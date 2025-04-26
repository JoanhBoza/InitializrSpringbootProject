import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SeguridadConfig {

    @Bean
    public SecurityFilterChain filtroSeguridad(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login", "/publico/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/inicio", true)
                .permitAll()
            )
            .logout(logout -> logout.permitAll());

        return http.build();
    }
    
   @Bean
public InMemoryUserDetailsManager usuarios() {
    UserDetails usuario = User
        .withUsername("admin")
        .password("{noop}1234")  // {noop} indica que no se usa cifrado
        .roles("ADMIN")
        .build();
    return new InMemoryUserDetailsManager(usuario);
}
}