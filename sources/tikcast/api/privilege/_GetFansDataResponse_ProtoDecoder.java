package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetFansDataResponse_ProtoDecoder implements InterfaceC31105CIr<GetFansDataResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetFansDataResponse LIZ(Q9H q9h) {
        GetFansDataResponse getFansDataResponse = new GetFansDataResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getFansDataResponse.data = _GetFansDataResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getFansDataResponse;
            }
        }
    }
}
