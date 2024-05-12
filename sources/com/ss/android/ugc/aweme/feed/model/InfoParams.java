package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InfoParams {

    @InterfaceC65349Pkn("survey")
    public final SurveyInfo surveyInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InfoParams copy$default(InfoParams infoParams, SurveyInfo surveyInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            surveyInfo = infoParams.surveyInfo;
        }
        return infoParams.copy(surveyInfo);
    }

    public final InfoParams copy(SurveyInfo surveyInfo) {
        return new InfoParams(surveyInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoParams) && o.LJ(this.surveyInfo, ((InfoParams) obj).surveyInfo);
    }

    public int hashCode() {
        SurveyInfo surveyInfo = this.surveyInfo;
        if (surveyInfo == null) {
            return 0;
        }
        return surveyInfo.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InfoParams(surveyInfo=");
        LIZ.append(this.surveyInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public InfoParams(SurveyInfo surveyInfo) {
        this.surveyInfo = surveyInfo;
    }

    public /* synthetic */ InfoParams(SurveyInfo surveyInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : surveyInfo);
    }
}
