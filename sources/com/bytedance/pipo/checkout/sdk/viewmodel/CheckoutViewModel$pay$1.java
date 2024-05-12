package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
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

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$pay$1", f = "CheckoutViewModel.kt", l = {572, 588, 592, 600, 604, 608, 664}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class CheckoutViewModel$pay$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC91773a01 $dialog;
    public final /* synthetic */ PaymentMethod $methodInfo;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> $navigate;
    public final /* synthetic */ boolean $storePayment;
    public final /* synthetic */ View $view;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ CheckoutViewModel this$0;

    /* loaded from: classes20.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC92085a53.values().length];
            iArr[EnumC92085a53.TimeoutError.ordinal()] = 1;
            iArr[EnumC92085a53.HttpError.ordinal()] = 2;
            iArr[EnumC92085a53.Success.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutViewModel$pay$1(CheckoutViewModel checkoutViewModel, View view, InterfaceC91773a01 interfaceC91773a01, PaymentMethod paymentMethod, boolean z, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super CheckoutViewModel$pay$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = checkoutViewModel;
        this.$view = view;
        this.$dialog = interfaceC91773a01;
        this.$methodInfo = paymentMethod;
        this.$storePayment = z;
        this.$navigate = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CheckoutViewModel$pay$1(this.this$0, this.$view, this.$dialog, this.$methodInfo, this.$storePayment, this.$navigate, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ad  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState, X.2kd, java.lang.Object, X.XKY] */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r19v2, types: [X.a5Q] */
    /* JADX WARN: Type inference failed for: r19v3, types: [X.a5Q] */
    /* JADX WARN: Type inference failed for: r20v2, types: [com.bytedance.pipo.checkout.api.network.model.response.Methods] */
    /* JADX WARN: Type inference failed for: r20v3, types: [com.bytedance.pipo.checkout.api.network.model.response.Methods] */
    /* JADX WARN: Type inference failed for: r21v2, types: [X.a33] */
    /* JADX WARN: Type inference failed for: r21v3, types: [X.a33] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v2, types: [com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse] */
    /* JADX WARN: Type inference failed for: r27v3, types: [com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$pay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
