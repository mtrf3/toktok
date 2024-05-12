package X;

import com.bytedance.android.livesdk.model.message.QuestionMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYL implements InterfaceC31330CRi<QuestionMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(QuestionMessage message, CQQ context) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        return !C1DH.LJJIIJ(context.LJIIIIZZ);
    }
}
