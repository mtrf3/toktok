package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CommentsMessage_ProtoDecoder implements InterfaceC31105CIr<CommentsMessage> {
    @Override // X.InterfaceC31105CIr
    public final CommentsMessage LIZ(Q9H q9h) {
        CommentsMessage commentsMessage = new CommentsMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        commentsMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        commentsMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        commentsMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        commentsMessage.color = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        commentsMessage.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        commentsMessage.actionType = q9h.LJIIJJI();
                        break;
                    case 7:
                        commentsMessage.actionContent = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return commentsMessage;
            }
        }
    }
}
