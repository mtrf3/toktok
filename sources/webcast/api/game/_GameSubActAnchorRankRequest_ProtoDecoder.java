package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GameSubActAnchorRankRequest_ProtoDecoder implements InterfaceC31105CIr<GameSubActAnchorRankRequest> {
    @Override // X.InterfaceC31105CIr
    public final GameSubActAnchorRankRequest LIZ(Q9H q9h) {
        GameSubActAnchorRankRequest gameSubActAnchorRankRequest = new GameSubActAnchorRankRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        gameSubActAnchorRankRequest.anchorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    gameSubActAnchorRankRequest.activityId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameSubActAnchorRankRequest;
            }
        }
    }
}
