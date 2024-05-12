package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.StarCommentPurchaseHistoryResponse;

/* loaded from: classes17.dex */
public final class _StarCommentPurchaseHistoryResponse_Data_ProtoDecoder implements InterfaceC31105CIr<StarCommentPurchaseHistoryResponse.Data> {
    public static StarCommentPurchaseHistoryResponse.Data LIZIZ(Q9H q9h) {
        StarCommentPurchaseHistoryResponse.Data data = new StarCommentPurchaseHistoryResponse.Data();
        data.purchaseHistory = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.hasMore = Q9J.LIZ(q9h);
                    }
                } else {
                    data.purchaseHistory.add(_StarCommentHistory_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentPurchaseHistoryResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
