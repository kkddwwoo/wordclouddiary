//package com.project.picasso.oauth;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//
//
////@Configuration
//public class OAuth2LoginConfig {
//
//	@Bean
//	public ClientRegistrationRepository clientRegistrationRepository() {
//		return new InMemoryClientRegistrationRepository(this.googleClientRegistration());
//	}
//
//	private ClientRegistration googleClientRegistration() {
//		return ClientRegistration.withRegistrationId("google")
//			.clientId("222348599521-seb9is801qmnpushj8nbv2ndhr0mklfc.apps.googleusercontent.com")
//			.clientSecret("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")
//			.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//			.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//			.redirectUri("http://localhost:9000/login/oauth2/code/google")
//			.scope("openid", "profile", "email")
//			.authorizationUri("https://accounts.google.com/o/oauth2/v2/auth")
//			.tokenUri("https://www.googleapis.com/oauth2/v4/token")
//			.userInfoUri("https://www.googleapis.com/oauth2/v3/userinfo")
//			.userNameAttributeName(IdTokenClaimNames.SUB)
//			.jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
//			.clientName("Google")
//			.build();
//	}
//}