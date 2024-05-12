package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _EnvelopePortalMessage_PortalInfo_ProtoDecoder implements InterfaceC31105CIr<EnvelopePortalMessage.PortalInfo> {
    public static EnvelopePortalMessage.PortalInfo LIZIZ(Q9H q9h) {
        EnvelopePortalMessage.PortalInfo portalInfo = new EnvelopePortalMessage.PortalInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        portalInfo.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        portalInfo.idc = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        portalInfo.sendAtSecond = q9h.LJIIJ();
                        break;
                    case 4:
                        portalInfo.ddlSecond = q9h.LJIIJ();
                        break;
                    case 5:
                        portalInfo.envelopeDiamonds = q9h.LJIIJ();
                        break;
                    case 6:
                        portalInfo.portalDiamonds = q9h.LJIIJ();
                        break;
                    case 7:
                        portalInfo.senderDisplayId = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        portalInfo.senderId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        portalInfo.senderAvatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        portalInfo.transCount = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        portalInfo.touchCount = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return portalInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnvelopePortalMessage.PortalInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
