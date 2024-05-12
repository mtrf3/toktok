package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameDetailBaseResponse_ProtoDecoder implements InterfaceC31105CIr<GameDetailBaseResponse> {
    @Override // X.InterfaceC31105CIr
    public final GameDetailBaseResponse LIZ(Q9H q9h) {
        GameDetailBaseResponse gameDetailBaseResponse = new GameDetailBaseResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameDetailBaseResponse.data = _GameDetailBaseResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameDetailBaseResponse;
            }
        }
    }
}
