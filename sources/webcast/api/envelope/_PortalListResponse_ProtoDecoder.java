package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PortalListResponse_ProtoDecoder implements InterfaceC31105CIr<PortalListResponse> {
    @Override // X.InterfaceC31105CIr
    public final PortalListResponse LIZ(Q9H q9h) {
        PortalListResponse portalListResponse = new PortalListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    portalListResponse.data = _PortalListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return portalListResponse;
            }
        }
    }
}
