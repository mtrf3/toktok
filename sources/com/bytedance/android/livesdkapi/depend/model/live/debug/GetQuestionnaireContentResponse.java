package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GetQuestionnaireContentResponse extends F9E implements Serializable {

    @InterfaceC65349Pkn("questions")
    public List<Question> questions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetQuestionnaireContentResponse copy$default(GetQuestionnaireContentResponse getQuestionnaireContentResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getQuestionnaireContentResponse.questions;
        }
        return getQuestionnaireContentResponse.copy(list);
    }

    public final GetQuestionnaireContentResponse copy(List<Question> questions) {
        o.LJIIIZ(questions, "questions");
        return new GetQuestionnaireContentResponse(questions);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.questions};
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }

    public GetQuestionnaireContentResponse(List<Question> questions) {
        o.LJIIIZ(questions, "questions");
        this.questions = questions;
    }

    public final void setQuestions(List<Question> list) {
        o.LJIIIZ(list, "<set-?>");
        this.questions = list;
    }
}
