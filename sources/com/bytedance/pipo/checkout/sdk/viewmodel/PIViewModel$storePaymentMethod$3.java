package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C92145a61;
import X.EnumC92085a53;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import android.view.View;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3", f = "PIViewModel.kt", l = {435, 445, 449, 454, 464, 477, 482, 486, 493, 493, 506, 510, 516, 519, 525}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class PIViewModel$storePaymentMethod$3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PaymentMethod $methodInfo;
    public final /* synthetic */ C92145a61 $navController;
    public final /* synthetic */ View $view;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ PIViewModel this$0;

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
    public PIViewModel$storePaymentMethod$3(PIViewModel pIViewModel, View view, PaymentMethod paymentMethod, C92145a61 c92145a61, InterfaceC67352kd<? super PIViewModel$storePaymentMethod$3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = pIViewModel;
        this.$view = view;
        this.$methodInfo = paymentMethod;
        this.$navController = c92145a61;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new PIViewModel$storePaymentMethod$3(this.this$0, this.$view, this.$methodInfo, this.$navController, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$2", f = "PIViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$2, reason: invalid class name */
    /* loaded from: classes20.dex */
    public final class AnonymousClass2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
        public final /* synthetic */ String $msg;
        public int label;
        public final /* synthetic */ PIViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PIViewModel pIViewModel, String str, InterfaceC67352kd<? super AnonymousClass2> interfaceC67352kd) {
            super(2, interfaceC67352kd);
            this.this$0 = pIViewModel;
            this.$msg = str;
        }

        @Override // fjb.a
        public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
            return new AnonymousClass2(this.this$0, this.$msg, interfaceC67352kd);
        }

        @Override // X.InterfaceC88471Ynr
        public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
            return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
        }

        @Override // fjb.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C141335gf.LIZJ(obj);
                this.this$0.getPipoEvents();
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$3", f = "PIViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$3, reason: invalid class name */
    /* loaded from: classes20.dex */
    public final class AnonymousClass3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
        public final /* synthetic */ String $msg;
        public int label;
        public final /* synthetic */ PIViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PIViewModel pIViewModel, String str, InterfaceC67352kd<? super AnonymousClass3> interfaceC67352kd) {
            super(2, interfaceC67352kd);
            this.this$0 = pIViewModel;
            this.$msg = str;
        }

        @Override // fjb.a
        public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
            return new AnonymousClass3(this.this$0, this.$msg, interfaceC67352kd);
        }

        @Override // X.InterfaceC88471Ynr
        public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
            return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
        }

        @Override // fjb.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C141335gf.LIZJ(obj);
                this.this$0.getPipoEvents();
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$4", f = "PIViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3$4, reason: invalid class name */
    /* loaded from: classes20.dex */
    public final class AnonymousClass4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
        public final /* synthetic */ String $msg;
        public int label;
        public final /* synthetic */ PIViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PIViewModel pIViewModel, String str, InterfaceC67352kd<? super AnonymousClass4> interfaceC67352kd) {
            super(2, interfaceC67352kd);
            this.this$0 = pIViewModel;
            this.$msg = str;
        }

        @Override // fjb.a
        public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
            return new AnonymousClass4(this.this$0, this.$msg, interfaceC67352kd);
        }

        @Override // X.InterfaceC88471Ynr
        public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
            return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
        }

        @Override // fjb.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C141335gf.LIZJ(obj);
                this.this$0.getPipoEvents();
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03c8  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$storePaymentMethod$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
