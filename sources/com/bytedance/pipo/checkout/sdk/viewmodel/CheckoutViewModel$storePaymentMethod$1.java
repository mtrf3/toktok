package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.EnumC92085a53;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC91773a01;
import android.view.View;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$storePaymentMethod$1", f = "CheckoutViewModel.kt", l = {477, 488, 491, 498, 526, 529, 529, 540, 543}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class CheckoutViewModel$storePaymentMethod$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC91773a01 $dialog;
    public final /* synthetic */ PaymentMethod $methodInfo;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> $navigate;
    public final /* synthetic */ View $view;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ CheckoutViewModel this$0;

    /* loaded from: classes20.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC92085a53.values().length];
            iArr[EnumC92085a53.Success.ordinal()] = 1;
            iArr[EnumC92085a53.TimeoutError.ordinal()] = 2;
            iArr[EnumC92085a53.HttpError.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutViewModel$storePaymentMethod$1(CheckoutViewModel checkoutViewModel, View view, InterfaceC91773a01 interfaceC91773a01, PaymentMethod paymentMethod, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super CheckoutViewModel$storePaymentMethod$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = checkoutViewModel;
        this.$view = view;
        this.$dialog = interfaceC91773a01;
        this.$methodInfo = paymentMethod;
        this.$navigate = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CheckoutViewModel$storePaymentMethod$1(this.this$0, this.$view, this.$dialog, this.$methodInfo, this.$navigate, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$storePaymentMethod$1$2", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$storePaymentMethod$1$2, reason: invalid class name */
    /* loaded from: classes20.dex */
    public final class AnonymousClass2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
        public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> $navigate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super AnonymousClass2> interfaceC67352kd) {
            super(2, interfaceC67352kd);
            this.$navigate = interfaceC88472Yns;
        }

        @Override // fjb.a
        public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
            return new AnonymousClass2(this.$navigate, interfaceC67352kd);
        }

        @Override // X.InterfaceC88471Ynr
        public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
            return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
        }

        @Override // fjb.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C141335gf.LIZJ(obj);
                this.$navigate.invoke("pay_result");
                return C76800UCe.LIZ;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0300 A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.2kd, X.XKY] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.bytedance.pipo.checkout.api.network.model.response.Methods, java.util.List, com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState, X.a33, com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse, X.2kd, X.a5Q, java.lang.Object, java.lang.String, X.XKY] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$storePaymentMethod$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
