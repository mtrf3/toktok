package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetFirstRechargeInfoV2Params_ProtoDecoder implements InterfaceC31105CIr<GetFirstRechargeInfoV2Params> {
    @Override // X.InterfaceC31105CIr
    public final GetFirstRechargeInfoV2Params LIZ(Q9H q9h) {
        GetFirstRechargeInfoV2Params getFirstRechargeInfoV2Params = new GetFirstRechargeInfoV2Params();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    Q9J.LIZJ(q9h);
                } else {
                    getFirstRechargeInfoV2Params.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return getFirstRechargeInfoV2Params;
            }
        }
    }
}
