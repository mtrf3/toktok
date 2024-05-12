package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceConfig_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceConfig> {
    public static RulesAndGuidanceConfig LIZIZ(Q9H q9h) {
        RulesAndGuidanceConfig rulesAndGuidanceConfig = new RulesAndGuidanceConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            rulesAndGuidanceConfig.showContentArea = Q9J.LIZ(q9h);
                        }
                    } else {
                        rulesAndGuidanceConfig.showFunctionArea = Q9J.LIZ(q9h);
                    }
                } else {
                    rulesAndGuidanceConfig.showBannerArea = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
