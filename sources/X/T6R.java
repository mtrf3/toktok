package X;

import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6R extends AbstractC65781Prl implements InterfaceC88471Ynr<QuestionDetailState, AbstractC26082ALm<? extends QuestionDetailResponse>, QuestionDetailState> {
    public static final T6R LJLIL = new T6R();

    public T6R() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final QuestionDetailState invoke(QuestionDetailState questionDetailState, AbstractC26082ALm<? extends QuestionDetailResponse> abstractC26082ALm) {
        QuestionDetailState execute = questionDetailState;
        AbstractC26082ALm<? extends QuestionDetailResponse> state = abstractC26082ALm;
        o.LJIIIZ(execute, "$this$execute");
        o.LJIIIZ(state, "state");
        return execute.copy(state);
    }
}
