package com.bytedance.android.livesdk.message.proto;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoEncoder implements InterfaceC64604PXc<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage> {
    public static int LIZJ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage) {
        if (shopLabelImage == null) {
            return 0;
        }
        int LJIIL = C30957CCz.LJIIL(4, shopLabelImage.thumbUri) + C30957CCz.LJIIL(3, shopLabelImage.minetype) + C30957CCz.LJI(2, shopLabelImage.width) + C30957CCz.LJI(1, shopLabelImage.height);
        List<String> list = shopLabelImage.thumbUriList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < shopLabelImage.thumbUriList.size(); i++) {
                LJIIL += C30957CCz.LJIIL(5, (String) ListProtector.get(shopLabelImage.thumbUriList, i));
            }
        }
        int LJIIL2 = C30957CCz.LJIIL(6, shopLabelImage.uri) + LJIIL;
        List<String> list2 = shopLabelImage.urlList;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < shopLabelImage.urlList.size(); i2++) {
                LJIIL2 += C30957CCz.LJIIL(7, (String) ListProtector.get(shopLabelImage.urlList, i2));
            }
        }
        return C30957CCz.LJIIL(8, shopLabelImage.color) + LJIIL2;
    }

    public static void LIZIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage) {
        int i = shopLabelImage.height;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        int i2 = shopLabelImage.width;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i2);
        C30957CCz.LIZLLL(cd6, 3, shopLabelImage.minetype);
        C30957CCz.LIZLLL(cd6, 4, shopLabelImage.thumbUri);
        List<String> list = shopLabelImage.thumbUriList;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < shopLabelImage.thumbUriList.size(); i3++) {
                C30957CCz.LIZLLL(cd6, 5, (String) ListProtector.get(shopLabelImage.thumbUriList, i3));
            }
        }
        C30957CCz.LIZLLL(cd6, 6, shopLabelImage.uri);
        List<String> list2 = shopLabelImage.urlList;
        if (list2 != null && !list2.isEmpty()) {
            for (int i4 = 0; i4 < shopLabelImage.urlList.size(); i4++) {
                C30957CCz.LIZLLL(cd6, 7, (String) ListProtector.get(shopLabelImage.urlList, i4));
            }
        }
        C30957CCz.LIZLLL(cd6, 8, shopLabelImage.color);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage) {
        LIZIZ(cd6, shopLabelImage);
    }
}
