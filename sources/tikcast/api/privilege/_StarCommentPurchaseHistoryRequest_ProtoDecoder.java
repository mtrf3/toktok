package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _StarCommentPurchaseHistoryRequest_ProtoDecoder implements InterfaceC31105CIr<StarCommentPurchaseHistoryRequest> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentPurchaseHistoryRequest LIZ(Q9H q9h) {
        StarCommentPurchaseHistoryRequest starCommentPurchaseHistoryRequest = new StarCommentPurchaseHistoryRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 10) {
                    if (LJI != 11) {
                        Q9J.LIZJ(q9h);
                    } else {
                        starCommentPurchaseHistoryRequest.offset = q9h.LJIIJ();
                    }
                } else {
                    starCommentPurchaseHistoryRequest.limit = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentPurchaseHistoryRequest;
            }
        }
    }
}
