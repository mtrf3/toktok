package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C91665ZyH;
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

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$showNetworkErrorDialog$5", f = "BaseViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class BaseViewModel$showNetworkErrorDialog$5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $onClickCancel;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $onClickRetry;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $onDialogDismiss;
    public final /* synthetic */ View $view;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$showNetworkErrorDialog$5(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, InterfaceC67352kd<? super BaseViewModel$showNetworkErrorDialog$5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$view = view;
        this.$onClickRetry = interfaceC65784Pro;
        this.$onClickCancel = interfaceC65784Pro2;
        this.$onDialogDismiss = interfaceC65784Pro3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BaseViewModel$showNetworkErrorDialog$5(this.$view, this.$onClickRetry, this.$onClickCancel, this.$onDialogDismiss, interfaceC67352kd);
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
            C91665ZyH.LIZ().getDialog().LIZ(this.$view, c92158a6E, C92054a4Y.LIZ("pipo_payin_dropin_cashier_networkerror", new String[0]), C92054a4Y.LIZ("pipo_payin_dropin_cashier_networkerror_statement", new String[0]), C92054a4Y.LIZ("pipo_payin_everypage_abnormal_button", new String[0]), this.$onClickRetry, C92054a4Y.LIZ("pipo_common_cancel", new String[0]), this.$onClickCancel, ComposableSingletons$BaseViewModelKt.INSTANCE.m73getLambda2$PIPO_SDK_release(), C91992a3Y.LJ(), C91992a3Y.LIZLLL(), this.$onDialogDismiss);
            c92158a6E.LJFF();
            return C76800UCe.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
