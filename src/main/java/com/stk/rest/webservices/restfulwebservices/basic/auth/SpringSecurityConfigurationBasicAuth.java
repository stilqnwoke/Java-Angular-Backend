package com.stk.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        log.debug("Using default configure(HttpSecurity). If subclassed this will potentially override subclass configure(HttpSecurity).");
        ((HttpSecurity) ((HttpSecurity) ((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)
                http
                        .csrf().disable()
                        .authorizeRequests()
                        .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                        .anyRequest()).authenticated()
                .and()))
                .httpBasic();
    }
}
