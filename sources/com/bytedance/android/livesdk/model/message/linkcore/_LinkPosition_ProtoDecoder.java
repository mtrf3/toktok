package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkPosition_ProtoDecoder implements InterfaceC31105CIr<LinkPosition> {
    public static LinkPosition LIZIZ(Q9H q9h) {
        LinkPosition linkPosition = new LinkPosition();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkPosition.positionType = q9h.LJIIJ();
                    }
                } else {
                    linkPosition.position = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkPosition;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkPosition LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
