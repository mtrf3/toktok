package X;

import com.bytedance.android.livesdk.model.message.QuestionSwitchMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWJ implements InterfaceC30921CBp<QuestionSwitchMessage> {
    @Override // X.InterfaceC30921CBp
    public final CRD b5(QuestionSwitchMessage questionSwitchMessage) {
        QuestionSwitchMessage message = questionSwitchMessage;
        o.LJIIIZ(message, "message");
        return new BWI(message);
    }
}
