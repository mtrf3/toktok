package X;

import com.bytedance.common.utility.Logger;

/* renamed from: X.QOq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66932QOq implements InterfaceC66937QOv {
    public final InterfaceC66931QOp LIZ;

    public AbstractC66932QOq(InterfaceC66931QOp interfaceC66931QOp) {
        this.LIZ = interfaceC66931QOp;
    }

    public final EnumC66933QOr LIZIZ(int i, int i2, boolean z) {
        EnumC66933QOr enumC66933QOr = EnumC66933QOr.CONNECTION_UNKNOWN;
        if (i2 != 0) {
            if (i2 == 1) {
                enumC66933QOr = EnumC66933QOr.CONNECTING;
            } else if (i2 == 2) {
                enumC66933QOr = EnumC66933QOr.CONNECT_FAILED;
            } else if (i2 == 3) {
                enumC66933QOr = EnumC66933QOr.CONNECT_CLOSED;
            } else if (i2 == 4) {
                enumC66933QOr = EnumC66933QOr.CONNECTED;
            }
        }
        Logger.debug();
        this.LIZ.syncState(i, enumC66933QOr, z);
        return enumC66933QOr;
    }
}
