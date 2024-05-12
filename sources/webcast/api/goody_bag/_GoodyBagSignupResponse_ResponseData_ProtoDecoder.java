package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.GoodyBagSignupResponse;

/* loaded from: classes14.dex */
public final class _GoodyBagSignupResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GoodyBagSignupResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final GoodyBagSignupResponse.ResponseData LIZ(Q9H q9h) {
        GoodyBagSignupResponse.ResponseData responseData = new GoodyBagSignupResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
