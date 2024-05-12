package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C3CS;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel", f = "CheckoutViewModel.kt", l = {825, 830}, m = "getPaymentDetails")
/* loaded from: classes20.dex */
public final class CheckoutViewModel$getPaymentDetails$1 extends C3CS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CheckoutViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$getPaymentDetails$1(CheckoutViewModel checkoutViewModel, InterfaceC67352kd<? super CheckoutViewModel$getPaymentDetails$1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.this$0 = checkoutViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.this$0.getPaymentDetails(this);
    }
}
