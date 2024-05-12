package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _SubActClaimRequest_ProtoDecoder implements InterfaceC31105CIr<SubActClaimRequest> {
    @Override // X.InterfaceC31105CIr
    public final SubActClaimRequest LIZ(Q9H q9h) {
        SubActClaimRequest subActClaimRequest = new SubActClaimRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subActClaimRequest.anchorIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subActClaimRequest.claimType = q9h.LJIIJ();
                    }
                } else {
                    subActClaimRequest.activityId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subActClaimRequest;
            }
        }
    }
}
