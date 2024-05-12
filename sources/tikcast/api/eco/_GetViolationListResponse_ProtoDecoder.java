package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetViolationListResponse_ProtoDecoder implements InterfaceC31105CIr<GetViolationListResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetViolationListResponse LIZ(Q9H q9h) {
        GetViolationListResponse getViolationListResponse = new GetViolationListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getViolationListResponse.extra = _GetViolationListResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    getViolationListResponse.data = _GetViolationListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getViolationListResponse;
            }
        }
    }
}
