package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SurveyConfig extends F9E implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("question_data")
    public final List<QuestionData> questionData;

    @InterfaceC65349Pkn("survey_config_id")
    public final String surveyConfigId;

    @InterfaceC65349Pkn("survey_title")
    public final String surveyTitle;

    public SurveyConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyConfig copy$default(SurveyConfig surveyConfig, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyConfig.surveyConfigId;
        }
        if ((i & 2) != 0) {
            str2 = surveyConfig.surveyTitle;
        }
        if ((i & 4) != 0) {
            list = surveyConfig.questionData;
        }
        return surveyConfig.copy(str, str2, list);
    }

    public final SurveyConfig copy(String surveyConfigId, String surveyTitle, List<QuestionData> questionData) {
        o.LJIIIZ(surveyConfigId, "surveyConfigId");
        o.LJIIIZ(surveyTitle, "surveyTitle");
        o.LJIIIZ(questionData, "questionData");
        return new SurveyConfig(surveyConfigId, surveyTitle, questionData);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.surveyConfigId, this.surveyTitle, this.questionData};
    }

    public final List<QuestionData> getQuestionData() {
        return this.questionData;
    }

    public final String getSurveyConfigId() {
        return this.surveyConfigId;
    }

    public final String getSurveyTitle() {
        return this.surveyTitle;
    }

    public SurveyConfig(String surveyConfigId, String surveyTitle, List<QuestionData> questionData) {
        o.LJIIIZ(surveyConfigId, "surveyConfigId");
        o.LJIIIZ(surveyTitle, "surveyTitle");
        o.LJIIIZ(questionData, "questionData");
        this.surveyConfigId = surveyConfigId;
        this.surveyTitle = surveyTitle;
        this.questionData = questionData;
    }

    public SurveyConfig(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
