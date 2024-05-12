package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import webcast.api.envelope.PortalListResponse;

/* loaded from: classes6.dex */
public final class _PortalListResponse_PortalInfo_ProtoDecoder implements InterfaceC31105CIr<PortalListResponse.PortalInfo> {
    public static PortalListResponse.PortalInfo LIZIZ(Q9H q9h) {
        PortalListResponse.PortalInfo portalInfo = new PortalListResponse.PortalInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        portalInfo.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        portalInfo.sendAtSecond = q9h.LJIIJ();
                        break;
                    case 3:
                        portalInfo.ddlSecond = q9h.LJIIJ();
                        break;
                    case 4:
                        portalInfo.envelopeDiamonds = q9h.LJIIJ();
                        break;
                    case 5:
                        portalInfo.portalDiamonds = q9h.LJIIJ();
                        break;
                    case 6:
                        portalInfo.senderDisplayId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        portalInfo.senderId = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        portalInfo.senderAvatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        portalInfo.transCount = q9h.LJIIJ();
                        break;
                    case 10:
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
    public final PortalListResponse.PortalInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
