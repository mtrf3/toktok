package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FlareInfo_ProtoDecoder implements InterfaceC31105CIr<FlareInfo> {
    public static FlareInfo LIZIZ(Q9H q9h) {
        FlareInfo flareInfo = new FlareInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        flareInfo.taskId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    flareInfo.isFlare = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return flareInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FlareInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
