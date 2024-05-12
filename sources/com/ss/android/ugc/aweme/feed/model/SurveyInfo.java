package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SurveyInfo {

    @InterfaceC65349Pkn("biz_params")
    public final PushParams bizParams;

    @InterfaceC65349Pkn("content_scope")
    public final String contentScope;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SurveyInfo copy$default(SurveyInfo surveyInfo, String str, PushParams pushParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyInfo.contentScope;
        }
        if ((i & 2) != 0) {
            pushParams = surveyInfo.bizParams;
        }
        return surveyInfo.copy(str, pushParams);
    }

    public final SurveyInfo copy(String str, PushParams pushParams) {
        return new SurveyInfo(str, pushParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyInfo)) {
            return false;
        }
        SurveyInfo surveyInfo = (SurveyInfo) obj;
        return o.LJ(this.contentScope, surveyInfo.contentScope) && o.LJ(this.bizParams, surveyInfo.bizParams);
    }

    public int hashCode() {
        String str = this.contentScope;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PushParams pushParams = this.bizParams;
        return hashCode + (pushParams != null ? pushParams.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SurveyInfo(contentScope=");
        LIZ.append(this.contentScope);
        LIZ.append(", bizParams=");
        LIZ.append(this.bizParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SurveyInfo(String str, PushParams pushParams) {
        this.contentScope = str;
        this.bizParams = pushParams;
    }

    public /* synthetic */ SurveyInfo(String str, PushParams pushParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : pushParams);
    }
}
