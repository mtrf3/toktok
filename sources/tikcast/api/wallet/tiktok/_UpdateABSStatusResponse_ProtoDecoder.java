package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UpdateABSStatusResponse_ProtoDecoder implements InterfaceC31105CIr<UpdateABSStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final UpdateABSStatusResponse LIZ(Q9H q9h) {
        UpdateABSStatusResponse updateABSStatusResponse = new UpdateABSStatusResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    updateABSStatusResponse.data = _UpdateABSStatusResponse_ABSData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return updateABSStatusResponse;
            }
        }
    }
}
