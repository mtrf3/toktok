package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LikeEffect_ProtoDecoder implements InterfaceC31105CIr<LikeEffect> {
    public static LikeEffect LIZIZ(Q9H q9h) {
        LikeEffect likeEffect = new LikeEffect();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            likeEffect.effectIntervalMs = q9h.LJIIJJI();
                        }
                    } else {
                        likeEffect.effectCnt = q9h.LJIIJJI();
                    }
                } else {
                    likeEffect.version = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return likeEffect;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LikeEffect LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
