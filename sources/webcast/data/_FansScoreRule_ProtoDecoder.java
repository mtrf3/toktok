package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FansScoreRule_ProtoDecoder implements InterfaceC31105CIr<FansScoreRule> {
    public static FansScoreRule LIZIZ(Q9H q9h) {
        FansScoreRule fansScoreRule = new FansScoreRule();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            fansScoreRule.levelMaxScore = q9h.LJIIJJI();
                        }
                    } else {
                        fansScoreRule.levelMinScore = q9h.LJIIJJI();
                    }
                } else {
                    fansScoreRule.level = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansScoreRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansScoreRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
