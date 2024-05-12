package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.ReserveMatchScheduleResponse;

/* loaded from: classes14.dex */
public final class _ReserveMatchScheduleResponse_ProtoDecoder implements InterfaceC31105CIr<ReserveMatchScheduleResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReserveMatchScheduleResponse LIZ(Q9H q9h) {
        ReserveMatchScheduleResponse reserveMatchScheduleResponse = new ReserveMatchScheduleResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    ReserveMatchScheduleResponse.ResponseData responseData = new ReserveMatchScheduleResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    reserveMatchScheduleResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return reserveMatchScheduleResponse;
            }
        }
    }
}
