package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.StarCommentPurchaseResponse;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _StarCommentPurchaseResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<StarCommentPurchaseResponse.Extra> {
    public static StarCommentPurchaseResponse.Extra LIZIZ(Q9H q9h) {
        StarCommentPurchaseResponse.Extra extra = new StarCommentPurchaseResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    extra.customError = _RechargeCustomError_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentPurchaseResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
