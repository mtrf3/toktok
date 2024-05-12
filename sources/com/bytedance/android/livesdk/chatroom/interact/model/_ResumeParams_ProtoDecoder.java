package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ResumeParams_ProtoDecoder implements InterfaceC31105CIr<ResumeParams> {
    @Override // X.InterfaceC31105CIr
    public final ResumeParams LIZ(Q9H q9h) {
        ResumeParams resumeParams = new ResumeParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        resumeParams.userId = q9h.LJIIJJI();
                    }
                } else {
                    resumeParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return resumeParams;
            }
        }
    }
}
