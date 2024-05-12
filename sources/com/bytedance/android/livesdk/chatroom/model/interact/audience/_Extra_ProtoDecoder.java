package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _Extra_ProtoDecoder implements InterfaceC31105CIr<Extra> {
    public static Extra LIZIZ(Q9H q9h) {
        Extra extra = new Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    extra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
