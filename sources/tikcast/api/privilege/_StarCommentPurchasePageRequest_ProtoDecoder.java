package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _StarCommentPurchasePageRequest_ProtoDecoder implements InterfaceC31105CIr<StarCommentPurchasePageRequest> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentPurchasePageRequest LIZ(Q9H q9h) {
        StarCommentPurchasePageRequest starCommentPurchasePageRequest = new StarCommentPurchasePageRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            switch (LJI) {
                                case 200:
                                    starCommentPurchasePageRequest.roomUserCount = q9h.LJIIJJI();
                                    break;
                                case 201:
                                    starCommentPurchasePageRequest.coins = q9h.LJIIJJI();
                                    break;
                                case 202:
                                    starCommentPurchasePageRequest.currentVersion = q9h.LJIIJ();
                                    break;
                                default:
                                    Q9J.LIZJ(q9h);
                                    break;
                            }
                        } else {
                            starCommentPurchasePageRequest.roomId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        starCommentPurchasePageRequest.secAnchorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    starCommentPurchasePageRequest.requestType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentPurchasePageRequest;
            }
        }
    }
}
