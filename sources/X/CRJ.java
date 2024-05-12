package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRJ implements InterfaceC31343CRv {
    public static final CRJ LIZ = new CRJ();

    @Override // X.InterfaceC31343CRv
    public final boolean LIZ(CR6 message) {
        o.LJIIIZ(message, "message");
        int intType = message.getMessageType().getIntType();
        if ((intType == EnumC31509CYf.GIFT.getIntType() || intType == EnumC31509CYf.DOODLE_GIFT.getIntType()) && !o.LJ(InterfaceC30442Bx8.LJJIJIIJIL.LIZJ(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }
}
