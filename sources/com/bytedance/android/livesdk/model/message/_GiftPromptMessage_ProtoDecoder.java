package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftPromptMessage_ProtoDecoder implements InterfaceC31105CIr<GiftPromptMessage> {
    @Override // X.InterfaceC31105CIr
    public final GiftPromptMessage LIZ(Q9H q9h) {
        GiftPromptMessage giftPromptMessage = new GiftPromptMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftPromptMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        giftPromptMessage.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftPromptMessage.body = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        giftPromptMessage.blockNumDays = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 5:
                        giftPromptMessage.orderId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        giftPromptMessage.orderTimestamp = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftPromptMessage;
            }
        }
    }
}
