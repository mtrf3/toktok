package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _ArrowConfig_ProtoDecoder implements InterfaceC31105CIr<ArrowConfig> {
    public static ArrowConfig LIZIZ(Q9H q9h) {
        ArrowConfig arrowConfig = new ArrowConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    arrowConfig.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return arrowConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ArrowConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
