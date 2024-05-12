package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _EntranceEffect_ProtoDecoder implements InterfaceC31105CIr<EntranceEffect> {
    public static EntranceEffect LIZIZ(Q9H q9h) {
        EntranceEffect entranceEffect = new EntranceEffect();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            entranceEffect.ribbon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        entranceEffect.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    entranceEffect.badge = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return entranceEffect;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EntranceEffect LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
