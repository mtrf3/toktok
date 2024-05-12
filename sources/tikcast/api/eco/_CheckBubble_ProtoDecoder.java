package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CheckBubble_ProtoDecoder implements InterfaceC31105CIr<CheckBubble> {
    public static CheckBubble LIZIZ(Q9H q9h) {
        CheckBubble checkBubble = new CheckBubble();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    checkBubble.showEntranceBubble = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return checkBubble;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CheckBubble LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
