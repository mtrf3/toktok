package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _DropsStartRequest_ProtoDecoder implements InterfaceC31105CIr<DropsStartRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsStartRequest LIZ(Q9H q9h) {
        DropsStartRequest dropsStartRequest = new DropsStartRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            dropsStartRequest.joinStatus = Q9J.LIZ(q9h);
                        }
                    } else {
                        dropsStartRequest.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    dropsStartRequest.dropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsStartRequest;
            }
        }
    }
}