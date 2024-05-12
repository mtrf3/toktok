package com.bytedance.android.livesdk.message.proto;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder implements InterfaceC64604PXc<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel) {
        int LIZ;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = storeOfficialLabel.labelImageLight;
        int i = 0;
        if (shopLabelImage == null) {
            LIZ = 0;
        } else {
            int LIZJ = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage);
            LIZ = CD6.LIZ(1) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage2 = storeOfficialLabel.labelImageDark;
        if (shopLabelImage2 != null) {
            int LIZJ2 = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage2);
            i = CD6.LIZ(2) + CD6.LIZIZ(LIZJ2) + LIZJ2;
        }
        return C30957CCz.LJIIL(4, storeOfficialLabel.labelTypeStr) + C30957CCz.LJI(3, storeOfficialLabel.labelType) + i + LIZ;
    }

    public static void LIZIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = storeOfficialLabel.labelImageLight;
        if (shopLabelImage != null) {
            cd6.LIZLLL(1, 2);
            cd6.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZIZ(cd6, shopLabelImage);
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage2 = storeOfficialLabel.labelImageDark;
        if (shopLabelImage2 != null) {
            cd6.LIZLLL(2, 2);
            cd6.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZJ(shopLabelImage2));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder.LIZIZ(cd6, shopLabelImage2);
        }
        int i = storeOfficialLabel.labelType;
        cd6.LIZLLL(3, 0);
        cd6.LIZJ(i);
        C30957CCz.LIZLLL(cd6, 4, storeOfficialLabel.labelTypeStr);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel) {
        LIZIZ(cd6, storeOfficialLabel);
    }
}
