package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameDetailExtraResponse_ProtoDecoder implements InterfaceC31105CIr<GameDetailExtraResponse> {
    @Override // X.InterfaceC31105CIr
    public final GameDetailExtraResponse LIZ(Q9H q9h) {
        GameDetailExtraResponse gameDetailExtraResponse = new GameDetailExtraResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameDetailExtraResponse.data = _GameDetailExtraResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameDetailExtraResponse;
            }
        }
    }
}
