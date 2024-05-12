package com.bytedance.android.livesdkapi.ping;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PingResult_ProtoDecoder implements InterfaceC31105CIr<PingResult> {
    @Override // X.InterfaceC31105CIr
    public final PingResult LIZ(Q9H q9h) {
        PingResult pingResult = new PingResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pingResult.nextPingInterval = q9h.LJIIJJI();
                        }
                    } else {
                        pingResult.roomId = q9h.LJIIJJI();
                    }
                } else {
                    pingResult.roomStatus = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pingResult;
            }
        }
    }
}
