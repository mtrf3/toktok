package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C76800UCe;
import X.C92145a61;
import X.InterfaceC35811ar;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.view.View;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$deleteStoredMethod$1", f = "PIViewModel.kt", l = {369, 373, 377, 379, 383}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class PIViewModel$deleteStoredMethod$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC35811ar<Boolean> $loadingDialog;
    public final /* synthetic */ C92145a61 $navHostController;
    public final /* synthetic */ String $paymentMethodToken;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> $toastCallback;
    public final /* synthetic */ View $view;
    public Object L$0;
    public int label;
    public final /* synthetic */ PIViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PIViewModel$deleteStoredMethod$1(PIViewModel pIViewModel, View view, InterfaceC35811ar<Boolean> interfaceC35811ar, String str, C92145a61 c92145a61, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super PIViewModel$deleteStoredMethod$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = pIViewModel;
        this.$view = view;
        this.$loadingDialog = interfaceC35811ar;
        this.$paymentMethodToken = str;
        this.$navHostController = c92145a61;
        this.$toastCallback = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new PIViewModel$deleteStoredMethod$1(this.this$0, this.$view, this.$loadingDialog, this.$paymentMethodToken, this.$navHostController, this.$toastCallback, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$deleteStoredMethod$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
