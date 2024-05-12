package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _StarCommentHistory_ProtoDecoder implements InterfaceC31105CIr<StarCommentHistory> {
    public static StarCommentHistory LIZIZ(Q9H q9h) {
        StarCommentHistory starCommentHistory = new StarCommentHistory();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            starCommentHistory.purchaseTimeMs = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        starCommentHistory.anchorName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    starCommentHistory.starCommentItem = _StarCommentItem_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentHistory;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentHistory LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
