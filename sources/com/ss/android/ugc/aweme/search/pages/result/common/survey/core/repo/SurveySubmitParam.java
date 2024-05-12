package com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class SurveySubmitParam extends F9E {

    @InterfaceC65349Pkn("keyword")
    public final String keyword;

    @InterfaceC65349Pkn("survey_answer_rating")
    public final int ratingAnswer;

    @InterfaceC65349Pkn("search_id")
    public final String searchId;

    @InterfaceC65349Pkn("survey_id")
    public final String surveyId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.surveyId, this.searchId, this.keyword, Integer.valueOf(this.ratingAnswer)};
    }

    public SurveySubmitParam(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "surveyId", str2, "searchId", str3, "keyword");
        this.surveyId = str;
        this.searchId = str2;
        this.keyword = str3;
        this.ratingAnswer = i;
    }
}
