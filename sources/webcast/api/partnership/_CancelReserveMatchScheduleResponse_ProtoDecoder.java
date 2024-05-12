package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.CancelReserveMatchScheduleResponse;

/* loaded from: classes14.dex */
public final class _CancelReserveMatchScheduleResponse_ProtoDecoder implements InterfaceC31105CIr<CancelReserveMatchScheduleResponse> {
    @Override // X.InterfaceC31105CIr
    public final CancelReserveMatchScheduleResponse LIZ(Q9H q9h) {
        CancelReserveMatchScheduleResponse cancelReserveMatchScheduleResponse = new CancelReserveMatchScheduleResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    CancelReserveMatchScheduleResponse.ResponseData responseData = new CancelReserveMatchScheduleResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    cancelReserveMatchScheduleResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelReserveMatchScheduleResponse;
            }
        }
    }
}
