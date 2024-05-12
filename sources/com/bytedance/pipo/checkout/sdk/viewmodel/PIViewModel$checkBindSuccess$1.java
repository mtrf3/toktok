package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C3CS;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel", f = "PIViewModel.kt", l = {683}, m = "checkBindSuccess")
/* loaded from: classes20.dex */
public final class PIViewModel$checkBindSuccess$1 extends C3CS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PIViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIViewModel$checkBindSuccess$1(PIViewModel pIViewModel, InterfaceC67352kd<? super PIViewModel$checkBindSuccess$1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.this$0 = pIViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.this$0.checkBindSuccess(null, null, this);
    }
}
