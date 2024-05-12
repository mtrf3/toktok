package com.bytedance.globalpayment.iap.model;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class AbsIapProduct {
    public IapChannelUserData mChannelUserData;
    public String mDescription;
    public AbsIapOneTimePurchaseOffer mOneTimePurchaseOffer;
    public String mProductId;
    public String mProductType;
    public List<AbsIapSubscriptionOffer> mSubscriptionOffer;
    public String mTitle;

    public String getPrice() {
        AbsIapOneTimePurchaseOffer absIapOneTimePurchaseOffer = this.mOneTimePurchaseOffer;
        if (absIapOneTimePurchaseOffer != null) {
            return absIapOneTimePurchaseOffer.getPrice();
        }
        List<AbsIapSubscriptionOffer> list = this.mSubscriptionOffer;
        if (list != null && list.size() > 0) {
            String basePrice = ((AbsIapSubscriptionOffer) ListProtector.get(this.mSubscriptionOffer, this.mSubscriptionOffer.size() - 1)).getBasePrice();
            for (AbsIapSubscriptionOffer absIapSubscriptionOffer : this.mSubscriptionOffer) {
                if (absIapSubscriptionOffer.getPricingPhases().size() == 1) {
                    return absIapSubscriptionOffer.getBasePrice();
                }
            }
            return basePrice;
        }
        return "";
    }

    public long getPriceAmountMicros() {
        AbsIapOneTimePurchaseOffer absIapOneTimePurchaseOffer = this.mOneTimePurchaseOffer;
        if (absIapOneTimePurchaseOffer != null) {
            return absIapOneTimePurchaseOffer.getPriceAmountMicros();
        }
        List<AbsIapSubscriptionOffer> list = this.mSubscriptionOffer;
        if (list != null && list.size() > 0) {
            long longValue = ((AbsIapSubscriptionOffer) ListProtector.get(this.mSubscriptionOffer, this.mSubscriptionOffer.size() - 1)).getBasePriceMicros().longValue();
            for (AbsIapSubscriptionOffer absIapSubscriptionOffer : this.mSubscriptionOffer) {
                if (absIapSubscriptionOffer.getPricingPhases().size() == 1) {
                    return absIapSubscriptionOffer.getBasePriceMicros().longValue();
                }
            }
            return longValue;
        }
        return 0L;
    }

    public String getPriceCurrencyCode() {
        AbsIapOneTimePurchaseOffer absIapOneTimePurchaseOffer = this.mOneTimePurchaseOffer;
        if (absIapOneTimePurchaseOffer != null) {
            return absIapOneTimePurchaseOffer.getPriceCurrencyCode();
        }
        List<AbsIapSubscriptionOffer> list = this.mSubscriptionOffer;
        if (list != null && list.size() > 0) {
            String currencyCode = ((AbsIapSubscriptionOffer) ListProtector.get(this.mSubscriptionOffer, this.mSubscriptionOffer.size() - 1)).getCurrencyCode();
            for (AbsIapSubscriptionOffer absIapSubscriptionOffer : this.mSubscriptionOffer) {
                if (absIapSubscriptionOffer.getPricingPhases().size() == 1) {
                    return absIapSubscriptionOffer.getCurrencyCode();
                }
            }
            return currencyCode;
        }
        return "";
    }

    public IapChannelUserData getChannelUserData() {
        return this.mChannelUserData;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public AbsIapOneTimePurchaseOffer getOneTimeProduct() {
        return this.mOneTimePurchaseOffer;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public String getProductType() {
        return this.mProductType;
    }

    public List<AbsIapSubscriptionOffer> getSubscriptionOffers() {
        return this.mSubscriptionOffer;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public AbsIapProduct setChannelUserData(IapChannelUserData iapChannelUserData) {
        this.mChannelUserData = iapChannelUserData;
        return this;
    }
}
