package X;

import com.bytedance.android.livesdk.model.message.MemberMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRH implements InterfaceC31343CRv {
    public static final CRH LIZ = new CRH();

    @Override // X.InterfaceC31343CRv
    public final boolean LIZ(CR6 message) {
        o.LJIIIZ(message, "message");
        if (message.getMessageType() == EnumC31509CYf.MEMBER && (message instanceof MemberMessage) && !o.LJ(InterfaceC30442Bx8.LJJIZ.LIZJ(), Boolean.TRUE) && ((MemberMessage) message).action == 1) {
            return true;
        }
        return false;
    }
}
