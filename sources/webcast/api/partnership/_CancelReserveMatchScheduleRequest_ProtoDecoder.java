package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _CancelReserveMatchScheduleRequest_ProtoDecoder implements InterfaceC31105CIr<CancelReserveMatchScheduleRequest> {
    @Override // X.InterfaceC31105CIr
    public final CancelReserveMatchScheduleRequest LIZ(Q9H q9h) {
        CancelReserveMatchScheduleRequest cancelReserveMatchScheduleRequest = new CancelReserveMatchScheduleRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cancelReserveMatchScheduleRequest.matchId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelReserveMatchScheduleRequest;
            }
        }
    }
}
