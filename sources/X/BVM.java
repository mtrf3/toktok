package X;

import com.bytedance.android.livesdk.qa.QuestionEx;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BVM extends AbstractC03160Am<QuestionEx> {
    @Override // X.AbstractC03160Am
    public final boolean LIZ(QuestionEx questionEx, QuestionEx questionEx2) {
        return o.LJ(questionEx, questionEx2);
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(QuestionEx questionEx, QuestionEx questionEx2) {
        if (questionEx.question.questionId == questionEx2.question.questionId) {
            return true;
        }
        return false;
    }
}
