package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.BehaviorTrackResult;

/* loaded from: classes14.dex */
public final class _BehaviorTrackResult_Response_ProtoDecoder implements InterfaceC31105CIr<BehaviorTrackResult.Response> {
    public static BehaviorTrackResult.Response LIZIZ(Q9H q9h) {
        BehaviorTrackResult.Response response = new BehaviorTrackResult.Response();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        response.errMsg = Q9J.LIZIZ(q9h);
                    }
                } else {
                    response.resultCode = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return response;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BehaviorTrackResult.Response LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
