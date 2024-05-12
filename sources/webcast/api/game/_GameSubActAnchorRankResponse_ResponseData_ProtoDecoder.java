package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.game.GameSubActAnchorRankResponse;

/* loaded from: classes17.dex */
public final class _GameSubActAnchorRankResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameSubActAnchorRankResponse.ResponseData> {
    public static GameSubActAnchorRankResponse.ResponseData LIZIZ(Q9H q9h) {
        GameSubActAnchorRankResponse.ResponseData responseData = new GameSubActAnchorRankResponse.ResponseData();
        responseData.anchorRankList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.anchorRankList.add(_AnchorRank_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameSubActAnchorRankResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
