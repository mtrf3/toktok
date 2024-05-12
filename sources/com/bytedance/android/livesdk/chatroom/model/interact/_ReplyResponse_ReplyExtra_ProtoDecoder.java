package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact.ReplyResponse;

/* loaded from: classes14.dex */
public final class _ReplyResponse_ReplyExtra_ProtoDecoder implements InterfaceC31105CIr<ReplyResponse.ReplyExtra> {
    public static ReplyResponse.ReplyExtra LIZIZ(Q9H q9h) {
        ReplyResponse.ReplyExtra replyExtra = new ReplyResponse.ReplyExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    replyExtra.logPb = _ReplyResponse_ReplyExtra_LogPb_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return replyExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReplyResponse.ReplyExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
