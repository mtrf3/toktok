package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UnbindPaymentMethodRequest extends F9E {

    @InterfaceC65349Pkn("payment_method_token")
    public final String paymentMethodToken;

    public static /* synthetic */ UnbindPaymentMethodRequest copy$default(UnbindPaymentMethodRequest unbindPaymentMethodRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unbindPaymentMethodRequest.paymentMethodToken;
        }
        return unbindPaymentMethodRequest.copy(str);
    }

    public final UnbindPaymentMethodRequest copy(String paymentMethodToken) {
        o.LJIIIZ(paymentMethodToken, "paymentMethodToken");
        return new UnbindPaymentMethodRequest(paymentMethodToken);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.paymentMethodToken};
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public UnbindPaymentMethodRequest(String paymentMethodToken) {
        o.LJIIIZ(paymentMethodToken, "paymentMethodToken");
        this.paymentMethodToken = paymentMethodToken;
    }
}
