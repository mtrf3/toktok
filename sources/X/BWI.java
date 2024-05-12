package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.QuestionSwitchMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWI extends CQO<QuestionSwitchMessage> {
    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        int i;
        Boolean LIZ = ((QuestionSwitchMessage) this.LJIJJLI).LIZ();
        o.LJIIIIZZ(LIZ, "message.on");
        if (LIZ.booleanValue()) {
            i = R.string.osy;
        } else {
            i = R.string.ofj;
        }
        return C15380j0.LJIILJJIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BWI(QuestionSwitchMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }
}
