package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SwitchExtraForOpen_ProtoDecoder implements InterfaceC31105CIr<SwitchExtraForOpen> {
    public static SwitchExtraForOpen LIZIZ(Q9H q9h) {
        SwitchExtraForOpen switchExtraForOpen = new SwitchExtraForOpen();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    switchExtraForOpen.schemaForOpen = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return switchExtraForOpen;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SwitchExtraForOpen LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
