package com.bytedance.android.livesdk.message.proto;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_ProtoEncoder implements InterfaceC64604PXc<EcommerceEntrance.ShopEntranceInfo> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        int i = 0;
        int LJIIL = C30957CCz.LJIIL(3, shopEntranceInfo.shopRating) + C30957CCz.LJIIL(2, shopEntranceInfo.shopName) + C30957CCz.LJIIL(1, shopEntranceInfo.shopId);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = shopEntranceInfo.storeLabel;
        if (storeLabel != null) {
            int LIZJ = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder.LIZJ(storeLabel);
            i = CD6.LIZ(4) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        return C30957CCz.LJ(10) + C30957CCz.LJI(9, shopEntranceInfo.rateDisplayStyle) + C30957CCz.LJIIL(8, shopEntranceInfo.expRateTopDisplay) + C30957CCz.LJI(7, shopEntranceInfo.expRatePercentile) + C30957CCz.LJIIIZ(6, shopEntranceInfo.soldCount) + C30957CCz.LJIIL(5, shopEntranceInfo.formatSoldCount) + LJIIL + i;
    }

    public static void LIZIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        C30957CCz.LIZLLL(cd6, 1, shopEntranceInfo.shopId);
        C30957CCz.LIZLLL(cd6, 2, shopEntranceInfo.shopName);
        C30957CCz.LIZLLL(cd6, 3, shopEntranceInfo.shopRating);
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = shopEntranceInfo.storeLabel;
        if (storeLabel != null) {
            cd6.LIZLLL(4, 2);
            cd6.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder.LIZJ(storeLabel));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder.LIZIZ(cd6, storeLabel);
        }
        C30957CCz.LIZLLL(cd6, 5, shopEntranceInfo.formatSoldCount);
        long j = shopEntranceInfo.soldCount;
        cd6.LIZLLL(6, 0);
        cd6.LJFF(j);
        int i = shopEntranceInfo.expRatePercentile;
        cd6.LIZLLL(7, 0);
        cd6.LIZJ(i);
        C30957CCz.LIZLLL(cd6, 8, shopEntranceInfo.expRateTopDisplay);
        int i2 = shopEntranceInfo.rateDisplayStyle;
        cd6.LIZLLL(9, 0);
        cd6.LIZJ(i2);
        boolean z = shopEntranceInfo.showRateNotApplicable;
        cd6.LIZLLL(10, 0);
        cd6.LJ(z ? 1 : 0);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        LIZIZ(cd6, shopEntranceInfo);
    }
}
