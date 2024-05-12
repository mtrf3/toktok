package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoDecoder implements InterfaceC31105CIr<EcommerceEntrance.ShopEntranceInfo.StoreLabel> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel LIZIZ(Q9H q9h) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        storeLabel.isBytemall = Q9J.LIZ(q9h);
                    }
                } else {
                    storeLabel.officialLabel = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return storeLabel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcommerceEntrance.ShopEntranceInfo.StoreLabel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
