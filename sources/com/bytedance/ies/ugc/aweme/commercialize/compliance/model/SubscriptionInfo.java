package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SubscriptionInfo implements Serializable {

    @InterfaceC65349Pkn("cancel_subscription_button_text")
    public final String cancelSubscriptionButtonText;

    @InterfaceC65349Pkn("current_plan_text_label")
    public final String currentPlanTextLabel;

    @InterfaceC65349Pkn("subscription_expire_timestamp")
    public final Integer expireTimestamp;

    @InterfaceC65349Pkn("subscription_expire_timestamp_text")
    public final String expireTimestampText;

    @InterfaceC65349Pkn("offer_info")
    public final OfferInfo offerInfo;

    @InterfaceC65349Pkn("subscription_start_timestamp")
    public final Integer startTimestamp;

    @InterfaceC65349Pkn("subscription_start_timestamp_text")
    public final String startTimestampText;

    public static /* synthetic */ SubscriptionInfo copy$default(SubscriptionInfo subscriptionInfo, String str, String str2, Integer num, String str3, Integer num2, OfferInfo offerInfo, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionInfo.currentPlanTextLabel;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionInfo.startTimestampText;
        }
        if ((i & 4) != 0) {
            num = subscriptionInfo.startTimestamp;
        }
        if ((i & 8) != 0) {
            str3 = subscriptionInfo.expireTimestampText;
        }
        if ((i & 16) != 0) {
            num2 = subscriptionInfo.expireTimestamp;
        }
        if ((i & 32) != 0) {
            offerInfo = subscriptionInfo.offerInfo;
        }
        if ((i & 64) != 0) {
            str4 = subscriptionInfo.cancelSubscriptionButtonText;
        }
        return subscriptionInfo.copy(str, str2, num, str3, num2, offerInfo, str4);
    }

    public final SubscriptionInfo copy(String str, String str2, Integer num, String str3, Integer num2, OfferInfo offerInfo, String str4) {
        return new SubscriptionInfo(str, str2, num, str3, num2, offerInfo, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionInfo)) {
            return false;
        }
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
        return o.LJ(this.currentPlanTextLabel, subscriptionInfo.currentPlanTextLabel) && o.LJ(this.startTimestampText, subscriptionInfo.startTimestampText) && o.LJ(this.startTimestamp, subscriptionInfo.startTimestamp) && o.LJ(this.expireTimestampText, subscriptionInfo.expireTimestampText) && o.LJ(this.expireTimestamp, subscriptionInfo.expireTimestamp) && o.LJ(this.offerInfo, subscriptionInfo.offerInfo) && o.LJ(this.cancelSubscriptionButtonText, subscriptionInfo.cancelSubscriptionButtonText);
    }

    public int hashCode() {
        String str = this.currentPlanTextLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.startTimestampText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.startTimestamp;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.expireTimestampText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.expireTimestamp;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        OfferInfo offerInfo = this.offerInfo;
        int hashCode6 = (hashCode5 + (offerInfo == null ? 0 : offerInfo.hashCode())) * 31;
        String str4 = this.cancelSubscriptionButtonText;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscriptionInfo(currentPlanTextLabel=");
        LIZ.append(this.currentPlanTextLabel);
        LIZ.append(", startTimestampText=");
        LIZ.append(this.startTimestampText);
        LIZ.append(", startTimestamp=");
        LIZ.append(this.startTimestamp);
        LIZ.append(", expireTimestampText=");
        LIZ.append(this.expireTimestampText);
        LIZ.append(", expireTimestamp=");
        LIZ.append(this.expireTimestamp);
        LIZ.append(", offerInfo=");
        LIZ.append(this.offerInfo);
        LIZ.append(", cancelSubscriptionButtonText=");
        return q.LIZIZ(LIZ, this.cancelSubscriptionButtonText, ')', LIZ);
    }

    public final String getCancelSubscriptionButtonText() {
        return this.cancelSubscriptionButtonText;
    }

    public final String getCurrentPlanTextLabel() {
        return this.currentPlanTextLabel;
    }

    public final Integer getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public final String getExpireTimestampText() {
        return this.expireTimestampText;
    }

    public final OfferInfo getOfferInfo() {
        return this.offerInfo;
    }

    public final Integer getStartTimestamp() {
        return this.startTimestamp;
    }

    public final String getStartTimestampText() {
        return this.startTimestampText;
    }

    public SubscriptionInfo(String str, String str2, Integer num, String str3, Integer num2, OfferInfo offerInfo, String str4) {
        this.currentPlanTextLabel = str;
        this.startTimestampText = str2;
        this.startTimestamp = num;
        this.expireTimestampText = str3;
        this.expireTimestamp = num2;
        this.offerInfo = offerInfo;
        this.cancelSubscriptionButtonText = str4;
    }

    public /* synthetic */ SubscriptionInfo(String str, String str2, Integer num, String str3, Integer num2, OfferInfo offerInfo, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, num2, (i & 32) != 0 ? null : offerInfo, str4);
    }
}
