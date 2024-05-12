package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceContentArea_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceContentArea> {
    public static RulesAndGuidanceContentArea LIZIZ(Q9H q9h) {
        RulesAndGuidanceContentArea rulesAndGuidanceContentArea = new RulesAndGuidanceContentArea();
        rulesAndGuidanceContentArea.contentSubAreaList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rulesAndGuidanceContentArea.contentSubAreaList.add(_RulesAndGuidanceContentSubArea_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceContentArea;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceContentArea LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
