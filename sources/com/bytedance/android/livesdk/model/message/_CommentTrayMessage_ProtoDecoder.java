package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CommentTrayMessage_ProtoDecoder implements InterfaceC31105CIr<CommentTrayMessage> {
    @Override // X.InterfaceC31105CIr
    public final CommentTrayMessage LIZ(Q9H q9h) {
        CommentTrayMessage commentTrayMessage = new CommentTrayMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        commentTrayMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        commentTrayMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        commentTrayMessage.contentType = q9h.LJIIJJI();
                        break;
                    case 4:
                        commentTrayMessage.count = q9h.LJIIJJI();
                        break;
                    case 5:
                        commentTrayMessage.chatTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        commentTrayMessage.trayId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return commentTrayMessage;
            }
        }
    }
}
