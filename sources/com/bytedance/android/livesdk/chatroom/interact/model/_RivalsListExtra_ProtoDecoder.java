package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RivalsListExtra_ProtoDecoder implements InterfaceC31105CIr<RivalsListExtra> {
    public static RivalsListExtra LIZIZ(Q9H q9h) {
        RivalsListExtra rivalsListExtra = new RivalsListExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rivalsListExtra.logPbBean = _RivalsListExtra_LogPbBean_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rivalsListExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalsListExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
