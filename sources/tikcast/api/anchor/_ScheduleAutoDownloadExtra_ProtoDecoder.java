package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ScheduleAutoDownloadExtra_ProtoDecoder implements InterfaceC31105CIr<ScheduleAutoDownloadExtra> {
    public static ScheduleAutoDownloadExtra LIZIZ(Q9H q9h) {
        ScheduleAutoDownloadExtra scheduleAutoDownloadExtra = new ScheduleAutoDownloadExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    scheduleAutoDownloadExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return scheduleAutoDownloadExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ScheduleAutoDownloadExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
