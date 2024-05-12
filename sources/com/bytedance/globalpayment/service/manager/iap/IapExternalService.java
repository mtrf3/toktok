package com.bytedance.globalpayment.service.manager.iap;

import X.AbstractC78349Uoz;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

/* loaded from: classes14.dex */
public interface IapExternalService extends IapService {
    void executeUnUploadTokenOrder(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData);

    AbstractC78349Uoz getNextState(AbstractC78349Uoz abstractC78349Uoz);

    void init();

    void onOrderTimeout(OrderInfo orderInfo);

    void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod);
}
