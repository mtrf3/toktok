package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsReportResponse;

/* loaded from: classes14.dex */
public final class _GuideKeywordsReportResponse_ProtoDecoder implements InterfaceC31105CIr<GuideKeywordsReportResponse> {
    @Override // X.InterfaceC31105CIr
    public final GuideKeywordsReportResponse LIZ(Q9H q9h) {
        GuideKeywordsReportResponse guideKeywordsReportResponse = new GuideKeywordsReportResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    GuideKeywordsReportResponse.Data data = new GuideKeywordsReportResponse.Data();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    guideKeywordsReportResponse.data = data;
                }
            } else {
                q9h.LJ(LIZJ);
                return guideKeywordsReportResponse;
            }
        }
    }
}
