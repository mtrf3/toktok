package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PreScheduleStreamExtra_ProtoDecoder implements InterfaceC31105CIr<PreScheduleStreamExtra> {
    public static PreScheduleStreamExtra LIZIZ(Q9H q9h) {
        PreScheduleStreamExtra preScheduleStreamExtra = new PreScheduleStreamExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    preScheduleStreamExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return preScheduleStreamExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PreScheduleStreamExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
