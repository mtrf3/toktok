package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerEnlargeStatusSynContent_ProtoDecoder implements InterfaceC31105CIr<LinkerEnlargeStatusSynContent> {
    public static LinkerEnlargeStatusSynContent LIZIZ(Q9H q9h) {
        LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent = new LinkerEnlargeStatusSynContent();
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
                                linkerEnlargeStatusSynContent.targetLinkmicId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            linkerEnlargeStatusSynContent.scene = q9h.LJIIJ();
                        }
                    } else {
                        linkerEnlargeStatusSynContent.enlargeLinkmicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkerEnlargeStatusSynContent.isEnlarge = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerEnlargeStatusSynContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerEnlargeStatusSynContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}