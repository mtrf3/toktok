package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StandardInfo implements Serializable {

    @InterfaceC65349Pkn("change_plan_text")
    public final String changePlanText;

    @InterfaceC65349Pkn("current_plan_text_label")
    public final String currentPlanTextLabel;

    @InterfaceC65349Pkn("offer_info")
    public final OfferInfo offerInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public StandardInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StandardInfo copy$default(StandardInfo standardInfo, String str, String str2, OfferInfo offerInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = standardInfo.currentPlanTextLabel;
        }
        if ((i & 2) != 0) {
            str2 = standardInfo.changePlanText;
        }
        if ((i & 4) != 0) {
            offerInfo = standardInfo.offerInfo;
        }
        return standardInfo.copy(str, str2, offerInfo);
    }

    public final StandardInfo copy(String str, String str2, OfferInfo offerInfo) {
        return new StandardInfo(str, str2, offerInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardInfo)) {
            return false;
        }
        StandardInfo standardInfo = (StandardInfo) obj;
        return o.LJ(this.currentPlanTextLabel, standardInfo.currentPlanTextLabel) && o.LJ(this.changePlanText, standardInfo.changePlanText) && o.LJ(this.offerInfo, standardInfo.offerInfo);
    }

    public int hashCode() {
        String str = this.currentPlanTextLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.changePlanText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        OfferInfo offerInfo = this.offerInfo;
        return hashCode2 + (offerInfo != null ? offerInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StandardInfo(currentPlanTextLabel=");
        LIZ.append(this.currentPlanTextLabel);
        LIZ.append(", changePlanText=");
        LIZ.append(this.changePlanText);
        LIZ.append(", offerInfo=");
        LIZ.append(this.offerInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getChangePlanText() {
        return this.changePlanText;
    }

    public final String getCurrentPlanTextLabel() {
        return this.currentPlanTextLabel;
    }

    public final OfferInfo getOfferInfo() {
        return this.offerInfo;
    }

    public StandardInfo(String str, String str2, OfferInfo offerInfo) {
        this.currentPlanTextLabel = str;
        this.changePlanText = str2;
        this.offerInfo = offerInfo;
    }

    public /* synthetic */ StandardInfo(String str, String str2, OfferInfo offerInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : offerInfo);
    }
}
