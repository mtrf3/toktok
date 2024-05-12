package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _StarCommentPurchaseRequest_ProtoDecoder implements InterfaceC31105CIr<StarCommentPurchaseRequest> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentPurchaseRequest LIZ(Q9H q9h) {
        StarCommentPurchaseRequest starCommentPurchaseRequest = new StarCommentPurchaseRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        starCommentPurchaseRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        starCommentPurchaseRequest.secAnchorId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        starCommentPurchaseRequest.roomUserCount = q9h.LJIIJJI();
                        break;
                    case 4:
                        starCommentPurchaseRequest.content = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        starCommentPurchaseRequest.option = q9h.LJIIJ();
                        break;
                    case 6:
                        starCommentPurchaseRequest.coins = q9h.LJIIJJI();
                        break;
                    case 7:
                        starCommentPurchaseRequest.currentScore = q9h.LJIIJJI();
                        break;
                    case 8:
                        starCommentPurchaseRequest.currentVersion = q9h.LJIIJ();
                        break;
                    case 9:
                        starCommentPurchaseRequest.clientCurMsgStartTimeMs = q9h.LJIIJJI();
                        break;
                    case 10:
                        starCommentPurchaseRequest.ugExchange = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        starCommentPurchaseRequest.enterFrom = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentPurchaseRequest;
            }
        }
    }
}
