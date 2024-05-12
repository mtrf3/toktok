package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC65784Pro;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC91780a08;
import android.view.View;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$redirectHandler$1", f = "PIViewModel.kt", l = {579}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class PIViewModel$redirectHandler$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $onClose;
    public final /* synthetic */ InterfaceC91780a08 $toast;
    public final /* synthetic */ View $view;
    public int label;
    public final /* synthetic */ PIViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIViewModel$redirectHandler$1(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, PIViewModel pIViewModel, View view, InterfaceC91780a08 interfaceC91780a08, InterfaceC67352kd<? super PIViewModel$redirectHandler$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$onClose = interfaceC65784Pro;
        this.this$0 = pIViewModel;
        this.$view = view;
        this.$toast = interfaceC91780a08;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new PIViewModel$redirectHandler$1(this.$onClose, this.this$0, this.$view, this.$toast, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.$onClose.invoke();
            PIViewModel pIViewModel = this.this$0;
            View view = this.$view;
            InterfaceC91780a08 interfaceC91780a08 = this.$toast;
            this.label = 1;
            if (pIViewModel.checkBindSuccess(view, interfaceC91780a08, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
