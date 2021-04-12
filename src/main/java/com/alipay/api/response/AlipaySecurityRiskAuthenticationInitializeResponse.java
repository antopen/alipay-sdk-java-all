package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.authentication.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityRiskAuthenticationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1859951426762416636L;

	/** 
	 * 身份安全业务初始化后返回的业务信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 身份安全业务初始化后生成的token
	 */
	@ApiField("token_id")
	private String tokenId;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getTokenId( ) {
		return this.tokenId;
	}

}
