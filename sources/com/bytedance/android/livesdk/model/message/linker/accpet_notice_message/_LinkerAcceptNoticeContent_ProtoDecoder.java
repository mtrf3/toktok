package com.bytedance.android.livesdk.model.message.linker.accpet_notice_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerAcceptNoticeContent_ProtoDecoder implements InterfaceC31105CIr<LinkerAcceptNoticeContent> {
    public static LinkerAcceptNoticeContent LIZIZ(Q9H q9h) {
        LinkerAcceptNoticeContent linkerAcceptNoticeContent = new LinkerAcceptNoticeContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkerAcceptNoticeContent.toUserId = q9h.LJIIJJI();
                        }
                    } else {
                        linkerAcceptNoticeContent.fromRoomId = q9h.LJIIJJI();
                    }
                } else {
                    linkerAcceptNoticeContent.fromUserId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerAcceptNoticeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerAcceptNoticeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
