package com.bytedance.pipo.checkout.api.network.model.response;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.InterfaceC92088a56;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentDetailResponse implements InterfaceC92088a56 {

    @InterfaceC65349Pkn("amount")
    public String amount;

    @InterfaceC65349Pkn("cashier_display_info")
    public String cashierDisplayInfo;

    @InterfaceC65349Pkn("channel_extra_info")
    public ChannelExtraInfo channelExtraInfo;

    @InterfaceC65349Pkn("charge_details")
    public PaymentChargeDetails chargeDetails;

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("error_code")
    public String errorCode;

    @InterfaceC65349Pkn("error_message")
    public String errorMessage;

    @InterfaceC65349Pkn("expiration_time")
    public String expirationTime;

    @InterfaceC65349Pkn("fx_rate")
    public String fxRate;

    @InterfaceC65349Pkn("fx_token")
    public String fxToken;

    @InterfaceC65349Pkn("initiate_time")
    public String initiateTime;

    @InterfaceC65349Pkn("merchant_id")
    public String merchantId;

    @InterfaceC65349Pkn("merchant_order_id")
    public String merchantOrderId;

    @InterfaceC65349Pkn("merchant_user_id")
    public String merchantUserId;

    @InterfaceC65349Pkn("message")
    public String message;

    @InterfaceC65349Pkn("order_type")
    public String orderType;

    @InterfaceC65349Pkn("payment_fee_amount")
    public String paymentFeeAmount;

    @InterfaceC65349Pkn("payment_method_info")
    public PaymentMethodInfo paymentMethodInfo;

    @InterfaceC65349Pkn("payment_reference")
    public String paymentReference;

    @InterfaceC65349Pkn("present_to_shopper_details")
    public String presentToShopperDetails;

    @InterfaceC65349Pkn("processing_fee_amount")
    public Amount processingFeeAmount;

    @InterfaceC65349Pkn("profit_sharing")
    public Boolean profitSharing;

    @InterfaceC65349Pkn("quote_amount")
    public String quoteAmount;

    @InterfaceC65349Pkn("quote_currency")
    public String quoteCurrency;

    @InterfaceC65349Pkn("quote_fee_amount")
    public String quoteFeeAmount;

    @InterfaceC65349Pkn("refund_details")
    public String refundDetails;

    @InterfaceC65349Pkn("refundable_amount")
    public String refundableAmount;

    @InterfaceC65349Pkn("refundable_currency")
    public String refundableCurrency;

    @InterfaceC65349Pkn("result_code")
    public String resultCode;

    @InterfaceC65349Pkn("status")
    public String status;

    @InterfaceC65349Pkn("sub_merchant_id")
    public String subMerchantId;

    @InterfaceC65349Pkn("sub_order_details")
    public List<SubOrderDetail> subOrderDetails;

    @InterfaceC65349Pkn("subsidy_details")
    public SubsidyDetails subsidyDetails;

    @InterfaceC65349Pkn("success_time")
    public String successTime;

    @InterfaceC65349Pkn("success_url")
    public String successUrl;

    public static /* synthetic */ PaymentDetailResponse copy$default(PaymentDetailResponse paymentDetailResponse, String str, String str2, String str3, String str4, PaymentChargeDetails paymentChargeDetails, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ChannelExtraInfo channelExtraInfo, Boolean bool, SubsidyDetails subsidyDetails, Amount amount, String str20, List list, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, PaymentMethodInfo paymentMethodInfo, int i, int i2, Object obj) {
        String str30 = str3;
        String str31 = str;
        String str32 = str2;
        String str33 = str13;
        String str34 = str12;
        String str35 = str11;
        String str36 = str10;
        String str37 = str9;
        PaymentChargeDetails paymentChargeDetails2 = paymentChargeDetails;
        String str38 = str4;
        String str39 = str5;
        String str40 = str6;
        String str41 = str7;
        String str42 = str8;
        String str43 = str29;
        String str44 = str27;
        String str45 = str26;
        String str46 = str25;
        String str47 = str19;
        String str48 = str18;
        String str49 = str17;
        String str50 = str16;
        String str51 = str14;
        String str52 = str15;
        ChannelExtraInfo channelExtraInfo2 = channelExtraInfo;
        Boolean bool2 = bool;
        SubsidyDetails subsidyDetails2 = subsidyDetails;
        String str53 = str28;
        Amount amount2 = amount;
        PaymentMethodInfo paymentMethodInfo2 = paymentMethodInfo;
        String str54 = str20;
        List list2 = list;
        String str55 = str21;
        String str56 = str22;
        String str57 = str23;
        String str58 = str24;
        if ((i & 1) != 0) {
            str31 = paymentDetailResponse.getErrorCode();
        }
        if ((i & 2) != 0) {
            str32 = paymentDetailResponse.getErrorMessage();
        }
        if ((i & 4) != 0) {
            str30 = paymentDetailResponse.getResultCode();
        }
        if ((i & 8) != 0) {
            str38 = paymentDetailResponse.amount;
        }
        if ((i & 16) != 0) {
            paymentChargeDetails2 = paymentDetailResponse.chargeDetails;
        }
        if ((i & 32) != 0) {
            str39 = paymentDetailResponse.currency;
        }
        if ((i & 64) != 0) {
            str40 = paymentDetailResponse.description;
        }
        if ((i & 128) != 0) {
            str41 = paymentDetailResponse.expirationTime;
        }
        if ((i & 256) != 0) {
            str42 = paymentDetailResponse.initiateTime;
        }
        if ((i & 512) != 0) {
            str37 = paymentDetailResponse.subMerchantId;
        }
        if ((i & 1024) != 0) {
            str36 = paymentDetailResponse.merchantOrderId;
        }
        if ((i & 2048) != 0) {
            str35 = paymentDetailResponse.message;
        }
        if ((i & 4096) != 0) {
            str34 = paymentDetailResponse.paymentReference;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str33 = paymentDetailResponse.refundableAmount;
        }
        if ((i & 16384) != 0) {
            str51 = paymentDetailResponse.refundableCurrency;
        }
        if ((32768 & i) != 0) {
            str52 = paymentDetailResponse.refundDetails;
        }
        if ((65536 & i) != 0) {
            str50 = paymentDetailResponse.status;
        }
        if ((131072 & i) != 0) {
            str49 = paymentDetailResponse.successTime;
        }
        if ((262144 & i) != 0) {
            str48 = paymentDetailResponse.successUrl;
        }
        if ((524288 & i) != 0) {
            str47 = paymentDetailResponse.presentToShopperDetails;
        }
        if ((1048576 & i) != 0) {
            channelExtraInfo2 = paymentDetailResponse.channelExtraInfo;
        }
        if ((2097152 & i) != 0) {
            bool2 = paymentDetailResponse.profitSharing;
        }
        if ((4194304 & i) != 0) {
            subsidyDetails2 = paymentDetailResponse.subsidyDetails;
        }
        if ((8388608 & i) != 0) {
            amount2 = paymentDetailResponse.processingFeeAmount;
        }
        if ((16777216 & i) != 0) {
            str54 = paymentDetailResponse.orderType;
        }
        if ((33554432 & i) != 0) {
            list2 = paymentDetailResponse.subOrderDetails;
        }
        if ((67108864 & i) != 0) {
            str55 = paymentDetailResponse.merchantUserId;
        }
        if ((134217728 & i) != 0) {
            str56 = paymentDetailResponse.merchantId;
        }
        if ((268435456 & i) != 0) {
            str57 = paymentDetailResponse.quoteAmount;
        }
        if ((536870912 & i) != 0) {
            str58 = paymentDetailResponse.quoteCurrency;
        }
        if ((1073741824 & i) != 0) {
            str46 = paymentDetailResponse.quoteFeeAmount;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            str45 = paymentDetailResponse.paymentFeeAmount;
        }
        if ((i2 & 1) != 0) {
            str44 = paymentDetailResponse.fxToken;
        }
        if ((i2 & 2) != 0) {
            str53 = paymentDetailResponse.fxRate;
        }
        if ((i2 & 4) != 0) {
            str43 = paymentDetailResponse.cashierDisplayInfo;
        }
        if ((i2 & 8) != 0) {
            paymentMethodInfo2 = paymentDetailResponse.paymentMethodInfo;
        }
        PaymentMethodInfo paymentMethodInfo3 = paymentMethodInfo2;
        return paymentDetailResponse.copy(str31, str32, str30, str38, paymentChargeDetails2, str39, str40, str41, str42, str37, str36, str35, str34, str33, str51, str52, str50, str49, str48, str47, channelExtraInfo2, bool2, subsidyDetails2, amount2, str54, list2, str55, str56, str57, str58, str46, str45, str44, str53, str43, paymentMethodInfo3);
    }

    public final String component1() {
        return getErrorCode();
    }

    public final String component2() {
        return getErrorMessage();
    }

    public final String component3() {
        return getResultCode();
    }

    public final PaymentDetailResponse copy(String str, String str2, String str3, String str4, PaymentChargeDetails paymentChargeDetails, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ChannelExtraInfo channelExtraInfo, Boolean bool, SubsidyDetails subsidyDetails, Amount amount, String str20, List<SubOrderDetail> list, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, PaymentMethodInfo paymentMethodInfo) {
        return new PaymentDetailResponse(str, str2, str3, str4, paymentChargeDetails, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, channelExtraInfo, bool, subsidyDetails, amount, str20, list, str21, str22, str23, str24, str25, str26, str27, str28, str29, paymentMethodInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDetailResponse)) {
            return false;
        }
        PaymentDetailResponse paymentDetailResponse = (PaymentDetailResponse) obj;
        return o.LJ(getErrorCode(), paymentDetailResponse.getErrorCode()) && o.LJ(getErrorMessage(), paymentDetailResponse.getErrorMessage()) && o.LJ(getResultCode(), paymentDetailResponse.getResultCode()) && o.LJ(this.amount, paymentDetailResponse.amount) && o.LJ(this.chargeDetails, paymentDetailResponse.chargeDetails) && o.LJ(this.currency, paymentDetailResponse.currency) && o.LJ(this.description, paymentDetailResponse.description) && o.LJ(this.expirationTime, paymentDetailResponse.expirationTime) && o.LJ(this.initiateTime, paymentDetailResponse.initiateTime) && o.LJ(this.subMerchantId, paymentDetailResponse.subMerchantId) && o.LJ(this.merchantOrderId, paymentDetailResponse.merchantOrderId) && o.LJ(this.message, paymentDetailResponse.message) && o.LJ(this.paymentReference, paymentDetailResponse.paymentReference) && o.LJ(this.refundableAmount, paymentDetailResponse.refundableAmount) && o.LJ(this.refundableCurrency, paymentDetailResponse.refundableCurrency) && o.LJ(this.refundDetails, paymentDetailResponse.refundDetails) && o.LJ(this.status, paymentDetailResponse.status) && o.LJ(this.successTime, paymentDetailResponse.successTime) && o.LJ(this.successUrl, paymentDetailResponse.successUrl) && o.LJ(this.presentToShopperDetails, paymentDetailResponse.presentToShopperDetails) && o.LJ(this.channelExtraInfo, paymentDetailResponse.channelExtraInfo) && o.LJ(this.profitSharing, paymentDetailResponse.profitSharing) && o.LJ(this.subsidyDetails, paymentDetailResponse.subsidyDetails) && o.LJ(this.processingFeeAmount, paymentDetailResponse.processingFeeAmount) && o.LJ(this.orderType, paymentDetailResponse.orderType) && o.LJ(this.subOrderDetails, paymentDetailResponse.subOrderDetails) && o.LJ(this.merchantUserId, paymentDetailResponse.merchantUserId) && o.LJ(this.merchantId, paymentDetailResponse.merchantId) && o.LJ(this.quoteAmount, paymentDetailResponse.quoteAmount) && o.LJ(this.quoteCurrency, paymentDetailResponse.quoteCurrency) && o.LJ(this.quoteFeeAmount, paymentDetailResponse.quoteFeeAmount) && o.LJ(this.paymentFeeAmount, paymentDetailResponse.paymentFeeAmount) && o.LJ(this.fxToken, paymentDetailResponse.fxToken) && o.LJ(this.fxRate, paymentDetailResponse.fxRate) && o.LJ(this.cashierDisplayInfo, paymentDetailResponse.cashierDisplayInfo) && o.LJ(this.paymentMethodInfo, paymentDetailResponse.paymentMethodInfo);
    }

    public int hashCode() {
        int hashCode = (((((getErrorCode() == null ? 0 : getErrorCode().hashCode()) * 31) + (getErrorMessage() == null ? 0 : getErrorMessage().hashCode())) * 31) + (getResultCode() == null ? 0 : getResultCode().hashCode())) * 31;
        String str = this.amount;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentChargeDetails paymentChargeDetails = this.chargeDetails;
        int hashCode3 = (hashCode2 + (paymentChargeDetails == null ? 0 : paymentChargeDetails.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expirationTime;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.initiateTime;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subMerchantId;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.merchantOrderId;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.message;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentReference;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.refundableAmount;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.refundableCurrency;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.refundDetails;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.status;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.successTime;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.successUrl;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.presentToShopperDetails;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        ChannelExtraInfo channelExtraInfo = this.channelExtraInfo;
        int hashCode19 = (hashCode18 + (channelExtraInfo == null ? 0 : channelExtraInfo.hashCode())) * 31;
        Boolean bool = this.profitSharing;
        int hashCode20 = (hashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        SubsidyDetails subsidyDetails = this.subsidyDetails;
        int hashCode21 = (hashCode20 + (subsidyDetails == null ? 0 : subsidyDetails.hashCode())) * 31;
        Amount amount = this.processingFeeAmount;
        int hashCode22 = (hashCode21 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str17 = this.orderType;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<SubOrderDetail> list = this.subOrderDetails;
        int hashCode24 = (hashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        String str18 = this.merchantUserId;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.merchantId;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.quoteAmount;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.quoteCurrency;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.quoteFeeAmount;
        int hashCode29 = (hashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.paymentFeeAmount;
        int hashCode30 = (hashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.fxToken;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.fxRate;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.cashierDisplayInfo;
        int hashCode33 = (hashCode32 + (str26 == null ? 0 : str26.hashCode())) * 31;
        PaymentMethodInfo paymentMethodInfo = this.paymentMethodInfo;
        return hashCode33 + (paymentMethodInfo != null ? paymentMethodInfo.hashCode() : 0);
    }

    public String toString() {
        return "PaymentDetailResponse(errorCode=" + ((Object) getErrorCode()) + ", errorMessage=" + ((Object) getErrorMessage()) + ", resultCode=" + ((Object) getResultCode()) + ", amount=" + ((Object) this.amount) + ", chargeDetails=" + this.chargeDetails + ", currency=" + ((Object) this.currency) + ", description=" + ((Object) this.description) + ", expirationTime=" + ((Object) this.expirationTime) + ", initiateTime=" + ((Object) this.initiateTime) + ", subMerchantId=" + ((Object) this.subMerchantId) + ", merchantOrderId=" + ((Object) this.merchantOrderId) + ", message=" + ((Object) this.message) + ", paymentReference=" + ((Object) this.paymentReference) + ", refundableAmount=" + ((Object) this.refundableAmount) + ", refundableCurrency=" + ((Object) this.refundableCurrency) + ", refundDetails=" + ((Object) this.refundDetails) + ", status=" + ((Object) this.status) + ", successTime=" + ((Object) this.successTime) + ", successUrl=" + ((Object) this.successUrl) + ", presentToShopperDetails=" + ((Object) this.presentToShopperDetails) + ", channelExtraInfo=" + this.channelExtraInfo + ", profitSharing=" + this.profitSharing + ", subsidyDetails=" + this.subsidyDetails + ", processingFeeAmount=" + this.processingFeeAmount + ", orderType=" + ((Object) this.orderType) + ", subOrderDetails=" + this.subOrderDetails + ", merchantUserId=" + ((Object) this.merchantUserId) + ", merchantId=" + ((Object) this.merchantId) + ", quoteAmount=" + ((Object) this.quoteAmount) + ", quoteCurrency=" + ((Object) this.quoteCurrency) + ", quoteFeeAmount=" + ((Object) this.quoteFeeAmount) + ", paymentFeeAmount=" + ((Object) this.paymentFeeAmount) + ", fxToken=" + ((Object) this.fxToken) + ", fxRate=" + ((Object) this.fxRate) + ", cashierDisplayInfo=" + ((Object) this.cashierDisplayInfo) + ", paymentMethodInfo=" + this.paymentMethodInfo + ')';
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCashierDisplayInfo() {
        return this.cashierDisplayInfo;
    }

    public final ChannelExtraInfo getChannelExtraInfo() {
        return this.channelExtraInfo;
    }

    public final PaymentChargeDetails getChargeDetails() {
        return this.chargeDetails;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getExpirationTime() {
        return this.expirationTime;
    }

    public final String getFxRate() {
        return this.fxRate;
    }

    public final String getFxToken() {
        return this.fxToken;
    }

    public final String getInitiateTime() {
        return this.initiateTime;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getMerchantOrderId() {
        return this.merchantOrderId;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getPaymentFeeAmount() {
        return this.paymentFeeAmount;
    }

    public final PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public final String getPaymentReference() {
        return this.paymentReference;
    }

    public final String getPresentToShopperDetails() {
        return this.presentToShopperDetails;
    }

    public final Amount getProcessingFeeAmount() {
        return this.processingFeeAmount;
    }

    public final Boolean getProfitSharing() {
        return this.profitSharing;
    }

    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    public final String getQuoteFeeAmount() {
        return this.quoteFeeAmount;
    }

    public final String getRefundDetails() {
        return this.refundDetails;
    }

    public final String getRefundableAmount() {
        return this.refundableAmount;
    }

    public final String getRefundableCurrency() {
        return this.refundableCurrency;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubMerchantId() {
        return this.subMerchantId;
    }

    public final List<SubOrderDetail> getSubOrderDetails() {
        return this.subOrderDetails;
    }

    public final SubsidyDetails getSubsidyDetails() {
        return this.subsidyDetails;
    }

    public final String getSuccessTime() {
        return this.successTime;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public final void setAmount(String str) {
        this.amount = str;
    }

    public final void setCashierDisplayInfo(String str) {
        this.cashierDisplayInfo = str;
    }

    public final void setChannelExtraInfo(ChannelExtraInfo channelExtraInfo) {
        this.channelExtraInfo = channelExtraInfo;
    }

    public final void setChargeDetails(PaymentChargeDetails paymentChargeDetails) {
        this.chargeDetails = paymentChargeDetails;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setExpirationTime(String str) {
        this.expirationTime = str;
    }

    public final void setFxRate(String str) {
        this.fxRate = str;
    }

    public final void setFxToken(String str) {
        this.fxToken = str;
    }

    public final void setInitiateTime(String str) {
        this.initiateTime = str;
    }

    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    public final void setMerchantOrderId(String str) {
        this.merchantOrderId = str;
    }

    public final void setMerchantUserId(String str) {
        this.merchantUserId = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final void setPaymentFeeAmount(String str) {
        this.paymentFeeAmount = str;
    }

    public final void setPaymentMethodInfo(PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public final void setPaymentReference(String str) {
        this.paymentReference = str;
    }

    public final void setPresentToShopperDetails(String str) {
        this.presentToShopperDetails = str;
    }

    public final void setProcessingFeeAmount(Amount amount) {
        this.processingFeeAmount = amount;
    }

    public final void setProfitSharing(Boolean bool) {
        this.profitSharing = bool;
    }

    public final void setQuoteAmount(String str) {
        this.quoteAmount = str;
    }

    public final void setQuoteCurrency(String str) {
        this.quoteCurrency = str;
    }

    public final void setQuoteFeeAmount(String str) {
        this.quoteFeeAmount = str;
    }

    public final void setRefundDetails(String str) {
        this.refundDetails = str;
    }

    public final void setRefundableAmount(String str) {
        this.refundableAmount = str;
    }

    public final void setRefundableCurrency(String str) {
        this.refundableCurrency = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setSubMerchantId(String str) {
        this.subMerchantId = str;
    }

    public final void setSubOrderDetails(List<SubOrderDetail> list) {
        this.subOrderDetails = list;
    }

    public final void setSubsidyDetails(SubsidyDetails subsidyDetails) {
        this.subsidyDetails = subsidyDetails;
    }

    public final void setSuccessTime(String str) {
        this.successTime = str;
    }

    public final void setSuccessUrl(String str) {
        this.successUrl = str;
    }

    public PaymentDetailResponse(String str, String str2, String str3, String str4, PaymentChargeDetails paymentChargeDetails, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ChannelExtraInfo channelExtraInfo, Boolean bool, SubsidyDetails subsidyDetails, Amount amount, String str20, List<SubOrderDetail> list, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, PaymentMethodInfo paymentMethodInfo) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.resultCode = str3;
        this.amount = str4;
        this.chargeDetails = paymentChargeDetails;
        this.currency = str5;
        this.description = str6;
        this.expirationTime = str7;
        this.initiateTime = str8;
        this.subMerchantId = str9;
        this.merchantOrderId = str10;
        this.message = str11;
        this.paymentReference = str12;
        this.refundableAmount = str13;
        this.refundableCurrency = str14;
        this.refundDetails = str15;
        this.status = str16;
        this.successTime = str17;
        this.successUrl = str18;
        this.presentToShopperDetails = str19;
        this.channelExtraInfo = channelExtraInfo;
        this.profitSharing = bool;
        this.subsidyDetails = subsidyDetails;
        this.processingFeeAmount = amount;
        this.orderType = str20;
        this.subOrderDetails = list;
        this.merchantUserId = str21;
        this.merchantId = str22;
        this.quoteAmount = str23;
        this.quoteCurrency = str24;
        this.quoteFeeAmount = str25;
        this.paymentFeeAmount = str26;
        this.fxToken = str27;
        this.fxRate = str28;
        this.cashierDisplayInfo = str29;
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public PaymentDetailResponse(String str, String str2, String str3, String str4, PaymentChargeDetails paymentChargeDetails, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ChannelExtraInfo channelExtraInfo, Boolean bool, SubsidyDetails subsidyDetails, Amount amount, String str20, List list, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, PaymentMethodInfo paymentMethodInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : paymentChargeDetails, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : str15, (65536 & i) != 0 ? null : str16, (131072 & i) != 0 ? null : str17, (262144 & i) != 0 ? null : str18, (524288 & i) != 0 ? null : str19, (1048576 & i) != 0 ? null : channelExtraInfo, (2097152 & i) != 0 ? null : bool, (4194304 & i) != 0 ? null : subsidyDetails, (8388608 & i) != 0 ? null : amount, (16777216 & i) != 0 ? null : str20, (33554432 & i) != 0 ? C61878OQg.INSTANCE : list, (67108864 & i) != 0 ? null : str21, (134217728 & i) != 0 ? null : str22, (268435456 & i) != 0 ? null : str23, (536870912 & i) != 0 ? null : str24, (1073741824 & i) != 0 ? null : str25, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str26, (i2 & 1) != 0 ? null : str27, (i2 & 2) != 0 ? null : str28, (i2 & 4) != 0 ? null : str29, (i2 & 8) == 0 ? paymentMethodInfo : null);
    }
}
