package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C0JT;
import X.C78983UzD;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreateOrderRequest {
    public String LIZ;

    @InterfaceC65349Pkn("activity_ids")
    public final List<String> activityIds;

    @InterfaceC65349Pkn("add_on_product_ids")
    public final List<String> addOnProductIds;

    @InterfaceC65349Pkn("bill_info_logid")
    public final String billInfoLogId;

    @InterfaceC65349Pkn("buy_type")
    public final int buyType;

    @InterfaceC65349Pkn("buyer_addr_id")
    public final String buyerAddrId;

    @InterfaceC65349Pkn("combo_id")
    public final String comboId;

    @InterfaceC65349Pkn("commute_type")
    public final CommuteType commuteType;

    @InterfaceC65349Pkn("cpf_elem")
    public final CpfElem cpfElem;

    @InterfaceC65349Pkn("create_order_info_from_bill")
    public final String createOrderInfoFromBill;

    @InterfaceC65349Pkn("deeplink")
    public final String deepLink;

    @InterfaceC65349Pkn("is_from_otp")
    public final Boolean isFromOtp;

    @InterfaceC65349Pkn("is_new_payment")
    public final Boolean isNewPayment;

    @InterfaceC65349Pkn("order_secret")
    public final String orderSecret;

    @InterfaceC65349Pkn("order_shop")
    public final List<OrderShopRequestParam> orderShop;

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn("pay_request_id")
    public final String payRequestId;

    @InterfaceC65349Pkn("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @InterfaceC65349Pkn("payment_method")
    public final PaymentMethodInfo paymentMethod;

    @InterfaceC65349Pkn("price_info")
    public final PriceInfoRequestParams priceInfo;

    @InterfaceC65349Pkn("redirect_url")
    public final String redirectUrl;

    @InterfaceC65349Pkn("server_issued_params")
    public final String serverIssuedParams;

    @InterfaceC65349Pkn("shipping_address")
    public final Address shippingAddress;

    @InterfaceC65349Pkn("trace_id")
    public final String traceId;

    @InterfaceC65349Pkn("traffic_source_list")
    public final int[] trafficSourceList;

    @InterfaceC65349Pkn("use_bonus_redeem")
    public final Boolean useBonusRedeem;

    @InterfaceC65349Pkn("vouchers")
    public final List<Voucher> voucher;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderRequest)) {
            return false;
        }
        CreateOrderRequest createOrderRequest = (CreateOrderRequest) obj;
        return o.LJ(this.traceId, createOrderRequest.traceId) && o.LJ(this.orderShop, createOrderRequest.orderShop) && o.LJ(this.priceInfo, createOrderRequest.priceInfo) && o.LJ(this.buyerAddrId, createOrderRequest.buyerAddrId) && o.LJ(this.voucher, createOrderRequest.voucher) && o.LJ(this.orderSecret, createOrderRequest.orderSecret) && o.LJ(this.isNewPayment, createOrderRequest.isNewPayment) && o.LJ(this.paymentMethod, createOrderRequest.paymentMethod) && o.LJ(this.redirectUrl, createOrderRequest.redirectUrl) && o.LJ(this.deepLink, createOrderRequest.deepLink) && o.LJ(this.serverIssuedParams, createOrderRequest.serverIssuedParams) && o.LJ(this.activityIds, createOrderRequest.activityIds) && this.buyType == createOrderRequest.buyType && o.LJ(this.payRiskControlParam, createOrderRequest.payRiskControlParam) && o.LJ(this.shippingAddress, createOrderRequest.shippingAddress) && this.commuteType == createOrderRequest.commuteType && o.LJ(this.comboId, createOrderRequest.comboId) && o.LJ(this.isFromOtp, createOrderRequest.isFromOtp) && o.LJ(this.billInfoLogId, createOrderRequest.billInfoLogId) && o.LJ(this.trafficSourceList, createOrderRequest.trafficSourceList) && o.LJ(this.addOnProductIds, createOrderRequest.addOnProductIds) && o.LJ(this.createOrderInfoFromBill, createOrderRequest.createOrderInfoFromBill) && o.LJ(this.pageSourceInfo, createOrderRequest.pageSourceInfo) && o.LJ(this.cpfElem, createOrderRequest.cpfElem) && o.LJ(this.payRequestId, createOrderRequest.payRequestId) && o.LJ(this.useBonusRedeem, createOrderRequest.useBonusRedeem);
    }

    public final int hashCode() {
        String str = this.traceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OrderShopRequestParam> list = this.orderShop;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PriceInfoRequestParams priceInfoRequestParams = this.priceInfo;
        int hashCode3 = (hashCode2 + (priceInfoRequestParams == null ? 0 : priceInfoRequestParams.hashCode())) * 31;
        String str2 = this.buyerAddrId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Voucher> list2 = this.voucher;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.orderSecret;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isNewPayment;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaymentMethodInfo paymentMethodInfo = this.paymentMethod;
        int hashCode8 = (hashCode7 + (paymentMethodInfo == null ? 0 : paymentMethodInfo.hashCode())) * 31;
        String str4 = this.redirectUrl;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deepLink;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.serverIssuedParams;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list3 = this.activityIds;
        int hashCode12 = (((hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.buyType) * 31;
        PayRiskControlParam payRiskControlParam = this.payRiskControlParam;
        int hashCode13 = (hashCode12 + (payRiskControlParam == null ? 0 : payRiskControlParam.hashCode())) * 31;
        Address address = this.shippingAddress;
        int hashCode14 = (hashCode13 + (address == null ? 0 : address.hashCode())) * 31;
        CommuteType commuteType = this.commuteType;
        int hashCode15 = (hashCode14 + (commuteType == null ? 0 : commuteType.hashCode())) * 31;
        String str7 = this.comboId;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.isFromOtp;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.billInfoLogId;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        int[] iArr = this.trafficSourceList;
        int hashCode19 = (hashCode18 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        List<String> list4 = this.addOnProductIds;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str9 = this.createOrderInfoFromBill;
        int hashCode21 = (hashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pageSourceInfo;
        int hashCode22 = (hashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        CpfElem cpfElem = this.cpfElem;
        int hashCode23 = (hashCode22 + (cpfElem == null ? 0 : cpfElem.hashCode())) * 31;
        String str11 = this.payRequestId;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool3 = this.useBonusRedeem;
        return hashCode24 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateOrderRequest(traceId=");
        sb.append(this.traceId);
        sb.append(", orderShop=");
        sb.append(this.orderShop);
        sb.append(", priceInfo=");
        sb.append(this.priceInfo);
        sb.append(", buyerAddrId=");
        sb.append(this.buyerAddrId);
        sb.append(", voucher=");
        sb.append(this.voucher);
        sb.append(", orderSecret=");
        sb.append(this.orderSecret);
        sb.append(", isNewPayment=");
        sb.append(this.isNewPayment);
        sb.append(", paymentMethod=");
        sb.append(this.paymentMethod);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", deepLink=");
        sb.append(this.deepLink);
        sb.append(", serverIssuedParams=");
        sb.append(this.serverIssuedParams);
        sb.append(", activityIds=");
        sb.append(this.activityIds);
        sb.append(", buyType=");
        sb.append(this.buyType);
        sb.append(", payRiskControlParam=");
        sb.append(this.payRiskControlParam);
        sb.append(", shippingAddress=");
        sb.append(this.shippingAddress);
        sb.append(", commuteType=");
        sb.append(this.commuteType);
        sb.append(", comboId=");
        sb.append(this.comboId);
        sb.append(", isFromOtp=");
        sb.append(this.isFromOtp);
        sb.append(", billInfoLogId=");
        sb.append(this.billInfoLogId);
        sb.append(", trafficSourceList=");
        C0JT.LIZLLL(this.trafficSourceList, sb, ", addOnProductIds=");
        sb.append(this.addOnProductIds);
        sb.append(", createOrderInfoFromBill=");
        sb.append(this.createOrderInfoFromBill);
        sb.append(", pageSourceInfo=");
        sb.append(this.pageSourceInfo);
        sb.append(", cpfElem=");
        sb.append(this.cpfElem);
        sb.append(", payRequestId=");
        sb.append(this.payRequestId);
        sb.append(", useBonusRedeem=");
        sb.append(this.useBonusRedeem);
        sb.append(')');
        return sb.toString();
    }

    public final CreateOrderRequest LIZ(String str) {
        if (str == null) {
            return this;
        }
        return new CreateOrderRequest(this.traceId, this.orderShop, this.priceInfo, this.buyerAddrId, this.voucher, this.orderSecret, this.isNewPayment, this.paymentMethod, this.redirectUrl, this.deepLink, this.serverIssuedParams, this.activityIds, this.buyType, this.payRiskControlParam, this.shippingAddress, this.commuteType, str, this.isFromOtp, this.billInfoLogId, this.trafficSourceList, this.addOnProductIds, this.createOrderInfoFromBill, this.pageSourceInfo, this.cpfElem, this.payRequestId, this.useBonusRedeem);
    }

    public final CreateOrderRequest LIZIZ(String str) {
        if (str == null) {
            return this;
        }
        return new CreateOrderRequest(this.traceId, this.orderShop, this.priceInfo, this.buyerAddrId, this.voucher, this.orderSecret, this.isNewPayment, this.paymentMethod, this.redirectUrl, this.deepLink, str, this.activityIds, this.buyType, this.payRiskControlParam, this.shippingAddress, this.commuteType, this.comboId, this.isFromOtp, this.billInfoLogId, this.trafficSourceList, this.addOnProductIds, this.createOrderInfoFromBill, this.pageSourceInfo, this.cpfElem, this.payRequestId, this.useBonusRedeem);
    }

    public CreateOrderRequest(String str, List<OrderShopRequestParam> list, PriceInfoRequestParams priceInfoRequestParams, String str2, List<Voucher> list2, String str3, Boolean bool, PaymentMethodInfo paymentMethodInfo, String str4, String str5, String str6, List<String> list3, int i, PayRiskControlParam payRiskControlParam, Address address, CommuteType commuteType, String str7, Boolean bool2, String str8, int[] iArr, List<String> list4, String str9, String str10, CpfElem cpfElem, String str11, Boolean bool3) {
        this.traceId = str;
        this.orderShop = list;
        this.priceInfo = priceInfoRequestParams;
        this.buyerAddrId = str2;
        this.voucher = list2;
        this.orderSecret = str3;
        this.isNewPayment = bool;
        this.paymentMethod = paymentMethodInfo;
        this.redirectUrl = str4;
        this.deepLink = str5;
        this.serverIssuedParams = str6;
        this.activityIds = list3;
        this.buyType = i;
        this.payRiskControlParam = payRiskControlParam;
        this.shippingAddress = address;
        this.commuteType = commuteType;
        this.comboId = str7;
        this.isFromOtp = bool2;
        this.billInfoLogId = str8;
        this.trafficSourceList = iArr;
        this.addOnProductIds = list4;
        this.createOrderInfoFromBill = str9;
        this.pageSourceInfo = str10;
        this.cpfElem = cpfElem;
        this.payRequestId = str11;
        this.useBonusRedeem = bool3;
        if (list == null || list.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("orderShop is null ");
            LIZ.append(this);
            C78983UzD.LJIIZILJ(new RuntimeException(X1D.LIZIZ(LIZ)));
        }
    }

    public /* synthetic */ CreateOrderRequest(String str, List list, PriceInfoRequestParams priceInfoRequestParams, String str2, List list2, String str3, Boolean bool, PaymentMethodInfo paymentMethodInfo, String str4, String str5, String str6, List list3, int i, PayRiskControlParam payRiskControlParam, Address address, CommuteType commuteType, String str7, Boolean bool2, String str8, int[] iArr, List list4, String str9, String str10, CpfElem cpfElem, String str11, Boolean bool3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, priceInfoRequestParams, str2, list2, str3, (i2 & 64) != 0 ? Boolean.TRUE : bool, paymentMethodInfo, str4, str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : list3, (i2 & 4096) != 0 ? 0 : i, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : payRiskControlParam, address, commuteType, (65536 & i2) != 0 ? null : str7, (131072 & i2) != 0 ? null : bool2, (262144 & i2) != 0 ? null : str8, (524288 & i2) != 0 ? null : iArr, (1048576 & i2) != 0 ? null : list4, (2097152 & i2) != 0 ? null : str9, (4194304 & i2) != 0 ? null : str10, (8388608 & i2) != 0 ? null : cpfElem, (16777216 & i2) != 0 ? null : str11, (i2 & 33554432) == 0 ? bool3 : null);
    }
}
