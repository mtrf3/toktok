package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetSubPrivilegeDetailRequest_ProtoDecoder implements InterfaceC31105CIr<GetSubPrivilegeDetailRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetSubPrivilegeDetailRequest LIZ(Q9H q9h) {
        GetSubPrivilegeDetailRequest getSubPrivilegeDetailRequest = new GetSubPrivilegeDetailRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                getSubPrivilegeDetailRequest.benefitScene = q9h.LJIIJ();
                            }
                        } else {
                            getSubPrivilegeDetailRequest.forAnchor = Q9J.LIZ(q9h);
                        }
                    } else {
                        getSubPrivilegeDetailRequest.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    getSubPrivilegeDetailRequest.secAnchorId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubPrivilegeDetailRequest;
            }
        }
    }
}
