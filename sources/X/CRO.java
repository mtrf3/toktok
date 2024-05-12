package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRO implements InterfaceC31343CRv {
    public static final CRO LIZ = new CRO();

    @Override // X.InterfaceC31343CRv
    public final boolean LIZ(CR6 message) {
        o.LJIIIZ(message, "message");
        if (message.getMessageType() == EnumC31509CYf.CHAT && !o.LJ(InterfaceC30442Bx8.LJJIJIIJI.LIZJ(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }
}
