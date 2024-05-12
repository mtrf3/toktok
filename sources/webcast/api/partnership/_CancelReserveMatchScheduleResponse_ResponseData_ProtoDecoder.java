package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.CancelReserveMatchScheduleResponse;

/* loaded from: classes14.dex */
public final class _CancelReserveMatchScheduleResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CancelReserveMatchScheduleResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final CancelReserveMatchScheduleResponse.ResponseData LIZ(Q9H q9h) {
        CancelReserveMatchScheduleResponse.ResponseData responseData = new CancelReserveMatchScheduleResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
