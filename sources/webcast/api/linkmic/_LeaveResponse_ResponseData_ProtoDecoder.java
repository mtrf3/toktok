package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.linkmic.LeaveResponse;

/* loaded from: classes14.dex */
public final class _LeaveResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<LeaveResponse.ResponseData> {
    public static LeaveResponse.ResponseData LIZIZ(Q9H q9h) {
        LeaveResponse.ResponseData responseData = new LeaveResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.feedbackShowReason = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LeaveResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
