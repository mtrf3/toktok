package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetUserLinkmicStatusResponse_ProtoDecoder implements InterfaceC31105CIr<GetUserLinkmicStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetUserLinkmicStatusResponse LIZ(Q9H q9h) {
        GetUserLinkmicStatusResponse getUserLinkmicStatusResponse = new GetUserLinkmicStatusResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getUserLinkmicStatusResponse.data = _GetUserLinkmicStatusResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getUserLinkmicStatusResponse;
            }
        }
    }
}
