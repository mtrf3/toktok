package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _KickOutContent_ProtoDecoder implements InterfaceC31105CIr<KickOutContent> {
    public static KickOutContent LIZIZ(Q9H q9h) {
        KickOutContent kickOutContent = new KickOutContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        kickOutContent.kickOutReason = q9h.LJIIJ();
                    }
                } else {
                    kickOutContent.leftUser = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return kickOutContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KickOutContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
