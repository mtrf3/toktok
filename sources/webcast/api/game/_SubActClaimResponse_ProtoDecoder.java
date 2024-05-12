package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubActClaimResponse_ProtoDecoder implements InterfaceC31105CIr<SubActClaimResponse> {
    @Override // X.InterfaceC31105CIr
    public final SubActClaimResponse LIZ(Q9H q9h) {
        SubActClaimResponse subActClaimResponse = new SubActClaimResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subActClaimResponse.data = _SubActClaimResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subActClaimResponse;
            }
        }
    }
}
