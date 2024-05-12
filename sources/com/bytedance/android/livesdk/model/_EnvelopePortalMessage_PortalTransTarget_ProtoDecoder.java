package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;

/* loaded from: classes6.dex */
public final class _EnvelopePortalMessage_PortalTransTarget_ProtoDecoder implements InterfaceC31105CIr<EnvelopePortalMessage.PortalTransTarget> {
    public static EnvelopePortalMessage.PortalTransTarget LIZIZ(Q9H q9h) {
        EnvelopePortalMessage.PortalTransTarget portalTransTarget = new EnvelopePortalMessage.PortalTransTarget();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        portalTransTarget.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        portalTransTarget.sendRoomCover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        portalTransTarget.anchorDisplayId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        portalTransTarget.anchorId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        portalTransTarget.anchorAvatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        portalTransTarget.envelopeDiamonds = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return portalTransTarget;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnvelopePortalMessage.PortalTransTarget LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
