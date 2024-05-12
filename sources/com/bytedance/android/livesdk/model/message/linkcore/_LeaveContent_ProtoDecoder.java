package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LeaveContent_ProtoDecoder implements InterfaceC31105CIr<LeaveContent> {
    public static LeaveContent LIZIZ(Q9H q9h) {
        LeaveContent leaveContent = new LeaveContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        leaveContent.leaveReason = q9h.LJIIJJI();
                    }
                } else {
                    leaveContent.leftUser = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return leaveContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LeaveContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
