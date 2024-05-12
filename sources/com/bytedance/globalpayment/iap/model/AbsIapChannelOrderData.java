package com.bytedance.globalpayment.iap.model;

/* loaded from: classes14.dex */
public abstract class AbsIapChannelOrderData {
    public String mChannelOrderId;
    public String mExtraPayload;
    public boolean mIsAckEd;
    public boolean mIsNewSubscription;
    public boolean mIsSubscription;
    public String mMerchantId;
    public String mMerchantUserId;
    public String mProductId;
    public String mSelfOrderId;
    public String mSignature;
    public int mQuantity = 1;
    public String mOriginalJson = "";

    public abstract String getChannelToken();

    public abstract String getChannelUserId();

    public abstract String getDeveloperPayload();

    public abstract String getHost();

    public abstract int getOrderState();

    public abstract String getOriginalJson();

    public abstract IapPaymentMethod getPaymentMethod();

    public abstract String getSelfToken();

    public abstract String getSignature();

    public abstract boolean isOrderFromOtherSystem();

    public abstract boolean isOrderStateSuccess();

    public String getSelfOrderId() {
        String str = this.mSelfOrderId;
        if (str != null) {
            return str;
        }
        return "";
    }

    public String getChannelOrderId() {
        return this.mChannelOrderId;
    }

    public String getExtraPayload() {
        return this.mExtraPayload;
    }

    public String getMerchantId() {
        return this.mMerchantId;
    }

    public String getMerchantUserId() {
        return this.mMerchantUserId;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public boolean isAcknowledged() {
        return this.mIsAckEd;
    }

    public boolean isNewSubscription() {
        return this.mIsNewSubscription;
    }

    public boolean isSubscription() {
        return this.mIsSubscription;
    }
}
