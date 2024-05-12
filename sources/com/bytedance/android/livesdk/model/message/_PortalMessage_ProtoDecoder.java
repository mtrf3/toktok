package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._Portal_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _PortalMessage_ProtoDecoder implements InterfaceC31105CIr<PortalMessage> {
    @Override // X.InterfaceC31105CIr
    public final PortalMessage LIZ(Q9H q9h) {
        PortalMessage portalMessage = new PortalMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        portalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        portalMessage.payloadType = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        portalMessage.portalId = q9h.LJIIJJI();
                        break;
                    case 4:
                        portalMessage.roomId = q9h.LJIIJJI();
                        break;
                    case 5:
                        portalMessage.portalBuy = _PortalMessage_PortalBuy_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        portalMessage.portalInvite = _PortalMessage_PortalInvite_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        portalMessage.portalFinish = _PortalMessage_PortalFinish_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        portalMessage.portal = _Portal_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        portalMessage.nextPingTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                int i = portalMessage.payloadType;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            portalMessage.payload = portalMessage.portalFinish;
                        }
                    } else {
                        portalMessage.payload = portalMessage.portalInvite;
                    }
                } else {
                    portalMessage.payload = portalMessage.portalBuy;
                }
                return portalMessage;
            }
        }
    }
}
