package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _StarCommentPushMessage_ProtoDecoder implements InterfaceC31105CIr<StarCommentPushMessage> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentPushMessage LIZ(Q9H q9h) {
        StarCommentPushMessage starCommentPushMessage = new StarCommentPushMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                starCommentPushMessage.next = _StarCommentMessage_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            starCommentPushMessage.current = _StarCommentMessage_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        starCommentPushMessage.queueVersion = q9h.LJIIJ();
                    }
                } else {
                    starCommentPushMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentPushMessage;
            }
        }
    }
}
