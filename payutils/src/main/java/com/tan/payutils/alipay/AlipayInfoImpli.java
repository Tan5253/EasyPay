package com.tan.payutils.alipay;

import com.tan.payutils.base.IPayInfo;

/**
 * 描述:支付宝支付类型和支付信息
 */
public class AlipayInfoImpli implements IPayInfo {

    private String orderInfo;

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

}
