package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RankListParam_ProtoDecoder implements InterfaceC31105CIr<RankListParam> {
    public static RankListParam LIZIZ(Q9H q9h) {
        RankListParam rankListParam = new RankListParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rankListParam.rank = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rankListParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
