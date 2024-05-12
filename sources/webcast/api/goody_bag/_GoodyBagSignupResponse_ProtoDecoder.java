package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.GoodyBagSignupResponse;

/* loaded from: classes14.dex */
public final class _GoodyBagSignupResponse_ProtoDecoder implements InterfaceC31105CIr<GoodyBagSignupResponse> {
    @Override // X.InterfaceC31105CIr
    public final GoodyBagSignupResponse LIZ(Q9H q9h) {
        GoodyBagSignupResponse goodyBagSignupResponse = new GoodyBagSignupResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    GoodyBagSignupResponse.ResponseData responseData = new GoodyBagSignupResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    goodyBagSignupResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagSignupResponse;
            }
        }
    }
}
