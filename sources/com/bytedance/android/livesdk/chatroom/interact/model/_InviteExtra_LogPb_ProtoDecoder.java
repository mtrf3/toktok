package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.InviteExtra;

/* loaded from: classes14.dex */
public final class _InviteExtra_LogPb_ProtoDecoder implements InterfaceC31105CIr<InviteExtra.LogPb> {
    public static InviteExtra.LogPb LIZIZ(Q9H q9h) {
        InviteExtra.LogPb logPb = new InviteExtra.LogPb();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    logPb.clientLogId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return logPb;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InviteExtra.LogPb LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
