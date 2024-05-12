package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _RulesAndGuidanceRequest_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceRequest> {
    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceRequest LIZ(Q9H q9h) {
        RulesAndGuidanceRequest rulesAndGuidanceRequest = new RulesAndGuidanceRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rulesAndGuidanceRequest.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceRequest;
            }
        }
    }
}
