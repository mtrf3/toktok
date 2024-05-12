package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceFunction_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceFunction> {
    public static RulesAndGuidanceFunction LIZIZ(Q9H q9h) {
        RulesAndGuidanceFunction rulesAndGuidanceFunction = new RulesAndGuidanceFunction();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        rulesAndGuidanceFunction.hint = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rulesAndGuidanceFunction.functionType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceFunction;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceFunction LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
