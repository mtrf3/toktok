package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.SubActClaimResponse;

/* loaded from: classes17.dex */
public final class _SubActClaimResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SubActClaimResponse.ResponseData> {
    public static SubActClaimResponse.ResponseData LIZIZ(Q9H q9h) {
        SubActClaimResponse.ResponseData responseData = new SubActClaimResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.reward = _Reward_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.failReason = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubActClaimResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
