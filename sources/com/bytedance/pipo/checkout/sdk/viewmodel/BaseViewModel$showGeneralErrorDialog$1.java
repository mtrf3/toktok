package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C3CS;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel", f = "BaseViewModel.kt", l = {198, 199}, m = "showGeneralErrorDialog")
/* loaded from: classes20.dex */
public final class BaseViewModel$showGeneralErrorDialog$1 extends C3CS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$showGeneralErrorDialog$1(BaseViewModel baseViewModel, InterfaceC67352kd<? super BaseViewModel$showGeneralErrorDialog$1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.this$0 = baseViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.this$0.showGeneralErrorDialog(null, null, null, null, null, null, this);
    }
}
