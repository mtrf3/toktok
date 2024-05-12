package com.bytedance.android.livesdk.model.message.linker.kick_out_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerKickOutContent_ProtoDecoder implements InterfaceC31105CIr<LinkerKickOutContent> {
    public static LinkerKickOutContent LIZIZ(Q9H q9h) {
        LinkerKickOutContent linkerKickOutContent = new LinkerKickOutContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkerKickOutContent.kickOutReason = q9h.LJIIJ();
                    }
                } else {
                    linkerKickOutContent.fromUid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerKickOutContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerKickOutContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
