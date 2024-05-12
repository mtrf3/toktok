package X;

import com.bytedance.android.livesdk.model.message.ControlMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYK implements InterfaceC31330CRi<ControlMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(ControlMessage controlMessage, CQQ context) {
        ControlMessage message = controlMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        int i = message.action;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }
}
