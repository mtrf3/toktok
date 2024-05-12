package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ScheduleAutoDownloadData_ProtoDecoder implements InterfaceC31105CIr<ScheduleAutoDownloadData> {
    public static ScheduleAutoDownloadData LIZIZ(Q9H q9h) {
        ScheduleAutoDownloadData scheduleAutoDownloadData = new ScheduleAutoDownloadData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    scheduleAutoDownloadData.scheduleSuccess = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return scheduleAutoDownloadData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ScheduleAutoDownloadData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
