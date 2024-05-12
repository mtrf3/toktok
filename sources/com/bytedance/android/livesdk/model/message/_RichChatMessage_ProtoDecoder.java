package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RichChatMessage_ProtoDecoder implements InterfaceC31105CIr<RichChatMessage> {
    @Override // X.InterfaceC31105CIr
    public final RichChatMessage LIZ(Q9H q9h) {
        RichChatMessage richChatMessage = new RichChatMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        richChatMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        richChatMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        richChatMessage.color = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        richChatMessage.traceId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        richChatMessage.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        richChatMessage.actionContent = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        richChatMessage.actionType = String.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        richChatMessage.pushDisplayTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return richChatMessage;
            }
        }
    }
}
