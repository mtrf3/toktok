package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceBanner_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceBanner> {
    public static RulesAndGuidanceBanner LIZIZ(Q9H q9h) {
        RulesAndGuidanceBanner rulesAndGuidanceBanner = new RulesAndGuidanceBanner();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                rulesAndGuidanceBanner.text = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            rulesAndGuidanceBanner.imageUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        rulesAndGuidanceBanner.linkUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rulesAndGuidanceBanner.bannerId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}