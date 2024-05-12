package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SwitchExtraBase_ProtoDecoder implements InterfaceC31105CIr<SwitchExtraBase> {
    public static SwitchExtraBase LIZIZ(Q9H q9h) {
        SwitchExtraBase switchExtraBase = new SwitchExtraBase();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    switchExtraBase.schemaForCheck = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return switchExtraBase;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SwitchExtraBase LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
