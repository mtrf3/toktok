package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.InterfaceC92088a56;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PayResponse implements InterfaceC92088a56 {

    @InterfaceC65349Pkn("channel_sdk_info")
    public ChannelSdkInfo channelSdkInfo;

    @InterfaceC65349Pkn("error_code")
    public String errorCode;

    @InterfaceC65349Pkn("error_message")
    public String errorMessage;

    @InterfaceC65349Pkn("expiration_time")
    public String expirationTime;

    @InterfaceC65349Pkn("merchant_order_id")
    public String merchantOrderId;

    @InterfaceC65349Pkn("payment_method_details")
    public String paymentMethodDetails;

    @InterfaceC65349Pkn("payment_method_info")
    public PaymentMethodInfo paymentMethodInfo;

    @InterfaceC65349Pkn("payment_method_token")
    public String paymentMethodToken;

    @InterfaceC65349Pkn("payment_reference")
    public String paymentReference;

    @InterfaceC65349Pkn("present_to_shopper_details")
    public String presentToShopperDetails;

    @InterfaceC65349Pkn("redirect_details")
    public RedirectDetails redirectDetails;

    @InterfaceC65349Pkn("result_code")
    public String resultCode;

    public static /* synthetic */ PayResponse copy$default(PayResponse payResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RedirectDetails redirectDetails, String str9, ChannelSdkInfo channelSdkInfo, PaymentMethodInfo paymentMethodInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payResponse.getErrorCode();
        }
        if ((i & 2) != 0) {
            str2 = payResponse.getErrorMessage();
        }
        if ((i & 4) != 0) {
            str3 = payResponse.getResultCode();
        }
        if ((i & 8) != 0) {
            str4 = payResponse.expirationTime;
        }
        if ((i & 16) != 0) {
            str5 = payResponse.paymentReference;
        }
        if ((i & 32) != 0) {
            str6 = payResponse.merchantOrderId;
        }
        if ((i & 64) != 0) {
            str7 = payResponse.paymentMethodDetails;
        }
        if ((i & 128) != 0) {
            str8 = payResponse.paymentMethodToken;
        }
        if ((i & 256) != 0) {
            redirectDetails = payResponse.redirectDetails;
        }
        if ((i & 512) != 0) {
            str9 = payResponse.presentToShopperDetails;
        }
        if ((i & 1024) != 0) {
            channelSdkInfo = payResponse.channelSdkInfo;
        }
        if ((i & 2048) != 0) {
            paymentMethodInfo = payResponse.paymentMethodInfo;
        }
        return payResponse.copy(str, str2, str3, str4, str5, str6, str7, str8, redirectDetails, str9, channelSdkInfo, paymentMethodInfo);
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

    public final PayResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RedirectDetails redirectDetails, String str9, ChannelSdkInfo channelSdkInfo, PaymentMethodInfo paymentMethodInfo) {
        return new PayResponse(str, str2, str3, str4, str5, str6, str7, str8, redirectDetails, str9, channelSdkInfo, paymentMethodInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayResponse)) {
            return false;
        }
        PayResponse payResponse = (PayResponse) obj;
        return o.LJ(getErrorCode(), payResponse.getErrorCode()) && o.LJ(getErrorMessage(), payResponse.getErrorMessage()) && o.LJ(getResultCode(), payResponse.getResultCode()) && o.LJ(this.expirationTime, payResponse.expirationTime) && o.LJ(this.paymentReference, payResponse.paymentReference) && o.LJ(this.merchantOrderId, payResponse.merchantOrderId) && o.LJ(this.paymentMethodDetails, payResponse.paymentMethodDetails) && o.LJ(this.paymentMethodToken, payResponse.paymentMethodToken) && o.LJ(this.redirectDetails, payResponse.redirectDetails) && o.LJ(this.presentToShopperDetails, payResponse.presentToShopperDetails) && o.LJ(this.channelSdkInfo, payResponse.channelSdkInfo) && o.LJ(this.paymentMethodInfo, payResponse.paymentMethodInfo);
    }

    public int hashCode() {
        int hashCode = (((((getErrorCode() == null ? 0 : getErrorCode().hashCode()) * 31) + (getErrorMessage() == null ? 0 : getErrorMessage().hashCode())) * 31) + (getResultCode() == null ? 0 : getResultCode().hashCode())) * 31;
        String str = this.expirationTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentReference;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantOrderId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentMethodDetails;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentMethodToken;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RedirectDetails redirectDetails = this.redirectDetails;
        int hashCode7 = (hashCode6 + (redirectDetails == null ? 0 : redirectDetails.hashCode())) * 31;
        String str6 = this.presentToShopperDetails;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ChannelSdkInfo channelSdkInfo = this.channelSdkInfo;
        int hashCode9 = (hashCode8 + (channelSdkInfo == null ? 0 : channelSdkInfo.hashCode())) * 31;
        PaymentMethodInfo paymentMethodInfo = this.paymentMethodInfo;
        return hashCode9 + (paymentMethodInfo != null ? paymentMethodInfo.hashCode() : 0);
    }

    public String toString() {
        return "PayResponse(errorCode=" + ((Object) getErrorCode()) + ", errorMessage=" + ((Object) getErrorMessage()) + ", resultCode=" + ((Object) getResultCode()) + ", expirationTime=" + ((Object) this.expirationTime) + ", paymentReference=" + ((Object) this.paymentReference) + ", merchantOrderId=" + ((Object) this.merchantOrderId) + ", paymentMethodDetails=" + ((Object) this.paymentMethodDetails) + ", paymentMethodToken=" + ((Object) this.paymentMethodToken) + ", redirectDetails=" + this.redirectDetails + ", presentToShopperDetails=" + ((Object) this.presentToShopperDetails) + ", channelSdkInfo=" + this.channelSdkInfo + ", paymentMethodInfo=" + this.paymentMethodInfo + ')';
    }

    public final ChannelSdkInfo getChannelSdkInfo() {
        return this.channelSdkInfo;
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

    public final String getMerchantOrderId() {
        return this.merchantOrderId;
    }

    public final String getPaymentMethodDetails() {
        return this.paymentMethodDetails;
    }

    public final PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public final String getPaymentReference() {
        return this.paymentReference;
    }

    public final String getPresentToShopperDetails() {
        return this.presentToShopperDetails;
    }

    public final RedirectDetails getRedirectDetails() {
        return this.redirectDetails;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public final void setChannelSdkInfo(ChannelSdkInfo channelSdkInfo) {
        this.channelSdkInfo = channelSdkInfo;
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

    public final void setMerchantOrderId(String str) {
        this.merchantOrderId = str;
    }

    public final void setPaymentMethodDetails(String str) {
        this.paymentMethodDetails = str;
    }

    public final void setPaymentMethodInfo(PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public final void setPaymentMethodToken(String str) {
        this.paymentMethodToken = str;
    }

    public final void setPaymentReference(String str) {
        this.paymentReference = str;
    }

    public final void setPresentToShopperDetails(String str) {
        this.presentToShopperDetails = str;
    }

    public final void setRedirectDetails(RedirectDetails redirectDetails) {
        this.redirectDetails = redirectDetails;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public PayResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RedirectDetails redirectDetails, String str9, ChannelSdkInfo channelSdkInfo, PaymentMethodInfo paymentMethodInfo) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.resultCode = str3;
        this.expirationTime = str4;
        this.paymentReference = str5;
        this.merchantOrderId = str6;
        this.paymentMethodDetails = str7;
        this.paymentMethodToken = str8;
        this.redirectDetails = redirectDetails;
        this.presentToShopperDetails = str9;
        this.channelSdkInfo = channelSdkInfo;
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public /* synthetic */ PayResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RedirectDetails redirectDetails, String str9, ChannelSdkInfo channelSdkInfo, PaymentMethodInfo paymentMethodInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : redirectDetails, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : channelSdkInfo, (i & 2048) == 0 ? paymentMethodInfo : null);
    }
}
