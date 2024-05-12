package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AutoMatchResp_ProtoDecoder implements InterfaceC31105CIr<AutoMatchResp> {
    @Override // X.InterfaceC31105CIr
    public final AutoMatchResp LIZ(Q9H q9h) {
        AutoMatchResp autoMatchResp = new AutoMatchResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    autoMatchResp.data = _AutoMatchResp_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return autoMatchResp;
            }
        }
    }
}
