package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GameSubActGetRandUnfinishedAnchorRequest_ProtoDecoder implements InterfaceC31105CIr<GameSubActGetRandUnfinishedAnchorRequest> {
    @Override // X.InterfaceC31105CIr
    public final GameSubActGetRandUnfinishedAnchorRequest LIZ(Q9H q9h) {
        GameSubActGetRandUnfinishedAnchorRequest gameSubActGetRandUnfinishedAnchorRequest = new GameSubActGetRandUnfinishedAnchorRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameSubActGetRandUnfinishedAnchorRequest.activityId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameSubActGetRandUnfinishedAnchorRequest;
            }
        }
    }
}
