package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AdFreeSubscription implements Serializable {

    @InterfaceC65349Pkn("ad_free_trial_page_info")
    public final AdFreeTrialPageInfo adFreeTrialPageInfo;

    @InterfaceC65349Pkn("is_show_free_trial_pop_up")
    public final Boolean isShowFreeTrialPopUp;

    @InterfaceC65349Pkn("is_show_standard_scheduled_pop_up")
    public final Boolean isShowStandardScheduledPopUp;

    @InterfaceC65349Pkn("need_pop_up_subscription_page")
    public final Boolean needPopUpSubscriptionPage;

    @InterfaceC65349Pkn("pick_your_ad_plan_page")
    public final PickYourAdPlanPage pickYourAdPlanPage;

    @InterfaceC65349Pkn("standard_scheduled_start_time")
    public final Integer standardScheduledStartTime;

    @InterfaceC65349Pkn("subscription_mode")
    public final Integer subscriptionMode;

    @InterfaceC65349Pkn("subscription_status")
    public Integer subscriptionStatus;

    @InterfaceC65349Pkn("subscription_status_info")
    public final SubscriptionStatusInfo subscriptionStatusInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public AdFreeSubscription() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdFreeSubscription copy$default(AdFreeSubscription adFreeSubscription, Integer num, Integer num2, PickYourAdPlanPage pickYourAdPlanPage, AdFreeTrialPageInfo adFreeTrialPageInfo, SubscriptionStatusInfo subscriptionStatusInfo, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adFreeSubscription.subscriptionMode;
        }
        if ((i & 2) != 0) {
            num2 = adFreeSubscription.subscriptionStatus;
        }
        if ((i & 4) != 0) {
            pickYourAdPlanPage = adFreeSubscription.pickYourAdPlanPage;
        }
        if ((i & 8) != 0) {
            adFreeTrialPageInfo = adFreeSubscription.adFreeTrialPageInfo;
        }
        if ((i & 16) != 0) {
            subscriptionStatusInfo = adFreeSubscription.subscriptionStatusInfo;
        }
        if ((i & 32) != 0) {
            bool = adFreeSubscription.isShowFreeTrialPopUp;
        }
        if ((i & 64) != 0) {
            bool2 = adFreeSubscription.isShowStandardScheduledPopUp;
        }
        if ((i & 128) != 0) {
            num3 = adFreeSubscription.standardScheduledStartTime;
        }
        if ((i & 256) != 0) {
            bool3 = adFreeSubscription.needPopUpSubscriptionPage;
        }
        return adFreeSubscription.copy(num, num2, pickYourAdPlanPage, adFreeTrialPageInfo, subscriptionStatusInfo, bool, bool2, num3, bool3);
    }

    public final AdFreeSubscription copy(Integer num, Integer num2, PickYourAdPlanPage pickYourAdPlanPage, AdFreeTrialPageInfo adFreeTrialPageInfo, SubscriptionStatusInfo subscriptionStatusInfo, Boolean bool, Boolean bool2, Integer num3, Boolean bool3) {
        return new AdFreeSubscription(num, num2, pickYourAdPlanPage, adFreeTrialPageInfo, subscriptionStatusInfo, bool, bool2, num3, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFreeSubscription)) {
            return false;
        }
        AdFreeSubscription adFreeSubscription = (AdFreeSubscription) obj;
        return o.LJ(this.subscriptionMode, adFreeSubscription.subscriptionMode) && o.LJ(this.subscriptionStatus, adFreeSubscription.subscriptionStatus) && o.LJ(this.pickYourAdPlanPage, adFreeSubscription.pickYourAdPlanPage) && o.LJ(this.adFreeTrialPageInfo, adFreeSubscription.adFreeTrialPageInfo) && o.LJ(this.subscriptionStatusInfo, adFreeSubscription.subscriptionStatusInfo) && o.LJ(this.isShowFreeTrialPopUp, adFreeSubscription.isShowFreeTrialPopUp) && o.LJ(this.isShowStandardScheduledPopUp, adFreeSubscription.isShowStandardScheduledPopUp) && o.LJ(this.standardScheduledStartTime, adFreeSubscription.standardScheduledStartTime) && o.LJ(this.needPopUpSubscriptionPage, adFreeSubscription.needPopUpSubscriptionPage);
    }

    public int hashCode() {
        Integer num = this.subscriptionMode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.subscriptionStatus;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        PickYourAdPlanPage pickYourAdPlanPage = this.pickYourAdPlanPage;
        int hashCode3 = (hashCode2 + (pickYourAdPlanPage == null ? 0 : pickYourAdPlanPage.hashCode())) * 31;
        AdFreeTrialPageInfo adFreeTrialPageInfo = this.adFreeTrialPageInfo;
        int hashCode4 = (hashCode3 + (adFreeTrialPageInfo == null ? 0 : adFreeTrialPageInfo.hashCode())) * 31;
        SubscriptionStatusInfo subscriptionStatusInfo = this.subscriptionStatusInfo;
        int hashCode5 = (hashCode4 + (subscriptionStatusInfo == null ? 0 : subscriptionStatusInfo.hashCode())) * 31;
        Boolean bool = this.isShowFreeTrialPopUp;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isShowStandardScheduledPopUp;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.standardScheduledStartTime;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.needPopUpSubscriptionPage;
        return hashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdFreeSubscription(subscriptionMode=");
        LIZ.append(this.subscriptionMode);
        LIZ.append(", subscriptionStatus=");
        LIZ.append(this.subscriptionStatus);
        LIZ.append(", pickYourAdPlanPage=");
        LIZ.append(this.pickYourAdPlanPage);
        LIZ.append(", adFreeTrialPageInfo=");
        LIZ.append(this.adFreeTrialPageInfo);
        LIZ.append(", subscriptionStatusInfo=");
        LIZ.append(this.subscriptionStatusInfo);
        LIZ.append(", isShowFreeTrialPopUp=");
        LIZ.append(this.isShowFreeTrialPopUp);
        LIZ.append(", isShowStandardScheduledPopUp=");
        LIZ.append(this.isShowStandardScheduledPopUp);
        LIZ.append(", standardScheduledStartTime=");
        LIZ.append(this.standardScheduledStartTime);
        LIZ.append(", needPopUpSubscriptionPage=");
        return C78920UyC.LIZIZ(LIZ, this.needPopUpSubscriptionPage, ')', LIZ);
    }

    public final AdFreeTrialPageInfo getAdFreeTrialPageInfo() {
        return this.adFreeTrialPageInfo;
    }

    public final Boolean getNeedPopUpSubscriptionPage() {
        return this.needPopUpSubscriptionPage;
    }

    public final PickYourAdPlanPage getPickYourAdPlanPage() {
        return this.pickYourAdPlanPage;
    }

    public final Integer getStandardScheduledStartTime() {
        return this.standardScheduledStartTime;
    }

    public final Integer getSubscriptionMode() {
        return this.subscriptionMode;
    }

    public final Integer getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public final SubscriptionStatusInfo getSubscriptionStatusInfo() {
        return this.subscriptionStatusInfo;
    }

    public final Boolean isShowFreeTrialPopUp() {
        return this.isShowFreeTrialPopUp;
    }

    public final Boolean isShowStandardScheduledPopUp() {
        return this.isShowStandardScheduledPopUp;
    }

    public final void setSubscriptionStatus(Integer num) {
        this.subscriptionStatus = num;
    }

    public AdFreeSubscription(Integer num, Integer num2, PickYourAdPlanPage pickYourAdPlanPage, AdFreeTrialPageInfo adFreeTrialPageInfo, SubscriptionStatusInfo subscriptionStatusInfo, Boolean bool, Boolean bool2, Integer num3, Boolean bool3) {
        this.subscriptionMode = num;
        this.subscriptionStatus = num2;
        this.pickYourAdPlanPage = pickYourAdPlanPage;
        this.adFreeTrialPageInfo = adFreeTrialPageInfo;
        this.subscriptionStatusInfo = subscriptionStatusInfo;
        this.isShowFreeTrialPopUp = bool;
        this.isShowStandardScheduledPopUp = bool2;
        this.standardScheduledStartTime = num3;
        this.needPopUpSubscriptionPage = bool3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AdFreeSubscription(java.lang.Integer r13, java.lang.Integer r14, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage r15, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo r16, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo r17, java.lang.Boolean r18, java.lang.Boolean r19, java.lang.Integer r20, java.lang.Boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r1 = r22
            r11 = r21
            r4 = r14
            r3 = r13
            r5 = r15
            r6 = r16
            r8 = r18
            r9 = r19
            r2 = r1 & 1
            r0 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L17
            r3 = r10
        L17:
            r0 = r1 & 2
            if (r0 == 0) goto L20
            r0 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L20:
            r0 = r1 & 4
            r7 = 0
            if (r0 == 0) goto L26
            r5 = r7
        L26:
            r0 = r1 & 8
            if (r0 == 0) goto L2b
            r6 = r7
        L2b:
            r0 = r1 & 16
            if (r0 == 0) goto L4d
        L2f:
            r0 = r1 & 32
            if (r0 == 0) goto L35
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L35:
            r0 = r1 & 64
            if (r0 == 0) goto L3b
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
        L3b:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4a
        L3f:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L45
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L45:
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L4a:
            r10 = r20
            goto L3f
        L4d:
            r7 = r17
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription.<init>(java.lang.Integer, java.lang.Integer, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
