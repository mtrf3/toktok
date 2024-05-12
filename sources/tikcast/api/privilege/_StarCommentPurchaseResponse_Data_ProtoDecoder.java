package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.StarCommentPurchaseResponse;

/* loaded from: classes6.dex */
public final class _StarCommentPurchaseResponse_Data_ProtoDecoder implements InterfaceC31105CIr<StarCommentPurchaseResponse.Data> {
    public static StarCommentPurchaseResponse.Data LIZIZ(Q9H q9h) {
        StarCommentPurchaseResponse.Data data = new StarCommentPurchaseResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.purchaseResult = q9h.LJIIJ();
                        break;
                    case 2:
                        data.queue = _StarCommentQueue_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        data.serverCurMsgStartTimeMs = q9h.LJIIJJI();
                        break;
                    case 4:
                        data.payGradeInfo = _PayGradeInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        data.roomUserCount = q9h.LJIIJJI();
                        break;
                    case 6:
                        data.coins = q9h.LJIIJJI();
                        break;
                    case 7:
                        data.msgId = q9h.LJIIJJI();
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
    public final StarCommentPurchaseResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
