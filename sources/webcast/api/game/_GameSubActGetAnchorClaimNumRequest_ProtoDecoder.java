package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GameSubActGetAnchorClaimNumRequest_ProtoDecoder implements InterfaceC31105CIr<GameSubActGetAnchorClaimNumRequest> {
    @Override // X.InterfaceC31105CIr
    public final GameSubActGetAnchorClaimNumRequest LIZ(Q9H q9h) {
        GameSubActGetAnchorClaimNumRequest gameSubActGetAnchorClaimNumRequest = new GameSubActGetAnchorClaimNumRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameSubActGetAnchorClaimNumRequest.activityId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameSubActGetAnchorClaimNumRequest;
            }
        }
    }
}
