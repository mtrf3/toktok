package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GoodyBagSignupRequest_ProtoDecoder implements InterfaceC31105CIr<GoodyBagSignupRequest> {
    @Override // X.InterfaceC31105CIr
    public final GoodyBagSignupRequest LIZ(Q9H q9h) {
        GoodyBagSignupRequest goodyBagSignupRequest = new GoodyBagSignupRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        goodyBagSignupRequest.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    goodyBagSignupRequest.goodyBagId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagSignupRequest;
            }
        }
    }
}