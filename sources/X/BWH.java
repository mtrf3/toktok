package X;

import android.text.SpannableString;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWH extends CQO<QuestionMessage> {
    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return new SpannableString(((QuestionMessage) this.LJIJJLI).question.content);
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((QuestionMessage) this.LJIJJLI).question.user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BWH(QuestionMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }
}
