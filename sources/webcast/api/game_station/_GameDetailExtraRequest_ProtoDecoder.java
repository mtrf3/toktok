package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GameDetailExtraRequest_ProtoDecoder implements InterfaceC31105CIr<GameDetailExtraRequest> {
    @Override // X.InterfaceC31105CIr
    public final GameDetailExtraRequest LIZ(Q9H q9h) {
        GameDetailExtraRequest gameDetailExtraRequest = new GameDetailExtraRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        gameDetailExtraRequest.srcId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    gameDetailExtraRequest.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return gameDetailExtraRequest;
            }
        }
    }
}
