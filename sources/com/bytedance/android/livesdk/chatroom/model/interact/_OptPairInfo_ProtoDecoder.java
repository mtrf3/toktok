package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _OptPairInfo_ProtoDecoder implements InterfaceC31105CIr<OptPairInfo> {
    public static OptPairInfo LIZIZ(Q9H q9h) {
        OptPairInfo optPairInfo = new OptPairInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            optPairInfo.optPairStatus = q9h.LJIIJ();
                        }
                    } else {
                        optPairInfo.expectedTimeSec = q9h.LJIIJJI();
                    }
                } else {
                    optPairInfo.mappingId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return optPairInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OptPairInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
