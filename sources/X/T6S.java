package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6S extends AbstractC65781Prl implements InterfaceC88471Ynr<QuestionDetailState, Bundle, QuestionDetailState> {
    public static final T6S INSTANCE = new T6S();

    public T6S() {
        super(2);
    }

    public final QuestionDetailState invoke(QuestionDetailState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ QuestionDetailState invoke(QuestionDetailState questionDetailState, Bundle bundle) {
        QuestionDetailState questionDetailState2 = questionDetailState;
        invoke(questionDetailState2, bundle);
        return questionDetailState2;
    }
}
