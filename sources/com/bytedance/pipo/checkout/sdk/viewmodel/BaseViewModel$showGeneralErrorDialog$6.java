package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C91665ZyH;
import X.C91856a1M;
import X.C91992a3Y;
import X.C92054a4Y;
import X.C92158a6E;
import X.InterfaceC65784Pro;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import android.view.View;
import fjb.a;
import kotlin.jvm.internal.IDqS422S0100000_31;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showGeneralErrorDialog$6", f = "BaseViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class BaseViewModel$showGeneralErrorDialog$6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String $errorCode;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $onCancel;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $onDismissRequest;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $onRetry;
    public final /* synthetic */ View $view;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$showGeneralErrorDialog$6(String str, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, InterfaceC67352kd<? super BaseViewModel$showGeneralErrorDialog$6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$errorCode = str;
        this.$view = view;
        this.$onDismissRequest = interfaceC65784Pro;
        this.$onRetry = interfaceC65784Pro2;
        this.$onCancel = interfaceC65784Pro3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BaseViewModel$showGeneralErrorDialog$6(this.$errorCode, this.$view, this.$onDismissRequest, this.$onRetry, this.$onCancel, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C141335gf.LIZJ(obj);
            C92158a6E c92158a6E = new C92158a6E(null);
            C91665ZyH.LIZ().getDialog().LIZ(this.$view, c92158a6E, C92054a4Y.LIZ("pipo_payin_everypage_abnormal_main", new String[0]), C91856a1M.LIZLLL(this.$errorCode), C92054a4Y.LIZ("pipo_payin_everypage_abnormal_button", new String[0]), new IDqS422S0100000_31(this.$onRetry, 8), C92054a4Y.LIZ("pipo_common_cancel", new String[0]), new IDqS422S0100000_31(this.$onCancel, 9), ComposableSingletons$BaseViewModelKt.INSTANCE.m72getLambda1$PIPO_SDK_release(), C91992a3Y.LJ(), C91992a3Y.LIZLLL(), this.$onDismissRequest);
            c92158a6E.LJFF();
            return C76800UCe.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
