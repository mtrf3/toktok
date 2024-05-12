package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ReplyBizContent_ProtoDecoder implements InterfaceC31105CIr<ReplyBizContent> {
    public static ReplyBizContent LIZIZ(Q9H q9h) {
        ReplyBizContent replyBizContent = new ReplyBizContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            replyBizContent.replyUserInfo = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        replyBizContent.isTurnOffInvitation = q9h.LJIIJ();
                    }
                } else {
                    replyBizContent.linkType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return replyBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReplyBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
