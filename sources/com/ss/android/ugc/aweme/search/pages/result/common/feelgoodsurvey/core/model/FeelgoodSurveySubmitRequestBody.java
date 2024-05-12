package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeelgoodSurveySubmitRequestBody extends F9E {

    @InterfaceC65349Pkn("answerData")
    public final List<AnswerData> answerData;

    @InterfaceC65349Pkn("platID")
    public final String platID;

    @InterfaceC65349Pkn("questionnaireID")
    public final String questionnaireID;

    @InterfaceC65349Pkn("reportParam")
    public final FeelgoodSurveyReportParam reportParam;

    @InterfaceC65349Pkn("submitCost")
    public final long submitCost;

    @InterfaceC65349Pkn("submitID")
    public final String submitID;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.platID, this.questionnaireID, this.submitID, Long.valueOf(this.submitCost), this.reportParam, this.answerData};
    }

    public FeelgoodSurveySubmitRequestBody(String platID, String questionnaireID, String submitID, long j, FeelgoodSurveyReportParam reportParam, List<AnswerData> answerData) {
        o.LJIIIZ(platID, "platID");
        o.LJIIIZ(questionnaireID, "questionnaireID");
        o.LJIIIZ(submitID, "submitID");
        o.LJIIIZ(reportParam, "reportParam");
        o.LJIIIZ(answerData, "answerData");
        this.platID = platID;
        this.questionnaireID = questionnaireID;
        this.submitID = submitID;
        this.submitCost = j;
        this.reportParam = reportParam;
        this.answerData = answerData;
    }
}
