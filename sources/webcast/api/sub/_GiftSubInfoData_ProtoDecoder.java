package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GiftSubInfoData_ProtoDecoder implements InterfaceC31105CIr<GiftSubInfoData> {
    public static GiftSubInfoData LIZIZ(Q9H q9h) {
        GiftSubInfoData giftSubInfoData = new GiftSubInfoData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                giftSubInfoData.giftSubPurchaseThreshold = q9h.LJIIJJI();
                            }
                        } else {
                            giftSubInfoData.giftSubQuota = q9h.LJIIJJI();
                        }
                    } else {
                        giftSubInfoData.anchorGiftSubAuth = Q9J.LIZ(q9h);
                    }
                } else {
                    giftSubInfoData.subscriberCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return giftSubInfoData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftSubInfoData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
