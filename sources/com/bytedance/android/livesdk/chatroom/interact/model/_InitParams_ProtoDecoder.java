package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _InitParams_ProtoDecoder implements InterfaceC31105CIr<InitParams> {
    @Override // X.InterfaceC31105CIr
    public final InitParams LIZ(Q9H q9h) {
        InitParams initParams = new InitParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                initParams.layout = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            initParams.linkmicLayout = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        initParams.linkmicVendor = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    initParams.roomId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return initParams;
            }
        }
    }
}
