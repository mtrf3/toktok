package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* loaded from: classes14.dex */
public final class _GetFirstRechargeInfoV2Resp_ProtoDecoder implements InterfaceC31105CIr<GetFirstRechargeInfoV2Resp> {
    @Override // X.InterfaceC31105CIr
    public final GetFirstRechargeInfoV2Resp LIZ(Q9H q9h) {
        GetFirstRechargeInfoV2Resp getFirstRechargeInfoV2Resp = new GetFirstRechargeInfoV2Resp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    GetFirstRechargeInfoV2Resp.Data data = new GetFirstRechargeInfoV2Resp.Data();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    getFirstRechargeInfoV2Resp.data = data;
                }
            } else {
                q9h.LJ(LIZJ);
                return getFirstRechargeInfoV2Resp;
            }
        }
    }
}
