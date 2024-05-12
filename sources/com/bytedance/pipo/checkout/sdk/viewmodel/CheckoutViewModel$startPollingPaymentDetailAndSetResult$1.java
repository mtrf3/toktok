package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C76800UCe;
import X.C92108a5Q;
import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final /* synthetic */ class CheckoutViewModel$startPollingPaymentDetailAndSetResult$1 extends TBS implements InterfaceC88472Yns<C92108a5Q, C76800UCe> {
    public CheckoutViewModel$startPollingPaymentDetailAndSetResult$1(Object obj) {
        super(1, obj, CheckoutViewModel.class, "setPayResultPageValue", "setPayResultPageValue(Lcom/bytedance/pipo/checkout/element/base/PayResult;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C92108a5Q p0) {
        o.LJIIIZ(p0, "p0");
        ((CheckoutViewModel) this.receiver).setPayResultPageValue(p0);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(C92108a5Q c92108a5Q) {
        invoke2(c92108a5Q);
        return C76800UCe.LIZ;
    }
}
