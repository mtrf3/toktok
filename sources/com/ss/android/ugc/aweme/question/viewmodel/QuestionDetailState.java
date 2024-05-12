package com.ss.android.ugc.aweme.question.viewmodel;

import X.AbstractC26082ALm;
import X.C26092ALw;
import X.F9E;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QuestionDetailState extends F9E implements InterfaceC61312at {
    public final AbstractC26082ALm<QuestionDetailResponse> questionDetail;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionDetailState copy$default(QuestionDetailState questionDetailState, AbstractC26082ALm abstractC26082ALm, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC26082ALm = questionDetailState.questionDetail;
        }
        return questionDetailState.copy(abstractC26082ALm);
    }

    public final QuestionDetailState copy(AbstractC26082ALm<QuestionDetailResponse> questionDetail) {
        o.LJIIIZ(questionDetail, "questionDetail");
        return new QuestionDetailState(questionDetail);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.questionDetail};
    }

    public final AbstractC26082ALm<QuestionDetailResponse> getQuestionDetail() {
        return this.questionDetail;
    }

    public QuestionDetailState(AbstractC26082ALm<QuestionDetailResponse> questionDetail) {
        o.LJIIIZ(questionDetail, "questionDetail");
        this.questionDetail = questionDetail;
    }

    public /* synthetic */ QuestionDetailState(AbstractC26082ALm abstractC26082ALm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C26092ALw.LIZ : abstractC26082ALm);
    }
}
