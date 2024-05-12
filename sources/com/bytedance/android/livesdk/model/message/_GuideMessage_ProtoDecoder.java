package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GuideMessage_ProtoDecoder implements InterfaceC31105CIr<GuideMessage> {
    @Override // X.InterfaceC31105CIr
    public final GuideMessage LIZ(Q9H q9h) {
        GuideMessage guideMessage = new GuideMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        guideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        guideMessage.guideType = q9h.LJIIJJI();
                        break;
                    case 3:
                        guideMessage.giftId = q9h.LJIIJJI();
                        break;
                    case 4:
                        guideMessage.description = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        guideMessage.duration = q9h.LJIIJJI();
                        break;
                    case 6:
                        guideMessage.displayStyle = q9h.LJIIJJI();
                        break;
                    case 7:
                        guideMessage.scene = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return guideMessage;
            }
        }
    }
}
