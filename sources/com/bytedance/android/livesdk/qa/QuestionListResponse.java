package com.bytedance.android.livesdk.qa;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QuestionListResponse extends F9E {

    @InterfaceC65349Pkn("answered_list")
    public QuestionList answeredList;

    @InterfaceC65349Pkn("current_question")
    public QuestionEx currentQuestion;

    @InterfaceC65349Pkn("invited_list")
    public QuestionList invitedList;

    @InterfaceC65349Pkn("unanswered_list")
    public final QuestionList unansweredList;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionListResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.unansweredList, this.answeredList, this.invitedList, this.currentQuestion};
    }

    public QuestionListResponse(QuestionList unansweredList, QuestionList answeredList, QuestionList invitedList, QuestionEx currentQuestion) {
        o.LJIIIZ(unansweredList, "unansweredList");
        o.LJIIIZ(answeredList, "answeredList");
        o.LJIIIZ(invitedList, "invitedList");
        o.LJIIIZ(currentQuestion, "currentQuestion");
        this.unansweredList = unansweredList;
        this.answeredList = answeredList;
        this.invitedList = invitedList;
        this.currentQuestion = currentQuestion;
    }

    public /* synthetic */ QuestionListResponse(QuestionList questionList, QuestionList questionList2, QuestionList questionList3, QuestionEx questionEx, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new QuestionList(null, false, null, 7, null) : questionList, (i & 2) != 0 ? new QuestionList(null, false, null, 7, null) : questionList2, (i & 4) != 0 ? new QuestionList(null, false, null, 7, null) : questionList3, (i & 8) != 0 ? new QuestionEx(null, 0L, 0, false, false, false, 0L, 0, 0, 511, null) : questionEx);
    }
}
