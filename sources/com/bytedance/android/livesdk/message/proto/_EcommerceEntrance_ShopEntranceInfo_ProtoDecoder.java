package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_ProtoDecoder implements InterfaceC31105CIr<EcommerceEntrance.ShopEntranceInfo> {
    public static EcommerceEntrance.ShopEntranceInfo LIZIZ(Q9H q9h) {
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = new EcommerceEntrance.ShopEntranceInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        shopEntranceInfo.shopId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        shopEntranceInfo.shopName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        shopEntranceInfo.shopRating = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        shopEntranceInfo.storeLabel = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        shopEntranceInfo.formatSoldCount = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        shopEntranceInfo.soldCount = q9h.LJIIJJI();
                        break;
                    case 7:
                        shopEntranceInfo.expRatePercentile = q9h.LJIIJ();
                        break;
                    case 8:
                        shopEntranceInfo.expRateTopDisplay = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        shopEntranceInfo.rateDisplayStyle = q9h.LJIIJ();
                        break;
                    case 10:
                        shopEntranceInfo.showRateNotApplicable = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return shopEntranceInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcommerceEntrance.ShopEntranceInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
