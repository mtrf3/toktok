package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubscriptionGuideMessage_ProtoDecoder implements InterfaceC31105CIr<SubscriptionGuideMessage> {
    @Override // X.InterfaceC31105CIr
    public final SubscriptionGuideMessage LIZ(Q9H q9h) {
        SubscriptionGuideMessage subscriptionGuideMessage = new SubscriptionGuideMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subscriptionGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        subscriptionGuideMessage.description = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        subscriptionGuideMessage.buttonName = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        subscriptionGuideMessage.buttonUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        subscriptionGuideMessage.capsuleScene = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        subscriptionGuideMessage.from_user_id = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subscriptionGuideMessage;
            }
        }
    }
}
