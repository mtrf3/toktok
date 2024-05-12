package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _FeedBanner_ProtoDecoder implements InterfaceC31105CIr<FeedBanner> {
    public static FeedBanner LIZIZ(Q9H q9h) {
        FeedBanner feedBanner = new FeedBanner();
        feedBanner.urlList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        feedBanner.avgColor = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        feedBanner.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        feedBanner.urlList.add(Q9J.LIZIZ(q9h));
                        break;
                    case 4:
                        feedBanner.uri = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        feedBanner.height = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        feedBanner.width = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                    case 10:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 8:
                        feedBanner.id = q9h.LJIIJJI();
                        break;
                    case 9:
                        feedBanner.schemaUrl = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        feedBanner.bannerType = (int) q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return feedBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
