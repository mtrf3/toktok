package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GiftGuideTriggerReqParams_ProtoDecoder implements InterfaceC31105CIr<GiftGuideTriggerReqParams> {
    @Override // X.InterfaceC31105CIr
    public final GiftGuideTriggerReqParams LIZ(Q9H q9h) {
        GiftGuideTriggerReqParams giftGuideTriggerReqParams = new GiftGuideTriggerReqParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftGuideTriggerReqParams.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        giftGuideTriggerReqParams.triggerType = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftGuideTriggerReqParams.watchDuration = q9h.LJIIJJI();
                        break;
                    case 4:
                        giftGuideTriggerReqParams.lastGiftGuideTs = q9h.LJIIJJI();
                        break;
                    case 5:
                        giftGuideTriggerReqParams.clientTriggerFeature = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        giftGuideTriggerReqParams.clientLogId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftGuideTriggerReqParams;
            }
        }
    }
}
