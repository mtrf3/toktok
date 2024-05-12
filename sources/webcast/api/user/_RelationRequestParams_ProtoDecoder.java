package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RelationRequestParams_ProtoDecoder implements InterfaceC31105CIr<RelationRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final RelationRequestParams LIZ(Q9H q9h) {
        RelationRequestParams relationRequestParams = new RelationRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        relationRequestParams.followType = q9h.LJIIJ();
                        break;
                    case 2:
                        relationRequestParams.toUserId = q9h.LJIIJJI();
                        break;
                    case 3:
                        relationRequestParams.currentRoomId = q9h.LJIIJJI();
                        break;
                    case 4:
                        relationRequestParams.secUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        relationRequestParams.secToUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        relationRequestParams.needBlockCheck = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return relationRequestParams;
            }
        }
    }
}
