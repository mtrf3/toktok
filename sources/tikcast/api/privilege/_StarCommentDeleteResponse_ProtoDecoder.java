package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _StarCommentDeleteResponse_ProtoDecoder implements InterfaceC31105CIr<StarCommentDeleteResponse> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentDeleteResponse LIZ(Q9H q9h) {
        StarCommentDeleteResponse starCommentDeleteResponse = new StarCommentDeleteResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    starCommentDeleteResponse.data = _StarCommentDeleteResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentDeleteResponse;
            }
        }
    }
}
