package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GuideKeywordsReportRequest_ProtoDecoder implements InterfaceC31105CIr<GuideKeywordsReportRequest> {
    @Override // X.InterfaceC31105CIr
    public final GuideKeywordsReportRequest LIZ(Q9H q9h) {
        GuideKeywordsReportRequest guideKeywordsReportRequest = new GuideKeywordsReportRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            guideKeywordsReportRequest.giftId = q9h.LJIIJJI();
                        }
                    } else {
                        guideKeywordsReportRequest.reportType = q9h.LJIIJ();
                    }
                } else {
                    guideKeywordsReportRequest.keyword = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return guideKeywordsReportRequest;
            }
        }
    }
}
