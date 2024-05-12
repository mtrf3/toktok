package com.bytedance.globalpayment.iap.model;

import X.C78261UnZ;
import X.C78273Unl;
import X.InterfaceC78268Ung;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.JsonName;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class TokenInfo {

    @JsonName("amount_value")
    public String amountValue;

    @JsonName("channel_order_id")
    public String channelOrderId;

    @JsonName("channel_user_id")
    public String channelUserId;

    @JsonName("currency")
    public String currency;
    public boolean isNewSubscription;
    public boolean isSubscription;

    @JsonName("order_from_other_system")
    public boolean orderFromOtherSystem;

    @JsonName("order_id")
    public String orderId;

    @JsonName("order_platform")
    public int orderPlatform;

    @JsonName("payment_method")
    public String paymentMethod;

    @JsonName("product_id")
    public String productId;

    @JsonName("token")
    public String token;

    @JsonName("merchant_user_id")
    public String userId;

    public JSONObject toJson() {
        if (this.isSubscription && !this.isNewSubscription) {
            return toSubscriptionJsonString();
        }
        return toPayJson();
    }

    public JSONObject toPayJson() {
        InterfaceC78268Ung interfaceC78268Ung;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("order_id", this.orderId);
        jSONObject.put("product_id", this.productId);
        if (TextUtils.isEmpty(this.userId) && (interfaceC78268Ung = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJ) != null) {
            this.userId = interfaceC78268Ung.getCurUserId();
        }
        jSONObject.put("merchant_user_id", this.userId);
        jSONObject.put("payment_method", this.paymentMethod);
        jSONObject.put("token", this.token);
        jSONObject.put("amount_value", this.amountValue);
        jSONObject.put("currency", this.currency);
        jSONObject.put("channel_order_id", this.channelOrderId);
        jSONObject.put("order_from_other_system", this.orderFromOtherSystem);
        jSONObject.put("channel_user_id", this.channelUserId);
        return jSONObject;
    }

    public JSONObject toSubscriptionJsonString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("MerchantSubscriptionID", this.orderId);
        jSONObject.put("ChannelType", 4);
        jSONObject.put("Token", this.token);
        return jSONObject;
    }

    public String getAmountValue() {
        return this.amountValue;
    }

    public String getChannelOrderId() {
        return this.channelOrderId;
    }

    public String getChannelUserId() {
        return this.channelUserId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public int getOrderPlatform() {
        return this.orderPlatform;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getToken() {
        return this.token;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isNewSubscription() {
        return this.isNewSubscription;
    }

    public boolean isOrderFromOtherSystem() {
        return this.orderFromOtherSystem;
    }

    public boolean isSubscription() {
        return this.isSubscription;
    }

    public TokenInfo setAmountValue(String str) {
        this.amountValue = str;
        return this;
    }

    public TokenInfo setChannelOrderId(String str) {
        this.channelOrderId = str;
        return this;
    }

    public TokenInfo setChannelUserId(String str) {
        this.channelUserId = str;
        return this;
    }

    public TokenInfo setCurrency(String str) {
        this.currency = str;
        return this;
    }

    public TokenInfo setNewSubscription(boolean z) {
        this.isNewSubscription = z;
        return this;
    }

    public TokenInfo setOrderFromOtherSystem(boolean z) {
        this.orderFromOtherSystem = z;
        return this;
    }

    public TokenInfo setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public TokenInfo setOrderPlatform(int i) {
        this.orderPlatform = i;
        return this;
    }

    public TokenInfo setPaymentMethod(String str) {
        this.paymentMethod = str;
        return this;
    }

    public TokenInfo setProductId(String str) {
        this.productId = str;
        return this;
    }

    public TokenInfo setSubscription(boolean z) {
        this.isSubscription = z;
        return this;
    }

    public TokenInfo setToken(String str) {
        this.token = str;
        return this;
    }

    public TokenInfo setUserId(String str) {
        this.userId = str;
        return this;
    }
}
