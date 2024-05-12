package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftGuideMessage_ProtoDecoder implements InterfaceC31105CIr<GiftGuideMessage> {
    public static GiftGuideMessage LIZIZ(Q9H q9h) {
        GiftGuideMessage giftGuideMessage = new GiftGuideMessage();
        giftGuideMessage.guidePageResources = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        giftGuideMessage.content = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        giftGuideMessage.giftId = q9h.LJIIJJI();
                        break;
                    case 4:
                        giftGuideMessage.hasSent = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        giftGuideMessage.guideType = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        giftGuideMessage.displaySeconds = q9h.LJIIJJI();
                        break;
                    case 7:
                        giftGuideMessage.triggerName = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        giftGuideMessage.schemaUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        giftGuideMessage.shouldUseConfig = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        giftGuideMessage.guidePageResources.add(_GuidePageResource_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftGuideMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftGuideMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
