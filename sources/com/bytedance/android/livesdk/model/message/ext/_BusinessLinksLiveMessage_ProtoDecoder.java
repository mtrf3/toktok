package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes13.dex */
public final class _BusinessLinksLiveMessage_ProtoDecoder implements InterfaceC31105CIr<BusinessLinksLiveMessage> {
    @Override // X.InterfaceC31105CIr
    public final BusinessLinksLiveMessage LIZ(Q9H q9h) {
        BusinessLinksLiveMessage businessLinksLiveMessage = new BusinessLinksLiveMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        businessLinksLiveMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        businessLinksLiveMessage.op = q9h.LJIIJ();
                        break;
                    case 3:
                        businessLinksLiveMessage.id = q9h.LJIIJJI();
                        break;
                    case 4:
                        businessLinksLiveMessage.title = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        businessLinksLiveMessage.subtitle = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        businessLinksLiveMessage.url = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        businessLinksLiveMessage.pic = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        businessLinksLiveMessage.opTime = q9h.LJIIJJI();
                        break;
                    case 9:
                        businessLinksLiveMessage.cardType = q9h.LJIIJ();
                        break;
                    case 10:
                        businessLinksLiveMessage.gameUrl = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return businessLinksLiveMessage;
            }
        }
    }
}
