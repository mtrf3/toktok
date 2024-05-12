package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GraceInfo_ProtoDecoder implements InterfaceC31105CIr<GraceInfo> {
    public static GraceInfo LIZIZ(Q9H q9h) {
        GraceInfo graceInfo = new GraceInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        graceInfo.graceEndTime = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    graceInfo.isInGracePeriod = Boolean.valueOf(Q9J.LIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return graceInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GraceInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
