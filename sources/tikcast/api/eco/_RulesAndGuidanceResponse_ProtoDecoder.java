package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceResponse_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceResponse> {
    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceResponse LIZ(Q9H q9h) {
        RulesAndGuidanceResponse rulesAndGuidanceResponse = new RulesAndGuidanceResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        rulesAndGuidanceResponse.extra = _RulesAndGuidanceResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    rulesAndGuidanceResponse.data = _RulesAndGuidanceResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceResponse;
            }
        }
    }
}
