package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizPermitParams_ProtoDecoder implements InterfaceC31105CIr<BizPermitParams> {
    @Override // X.InterfaceC31105CIr
    public final BizPermitParams LIZ(Q9H q9h) {
        BizPermitParams bizPermitParams = new BizPermitParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizPermitParams.effectiveSeconds = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizPermitParams;
            }
        }
    }
}
