package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ReplyParams_ProtoDecoder implements InterfaceC31105CIr<ReplyParams> {
    @Override // X.InterfaceC31105CIr
    public final ReplyParams LIZ(Q9H q9h) {
        ReplyParams replyParams = new ReplyParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        replyParams.channelId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        replyParams.replyStatus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        replyParams.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        replyParams.inviteUserId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        replyParams.secInviteUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        replyParams.scene = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        replyParams.transparentExtra = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return replyParams;
            }
        }
    }
}
