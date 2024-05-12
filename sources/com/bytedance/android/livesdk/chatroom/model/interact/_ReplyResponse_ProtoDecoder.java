package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ReplyResponse_ProtoDecoder implements InterfaceC31105CIr<ReplyResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReplyResponse LIZ(Q9H q9h) {
        ReplyResponse replyResponse = new ReplyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        replyResponse.extra = _ReplyResponse_ReplyExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    replyResponse.data = _LinkReplyResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return replyResponse;
            }
        }
    }
}
