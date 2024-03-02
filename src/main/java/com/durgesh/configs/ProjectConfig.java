package com.durgesh.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
    /**
     * defining bean-
     * instructs Spring to add the instance returned by the method to the Spring context
     */
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();

        PasswordEncoder passwordEncoder = passwordEncoder();
        UserDetails build = User.withUsername("sam")
                .password("12345")
                .authorities("read")
                .build();

        // more users can be added in similar way
        userDetailsService.createUser(build);
        return userDetailsService;
    }

    /**
     * bean for password encoder
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        /**
         * below code is default behaviour of spring security
         * requiring authorization for all endpoint requests
         */
//        http.authorizeRequests()
//                .anyRequest().authenticated();
        /**
         * below permitAll() along with anyRequest() makes
         * all endpoint accessible without need for credentials
         * =>
         * below code makes all requests authenticated without requiring credentials
         */
        http.authorizeRequests()
                .anyRequest().permitAll();
    }
}

