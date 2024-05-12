package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _DSLConfig_ProtoDecoder implements InterfaceC31105CIr<DSLConfig> {
    public static DSLConfig LIZIZ(Q9H q9h) {
        DSLConfig dSLConfig = new DSLConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        dSLConfig.layoutId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    dSLConfig.sceneVersion = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return dSLConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DSLConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
