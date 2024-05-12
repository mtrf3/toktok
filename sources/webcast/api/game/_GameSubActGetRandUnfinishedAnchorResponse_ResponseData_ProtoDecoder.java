package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.GameSubActGetRandUnfinishedAnchorResponse;

/* loaded from: classes17.dex */
public final class _GameSubActGetRandUnfinishedAnchorResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameSubActGetRandUnfinishedAnchorResponse.ResponseData> {
    public static GameSubActGetRandUnfinishedAnchorResponse.ResponseData LIZIZ(Q9H q9h) {
        GameSubActGetRandUnfinishedAnchorResponse.ResponseData responseData = new GameSubActGetRandUnfinishedAnchorResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.anchorUserId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    responseData.anchorSecUserId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameSubActGetRandUnfinishedAnchorResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
