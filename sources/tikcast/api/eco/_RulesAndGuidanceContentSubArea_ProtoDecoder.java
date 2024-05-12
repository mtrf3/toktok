package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceContentSubArea_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceContentSubArea> {
    public static RulesAndGuidanceContentSubArea LIZIZ(Q9H q9h) {
        RulesAndGuidanceContentSubArea rulesAndGuidanceContentSubArea = new RulesAndGuidanceContentSubArea();
        rulesAndGuidanceContentSubArea.contentDetailList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rulesAndGuidanceContentSubArea.contentDetailList.add(_RulesAndGuidanceContentDetail_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceContentSubArea;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceContentSubArea LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
