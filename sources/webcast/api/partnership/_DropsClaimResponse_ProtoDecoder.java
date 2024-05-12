package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DropsClaimResponse_ProtoDecoder implements InterfaceC31105CIr<DropsClaimResponse> {
    @Override // X.InterfaceC31105CIr
    public final DropsClaimResponse LIZ(Q9H q9h) {
        DropsClaimResponse dropsClaimResponse = new DropsClaimResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    dropsClaimResponse.data = _DropsClaimResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsClaimResponse;
            }
        }
    }
}
