package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ReplyContent_ProtoDecoder implements InterfaceC31105CIr<ReplyContent> {
    public static ReplyContent LIZIZ(Q9H q9h) {
        ReplyContent replyContent = new ReplyContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            replyContent.replyStatus = q9h.LJIIJ();
                        }
                    } else {
                        replyContent.replierRoomId = q9h.LJIIJJI();
                    }
                } else {
                    replyContent.replier = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return replyContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReplyContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
