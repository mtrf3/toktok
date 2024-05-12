package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65781Prl;
import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C91684Zya;
import X.C91950a2s;
import X.C92145a61;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import com.bytedance.pipo.checkout.api.network.model.response.RedirectDetails;
import com.bytedance.pipo.checkout.api.network.model.response.StorePaymentMethodResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$1$1", f = "PIViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class PIViewModel$storePaymentMethod$3$1$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StorePaymentMethodResponse $it;
    public final /* synthetic */ C92145a61 $navController;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIViewModel$storePaymentMethod$3$1$1(C92145a61 c92145a61, StorePaymentMethodResponse storePaymentMethodResponse, InterfaceC67352kd<? super PIViewModel$storePaymentMethod$3$1$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$navController = c92145a61;
        this.$it = storePaymentMethodResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new PIViewModel$storePaymentMethod$3$1$1(this.$navController, this.$it, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* renamed from: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$1$1$1, reason: invalid class name */
    /* loaded from: classes20.dex */
    public final class AnonymousClass1 extends AbstractC65781Prl implements InterfaceC88472Yns<C91684Zya, C76800UCe> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C91684Zya navigate) {
            o.LJIIIZ(navigate, "$this$navigate");
            navigate.LIZIZ = true;
        }

        @Override // X.InterfaceC88472Yns
        public /* bridge */ /* synthetic */ C76800UCe invoke(C91684Zya c91684Zya) {
            invoke2(c91684Zya);
            return C76800UCe.LIZ;
        }
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String url;
        if (this.label == 0) {
            C141335gf.LIZJ(obj);
            C92145a61 c92145a61 = this.$navController;
            RedirectDetails redirectDetails = this.$it.getRedirectDetails();
            if (redirectDetails == null || (url = redirectDetails.getUrl()) == null) {
                url = "";
            }
            c92145a61.LJIIJJI(C91950a2s.LIZIZ(url, null, false, false, false, false, false, 252), AnonymousClass1.INSTANCE);
            return C76800UCe.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
