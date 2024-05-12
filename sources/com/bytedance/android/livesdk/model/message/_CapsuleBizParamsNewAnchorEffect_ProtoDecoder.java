package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CapsuleBizParamsNewAnchorEffect_ProtoDecoder implements InterfaceC31105CIr<CapsuleBizParamsNewAnchorEffect> {
    public static CapsuleBizParamsNewAnchorEffect LIZIZ(Q9H q9h) {
        CapsuleBizParamsNewAnchorEffect capsuleBizParamsNewAnchorEffect = new CapsuleBizParamsNewAnchorEffect();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                capsuleBizParamsNewAnchorEffect.tabKey = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            capsuleBizParamsNewAnchorEffect.categoryId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        capsuleBizParamsNewAnchorEffect.resourceId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    capsuleBizParamsNewAnchorEffect.effectPanel = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return capsuleBizParamsNewAnchorEffect;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CapsuleBizParamsNewAnchorEffect LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
