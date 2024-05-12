package com.bytedance.android.live.iap.model.response.iap;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class IapSubscriptionProduct {

    @InterfaceC65349Pkn("basePlanId")
    public String basePlanId;

    @InterfaceC65349Pkn("offerId")
    public String offerId;

    @InterfaceC65349Pkn("offerTags")
    public List<String> offerTags;

    @InterfaceC65349Pkn("offerToken")
    public String offerToken;

    @InterfaceC65349Pkn("pricingPhases")
    public List<IapSubscriptionOfferPricing> pricingPhases;

    public IapSubscriptionProduct(String str, String str2, String str3, List<IapSubscriptionOfferPricing> pricingPhases, List<String> list) {
        o.LJIIIZ(pricingPhases, "pricingPhases");
        this.offerToken = str;
        this.basePlanId = str2;
        this.offerId = str3;
        this.pricingPhases = pricingPhases;
        this.offerTags = list;
    }

    /* loaded from: classes.dex */
    public static final class IapSubscriptionOfferPricing extends AbsIapPricing {

        @InterfaceC65349Pkn("billingCycleCount")
        public final int billingCycleCount;

        @InterfaceC65349Pkn("billingPeriod")
        public final String billingPeriod;

        @InterfaceC65349Pkn("recurrenceMode")
        public final int recurrenceMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IapSubscriptionOfferPricing(String str, long j, String str2, String billingPeriod, int i, int i2) {
            super(str, j, str2);
            o.LJIIIZ(billingPeriod, "billingPeriod");
            this.billingPeriod = billingPeriod;
            this.billingCycleCount = i;
            this.recurrenceMode = i2;
        }
    }
}
