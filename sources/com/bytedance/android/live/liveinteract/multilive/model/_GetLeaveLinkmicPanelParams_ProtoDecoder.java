package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetLeaveLinkmicPanelParams_ProtoDecoder implements InterfaceC31105CIr<GetLeaveLinkmicPanelParams> {
    @Override // X.InterfaceC31105CIr
    public final GetLeaveLinkmicPanelParams LIZ(Q9H q9h) {
        GetLeaveLinkmicPanelParams getLeaveLinkmicPanelParams = new GetLeaveLinkmicPanelParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getLeaveLinkmicPanelParams.channelId = q9h.LJIIJJI();
                    }
                } else {
                    getLeaveLinkmicPanelParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return getLeaveLinkmicPanelParams;
            }
        }
    }
}
