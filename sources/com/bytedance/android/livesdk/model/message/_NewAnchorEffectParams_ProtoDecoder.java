package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _NewAnchorEffectParams_ProtoDecoder implements InterfaceC31105CIr<NewAnchorEffectParams> {
    public static NewAnchorEffectParams LIZIZ(Q9H q9h) {
        NewAnchorEffectParams newAnchorEffectParams = new NewAnchorEffectParams();
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
                                newAnchorEffectParams.tabKey = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            newAnchorEffectParams.categoryId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        newAnchorEffectParams.resourceId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    newAnchorEffectParams.effectPanel = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return newAnchorEffectParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NewAnchorEffectParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
