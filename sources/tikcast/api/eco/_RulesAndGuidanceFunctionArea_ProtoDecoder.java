package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceFunctionArea_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceFunctionArea> {
    public static RulesAndGuidanceFunctionArea LIZIZ(Q9H q9h) {
        RulesAndGuidanceFunctionArea rulesAndGuidanceFunctionArea = new RulesAndGuidanceFunctionArea();
        rulesAndGuidanceFunctionArea.functionList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rulesAndGuidanceFunctionArea.functionList.add(_RulesAndGuidanceFunction_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceFunctionArea;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceFunctionArea LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
