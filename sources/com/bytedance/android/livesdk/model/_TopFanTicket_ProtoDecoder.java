package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _TopFanTicket_ProtoDecoder implements InterfaceC31105CIr<TopFanTicket> {
    public static TopFanTicket LIZIZ(Q9H q9h) {
        TopFanTicket topFanTicket = new TopFanTicket();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        topFanTicket.user = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    topFanTicket.fanTicket = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return topFanTicket;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopFanTicket LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
