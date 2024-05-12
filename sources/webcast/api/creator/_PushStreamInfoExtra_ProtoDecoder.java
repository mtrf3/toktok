package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PushStreamInfoExtra_ProtoDecoder implements InterfaceC31105CIr<PushStreamInfoExtra> {
    public static PushStreamInfoExtra LIZIZ(Q9H q9h) {
        PushStreamInfoExtra pushStreamInfoExtra = new PushStreamInfoExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    pushStreamInfoExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pushStreamInfoExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PushStreamInfoExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
