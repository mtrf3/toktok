package com.ss.android.ugc.aweme.bnpl.network.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BNPLEntryData implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("completed_step_codes")
    public List<StepItem> completedStepItems;

    @InterfaceC65349Pkn("failed_step_codes")
    public List<StepItem> failedStepItems;

    @InterfaceC65349Pkn("institution_info")
    public final Institution institutionInfo;

    @InterfaceC65349Pkn("next_step_code")
    public StepItem nextStepItem;

    @InterfaceC65349Pkn("order_id")
    public final String orderId;

    @InterfaceC65349Pkn("privacy_policies")
    public final ArrayList<Object> policies;

    @InterfaceC65349Pkn("fp_session_id")
    public final String sessionId;

    @InterfaceC65349Pkn("step_code_configs")
    public final ArrayList<StepItem> stepCodeConfigs;

    @InterfaceC65349Pkn("url_configs")
    public final StepUrlConfigs urlConfigs;

    @InterfaceC65349Pkn("user_agreement")
    public final UserAgreement userAgreement;

    @InterfaceC65349Pkn("verify_info")
    public String verifyInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BNPLEntryData copy$default(BNPLEntryData bNPLEntryData, Institution institution, ArrayList arrayList, StepItem stepItem, List list, List list2, ArrayList arrayList2, String str, String str2, String str3, StepUrlConfigs stepUrlConfigs, UserAgreement userAgreement, int i, Object obj) {
        if ((i & 1) != 0) {
            institution = bNPLEntryData.institutionInfo;
        }
        if ((i & 2) != 0) {
            arrayList = bNPLEntryData.stepCodeConfigs;
        }
        if ((i & 4) != 0) {
            stepItem = bNPLEntryData.nextStepItem;
        }
        if ((i & 8) != 0) {
            list = bNPLEntryData.completedStepItems;
        }
        if ((i & 16) != 0) {
            list2 = bNPLEntryData.failedStepItems;
        }
        if ((i & 32) != 0) {
            arrayList2 = bNPLEntryData.policies;
        }
        if ((i & 64) != 0) {
            str = bNPLEntryData.verifyInfo;
        }
        if ((i & 128) != 0) {
            str2 = bNPLEntryData.orderId;
        }
        if ((i & 256) != 0) {
            str3 = bNPLEntryData.sessionId;
        }
        if ((i & 512) != 0) {
            stepUrlConfigs = bNPLEntryData.urlConfigs;
        }
        if ((i & 1024) != 0) {
            userAgreement = bNPLEntryData.userAgreement;
        }
        return bNPLEntryData.copy(institution, arrayList, stepItem, list, list2, arrayList2, str, str2, str3, stepUrlConfigs, userAgreement);
    }

    public final BNPLEntryData copy(Institution institutionInfo, ArrayList<StepItem> stepCodeConfigs, StepItem nextStepItem, List<StepItem> completedStepItems, List<StepItem> failedStepItems, ArrayList<Object> arrayList, String str, String orderId, String sessionId, StepUrlConfigs stepUrlConfigs, UserAgreement userAgreement) {
        o.LJIIIZ(institutionInfo, "institutionInfo");
        o.LJIIIZ(stepCodeConfigs, "stepCodeConfigs");
        o.LJIIIZ(nextStepItem, "nextStepItem");
        o.LJIIIZ(completedStepItems, "completedStepItems");
        o.LJIIIZ(failedStepItems, "failedStepItems");
        o.LJIIIZ(orderId, "orderId");
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(userAgreement, "userAgreement");
        return new BNPLEntryData(institutionInfo, stepCodeConfigs, nextStepItem, completedStepItems, failedStepItems, arrayList, str, orderId, sessionId, stepUrlConfigs, userAgreement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BNPLEntryData)) {
            return false;
        }
        BNPLEntryData bNPLEntryData = (BNPLEntryData) obj;
        return o.LJ(this.institutionInfo, bNPLEntryData.institutionInfo) && o.LJ(this.stepCodeConfigs, bNPLEntryData.stepCodeConfigs) && o.LJ(this.nextStepItem, bNPLEntryData.nextStepItem) && o.LJ(this.completedStepItems, bNPLEntryData.completedStepItems) && o.LJ(this.failedStepItems, bNPLEntryData.failedStepItems) && o.LJ(this.policies, bNPLEntryData.policies) && o.LJ(this.verifyInfo, bNPLEntryData.verifyInfo) && o.LJ(this.orderId, bNPLEntryData.orderId) && o.LJ(this.sessionId, bNPLEntryData.sessionId) && o.LJ(this.urlConfigs, bNPLEntryData.urlConfigs) && o.LJ(this.userAgreement, bNPLEntryData.userAgreement);
    }

    public int hashCode() {
        int hashCode = ((((((((this.institutionInfo.hashCode() * 31) + this.stepCodeConfigs.hashCode()) * 31) + this.nextStepItem.hashCode()) * 31) + this.completedStepItems.hashCode()) * 31) + this.failedStepItems.hashCode()) * 31;
        ArrayList<Object> arrayList = this.policies;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str = this.verifyInfo;
        int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.orderId.hashCode()) * 31) + this.sessionId.hashCode()) * 31;
        StepUrlConfigs stepUrlConfigs = this.urlConfigs;
        return ((hashCode3 + (stepUrlConfigs != null ? stepUrlConfigs.hashCode() : 0)) * 31) + this.userAgreement.hashCode();
    }

    public String toString() {
        return "BNPLEntryData(institutionInfo=" + this.institutionInfo + ", stepCodeConfigs=" + this.stepCodeConfigs + ", nextStepItem=" + this.nextStepItem + ", completedStepItems=" + this.completedStepItems + ", failedStepItems=" + this.failedStepItems + ", policies=" + this.policies + ", verifyInfo=" + this.verifyInfo + ", orderId=" + this.orderId + ", sessionId=" + this.sessionId + ", urlConfigs=" + this.urlConfigs + ", userAgreement=" + this.userAgreement + ')';
    }

    public final List<StepItem> getCompletedStepItems() {
        return this.completedStepItems;
    }

    public final List<StepItem> getFailedStepItems() {
        return this.failedStepItems;
    }

    public final Institution getInstitutionInfo() {
        return this.institutionInfo;
    }

    public final StepItem getNextStepItem() {
        return this.nextStepItem;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final ArrayList<Object> getPolicies() {
        return this.policies;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final ArrayList<StepItem> getStepCodeConfigs() {
        return this.stepCodeConfigs;
    }

    public final StepUrlConfigs getUrlConfigs() {
        return this.urlConfigs;
    }

    public final UserAgreement getUserAgreement() {
        return this.userAgreement;
    }

    public final String getVerifyInfo() {
        return this.verifyInfo;
    }

    public final void setCompletedStepItems(List<StepItem> list) {
        o.LJIIIZ(list, "<set-?>");
        this.completedStepItems = list;
    }

    public final void setFailedStepItems(List<StepItem> list) {
        o.LJIIIZ(list, "<set-?>");
        this.failedStepItems = list;
    }

    public final void setNextStepItem(StepItem stepItem) {
        o.LJIIIZ(stepItem, "<set-?>");
        this.nextStepItem = stepItem;
    }

    public final void setVerifyInfo(String str) {
        this.verifyInfo = str;
    }

    public BNPLEntryData(Institution institutionInfo, ArrayList<StepItem> stepCodeConfigs, StepItem nextStepItem, List<StepItem> completedStepItems, List<StepItem> failedStepItems, ArrayList<Object> arrayList, String str, String orderId, String sessionId, StepUrlConfigs stepUrlConfigs, UserAgreement userAgreement) {
        o.LJIIIZ(institutionInfo, "institutionInfo");
        o.LJIIIZ(stepCodeConfigs, "stepCodeConfigs");
        o.LJIIIZ(nextStepItem, "nextStepItem");
        o.LJIIIZ(completedStepItems, "completedStepItems");
        o.LJIIIZ(failedStepItems, "failedStepItems");
        o.LJIIIZ(orderId, "orderId");
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(userAgreement, "userAgreement");
        this.institutionInfo = institutionInfo;
        this.stepCodeConfigs = stepCodeConfigs;
        this.nextStepItem = nextStepItem;
        this.completedStepItems = completedStepItems;
        this.failedStepItems = failedStepItems;
        this.policies = arrayList;
        this.verifyInfo = str;
        this.orderId = orderId;
        this.sessionId = sessionId;
        this.urlConfigs = stepUrlConfigs;
        this.userAgreement = userAgreement;
    }

    public BNPLEntryData(Institution institution, ArrayList arrayList, StepItem stepItem, List list, List list2, ArrayList arrayList2, String str, String str2, String str3, StepUrlConfigs stepUrlConfigs, UserAgreement userAgreement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(institution, arrayList, stepItem, (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? C61878OQg.INSTANCE : list2, arrayList2, str, str2, str3, stepUrlConfigs, userAgreement);
    }
}
