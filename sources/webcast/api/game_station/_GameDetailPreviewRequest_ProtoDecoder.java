package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GameDetailPreviewRequest_ProtoDecoder implements InterfaceC31105CIr<GameDetailPreviewRequest> {
    @Override // X.InterfaceC31105CIr
    public final GameDetailPreviewRequest LIZ(Q9H q9h) {
        GameDetailPreviewRequest gameDetailPreviewRequest = new GameDetailPreviewRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        gameDetailPreviewRequest.srcId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    gameDetailPreviewRequest.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return gameDetailPreviewRequest;
            }
        }
    }
}
