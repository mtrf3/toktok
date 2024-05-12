package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _JoinDirectBizContent_ProtoDecoder implements InterfaceC31105CIr<JoinDirectBizContent> {
    public static JoinDirectBizContent LIZIZ(Q9H q9h) {
        JoinDirectBizContent joinDirectBizContent = new JoinDirectBizContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    joinDirectBizContent.replyImMsgId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return joinDirectBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final JoinDirectBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
