package com.bytedance.globalpayment.iap.common.ability.model;

import X.C16880lQ;
import X.C39670Fha;
import X.C77874UhK;
import X.C78273Unl;
import X.C78295Uo7;
import X.IO1;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class OrderData extends IO1 {
    public final String TAG;
    public AbsIapChannelOrderData mAbsIapChannelOrderData;
    public AbsIapProduct mAbsIapProduct;
    public volatile boolean mCanceled;
    public String mChannelUserId;
    public volatile boolean mConsumed;
    public volatile boolean mExecuted;
    public volatile boolean mFinished;
    public String mHost;
    public C78295Uo7 mIapPayMonitor;
    public C77874UhK mIapPayRequest;
    public IapPaymentMethod mIapPaymentMethod;
    public boolean mIsNewSubscription;
    public String mOfferToken;
    public String mOrderId;
    public PayType mPayType;
    public String mProductId;
    public volatile boolean mQuerySucceed;
    public long mStartPayTimeStamp;
    public String mUserId;
    public boolean orderFromOtherSystem;

    public void execute() {
        this.mExecuted = true;
    }

    public void finish() {
        this.mFinished = true;
    }

    public OrderInfo buildOrderInfo() {
        String str;
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setProductId(getProductId());
        orderInfo.setOrderId(getOrderId());
        orderInfo.setUserId(getUserId());
        orderInfo.setQuantity(getQuantity());
        C77874UhK c77874UhK = this.mIapPayRequest;
        if (c77874UhK == null) {
            str = "";
        } else {
            str = c77874UhK.LJIIJ;
        }
        orderInfo.setExtraPayload(str);
        orderInfo.setIapPaymentMethod(this.mIapPaymentMethod);
        return orderInfo;
    }

    public boolean isSuccess() {
        if (this.mExecuted && this.mConsumed && this.mQuerySucceed) {
            return true;
        }
        return false;
    }

    public void parseInfoFromBizContent() {
        JSONObject optJSONObject;
        String str = this.mIapPayRequest.LJFF;
        if (TextUtils.isEmpty(str)) {
            C77874UhK c77874UhK = this.mIapPayRequest;
            if (!c77874UhK.LJIIJJI) {
                this.mProductId = c77874UhK.LJIIIZ;
                this.mUserId = c77874UhK.LJ;
                if (c77874UhK.LJIIL.containsKey("OfferIDToken")) {
                    this.mOfferToken = this.mIapPayRequest.LJIIL.get("OfferIDToken");
                }
                this.mIapPaymentMethod = IapPaymentMethod.GOOGLE;
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = false;
            if (jSONObject.optBoolean("is_generic", false)) {
                this.mOrderId = jSONObject.optString("order_id");
                this.mProductId = jSONObject.optString("product_id");
                this.mUserId = jSONObject.optString("user_id");
                this.mIapPayRequest.LIZIZ = jSONObject.optString("merchant_id");
                this.mOfferToken = jSONObject.optString("offer_id_token", "");
                if (jSONObject.optString("product_type", "inapp").equals("subs")) {
                    this.mIsNewSubscription = true;
                } else {
                    this.mIsNewSubscription = false;
                }
                String optString = jSONObject.optString("payment_method");
                IapPaymentMethod iapPaymentMethod = IapPaymentMethod.GOOGLE;
                if (TextUtils.equals(optString, iapPaymentMethod.channelName)) {
                    this.mIapPaymentMethod = iapPaymentMethod;
                    return;
                }
                IapPaymentMethod iapPaymentMethod2 = IapPaymentMethod.AMAZON;
                if (TextUtils.equals(optString, iapPaymentMethod2.channelName)) {
                    this.mIapPaymentMethod = iapPaymentMethod2;
                    return;
                } else {
                    this.mIapPaymentMethod = iapPaymentMethod;
                    return;
                }
            }
            if (jSONObject.optInt("SubscriptionMode", -1) > 0) {
                z = true;
            }
            this.mIsNewSubscription = z;
            if (z) {
                String optString2 = jSONObject.optString("MerchantSubscriptionID");
                this.mOrderId = optString2;
                if (optString2.equals("")) {
                    this.mOrderId = jSONObject.optString("OrderID");
                }
                this.mUserId = jSONObject.optString("UserID");
                this.mProductId = jSONObject.optString("ProductID");
                this.mOfferToken = jSONObject.optString("OfferIDToken");
                this.mIapPaymentMethod = IapPaymentMethod.GOOGLE;
                return;
            }
            if (this.mIapPayRequest.LJII) {
                this.mIapPaymentMethod = IapPaymentMethod.GOOGLE;
                this.mOrderId = jSONObject.optString("MerchantSubscriptionID");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("UserInfo");
                if (optJSONObject2 != null) {
                    this.mUserId = optJSONObject2.optString("UserId");
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("ChannelSubscriptionParams");
                if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("GPParams")) != null) {
                    this.mProductId = optJSONObject.optString("ProductID");
                    return;
                }
                return;
            }
            this.mOrderId = jSONObject.optString("order_id");
            this.mUserId = jSONObject.optString("merchant_user_id");
            this.mProductId = new JSONObject(jSONObject.optString("goods_detail")).optString("product_id");
            String optString3 = jSONObject.optString("payment_method");
            IapPaymentMethod iapPaymentMethod3 = IapPaymentMethod.GOOGLE;
            if (TextUtils.equals(optString3, iapPaymentMethod3.channelName)) {
                this.mIapPaymentMethod = iapPaymentMethod3;
                return;
            }
            IapPaymentMethod iapPaymentMethod4 = IapPaymentMethod.AMAZON;
            if (TextUtils.equals(optString3, iapPaymentMethod4.channelName)) {
                this.mIapPaymentMethod = iapPaymentMethod4;
                return;
            }
            throw new RuntimeException("invalid payment_method!");
        } catch (JSONException e) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parse piporequest bizcontent has error:");
            LIZ.append(e.getLocalizedMessage());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
        }
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "user_id", this.mUserId);
        add(jSONObject, "order_id", this.mOrderId);
        add(jSONObject, "host", this.mHost);
        try {
            jSONObject.put("iap_pay_request", this.mIapPayRequest.toJson());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public int getQuantity() {
        if (getAbsIapChannelOrderData() != null) {
            return getAbsIapChannelOrderData().getQuantity();
        }
        return 1;
    }

    public AbsIapChannelOrderData getAbsIapChannelOrderData() {
        return this.mAbsIapChannelOrderData;
    }

    public AbsIapProduct getAbsIapProduct() {
        return this.mAbsIapProduct;
    }

    public String getChannelUserId() {
        return this.mChannelUserId;
    }

    public String getHost() {
        return this.mHost;
    }

    public C78295Uo7 getIapPayMonitor() {
        return this.mIapPayMonitor;
    }

    public C77874UhK getIapPayRequest() {
        return this.mIapPayRequest;
    }

    public IapPaymentMethod getIapPaymentMethod() {
        return this.mIapPaymentMethod;
    }

    public String getOfferToken() {
        return this.mOfferToken;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public PayType getPayType() {
        return this.mPayType;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public long getStartPayTimeStamp() {
        return this.mStartPayTimeStamp;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public boolean isConsumed() {
        return this.mConsumed;
    }

    public boolean isExecuted() {
        return this.mExecuted;
    }

    public boolean isFinished() {
        return this.mFinished;
    }

    public boolean isNewSubscription() {
        return this.mIsNewSubscription;
    }

    public boolean isOrderFromOtherSystem() {
        return this.orderFromOtherSystem;
    }

    public boolean isQuerySucceed() {
        return this.mQuerySucceed;
    }

    public OrderData(JSONObject jSONObject) {
        this.TAG = C16880lQ.LJLLJ(OrderData.class);
        this.mOfferToken = "";
        this.mPayType = PayType.NOMAL;
        try {
            this.mUserId = jSONObject.optString("user_id");
            this.mOrderId = jSONObject.optString("order_id");
            this.mHost = jSONObject.optString("host");
            this.mIapPayRequest = new C77874UhK(jSONObject.optJSONObject("iap_pay_request"));
        } catch (Throwable unused) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error to parse orderData from cache : orderDataJsonObject is ");
            LIZ.append(jSONObject);
            X1D.LIZIZ(LIZ);
            LJ.getClass();
        }
    }

    public OrderData setAbsIapChannelOrderData(AbsIapChannelOrderData absIapChannelOrderData) {
        this.mAbsIapChannelOrderData = absIapChannelOrderData;
        return this;
    }

    public OrderData setAbsIapProduct(AbsIapProduct absIapProduct) {
        this.mAbsIapProduct = absIapProduct;
        return this;
    }

    public OrderData setCanceled(boolean z) {
        this.mCanceled = z;
        return this;
    }

    public OrderData setChannelUserId(String str) {
        this.mChannelUserId = str;
        return this;
    }

    public OrderData setConsumed(boolean z) {
        this.mConsumed = z;
        return this;
    }

    public OrderData setExecuted(boolean z) {
        this.mExecuted = z;
        return this;
    }

    public OrderData setFinished(boolean z) {
        this.mFinished = z;
        return this;
    }

    public OrderData setHost(String str) {
        if (TextUtils.isEmpty(this.mHost)) {
            this.mHost = str;
        }
        return this;
    }

    public OrderData setIapPayMonitor(C78295Uo7 c78295Uo7) {
        this.mIapPayMonitor = c78295Uo7;
        return this;
    }

    public OrderData setIapPayRequest(C77874UhK c77874UhK) {
        this.mIapPayRequest = c77874UhK;
        return this;
    }

    public OrderData setIapPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        this.mIapPaymentMethod = iapPaymentMethod;
        return this;
    }

    public OrderData setNewSubscription(boolean z) {
        this.mIsNewSubscription = z;
        return this;
    }

    public OrderData setOrderFromOtherSystem(boolean z) {
        this.orderFromOtherSystem = z;
        return this;
    }

    public OrderData setOrderId(String str) {
        this.mOrderId = str;
        return this;
    }

    public OrderData setPayType(PayType payType) {
        this.mPayType = payType;
        return this;
    }

    public OrderData setProductId(String str) {
        this.mProductId = str;
        return this;
    }

    public OrderData setQuerySucceed(boolean z) {
        this.mQuerySucceed = z;
        return this;
    }

    public OrderData setStartPayTimeStamp(long j) {
        this.mStartPayTimeStamp = j;
        return this;
    }

    public OrderData setUserId(String str) {
        this.mUserId = str;
        return this;
    }

    public OrderData(C77874UhK c77874UhK) {
        this(c77874UhK, PayType.NOMAL);
    }

    public OrderData(C77874UhK c77874UhK, PayType payType) {
        this.TAG = C16880lQ.LJLLJ(OrderData.class);
        this.mOfferToken = "";
        this.mPayType = PayType.NOMAL;
        this.mStartPayTimeStamp = c77874UhK.LJIILIIL;
        this.mPayType = payType;
        this.mIapPayRequest = c77874UhK;
        this.orderFromOtherSystem = false;
        this.mHost = c77874UhK.LJIIIIZZ;
        parseInfoFromBizContent();
    }
}
