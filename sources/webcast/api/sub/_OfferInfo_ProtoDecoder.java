package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _OfferInfo_ProtoDecoder implements InterfaceC31105CIr<OfferInfo> {
    public static OfferInfo LIZIZ(Q9H q9h) {
        OfferInfo offerInfo = new OfferInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        offerInfo.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        offerInfo.offerType = q9h.LJIIJJI();
                        break;
                    case 3:
                        offerInfo.campaignType = q9h.LJIIJJI();
                        break;
                    case 4:
                        offerInfo.originalAmount = q9h.LJIIJJI();
                        break;
                    case 5:
                        offerInfo.originalMoneyDisplay = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        offerInfo.discountAmount = q9h.LJIIJJI();
                        break;
                    case 7:
                        offerInfo.discountMoneyDisplay = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        offerInfo.offerEndTimestamp = q9h.LJIIJJI();
                        break;
                    case 9:
                        offerInfo.discountRate = Float.intBitsToFloat(q9h.LJIIIIZZ());
                        break;
                    case 10:
                        offerInfo.offerStartTimestamp = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return offerInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OfferInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
