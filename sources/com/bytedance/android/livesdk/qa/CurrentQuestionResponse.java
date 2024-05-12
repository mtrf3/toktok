package com.bytedance.android.livesdk.qa;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CurrentQuestionResponse extends F9E {

    @InterfaceC65349Pkn("current_question")
    public QuestionEx currentQuestion;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrentQuestionResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.currentQuestion};
    }

    public CurrentQuestionResponse(QuestionEx currentQuestion) {
        o.LJIIIZ(currentQuestion, "currentQuestion");
        this.currentQuestion = currentQuestion;
    }

    public /* synthetic */ CurrentQuestionResponse(QuestionEx questionEx, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new QuestionEx(null, 0L, 0, false, false, false, 0L, 0, 0, 511, null) : questionEx);
    }
}
