package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PayRequest {

    @InterfaceC65349Pkn("combo_Id")
    public final String comboId;

    @InterfaceC65349Pkn("commute_type")
    public final CommuteType commuteType;

    @InterfaceC65349Pkn("deeplink")
    public final String deepLink;

    @InterfaceC65349Pkn("is_from_otp")
    public final Boolean isFromOtp;

    @InterfaceC65349Pkn("is_new_payment")
    public final Boolean isNewPayment;

    @InterfaceC65349Pkn("order_ids")
    public final List<String> orderIds;

    @InterfaceC65349Pkn("pay_request_id")
    public final String payRequestId;

    @InterfaceC65349Pkn("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @InterfaceC65349Pkn("payment_method")
    public final PaymentMethodInfo paymentMethod;

    @InterfaceC65349Pkn("price_info")
    public final Summary priceInfo;

    @InterfaceC65349Pkn("redirect_url")
    public final String redirectUrl;

    @InterfaceC65349Pkn("server_issued_params")
    public final String serverIssuedParams;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayRequest)) {
            return false;
        }
        PayRequest payRequest = (PayRequest) obj;
        return o.LJ(this.comboId, payRequest.comboId) && o.LJ(this.orderIds, payRequest.orderIds) && o.LJ(this.isNewPayment, payRequest.isNewPayment) && o.LJ(this.paymentMethod, payRequest.paymentMethod) && o.LJ(this.redirectUrl, payRequest.redirectUrl) && o.LJ(this.deepLink, payRequest.deepLink) && o.LJ(this.payRiskControlParam, payRequest.payRiskControlParam) && this.commuteType == payRequest.commuteType && o.LJ(this.serverIssuedParams, payRequest.serverIssuedParams) && o.LJ(this.isFromOtp, payRequest.isFromOtp) && o.LJ(this.payRequestId, payRequest.payRequestId) && o.LJ(this.priceInfo, payRequest.priceInfo);
    }

    public final int hashCode() {
        String str = this.comboId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.orderIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isNewPayment;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaymentMethodInfo paymentMethodInfo = this.paymentMethod;
        int hashCode4 = (hashCode3 + (paymentMethodInfo == null ? 0 : paymentMethodInfo.hashCode())) * 31;
        String str2 = this.redirectUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deepLink;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PayRiskControlParam payRiskControlParam = this.payRiskControlParam;
        int hashCode7 = (hashCode6 + (payRiskControlParam == null ? 0 : payRiskControlParam.hashCode())) * 31;
        CommuteType commuteType = this.commuteType;
        int hashCode8 = (hashCode7 + (commuteType == null ? 0 : commuteType.hashCode())) * 31;
        String str4 = this.serverIssuedParams;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isFromOtp;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.payRequestId;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Summary summary = this.priceInfo;
        return hashCode11 + (summary != null ? summary.hashCode() : 0);
    }

    public final String toString() {
        return "PayRequest(comboId=" + this.comboId + ", orderIds=" + this.orderIds + ", isNewPayment=" + this.isNewPayment + ", paymentMethod=" + this.paymentMethod + ", redirectUrl=" + this.redirectUrl + ", deepLink=" + this.deepLink + ", payRiskControlParam=" + this.payRiskControlParam + ", commuteType=" + this.commuteType + ", serverIssuedParams=" + this.serverIssuedParams + ", isFromOtp=" + this.isFromOtp + ", payRequestId=" + this.payRequestId + ", priceInfo=" + this.priceInfo + ')';
    }

    public PayRequest(String str, List<String> list, Boolean bool, PaymentMethodInfo paymentMethodInfo, String str2, String str3, PayRiskControlParam payRiskControlParam, CommuteType commuteType, String str4, Boolean bool2, String str5, Summary summary) {
        this.comboId = str;
        this.orderIds = list;
        this.isNewPayment = bool;
        this.paymentMethod = paymentMethodInfo;
        this.redirectUrl = str2;
        this.deepLink = str3;
        this.payRiskControlParam = payRiskControlParam;
        this.commuteType = commuteType;
        this.serverIssuedParams = str4;
        this.isFromOtp = bool2;
        this.payRequestId = str5;
        this.priceInfo = summary;
    }

    public /* synthetic */ PayRequest(String str, List list, Boolean bool, PaymentMethodInfo paymentMethodInfo, String str2, String str3, PayRiskControlParam payRiskControlParam, CommuteType commuteType, String str4, Boolean bool2, String str5, Summary summary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, bool, (i & 8) != 0 ? null : paymentMethodInfo, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : payRiskControlParam, (i & 128) != 0 ? null : commuteType, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str5, (i & 2048) == 0 ? summary : null);
    }
}
