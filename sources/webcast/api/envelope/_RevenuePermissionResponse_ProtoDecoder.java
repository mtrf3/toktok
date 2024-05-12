package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RevenuePermissionResponse_ProtoDecoder implements InterfaceC31105CIr<RevenuePermissionResponse> {
    @Override // X.InterfaceC31105CIr
    public final RevenuePermissionResponse LIZ(Q9H q9h) {
        RevenuePermissionResponse revenuePermissionResponse = new RevenuePermissionResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    revenuePermissionResponse.data = _RevenuePermissionResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return revenuePermissionResponse;
            }
        }
    }
}
