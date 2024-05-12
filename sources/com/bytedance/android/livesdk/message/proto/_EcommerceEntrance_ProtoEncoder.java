package com.bytedance.android.livesdk.message.proto;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ProtoEncoder implements InterfaceC64604PXc<EcommerceEntrance> {
    public static int LIZJ(EcommerceEntrance ecommerceEntrance) {
        int LIZ;
        int i = 0;
        int LJIIL = C30957CCz.LJIIL(3, ecommerceEntrance.schema) + C30957CCz.LJI(2, ecommerceEntrance.creatorType) + C30957CCz.LJI(1, ecommerceEntrance.entranceType);
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = ecommerceEntrance.shopEntranceInfo;
        if (shopEntranceInfo == null) {
            LIZ = 0;
        } else {
            int LIZJ = _EcommerceEntrance_ShopEntranceInfo_ProtoEncoder.LIZJ(shopEntranceInfo);
            LIZ = CD6.LIZ(4) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int i2 = LJIIL + LIZ;
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = ecommerceEntrance.showcaseEntranceInfo;
        if (showcaseEntranceInfo != null) {
            int LJIIIZ = C30957CCz.LJIIIZ(2, showcaseEntranceInfo.soldCount) + C30957CCz.LJIIL(1, showcaseEntranceInfo.formatSoldCount);
            i = CD6.LIZ(5) + CD6.LIZIZ(LJIIIZ) + LJIIIZ;
        }
        return i2 + i;
    }

    public static void LIZIZ(CD6 cd6, EcommerceEntrance ecommerceEntrance) {
        int i = ecommerceEntrance.entranceType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        int i2 = ecommerceEntrance.creatorType;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i2);
        C30957CCz.LIZLLL(cd6, 3, ecommerceEntrance.schema);
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = ecommerceEntrance.shopEntranceInfo;
        if (shopEntranceInfo != null) {
            cd6.LIZLLL(4, 2);
            cd6.LJ(_EcommerceEntrance_ShopEntranceInfo_ProtoEncoder.LIZJ(shopEntranceInfo));
            _EcommerceEntrance_ShopEntranceInfo_ProtoEncoder.LIZIZ(cd6, shopEntranceInfo);
        }
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = ecommerceEntrance.showcaseEntranceInfo;
        if (showcaseEntranceInfo == null) {
            return;
        }
        cd6.LIZLLL(5, 2);
        cd6.LJ(C30957CCz.LJIIIZ(2, showcaseEntranceInfo.soldCount) + C30957CCz.LJIIL(1, showcaseEntranceInfo.formatSoldCount));
        C30957CCz.LIZLLL(cd6, 1, showcaseEntranceInfo.formatSoldCount);
        long j = showcaseEntranceInfo.soldCount;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, EcommerceEntrance ecommerceEntrance) {
        LIZIZ(cd6, ecommerceEntrance);
    }
}
