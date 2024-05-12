package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.GameSubActGetAnchorClaimNumResponse;

/* loaded from: classes17.dex */
public final class _GameSubActGetAnchorClaimNumResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameSubActGetAnchorClaimNumResponse.ResponseData> {
    public static GameSubActGetAnchorClaimNumResponse.ResponseData LIZIZ(Q9H q9h) {
        GameSubActGetAnchorClaimNumResponse.ResponseData responseData = new GameSubActGetAnchorClaimNumResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.canNotClaimReason = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        responseData.canClaim = Q9J.LIZ(q9h);
                    }
                } else {
                    responseData.claimNum = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameSubActGetAnchorClaimNumResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
