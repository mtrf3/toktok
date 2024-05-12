package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.InterfaceC88472Yns;
import X.TBS;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final /* synthetic */ class CheckoutViewModel$startPollingPaymentResult$1$1$result$1$1 extends TBS implements InterfaceC88472Yns<String, String> {
    public CheckoutViewModel$startPollingPaymentResult$1$1$result$1$1(Object obj) {
        super(1, obj, CheckoutViewModel.class, "formatAmount", "formatAmount(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(String p0) {
        o.LJIIIZ(p0, "p0");
        return ((CheckoutViewModel) this.receiver).formatAmount(p0);
    }
}
