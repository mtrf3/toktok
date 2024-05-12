package com.bytedance.android.livesdk.message.proto;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoEncoder implements InterfaceC64604PXc<EcommerceEntrance.ShopEntranceInfo.StoreLabel> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel) {
        int LIZ;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = storeLabel.officialLabel;
        if (storeOfficialLabel == null) {
            LIZ = 0;
        } else {
            int LIZJ = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder.LIZJ(storeOfficialLabel);
            LIZ = CD6.LIZ(1) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        return C30957CCz.LJ(2) + LIZ;
    }

    public static void LIZIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = storeLabel.officialLabel;
        if (storeOfficialLabel != null) {
            cd6.LIZLLL(1, 2);
            cd6.LJ(_EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder.LIZJ(storeOfficialLabel));
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoEncoder.LIZIZ(cd6, storeOfficialLabel);
        }
        boolean z = storeLabel.isBytemall;
        cd6.LIZLLL(2, 0);
        cd6.LJ(z ? 1 : 0);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel) {
        LIZIZ(cd6, storeLabel);
    }
}
