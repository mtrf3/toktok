package com.ss.android.ugc.aweme.feed.model.survey;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SurveyInfo implements Serializable {

    @InterfaceC65349Pkn("biz_params")
    public String bitParams;

    @InterfaceC65349Pkn("content_scope")
    public String contentScope;

    @InterfaceC65349Pkn("replace")
    public ReplaceInfo replacement;

    @InterfaceC65349Pkn("survey_key")
    public String surveyKey;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SurveyInfo copy$default(SurveyInfo surveyInfo, String str, String str2, String str3, ReplaceInfo replaceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyInfo.surveyKey;
        }
        if ((i & 2) != 0) {
            str2 = surveyInfo.contentScope;
        }
        if ((i & 4) != 0) {
            str3 = surveyInfo.bitParams;
        }
        if ((i & 8) != 0) {
            replaceInfo = surveyInfo.replacement;
        }
        return surveyInfo.copy(str, str2, str3, replaceInfo);
    }

    public final SurveyInfo copy(String str, String str2, String str3, ReplaceInfo replaceInfo) {
        return new SurveyInfo(str, str2, str3, replaceInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyInfo)) {
            return false;
        }
        SurveyInfo surveyInfo = (SurveyInfo) obj;
        return o.LJ(this.surveyKey, surveyInfo.surveyKey) && o.LJ(this.contentScope, surveyInfo.contentScope) && o.LJ(this.bitParams, surveyInfo.bitParams) && o.LJ(this.replacement, surveyInfo.replacement);
    }

    public int hashCode() {
        String str = this.surveyKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentScope;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bitParams;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ReplaceInfo replaceInfo = this.replacement;
        return hashCode3 + (replaceInfo != null ? replaceInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SurveyInfo(surveyKey=");
        LIZ.append(this.surveyKey);
        LIZ.append(", contentScope=");
        LIZ.append(this.contentScope);
        LIZ.append(", bitParams=");
        LIZ.append(this.bitParams);
        LIZ.append(", replacement=");
        LIZ.append(this.replacement);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getBitParams() {
        return this.bitParams;
    }

    public final String getContentScope() {
        return this.contentScope;
    }

    public final ReplaceInfo getReplacement() {
        return this.replacement;
    }

    public final String getSurveyKey() {
        return this.surveyKey;
    }

    public final void setSurveyKey(String str) {
        this.surveyKey = str;
    }

    public SurveyInfo(String str, String str2, String str3, ReplaceInfo replaceInfo) {
        this.surveyKey = str;
        this.contentScope = str2;
        this.bitParams = str3;
        this.replacement = replaceInfo;
    }

    public /* synthetic */ SurveyInfo(String str, String str2, String str3, ReplaceInfo replaceInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : replaceInfo);
    }
}
