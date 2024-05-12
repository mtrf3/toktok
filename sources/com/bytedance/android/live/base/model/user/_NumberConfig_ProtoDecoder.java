package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _NumberConfig_ProtoDecoder implements InterfaceC31105CIr<NumberConfig> {
    public static NumberConfig LIZIZ(Q9H q9h) {
        NumberConfig numberConfig = new NumberConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            numberConfig.background = _CombineBadgeBackground_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        numberConfig.fontStyle = _FontStyle_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    numberConfig.number = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return numberConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NumberConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
