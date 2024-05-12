package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _PIPODetails_ProtoDecoder implements InterfaceC31105CIr<PIPODetails> {
    public static PIPODetails LIZIZ(Q9H q9h) {
        PIPODetails pIPODetails = new PIPODetails();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        pIPODetails.sign = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        pIPODetails.bizContent = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        pIPODetails.merchantId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        pIPODetails.timestamp = q9h.LJIIJJI();
                        break;
                    case 5:
                        pIPODetails.method = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        pIPODetails.needChangePipoUrl = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        pIPODetails.pipoUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        pIPODetails.moneyPlatformUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        pIPODetails.apPartnerApiInAppRequest = _PIPODetails_APPartnerAPIInAppRequest_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        pIPODetails.appAccountToken = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return pIPODetails;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PIPODetails LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
