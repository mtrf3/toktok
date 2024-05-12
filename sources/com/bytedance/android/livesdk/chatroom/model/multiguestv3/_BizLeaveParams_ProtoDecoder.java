package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizLeaveParams_ProtoDecoder implements InterfaceC31105CIr<BizLeaveParams> {
    @Override // X.InterfaceC31105CIr
    public final BizLeaveParams LIZ(Q9H q9h) {
        BizLeaveParams bizLeaveParams = new BizLeaveParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizLeaveParams.anchorId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizLeaveParams;
            }
        }
    }
}
