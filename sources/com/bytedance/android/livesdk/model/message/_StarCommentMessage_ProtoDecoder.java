package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _StarCommentMessage_ProtoDecoder implements InterfaceC31105CIr<StarCommentMessage> {
    public static StarCommentMessage LIZIZ(Q9H q9h) {
        StarCommentMessage starCommentMessage = new StarCommentMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        starCommentMessage.starCommentId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        starCommentMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        starCommentMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        starCommentMessage.duration = q9h.LJIIJJI();
                        break;
                    case 5:
                        starCommentMessage.startTimeMs = q9h.LJIIJJI();
                        break;
                    case 6:
                        starCommentMessage.commentOption = q9h.LJIIJ();
                        break;
                    case 7:
                        starCommentMessage.contentLanguage = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
