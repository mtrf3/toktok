package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AdEventTracking_ProtoDecoder implements InterfaceC31105CIr<AdEventTracking> {
    public static AdEventTracking LIZIZ(Q9H q9h) {
        AdEventTracking adEventTracking = new AdEventTracking();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        adEventTracking.advId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        adEventTracking.enterFromMerge = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        adEventTracking.enterMethod = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        adEventTracking.feedId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        adEventTracking.isAd = q9h.LJIIJ();
                        break;
                    case 6:
                        adEventTracking.adId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        adEventTracking.label = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        adEventTracking.logExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        adEventTracking.tag = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        adEventTracking.creativeId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return adEventTracking;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AdEventTracking LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
