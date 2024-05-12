package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _EffectInfo_ProtoDecoder implements InterfaceC31105CIr<EffectInfo> {
    public static EffectInfo LIZIZ(Q9H q9h) {
        EffectInfo effectInfo = new EffectInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            effectInfo.userId = q9h.LJIIJJI();
                        }
                    } else {
                        effectInfo.role = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    effectInfo.effectId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return effectInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EffectInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
