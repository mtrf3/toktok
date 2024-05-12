package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _AudiencePingExtra_ProtoDecoder implements InterfaceC31105CIr<AudiencePingExtra> {
    @Override // X.InterfaceC31105CIr
    public final AudiencePingExtra LIZ(Q9H q9h) {
        AudiencePingExtra audiencePingExtra = new AudiencePingExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    audiencePingExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return audiencePingExtra;
            }
        }
    }
}
