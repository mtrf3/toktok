package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _StarCommentGetQueueResponse_ProtoDecoder implements InterfaceC31105CIr<StarCommentGetQueueResponse> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentGetQueueResponse LIZ(Q9H q9h) {
        StarCommentGetQueueResponse starCommentGetQueueResponse = new StarCommentGetQueueResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    starCommentGetQueueResponse.data = _StarCommentGetQueueResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentGetQueueResponse;
            }
        }
    }
}
