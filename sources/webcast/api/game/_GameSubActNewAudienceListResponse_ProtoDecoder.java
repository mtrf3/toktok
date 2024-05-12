package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameSubActNewAudienceListResponse_ProtoDecoder implements InterfaceC31105CIr<GameSubActNewAudienceListResponse> {
    @Override // X.InterfaceC31105CIr
    public final GameSubActNewAudienceListResponse LIZ(Q9H q9h) {
        GameSubActNewAudienceListResponse gameSubActNewAudienceListResponse = new GameSubActNewAudienceListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameSubActNewAudienceListResponse.data = _GameSubActNewAudienceListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameSubActNewAudienceListResponse;
            }
        }
    }
}
