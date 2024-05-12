package com.ss.android.ugc.aweme.qnasearch.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class QnaSearchSuggestionExtraInfo extends F9E {

    @InterfaceC65349Pkn("cut_query")
    public final String cutQuery;

    @InterfaceC65349Pkn("is_history_sug")
    public final int isHistorySug;

    @InterfaceC65349Pkn("lang")
    public final String lang;

    @InterfaceC65349Pkn("question_answer_count")
    public final String questionAnswerCount;

    @InterfaceC65349Pkn("question_id")
    public final String questionId;

    @InterfaceC65349Pkn("recall_reason")
    public final String recallReason;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.cutQuery, Integer.valueOf(this.isHistorySug), this.lang, this.recallReason, this.questionId, this.questionAnswerCount};
    }

    public QnaSearchSuggestionExtraInfo(String cutQuery, int i, String lang, String recallReason, String questionId, String questionAnswerCount) {
        o.LJIIIZ(cutQuery, "cutQuery");
        o.LJIIIZ(lang, "lang");
        o.LJIIIZ(recallReason, "recallReason");
        o.LJIIIZ(questionId, "questionId");
        o.LJIIIZ(questionAnswerCount, "questionAnswerCount");
        this.cutQuery = cutQuery;
        this.isHistorySug = i;
        this.lang = lang;
        this.recallReason = recallReason;
        this.questionId = questionId;
        this.questionAnswerCount = questionAnswerCount;
    }
}
