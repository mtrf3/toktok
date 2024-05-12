package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceBannerArea_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceBannerArea> {
    public static RulesAndGuidanceBannerArea LIZIZ(Q9H q9h) {
        RulesAndGuidanceBannerArea rulesAndGuidanceBannerArea = new RulesAndGuidanceBannerArea();
        rulesAndGuidanceBannerArea.banners = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rulesAndGuidanceBannerArea.banners.add(_RulesAndGuidanceBanner_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceBannerArea;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceBannerArea LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
