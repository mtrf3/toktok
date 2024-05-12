package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _StarCommentGetQueueRequest_ProtoDecoder implements InterfaceC31105CIr<StarCommentGetQueueRequest> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentGetQueueRequest LIZ(Q9H q9h) {
        StarCommentGetQueueRequest starCommentGetQueueRequest = new StarCommentGetQueueRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        starCommentGetQueueRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        starCommentGetQueueRequest.secAnchorId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        starCommentGetQueueRequest.role = q9h.LJIIJ();
                        break;
                    case 4:
                        starCommentGetQueueRequest.currentVersion = q9h.LJIIJ();
                        break;
                    case 5:
                        starCommentGetQueueRequest.clientCurMsgStartTimeMs = q9h.LJIIJJI();
                        break;
                    case 6:
                        starCommentGetQueueRequest.clientReserve = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        starCommentGetQueueRequest.scene = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentGetQueueRequest;
            }
        }
    }
}
