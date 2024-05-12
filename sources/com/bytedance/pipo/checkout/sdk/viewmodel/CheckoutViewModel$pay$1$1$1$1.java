package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C91950a2s;
import X.C92054a4Y;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$pay$1$1$1$1", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class CheckoutViewModel$pay$1$1$1$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String $detailUrl;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> $navigate;
    public int label;
    public final /* synthetic */ CheckoutViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutViewModel$pay$1$1$1$1(CheckoutViewModel checkoutViewModel, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, String str, InterfaceC67352kd<? super CheckoutViewModel$pay$1$1$1$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = checkoutViewModel;
        this.$navigate = interfaceC88472Yns;
        this.$detailUrl = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CheckoutViewModel$pay$1$1$1$1(this.this$0, this.$navigate, this.$detailUrl, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C141335gf.LIZJ(obj);
            CheckoutViewModel checkoutViewModel = this.this$0;
            checkoutViewModel.setUiState(CheckoutUiState.copy$default(checkoutViewModel.getUiState(), false, false, false, null, 0, 0, 0, false, false, null, null, null, null, null, null, C92054a4Y.LIZ("pipo_payin_state_cashier_section_payment_info", new String[0]), null, null, 229119, null));
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.$navigate;
            String LIZ = C92054a4Y.LIZ("pipo_payin_state_cashier_section_payment_info", new String[0]);
            String detailUrl = this.$detailUrl;
            o.LJIIIIZZ(detailUrl, "detailUrl");
            interfaceC88472Yns.invoke(C91950a2s.LIZIZ(detailUrl, LIZ, true, false, false, true, true, 16));
            return C76800UCe.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
