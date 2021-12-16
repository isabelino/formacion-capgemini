package com.formacionjava.springboot.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "mi.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCzZgIV8MJTvf+y\r\n"
			+ "rYtqGVp6a8h4ZRnp9wuifKtCqseWFAqI/H/R2SKj5snpRAzNPHwRXR+5lFkTbMwE\r\n"
			+ "+bgoHyQiQqLpGl2S9NBGdvS1wF+dTOTbnXm4Pe8s+LF4NYzJ1OuRGXjMHIHaa2+t\r\n"
			+ "MtnJZrpmRb4dFKw7ZHUUMttihtHt7rJVf8sHNC+8h9v2fYsiWVPxYJl2duhnbnSN\r\n"
			+ "LL6Zh8zivmP13Z0X0qjSEHTWU2of8QcyFj+nLBNsctwl8DYwY/RAwk/ZJsJjH/EK\r\n"
			+ "jhSj1Cx1CCiSX5tsaqhGsvrH4Bjbtvgu8t+G01JhNUKLD5Sa8IvfKI0hhYcrbGPl\r\n"
			+ "vCT90TlDAgMBAAECggEAPAfEZucbf74yU+3ymtxFBHYQrQjXtQyv3f1tqW9QPg4S\r\n"
			+ "wGgNtYC9MK9HnUDiL8MvmPfaZ9UWQYPEeV2+m95fzv8RWIM0ELrO/uVLWY438IEM\r\n"
			+ "i9iUJGzFHf1SFXGF3Pvcn78wRsy7PwV4ZzJ+4f/4G8T2qvCB+ZXR/6JM+xk2IjGQ\r\n"
			+ "F9Ssrtn9dhEulihiScp2rpW/TIEKdOTxRwnvAzb66RUSOu8knQGeCn4g11TNdwlY\r\n"
			+ "vT/Q5/rp+HOviqJZ3282dzGh/1h+ZDqvqqI3XXaI1KUe6D9gOQKb/TVjERNWBqsL\r\n"
			+ "tn3jcjMTM90PiOhmsiD49E1zLsINdUU6bZrqCqldgQKBgQDTfqOw66FxI/B9eLES\r\n"
			+ "NGTsvQL1vw4ICg43fmN1dEIcHIFyvwQa+BKUbEeFFz5r8M3r+VS01vhNSYXiac2W\r\n"
			+ "lvTHiPBWzY/9kQGBvilvtmc7ZApaewizQC7V7bBK5EbzLQSZKEW4u79zRRhg2ao5\r\n"
			+ "i5y1mcvVsSEfpGR3k5QDXPbhowKBgQDZJlL0pCsyZYYbqBeZDY7KmpjrP66mQTn4\r\n"
			+ "gtp963cRaCxTww5HH9dMOBHJdq/kG34pjMCJWEVO4yVJ4ae4BdhaqQRdeQK6fjJ3\r\n"
			+ "vBAyt7SLJJSD5tgsgUbyT9enwkb/4jARK0//Z+S3sGj0BU5LIYrChyBA+U7aQzkk\r\n"
			+ "ZAZgLhAD4QKBgBEolBU1eLqaJNe5I/yLHakLSKMxZe0HC9I6wcz0qqxnL6Vkk+uw\r\n"
			+ "NqmuAztsAFd3iO1dJB8r1adHkMImvVQ7WQ6bMIyKTuVOj2W8TNZQYR2zZxeiJbmN\r\n"
			+ "On+GsifRT2RJQbc/SjDLoqOydmDdJ+9VQViGasAih8Jubuw4n+iJ8UmrAoGAGQ//\r\n"
			+ "SxUXlz14eQCxmIykCmZFeAFlmvK0SiZwKVBf8bZgR1qf7z2Rj8543xO/wUgbC5if\r\n"
			+ "MDrr5Or6hshwnyCtk+kmA9PPqM6f7IncJL5nLBgQvBiMorZZBeaJMWeO4kGs4o5p\r\n"
			+ "MUVAdKL7ug5StwEsDr+hzV345+ASXEzfH4KxfoECgYBuabsn462yZbA18BxckpxJ\r\n"
			+ "VAsZvicxm6x4n1J9oxBSZVDqC8VyMvjVzEQ8OPmCJCr4nxdffSs+fEuOO94kBUq3\r\n"
			+ "yAA7uOVbK7UnW93v+UMhxQmBsvIqrlhxxkxGprki9pW7kUzu1s10IgUapZKG/iVh\r\n"
			+ "5wyUmcDuallohUf3mjIXOg==";
	
	public static final String RSA_PUBLICA = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq9xyjFHDj3d4iy4MTuvy\r\n"
			+ "GN2L4/QCqVpiQxfDieiWFJR+nHlc8ayqilUXHllpHBXAV1OKoDviNZkYU1xusJHU\r\n"
			+ "q97fsy4EtriD9G7YBpMxy7nWOccaxjoYZpPAviYL20/eehqaCXBqMQdTqyCdOfj8\r\n"
			+ "Tzx7F9Q2/J4mJrHotfAo7/2ifkMbURBPjLHX5ZYJ94UrcYoG4kmnN2K94lQM+IzP\r\n"
			+ "X219OJ7eH7RtfyimskYKoQVvCwuNz7xj5fUt16gehZ7a2jG615cn6uGTLmVYwRal\r\n"
			+ "uECWzbMd8ycYS41wNYPZZyEKTikaGlMDwJGO0IWGds/5HllHQuLiJHAOrsevKweT\r\n"
			+ "zQIDAQAB";
}