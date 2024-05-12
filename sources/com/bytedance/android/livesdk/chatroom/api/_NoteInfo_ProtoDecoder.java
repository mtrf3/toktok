package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _NoteInfo_ProtoDecoder implements InterfaceC31105CIr<NoteInfo> {
    public static NoteInfo LIZIZ(Q9H q9h) {
        NoteInfo noteInfo = new NoteInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    noteInfo.currentStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return noteInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NoteInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
