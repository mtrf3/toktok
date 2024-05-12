package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _HeatUpdateContent_ProtoDecoder implements InterfaceC31105CIr<HeatUpdateContent> {
    public static HeatUpdateContent LIZIZ(Q9H q9h) {
        HeatUpdateContent heatUpdateContent = new HeatUpdateContent();
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
                                heatUpdateContent.updateSource = q9h.LJIIJ();
                            }
                        } else {
                            heatUpdateContent.updatedHeat = q9h.LJIIJJI();
                        }
                    } else {
                        heatUpdateContent.fromUserId = q9h.LJIIJJI();
                    }
                } else {
                    heatUpdateContent.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return heatUpdateContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final HeatUpdateContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
