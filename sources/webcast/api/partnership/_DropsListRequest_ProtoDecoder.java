package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DropsListRequest_ProtoDecoder implements InterfaceC31105CIr<DropsListRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsListRequest LIZ(Q9H q9h) {
        DropsListRequest dropsListRequest = new DropsListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        dropsListRequest.dropMode = q9h.LJIIJ();
                        break;
                    case 2:
                        dropsListRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        dropsListRequest.startHistory = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        dropsListRequest.userType = q9h.LJIIJ();
                        break;
                    case 5:
                        dropsListRequest.offset = q9h.LJIIJJI();
                        break;
                    case 6:
                        dropsListRequest.limit = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsListRequest;
            }
        }
    }
}
