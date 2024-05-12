package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C91950a2s;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import com.bytedance.pipo.checkout.api.network.model.response.RedirectDetails;
import com.bytedance.pipo.checkout.api.network.model.response.StorePaymentMethodResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$storePaymentMethod$1$1$1", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class CheckoutViewModel$storePaymentMethod$1$1$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StorePaymentMethodResponse $it;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> $navigate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutViewModel$storePaymentMethod$1$1$1(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, StorePaymentMethodResponse storePaymentMethodResponse, InterfaceC67352kd<? super CheckoutViewModel$storePaymentMethod$1$1$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$navigate = interfaceC88472Yns;
        this.$it = storePaymentMethodResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CheckoutViewModel$storePaymentMethod$1$1$1(this.$navigate, this.$it, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String url;
        if (this.label == 0) {
            C141335gf.LIZJ(obj);
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.$navigate;
            RedirectDetails redirectDetails = this.$it.getRedirectDetails();
            if (redirectDetails == null || (url = redirectDetails.getUrl()) == null) {
                url = "";
            }
            interfaceC88472Yns.invoke(C91950a2s.LIZIZ(url, null, true, false, false, true, false, 148));
            return C76800UCe.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
