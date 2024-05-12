package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LeaveResponse_ProtoDecoder implements InterfaceC31105CIr<LeaveResponse> {
    @Override // X.InterfaceC31105CIr
    public final LeaveResponse LIZ(Q9H q9h) {
        LeaveResponse leaveResponse = new LeaveResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    leaveResponse.data = _LeaveResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return leaveResponse;
            }
        }
    }
}
