package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api;

import X.AbstractC73672Svk;
import X.C64797Pbt;
import X.C74672wR;
import X.C76800UCe;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC65002PfC;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto.RiskContextRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BalanceResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PiPoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.StoredMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnbindPaymentMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BalanceRequest;

/* loaded from: classes2.dex */
public interface PaymentApi {
    public static final C74672wR LIZ = C74672wR.LIZ;

    @E4T("/api/v1/trade/pay_method/get_balance")
    AbstractC73672Svk<Response<BalanceResponseData>> getBalance(@InterfaceC27211Am7 BalanceRequest balanceRequest);

    @E4T("/payment/v1/stored_method_details")
    AbstractC73672Svk<PiPoResponse> getBillingAddress(@InterfaceC27211Am7 StoredMethodRequest storedMethodRequest, @InterfaceC65002PfC("Referer") String str);

    @E4T("/api/v1/trade/order/payment_method_bind_info")
    AbstractC73672Svk<Response<BindInfoResponseData>> getBindInfo(@InterfaceC27211Am7 BindInfoRequest bindInfoRequest);

    @E4T("/api/v1/trade/pay_method/get_bind_status")
    AbstractC73672Svk<Response<BindStatusResponseData>> getBindStatus(@InterfaceC27211Am7 BindStatusRequest bindStatusRequest);

    @E4T("/api/v1/trade/order/payment_list")
    AbstractC73672Svk<Response<PaymentListResponseData>> getPaymentList(@InterfaceC27211Am7 PaymentListRequest paymentListRequest);

    @E4T("/api/v1/trade/order/pay")
    AbstractC73672Svk<C64797Pbt<Response<PayResponseData>>> pay(@InterfaceC27211Am7 PayRequest payRequest);

    @E4T("/payment/v1/risk_context")
    AbstractC73672Svk<PiPoResponse> paymentRiskContext(@InterfaceC27211Am7 RiskContextRequest riskContextRequest, @InterfaceC65002PfC("Referer") String str);

    @E4T("/api/v1/pay/unbind_payment_method")
    AbstractC73672Svk<Response<C76800UCe>> unbindPaymentMethod(@InterfaceC27211Am7 UnbindPaymentMethodRequest unbindPaymentMethodRequest);
}
