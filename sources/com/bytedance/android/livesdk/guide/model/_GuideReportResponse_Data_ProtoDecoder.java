package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;

/* loaded from: classes14.dex */
public final class _GuideReportResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GuideReportResponse.Data> {
    @Override // X.InterfaceC31105CIr
    public final GuideReportResponse.Data LIZ(Q9H q9h) {
        GuideReportResponse.Data data = new GuideReportResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return data;
    }
}
