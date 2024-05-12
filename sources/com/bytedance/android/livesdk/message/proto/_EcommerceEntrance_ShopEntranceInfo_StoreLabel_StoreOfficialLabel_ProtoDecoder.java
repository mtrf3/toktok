package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoDecoder implements InterfaceC31105CIr<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel LIZIZ(Q9H q9h) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel();
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
                                storeOfficialLabel.labelTypeStr = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            storeOfficialLabel.labelType = q9h.LJIIJ();
                        }
                    } else {
                        storeOfficialLabel.labelImageDark = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    storeOfficialLabel.labelImageLight = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return storeOfficialLabel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
