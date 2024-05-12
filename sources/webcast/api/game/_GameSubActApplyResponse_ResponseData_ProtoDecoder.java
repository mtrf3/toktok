package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.GameSubActApplyResponse;

/* loaded from: classes17.dex */
public final class _GameSubActApplyResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameSubActApplyResponse.ResponseData> {
    public static GameSubActApplyResponse.ResponseData LIZIZ(Q9H q9h) {
        GameSubActApplyResponse.ResponseData responseData = new GameSubActApplyResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameSubActApplyResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
