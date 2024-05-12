package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubLiveBanner_ProtoDecoder implements InterfaceC31105CIr<SubLiveBanner> {
    public static SubLiveBanner LIZIZ(Q9H q9h) {
        SubLiveBanner subLiveBanner = new SubLiveBanner();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subLiveBanner.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        subLiveBanner.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        subLiveBanner.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        subLiveBanner.height = q9h.LJIIJJI();
                        break;
                    case 5:
                        subLiveBanner.width = q9h.LJIIJJI();
                        break;
                    case 6:
                        subLiveBanner.schemaUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        subLiveBanner.text = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        subLiveBanner.activityName = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subLiveBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubLiveBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
