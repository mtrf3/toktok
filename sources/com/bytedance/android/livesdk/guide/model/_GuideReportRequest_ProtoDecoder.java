package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GuideReportRequest_ProtoDecoder implements InterfaceC31105CIr<GuideReportRequest> {
    @Override // X.InterfaceC31105CIr
    public final GuideReportRequest LIZ(Q9H q9h) {
        GuideReportRequest guideReportRequest = new GuideReportRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            guideReportRequest.roomId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        guideReportRequest.reportType = q9h.LJIIJ();
                    }
                } else {
                    guideReportRequest.guideType = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return guideReportRequest;
            }
        }
    }
}