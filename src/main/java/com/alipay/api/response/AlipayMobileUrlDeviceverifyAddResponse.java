package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.url.deviceverify.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:42:01
 */
public class AlipayMobileUrlDeviceverifyAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6299997256243281982L;

	/** 
	 * 返回业务操作是否成功
	 */
	@ApiField("response")
	private Boolean response;

	public void setResponse(Boolean response) {
		this.response = response;
	}
	public Boolean getResponse( ) {
		return this.response;
	}

}
