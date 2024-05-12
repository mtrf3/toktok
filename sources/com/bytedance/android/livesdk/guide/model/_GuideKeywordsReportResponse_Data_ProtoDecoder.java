package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsReportResponse;

/* loaded from: classes14.dex */
public final class _GuideKeywordsReportResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GuideKeywordsReportResponse.Data> {
    @Override // X.InterfaceC31105CIr
    public final GuideKeywordsReportResponse.Data LIZ(Q9H q9h) {
        GuideKeywordsReportResponse.Data data = new GuideKeywordsReportResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return data;
    }
}
