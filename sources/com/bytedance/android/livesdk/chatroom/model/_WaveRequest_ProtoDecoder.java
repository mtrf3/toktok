package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _WaveRequest_ProtoDecoder implements InterfaceC31105CIr<WaveRequest> {
    @Override // X.InterfaceC31105CIr
    public final WaveRequest LIZ(Q9H q9h) {
        WaveRequest waveRequest = new WaveRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        waveRequest.enterUid = q9h.LJIIJJI();
                    }
                } else {
                    waveRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return waveRequest;
            }
        }
    }
}