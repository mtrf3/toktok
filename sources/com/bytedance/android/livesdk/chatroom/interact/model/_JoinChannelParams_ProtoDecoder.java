package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _JoinChannelParams_ProtoDecoder implements InterfaceC31105CIr<JoinChannelParams> {
    @Override // X.InterfaceC31105CIr
    public final JoinChannelParams LIZ(Q9H q9h) {
        JoinChannelParams joinChannelParams = new JoinChannelParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            joinChannelParams.transparentExtra = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        joinChannelParams.scene = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    joinChannelParams.channelId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return joinChannelParams;
            }
        }
    }
}
