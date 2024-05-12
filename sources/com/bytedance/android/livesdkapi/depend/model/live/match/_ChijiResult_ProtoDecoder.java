package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ChijiResult_ProtoDecoder implements InterfaceC31105CIr<ChijiResult> {
    public static ChijiResult LIZIZ(Q9H q9h) {
        ChijiResult chijiResult = new ChijiResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            chijiResult.bonus = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        chijiResult.winningStreak = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    chijiResult.timeStr = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return chijiResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ChijiResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
