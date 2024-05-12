package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubTaskInfo_ProtoDecoder implements InterfaceC31105CIr<SubTaskInfo> {
    public static SubTaskInfo LIZIZ(Q9H q9h) {
        SubTaskInfo subTaskInfo = new SubTaskInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subTaskInfo.subUserTask = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subTaskInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubTaskInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
