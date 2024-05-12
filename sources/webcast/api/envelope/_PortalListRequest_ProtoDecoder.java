package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _PortalListRequest_ProtoDecoder implements InterfaceC31105CIr<PortalListRequest> {
    @Override // X.InterfaceC31105CIr
    public final PortalListRequest LIZ(Q9H q9h) {
        PortalListRequest portalListRequest = new PortalListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        portalListRequest.anchorId = q9h.LJIIJJI();
                    }
                } else {
                    portalListRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return portalListRequest;
            }
        }
    }
}
