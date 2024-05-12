package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.StarCommentPurchasePageResponse;

/* loaded from: classes6.dex */
public final class _StarCommentPurchasePageResponse_Data_ProtoDecoder implements InterfaceC31105CIr<StarCommentPurchasePageResponse.Data> {
    public static StarCommentPurchasePageResponse.Data LIZIZ(Q9H q9h) {
        StarCommentPurchasePageResponse.Data data = new StarCommentPurchasePageResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    data.errorCode = q9h.LJIIJJI();
                                }
                            } else {
                                data.wordLimit = q9h.LJIIJ();
                            }
                        } else {
                            data.queue = _StarCommentQueue_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        data.notAllowReason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    data.purchasePageStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentPurchasePageResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
