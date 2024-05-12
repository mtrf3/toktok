package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.StarCommentGetQueueResponse;

/* loaded from: classes6.dex */
public final class _StarCommentGetQueueResponse_Data_ProtoDecoder implements InterfaceC31105CIr<StarCommentGetQueueResponse.Data> {
    public static StarCommentGetQueueResponse.Data LIZIZ(Q9H q9h) {
        StarCommentGetQueueResponse.Data data = new StarCommentGetQueueResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.queue = _StarCommentQueue_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        data.serverCurMsgStartTimeMs = q9h.LJIIJJI();
                        break;
                    case 3:
                        data.clientReserve = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        data.pollingIntervalMs = q9h.LJIIJJI();
                        break;
                    case 5:
                        data.normalIntervalBetweenMsgMs = q9h.LJIIJJI();
                        break;
                    case 6:
                        data.advancedIntervalBetweenMsgMs = q9h.LJIIJJI();
                        break;
                    case 7:
                        data.laggingIntervalBetweenMsgMs = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentGetQueueResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
