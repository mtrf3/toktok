package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerSysKickOutContent_ProtoDecoder implements InterfaceC31105CIr<LinkerSysKickOutContent> {
    public static LinkerSysKickOutContent LIZIZ(Q9H q9h) {
        LinkerSysKickOutContent linkerSysKickOutContent = new LinkerSysKickOutContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkerSysKickOutContent.linkmicIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkerSysKickOutContent.userId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerSysKickOutContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerSysKickOutContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}