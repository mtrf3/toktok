package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetABSStatusResponse_ProtoDecoder implements InterfaceC31105CIr<GetABSStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetABSStatusResponse LIZ(Q9H q9h) {
        GetABSStatusResponse getABSStatusResponse = new GetABSStatusResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getABSStatusResponse.data = _GetABSStatusResponse_ABSData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getABSStatusResponse;
            }
        }
    }
}
