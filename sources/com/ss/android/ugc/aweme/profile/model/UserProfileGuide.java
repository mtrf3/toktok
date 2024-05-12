package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileGuide implements Serializable {

    @InterfaceC65349Pkn("guide_text")
    public String guideContext;

    @InterfaceC65349Pkn("guide_key")
    public String guideContextKeyToReport;

    @InterfaceC65349Pkn("guide_weight")
    public int guideWeight;

    public static /* synthetic */ UserProfileGuide copy$default(UserProfileGuide userProfileGuide, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userProfileGuide.guideContext;
        }
        if ((i2 & 2) != 0) {
            str2 = userProfileGuide.guideContextKeyToReport;
        }
        if ((i2 & 4) != 0) {
            i = userProfileGuide.guideWeight;
        }
        return userProfileGuide.copy(str, str2, i);
    }

    public final UserProfileGuide copy(String str, String str2, int i) {
        return new UserProfileGuide(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileGuide)) {
            return false;
        }
        UserProfileGuide userProfileGuide = (UserProfileGuide) obj;
        return o.LJ(this.guideContext, userProfileGuide.guideContext) && o.LJ(this.guideContextKeyToReport, userProfileGuide.guideContextKeyToReport) && this.guideWeight == userProfileGuide.guideWeight;
    }

    public int hashCode() {
        String str = this.guideContext;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.guideContextKeyToReport;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.guideWeight;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserProfileGuide(guideContext=");
        LIZ.append(this.guideContext);
        LIZ.append(", guideContextKeyToReport=");
        LIZ.append(this.guideContextKeyToReport);
        LIZ.append(", guideWeight=");
        return b0.LIZJ(LIZ, this.guideWeight, ')', LIZ);
    }

    public final String getGuideContext() {
        return this.guideContext;
    }

    public final String getGuideContextKeyToReport() {
        return this.guideContextKeyToReport;
    }

    public final int getGuideWeight() {
        return this.guideWeight;
    }

    public final void setGuideContext(String str) {
        this.guideContext = str;
    }

    public final void setGuideContextKeyToReport(String str) {
        this.guideContextKeyToReport = str;
    }

    public final void setGuideWeight(int i) {
        this.guideWeight = i;
    }

    public UserProfileGuide(String str, String str2, int i) {
        this.guideContext = str;
        this.guideContextKeyToReport = str2;
        this.guideWeight = i;
    }

    public /* synthetic */ UserProfileGuide(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, str2, i);
    }
}
