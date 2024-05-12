package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C78857UxB;
import X.C91856a1M;
import X.C92054a4Y;
import X.C92082a50;
import X.C92108a5Q;
import X.C92325a8v;
import X.C92326a8w;
import X.C92327a8x;
import X.C92328a8y;
import X.C92329a8z;
import X.EnumC58928NAu;
import X.EnumC91967a39;
import X.EnumC92085a53;
import X.EnumC92087a55;
import X.EnumC92089a57;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.X1D;
import android.util.Log;
import com.bytedance.pipo.checkout.api.network.model.response.PaymentChargeDetails;
import com.bytedance.pipo.checkout.api.network.model.response.PaymentDetailResponse;
import com.bytedance.pipo.checkout.api.network.model.response.PaymentMethodInfo;
import fjb.a;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel$startPollingPaymentResult$1$1", f = "CheckoutViewModel.kt", l = {754}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class CheckoutViewModel$startPollingPaymentResult$1$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> $navigate;
    public final /* synthetic */ InterfaceC88472Yns<C92108a5Q, C76800UCe> $onResult;
    public int label;
    public final /* synthetic */ CheckoutViewModel this$0;

    /* loaded from: classes20.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC92085a53.values().length];
            iArr[EnumC92085a53.Success.ordinal()] = 1;
            iArr[EnumC92085a53.HttpError.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutViewModel$startPollingPaymentResult$1$1(CheckoutViewModel checkoutViewModel, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super C92108a5Q, C76800UCe> interfaceC88472Yns2, InterfaceC67352kd<? super CheckoutViewModel$startPollingPaymentResult$1$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = checkoutViewModel;
        this.$navigate = interfaceC88472Yns;
        this.$onResult = interfaceC88472Yns2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CheckoutViewModel$startPollingPaymentResult$1$1(this.this$0, this.$navigate, this.$onResult, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String status;
        String starlingKey;
        String str;
        String status2;
        C92108a5Q c92326a8w;
        String str2;
        PaymentMethodInfo paymentMethodInfo;
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
            CheckoutViewModel checkoutViewModel = this.this$0;
            this.label = 1;
            obj = checkoutViewModel.getPaymentDetails(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C92082a50 c92082a50 = (C92082a50) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("payment is ");
        PaymentDetailResponse paymentDetailResponse = (PaymentDetailResponse) c92082a50.LIZJ;
        String str3 = null;
        if (paymentDetailResponse == null) {
            status = null;
        } else {
            status = paymentDetailResponse.getStatus();
        }
        LIZ.append((Object) status);
        LIZ.append(", detail: ");
        LIZ.append(c92082a50.LIZJ);
        X1D.LIZIZ(LIZ);
        int i2 = WhenMappings.$EnumSwitchMapping$0[c92082a50.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                InterfaceC88472Yns<C92108a5Q, C76800UCe> interfaceC88472Yns = this.$onResult;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(new C92325a8v(c92082a50.LIZIZ));
                }
                this.this$0.cancelPolling();
            } else {
                CheckoutViewModel checkoutViewModel2 = this.this$0;
                PaymentDetailResponse paymentDetailResponse2 = (PaymentDetailResponse) c92082a50.LIZJ;
                if (paymentDetailResponse2 != null) {
                    str3 = paymentDetailResponse2.getErrorCode();
                }
                checkoutViewModel2.updateErrorCode(str3);
                this.$navigate.invoke("error_page");
                CheckoutViewModel checkoutViewModel3 = this.this$0;
                checkoutViewModel3.setErrorPageRetryFun(new IDqS178S0200000_31(checkoutViewModel3, (CheckoutViewModel) this.$navigate, (InterfaceC88472Yns<? super String, C76800UCe>) 1));
                this.this$0.cancelPolling();
            }
        } else {
            PaymentDetailResponse paymentDetailResponse3 = (PaymentDetailResponse) c92082a50.LIZJ;
            if (paymentDetailResponse3 != null) {
                CheckoutViewModel$startPollingPaymentResult$1$1$result$1$1 checkoutViewModel$startPollingPaymentResult$1$1$result$1$1 = new CheckoutViewModel$startPollingPaymentResult$1$1$result$1$1(this.this$0);
                PaymentMethodInfo paymentMethodInfo2 = paymentDetailResponse3.getPaymentMethodInfo();
                String str4 = "";
                if (paymentMethodInfo2 == null || (starlingKey = paymentMethodInfo2.getStarlingKey()) == null) {
                    starlingKey = "";
                }
                String LIZ2 = C92054a4Y.LIZ(starlingKey, new String[0]);
                if (LIZ2.length() == 0 && ((paymentMethodInfo = paymentDetailResponse3.getPaymentMethodInfo()) == null || (LIZ2 = paymentMethodInfo.getDisplayName()) == null)) {
                    LIZ2 = "";
                }
                String amount = paymentDetailResponse3.getAmount();
                if (amount == null || (str = (String) checkoutViewModel$startPollingPaymentResult$1$1$result$1$1.invoke(amount)) == null) {
                    str = "";
                }
                if (!o.LJ(paymentDetailResponse3.getResultCode(), EnumC92089a57.Success.getDesc())) {
                    String errorCode = paymentDetailResponse3.getErrorCode();
                    if (errorCode != null) {
                        str4 = errorCode;
                    }
                    c92326a8w = new C92326a8w(C91856a1M.LIZLLL(str4));
                } else {
                    PaymentChargeDetails chargeDetails = paymentDetailResponse3.getChargeDetails();
                    if (chargeDetails == null) {
                        status2 = null;
                    } else {
                        status2 = chargeDetails.getStatus();
                    }
                    if (o.LJ(status2, EnumC92087a55.Init.getDesc())) {
                        c92326a8w = new C92327a8x();
                    } else if (o.LJ(status2, EnumC92087a55.Success.getDesc())) {
                        c92326a8w = new C92329a8z(LIZ2, str);
                    } else if (o.LJ(status2, EnumC92087a55.Pending.getDesc())) {
                        PaymentMethodInfo paymentMethodInfo3 = paymentDetailResponse3.getPaymentMethodInfo();
                        if (paymentMethodInfo3 != null) {
                            str3 = paymentMethodInfo3.getPaymentMethodType();
                        }
                        if (o.LJ(str3, EnumC91967a39.CCDC.getValue())) {
                            str2 = "pipo_payin_state_cashier_directdebit_content_pending_notice";
                        } else {
                            str2 = "pipo_payin_pending_notice";
                        }
                        String LIZ3 = C92054a4Y.LIZ(str2, new String[0]);
                        String initiateTime = paymentDetailResponse3.getInitiateTime();
                        if (initiateTime == null) {
                            initiateTime = "";
                        }
                        String paymentReference = paymentDetailResponse3.getPaymentReference();
                        if (paymentReference != null) {
                            str4 = paymentReference;
                        }
                        c92326a8w = new C92328a8y(LIZ3, str4, initiateTime, LIZ2, str);
                    } else {
                        PaymentChargeDetails chargeDetails2 = paymentDetailResponse3.getChargeDetails();
                        if (chargeDetails2 != null) {
                            str3 = chargeDetails2.getStatusCode();
                        }
                        c92326a8w = new C92326a8w(C91856a1M.LIZLLL(str3));
                    }
                }
                InterfaceC88472Yns<C92108a5Q, C76800UCe> interfaceC88472Yns2 = this.$onResult;
                CheckoutViewModel checkoutViewModel4 = this.this$0;
                if (c92326a8w instanceof C92327a8x) {
                    C78857UxB.LJIIL(Log.d("PayDetail", "payment is init, continue"));
                } else {
                    if (interfaceC88472Yns2 != null) {
                        interfaceC88472Yns2.invoke(c92326a8w);
                    }
                    checkoutViewModel4.cancelPolling();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
