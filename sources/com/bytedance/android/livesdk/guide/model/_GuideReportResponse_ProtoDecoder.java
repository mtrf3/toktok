package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;

/* loaded from: classes14.dex */
public final class _GuideReportResponse_ProtoDecoder implements InterfaceC31105CIr<GuideReportResponse> {
    @Override // X.InterfaceC31105CIr
    public final GuideReportResponse LIZ(Q9H q9h) {
        GuideReportResponse guideReportResponse = new GuideReportResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    GuideReportResponse.Data data = new GuideReportResponse.Data();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    guideReportResponse.data = data;
                }
            } else {
                q9h.LJ(LIZJ);
                return guideReportResponse;
            }
        }
    }
}
