package X;

import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.SuggestedQuestionViewModel;

/* loaded from: classes6.dex */
public final class BVI extends AbstractC18980oo<Long, QuestionEx> {
    public final /* synthetic */ SuggestedQuestionViewModel LIZ;

    @Override // X.AbstractC18980oo
    public final AbstractC19010or<Long, QuestionEx> LIZ() {
        C28882BVe c28882BVe = this.LIZ.LJZL;
        if (c28882BVe != null) {
            return c28882BVe;
        }
        throw new IllegalStateException("questionDataSource is null");
    }

    public BVI(SuggestedQuestionViewModel suggestedQuestionViewModel) {
        this.LIZ = suggestedQuestionViewModel;
    }
}
