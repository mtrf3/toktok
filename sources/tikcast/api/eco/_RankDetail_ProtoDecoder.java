package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RankDetail_ProtoDecoder implements InterfaceC31105CIr<RankDetail> {
    public static RankDetail LIZIZ(Q9H q9h) {
        RankDetail rankDetail = new RankDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            rankDetail.faqUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        rankDetail.rankTypeKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rankDetail.rankType = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rankDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
