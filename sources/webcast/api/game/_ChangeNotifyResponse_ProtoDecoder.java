package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.ChangeNotifyResponse;

/* loaded from: classes14.dex */
public final class _ChangeNotifyResponse_ProtoDecoder implements InterfaceC31105CIr<ChangeNotifyResponse> {
    @Override // X.InterfaceC31105CIr
    public final ChangeNotifyResponse LIZ(Q9H q9h) {
        ChangeNotifyResponse changeNotifyResponse = new ChangeNotifyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    ChangeNotifyResponse.ResponseData responseData = new ChangeNotifyResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    changeNotifyResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return changeNotifyResponse;
            }
        }
    }
}
