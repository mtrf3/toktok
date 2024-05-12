package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _StarCommentNotificationMessage_ProtoDecoder implements InterfaceC31105CIr<StarCommentNotificationMessage> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentNotificationMessage LIZ(Q9H q9h) {
        StarCommentNotificationMessage starCommentNotificationMessage = new StarCommentNotificationMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    starCommentNotificationMessage.starCommentMessage = _StarCommentMessage_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                starCommentNotificationMessage.operator = _User_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            starCommentNotificationMessage.msgId = q9h.LJIIJJI();
                        }
                    } else {
                        starCommentNotificationMessage.starCommentAction = q9h.LJIIJ();
                    }
                } else {
                    starCommentNotificationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentNotificationMessage;
            }
        }
    }
}
