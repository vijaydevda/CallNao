package com.ordernao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderNaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderNaoApplication.class, args);
	}

/*	@Bean
	public FilterRegistrationBean myFilterBean() {
		final FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
		filterRegBean.setFilter(new AuthenticationFilter());
		filterRegBean.addUrlPatterns("/*");
		filterRegBean.setEnabled(Boolean.TRUE);
		filterRegBean.setName("AuthenticationFilter");
		filterRegBean.setAsyncSupported(Boolean.TRUE);
		return filterRegBean;
	}*/

/*	@Bean
	public AuthenticationService getAuthService() {
		return new AuthenticationService();
	}*/

/*	@Bean
	public AuthenticationDao getAuthDao() {
		return new AuthenticationDao();
	}*/

/*	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}*/
}
