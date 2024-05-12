package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _StarCommentDeleteRequest_ProtoDecoder implements InterfaceC31105CIr<StarCommentDeleteRequest> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentDeleteRequest LIZ(Q9H q9h) {
        StarCommentDeleteRequest starCommentDeleteRequest = new StarCommentDeleteRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        starCommentDeleteRequest.starCommentMsgId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        starCommentDeleteRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        starCommentDeleteRequest.clientCurMsgStartTimeMs = q9h.LJIIJJI();
                        break;
                    case 4:
                        starCommentDeleteRequest.currentVersion = q9h.LJIIJ();
                        break;
                    case 5:
                        starCommentDeleteRequest.role = q9h.LJIIJ();
                        break;
                    case 6:
                        starCommentDeleteRequest.needBan = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentDeleteRequest;
            }
        }
    }
}
