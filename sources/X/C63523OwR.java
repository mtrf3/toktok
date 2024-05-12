package X;

import com.bytedance.im.core.proto.Response;

/* renamed from: X.OwR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63523OwR extends AbstractC63527OwV {
    @Override // X.InterfaceC63520OwO
    public final EnumC63524OwS getPriority() {
        return EnumC63524OwS.HIGH;
    }

    public C63523OwR(C63587OxT c63587OxT) {
        super(c63587OxT);
    }

    public static boolean LJ(Integer num) {
        if (num != null && num.intValue() == EnumC63625Oy5.SEND_MESSAGE.getValue()) {
            C47922IrO.LIZ();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC63520OwO
    public final boolean LIZJ(Response response) {
        return LJ(response.cmd);
    }

    @Override // X.InterfaceC63520OwO
    public final boolean LIZLLL(C63622Oy2 c63622Oy2) {
        return LJ(Integer.valueOf(c63622Oy2.LJFF()));
    }
}
