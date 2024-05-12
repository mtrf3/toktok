package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DropsDetailRequest_ProtoDecoder implements InterfaceC31105CIr<DropsDetailRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsDetailRequest LIZ(Q9H q9h) {
        DropsDetailRequest dropsDetailRequest = new DropsDetailRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                dropsDetailRequest.anchorId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            dropsDetailRequest.roomId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        dropsDetailRequest.userType = q9h.LJIIJ();
                    }
                } else {
                    dropsDetailRequest.dropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsDetailRequest;
            }
        }
    }
}
