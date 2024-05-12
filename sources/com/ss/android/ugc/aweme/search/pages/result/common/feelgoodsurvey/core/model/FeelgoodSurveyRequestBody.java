package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeelgoodSurveyRequestBody extends F9E {

    @InterfaceC65349Pkn("platID")
    public final String platID;

    @InterfaceC65349Pkn("questionnaireID")
    public final String questionnaireID;

    @InterfaceC65349Pkn("reportParam")
    public final FeelgoodSurveyReportParam reportParam;

    @InterfaceC65349Pkn("submitID")
    public final String submitID;

    @InterfaceC65349Pkn("triggerKey")
    public final String triggerKey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.platID, this.triggerKey, this.reportParam, this.questionnaireID, this.submitID};
    }

    public FeelgoodSurveyRequestBody(String platID, String triggerKey, FeelgoodSurveyReportParam reportParam, String questionnaireID, String submitID) {
        o.LJIIIZ(platID, "platID");
        o.LJIIIZ(triggerKey, "triggerKey");
        o.LJIIIZ(reportParam, "reportParam");
        o.LJIIIZ(questionnaireID, "questionnaireID");
        o.LJIIIZ(submitID, "submitID");
        this.platID = platID;
        this.triggerKey = triggerKey;
        this.reportParam = reportParam;
        this.questionnaireID = questionnaireID;
        this.submitID = submitID;
    }

    public /* synthetic */ FeelgoodSurveyRequestBody(String str, String str2, FeelgoodSurveyReportParam feelgoodSurveyReportParam, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, feelgoodSurveyReportParam, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}
