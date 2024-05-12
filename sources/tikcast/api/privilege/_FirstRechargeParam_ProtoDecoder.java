package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _FirstRechargeParam_ProtoDecoder implements InterfaceC31105CIr<FirstRechargeParam> {
    @Override // X.InterfaceC31105CIr
    public final FirstRechargeParam LIZ(Q9H q9h) {
        FirstRechargeParam firstRechargeParam = new FirstRechargeParam();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return firstRechargeParam;
    }
}
