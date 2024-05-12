package com.bytedance.globalpayment.iap.model;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes14.dex */
public class AbsIapSubscriptionOffer {
    public String mBasePlanId;
    public String mOfferId;
    public String mOfferToken;
    public List<AbsIapSubscriptionPricing> mPricingPhases;
    public List<String> offerTags;

    public String getBasePrice() {
        int size = this.mPricingPhases.size();
        if (size > 0) {
            return ((AbsIapPricingPhase) ListProtector.get(this.mPricingPhases, size - 1)).getPrice();
        }
        return "";
    }

    public Long getBasePriceMicros() {
        int size = this.mPricingPhases.size();
        if (size > 0) {
            return Long.valueOf(((AbsIapPricingPhase) ListProtector.get(this.mPricingPhases, size - 1)).getPriceAmountMicros());
        }
        return 0L;
    }

    public String getCurrencyCode() {
        int size = this.mPricingPhases.size();
        if (size > 0) {
            return ((AbsIapPricingPhase) ListProtector.get(this.mPricingPhases, size - 1)).getPriceCurrencyCode();
        }
        return "";
    }

    /* loaded from: classes14.dex */
    public static class AbsIapSubscriptionPricing extends AbsIapPricingPhase {
        public final int billingCycleCount;
        public final String billingPeriod;
        public final int recurrenceMode;

        public int getBillingCycleCount() {
            return this.billingCycleCount;
        }

        public String getBillingPeriod() {
            return this.billingPeriod;
        }

        public int getRecurrenceMode() {
            return this.recurrenceMode;
        }

        public AbsIapSubscriptionPricing(String str, long j, String str2, String str3, int i, int i2) {
            super(str, j, str2);
            this.billingPeriod = str3;
            this.billingCycleCount = i;
            this.recurrenceMode = i2;
        }
    }

    public String getBasePlanId() {
        return this.mBasePlanId;
    }

    public String getOfferId() {
        return this.mOfferId;
    }

    public List<String> getOfferTags() {
        return this.offerTags;
    }

    public String getOfferToken() {
        return this.mOfferToken;
    }

    public List<AbsIapSubscriptionPricing> getPricingPhases() {
        return this.mPricingPhases;
    }

    public AbsIapSubscriptionOffer(String str, String str2, String str3, List<AbsIapSubscriptionPricing> list, List<String> list2) {
        this.mOfferToken = str;
        this.mBasePlanId = str2;
        this.mOfferId = str3;
        this.mPricingPhases = list;
        this.offerTags = list2;
    }
}
