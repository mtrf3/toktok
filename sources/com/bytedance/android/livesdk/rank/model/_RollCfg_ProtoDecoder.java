package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RollCfg_ProtoDecoder implements InterfaceC31105CIr<RollCfg> {
    public static RollCfg LIZIZ(Q9H q9h) {
        RollCfg rollCfg = new RollCfg();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    Q9J.LIZJ(q9h);
                } else {
                    rollCfg.duration = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return rollCfg;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RollCfg LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
