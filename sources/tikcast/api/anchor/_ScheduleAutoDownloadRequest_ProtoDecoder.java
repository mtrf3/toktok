package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ScheduleAutoDownloadRequest_ProtoDecoder implements InterfaceC31105CIr<ScheduleAutoDownloadRequest> {
    @Override // X.InterfaceC31105CIr
    public final ScheduleAutoDownloadRequest LIZ(Q9H q9h) {
        ScheduleAutoDownloadRequest scheduleAutoDownloadRequest = new ScheduleAutoDownloadRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    scheduleAutoDownloadRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return scheduleAutoDownloadRequest;
            }
        }
    }
}
