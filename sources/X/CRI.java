package X;

import com.bytedance.android.livesdk.model.message.SocialMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRI implements InterfaceC31343CRv {
    public static final CRI LIZ = new CRI();

    @Override // X.InterfaceC31343CRv
    public final boolean LIZ(CR6 message) {
        o.LJIIIZ(message, "message");
        if (message.getMessageType() == EnumC31509CYf.SOCIAL && (message instanceof SocialMessage) && !o.LJ(InterfaceC30442Bx8.LJJJ.LIZJ(), Boolean.TRUE) && ((SocialMessage) message).action == 1) {
            return true;
        }
        return false;
    }
}
