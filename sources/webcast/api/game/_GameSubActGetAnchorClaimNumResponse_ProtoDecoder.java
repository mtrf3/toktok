package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameSubActGetAnchorClaimNumResponse_ProtoDecoder implements InterfaceC31105CIr<GameSubActGetAnchorClaimNumResponse> {
    @Override // X.InterfaceC31105CIr
    public final GameSubActGetAnchorClaimNumResponse LIZ(Q9H q9h) {
        GameSubActGetAnchorClaimNumResponse gameSubActGetAnchorClaimNumResponse = new GameSubActGetAnchorClaimNumResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameSubActGetAnchorClaimNumResponse.data = _GameSubActGetAnchorClaimNumResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameSubActGetAnchorClaimNumResponse;
            }
        }
    }
}