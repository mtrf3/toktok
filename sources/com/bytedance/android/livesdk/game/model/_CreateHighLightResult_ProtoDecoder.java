package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CreateHighLightResult_ProtoDecoder implements InterfaceC31105CIr<CreateHighLightResult> {
    @Override // X.InterfaceC31105CIr
    public final CreateHighLightResult LIZ(Q9H q9h) {
        CreateHighLightResult createHighLightResult = new CreateHighLightResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            createHighLightResult.title = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        createHighLightResult.fragmentIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    createHighLightResult.fragmentId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return createHighLightResult;
            }
        }
    }
}
