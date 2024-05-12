package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ChangeNotifyRequest_ProtoDecoder implements InterfaceC31105CIr<ChangeNotifyRequest> {
    @Override // X.InterfaceC31105CIr
    public final ChangeNotifyRequest LIZ(Q9H q9h) {
        ChangeNotifyRequest changeNotifyRequest = new ChangeNotifyRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        changeNotifyRequest.openNotify = Q9J.LIZ(q9h);
                    }
                } else {
                    changeNotifyRequest.changeType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return changeNotifyRequest;
            }
        }
    }
}
