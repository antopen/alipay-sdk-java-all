package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能量清单扩展信息
 *
 * @author auto create
 * @since 1.0, 2021-02-01 19:20:11
 */
public class EnergyExtRequest extends AlipayObject {

	private static final long serialVersionUID = 1529145931444295994L;

	/**
	 * 扩展信息的key信息
	 */
	@ApiField("ext_key")
	private String extKey;

	/**
	 * 扩展信息的value信息
	 */
	@ApiField("ext_value")
	private String extValue;

	public String getExtKey() {
		return this.extKey;
	}
	public void setExtKey(String extKey) {
		this.extKey = extKey;
	}

	public String getExtValue() {
		return this.extValue;
	}
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

}
