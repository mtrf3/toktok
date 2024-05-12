package com.bytedance.android.livesdk.firstrecharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _FirstRechargeResponse_ProtoDecoder implements InterfaceC31105CIr<FirstRechargeResponse> {
    @Override // X.InterfaceC31105CIr
    public final FirstRechargeResponse LIZ(Q9H q9h) {
        FirstRechargeResponse firstRechargeResponse = new FirstRechargeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    firstRechargeResponse.data = _FirstChargeData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return firstRechargeResponse;
            }
        }
    }
}
