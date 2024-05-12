package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._GiftOperation_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _GiftPage_ProtoDecoder implements InterfaceC31105CIr<GiftPage> {
    public static GiftPage LIZIZ(Q9H q9h) {
        GiftPage giftPage = new GiftPage();
        giftPage.frequentlyUsedGifts = new ArrayList();
        giftPage.forceInsertMetrics = new HashMap();
        giftPage.forceInsertPriorityMap = new HashMap();
        giftPage.gifts = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                switch (LJI) {
                    case 1:
                        giftPage.pageType = q9h.LJIIJ();
                        break;
                    case 2:
                        giftPage.pageName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftPage.gifts.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        giftPage.display = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        giftPage.operation = _GiftOperation_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        giftPage.eventName = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        giftPage.pagePanelBanner = _GiftPanelBanner_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        giftPage.frequentlyUsedGifts.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 9:
                        long LIZJ2 = q9h.LIZJ();
                        ForceInsertMetricsItem forceInsertMetricsItem = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        forceInsertMetricsItem = _ForceInsertMetricsItem_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (forceInsertMetricsItem != null) {
                                        giftPage.forceInsertMetrics.put(l, forceInsertMetricsItem);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 10:
                        giftPage.region = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        long LIZJ3 = q9h.LIZJ();
                        Long l2 = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        l2 = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (l != null) {
                                    if (l2 != null) {
                                        giftPage.forceInsertPriorityMap.put(l, l2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftPage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftPage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
