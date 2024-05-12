package com.bytedance.android.livesdk.gift.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model._GiftOperation_ProtoEncoder;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoEncoder;
import com.bytedance.android.livesdk.model._Gift_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class _GiftPage_ProtoEncoder implements InterfaceC64604PXc<GiftPage> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GiftPage giftPage) {
        int LIZ;
        GiftPage giftPage2 = giftPage;
        int i = giftPage2.pageType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        C30957CCz.LIZLLL(cd6, 2, giftPage2.pageName);
        List<Gift> list = giftPage2.gifts;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < giftPage2.gifts.size(); i2++) {
                _Gift_ProtoEncoder.LIZJ(cd6, 3, (Gift) ListProtector.get(giftPage2.gifts, i2));
            }
        }
        boolean z = giftPage2.display;
        cd6.LIZLLL(4, 0);
        cd6.LJ(z ? 1 : 0);
        GiftOperation giftOperation = giftPage2.operation;
        if (giftOperation != null) {
            cd6.LIZLLL(5, 2);
            cd6.LJ(C30957CCz.LJIIL(7, giftOperation.eventName) + C30957CCz.LJIIL(6, giftOperation.schemeUrl) + C30957CCz.LJIIIZ(5, giftOperation.titleSize) + C30957CCz.LJIIL(4, giftOperation.titleColor) + C30957CCz.LJIIL(3, giftOperation.title) + _ImageModel_ProtoEncoder.LJ(2, giftOperation.rightImage) + _ImageModel_ProtoEncoder.LJ(1, giftOperation.leftImage));
            _GiftOperation_ProtoEncoder.LIZIZ(cd6, giftOperation);
        }
        C30957CCz.LIZLLL(cd6, 6, giftPage2.eventName);
        GiftPanelBanner giftPanelBanner = giftPage2.pagePanelBanner;
        if (giftPanelBanner != null) {
            cd6.LIZLLL(7, 2);
            cd6.LJ(_GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner));
            _GiftPanelBanner_ProtoEncoder.LIZIZ(cd6, giftPanelBanner);
        }
        List<Gift> list2 = giftPage2.frequentlyUsedGifts;
        if (list2 != null && !list2.isEmpty()) {
            for (int i3 = 0; i3 < giftPage2.frequentlyUsedGifts.size(); i3++) {
                _Gift_ProtoEncoder.LIZJ(cd6, 8, (Gift) ListProtector.get(giftPage2.frequentlyUsedGifts, i3));
            }
        }
        Map<Long, ForceInsertMetricsItem> map = giftPage2.forceInsertMetrics;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Long, ForceInsertMetricsItem> entry : giftPage2.forceInsertMetrics.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    cd6.LIZLLL(9, 2);
                    int LJIIJ = C30957CCz.LJIIJ(1, entry.getKey());
                    ForceInsertMetricsItem value = entry.getValue();
                    if (value == null) {
                        LIZ = 0;
                    } else {
                        int LJI = C30957CCz.LJI(2, value.forceIndexConfig) + C30957CCz.LJI(1, value.forceInsertType);
                        LIZ = CD6.LIZ(2) + CD6.LIZIZ(LJI) + LJI;
                    }
                    cd6.LJ(LJIIJ + LIZ);
                    C30957CCz.LIZJ(cd6, 1, entry.getKey());
                    ForceInsertMetricsItem value2 = entry.getValue();
                    if (value2 != null) {
                        cd6.LIZLLL(2, 2);
                        cd6.LJ(C30957CCz.LJI(2, value2.forceIndexConfig) + C30957CCz.LJI(1, value2.forceInsertType));
                        int i4 = value2.forceInsertType;
                        cd6.LIZLLL(1, 0);
                        cd6.LIZJ(i4);
                        int i5 = value2.forceIndexConfig;
                        cd6.LIZLLL(2, 0);
                        cd6.LIZJ(i5);
                    }
                }
            }
        }
        C30957CCz.LIZLLL(cd6, 10, giftPage2.region);
        Map<Long, Long> map2 = giftPage2.forceInsertPriorityMap;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<Long, Long> entry2 : giftPage2.forceInsertPriorityMap.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null) {
                    cd6.LIZLLL(11, 2);
                    cd6.LJ(C30957CCz.LJIIJ(2, entry2.getValue()) + C30957CCz.LJIIJ(1, entry2.getKey()));
                    C30957CCz.LIZJ(cd6, 1, entry2.getKey());
                    C30957CCz.LIZJ(cd6, 2, entry2.getValue());
                }
            }
        }
    }
}
