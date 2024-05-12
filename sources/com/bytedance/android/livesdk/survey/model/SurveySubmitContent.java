package com.bytedance.android.livesdk.survey.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public class SurveySubmitContent {

    @InterfaceC65349Pkn("input")
    public String input;

    @InterfaceC65349Pkn("option_id")
    public long optionId;

    @InterfaceC65349Pkn("question_id")
    public String questionId;

    @InterfaceC65349Pkn("second_option_id")
    public String secondOptionId;

    public SurveySubmitContent(String str, long j) {
        this.questionId = str;
        this.optionId = j;
    }

    public SurveySubmitContent(String str, long j, String str2, String str3) {
        this.questionId = str;
        this.optionId = j;
        this.secondOptionId = str2;
        this.input = str3;
    }
}
