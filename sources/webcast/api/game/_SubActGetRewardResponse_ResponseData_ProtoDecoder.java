package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.SubActGetRewardResponse;

/* loaded from: classes17.dex */
public final class _SubActGetRewardResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SubActGetRewardResponse.ResponseData> {
    public static SubActGetRewardResponse.ResponseData LIZIZ(Q9H q9h) {
        SubActGetRewardResponse.ResponseData responseData = new SubActGetRewardResponse.ResponseData();
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
                    responseData.haveClaimed = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubActGetRewardResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
