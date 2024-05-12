package X;

import com.bytedance.android.livesdk.model.message.LikeMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRM implements InterfaceC31343CRv {
    public static final CRM LIZ = new CRM();

    @Override // X.InterfaceC31343CRv
    public final boolean LIZ(CR6 message) {
        o.LJIIIZ(message, "message");
        if (message.getMessageType() == EnumC31509CYf.LIKE && (message instanceof LikeMessage) && !o.LJ(InterfaceC30442Bx8.LJJJI.LIZJ(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }
}
