package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ReserveMatchScheduleRequest_ProtoDecoder implements InterfaceC31105CIr<ReserveMatchScheduleRequest> {
    @Override // X.InterfaceC31105CIr
    public final ReserveMatchScheduleRequest LIZ(Q9H q9h) {
        ReserveMatchScheduleRequest reserveMatchScheduleRequest = new ReserveMatchScheduleRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    reserveMatchScheduleRequest.matchId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reserveMatchScheduleRequest;
            }
        }
    }
}
