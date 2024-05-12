package com.ss.android.ugc.aweme.survey;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SurveyData extends F9E {

    @InterfaceC65349Pkn("answer1")
    public String answer1;

    @InterfaceC65349Pkn("answer2")
    public String answer2;

    @InterfaceC65349Pkn("dialog_id")
    public int dialogId;

    @InterfaceC65349Pkn("orig_answer1")
    public String originAnswer1;

    @InterfaceC65349Pkn("orig_answer2")
    public String originAnswer2;

    @InterfaceC65349Pkn("original_id")
    public int originId;

    @InterfaceC65349Pkn("orig_question")
    public String originalQuestion;

    @InterfaceC65349Pkn("question")
    public String question;

    @InterfaceC65349Pkn("end_sub_title")
    public String resultDesc;

    @InterfaceC65349Pkn("end_title")
    public String resultTitle;

    @InterfaceC65349Pkn("title")
    public String title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.dialogId), this.title, this.question, this.answer1, this.answer2, this.resultTitle, this.resultDesc, this.originalQuestion, Integer.valueOf(this.originId), this.originAnswer1, this.originAnswer2};
    }

    public SurveyData(int i, String title, String question, String answer1, String answer2, String resultTitle, String resultDesc, String originalQuestion, int i2, String originAnswer1, String originAnswer2) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(question, "question");
        o.LJIIIZ(answer1, "answer1");
        o.LJIIIZ(answer2, "answer2");
        o.LJIIIZ(resultTitle, "resultTitle");
        o.LJIIIZ(resultDesc, "resultDesc");
        o.LJIIIZ(originalQuestion, "originalQuestion");
        o.LJIIIZ(originAnswer1, "originAnswer1");
        o.LJIIIZ(originAnswer2, "originAnswer2");
        this.dialogId = i;
        this.title = title;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.resultTitle = resultTitle;
        this.resultDesc = resultDesc;
        this.originalQuestion = originalQuestion;
        this.originId = i2;
        this.originAnswer1 = originAnswer1;
        this.originAnswer2 = originAnswer2;
    }
}
