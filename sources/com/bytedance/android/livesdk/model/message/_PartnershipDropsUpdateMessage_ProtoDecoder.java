package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PartnershipDropsUpdateMessage_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsUpdateMessage> {
    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsUpdateMessage LIZ(Q9H q9h) {
        PartnershipDropsUpdateMessage partnershipDropsUpdateMessage = new PartnershipDropsUpdateMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDropsUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDropsUpdateMessage.changeMode = q9h.LJIIJ();
                        break;
                    case 3:
                        partnershipDropsUpdateMessage.dropsId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipDropsUpdateMessage.taskId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        partnershipDropsUpdateMessage.eventId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        partnershipDropsUpdateMessage.anchorUid = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsUpdateMessage;
            }
        }
    }
}
