package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder implements InterfaceC31105CIr<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage LIZIZ(Q9H q9h) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage();
        shopLabelImage.urlList = new ArrayList();
        shopLabelImage.thumbUriList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        shopLabelImage.height = q9h.LJIIJ();
                        break;
                    case 2:
                        shopLabelImage.width = q9h.LJIIJ();
                        break;
                    case 3:
                        shopLabelImage.minetype = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        shopLabelImage.thumbUri = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        shopLabelImage.thumbUriList.add(Q9J.LIZIZ(q9h));
                        break;
                    case 6:
                        shopLabelImage.uri = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        shopLabelImage.urlList.add(Q9J.LIZIZ(q9h));
                        break;
                    case 8:
                        shopLabelImage.color = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return shopLabelImage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
