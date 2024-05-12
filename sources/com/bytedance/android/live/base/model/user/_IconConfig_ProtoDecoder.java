package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _IconConfig_ProtoDecoder implements InterfaceC31105CIr<IconConfig> {
    public static IconConfig LIZIZ(Q9H q9h) {
        IconConfig iconConfig = new IconConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        iconConfig.background = _CombineBadgeBackground_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    iconConfig.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return iconConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final IconConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
