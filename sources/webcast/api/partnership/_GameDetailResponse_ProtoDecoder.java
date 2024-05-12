package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameDetailResponse_ProtoDecoder implements InterfaceC31105CIr<GameDetailResponse> {
    @Override // X.InterfaceC31105CIr
    public final GameDetailResponse LIZ(Q9H q9h) {
        GameDetailResponse gameDetailResponse = new GameDetailResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameDetailResponse.data = _GameDetailResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameDetailResponse;
            }
        }
    }
}
