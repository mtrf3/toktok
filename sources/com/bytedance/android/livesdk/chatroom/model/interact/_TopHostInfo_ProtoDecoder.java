package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TopHostInfo_ProtoDecoder implements InterfaceC31105CIr<TopHostInfo> {
    public static TopHostInfo LIZIZ(Q9H q9h) {
        TopHostInfo topHostInfo = new TopHostInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        topHostInfo.topIndex = q9h.LJIIJJI();
                    }
                } else {
                    topHostInfo.rankType = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return topHostInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopHostInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
