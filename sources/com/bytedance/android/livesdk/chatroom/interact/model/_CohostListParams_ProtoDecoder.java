package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _CohostListParams_ProtoDecoder implements InterfaceC31105CIr<CohostListParams> {
    @Override // X.InterfaceC31105CIr
    public final CohostListParams LIZ(Q9H q9h) {
        CohostListParams cohostListParams = new CohostListParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            cohostListParams.source = q9h.LJIIJ();
                        }
                    } else {
                        cohostListParams.roomId = q9h.LJIIJJI();
                    }
                } else {
                    cohostListParams.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostListParams;
            }
        }
    }
}
