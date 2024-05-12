package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _SeparatorConfig_ProtoDecoder implements InterfaceC31105CIr<SeparatorConfig> {
    public static SeparatorConfig LIZIZ(Q9H q9h) {
        SeparatorConfig separatorConfig = new SeparatorConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    separatorConfig.color = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return separatorConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SeparatorConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
