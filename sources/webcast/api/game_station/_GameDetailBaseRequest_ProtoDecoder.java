package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GameDetailBaseRequest_ProtoDecoder implements InterfaceC31105CIr<GameDetailBaseRequest> {
    @Override // X.InterfaceC31105CIr
    public final GameDetailBaseRequest LIZ(Q9H q9h) {
        GameDetailBaseRequest gameDetailBaseRequest = new GameDetailBaseRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            gameDetailBaseRequest.siteId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        gameDetailBaseRequest.srcId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    gameDetailBaseRequest.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return gameDetailBaseRequest;
            }
        }
    }
}
