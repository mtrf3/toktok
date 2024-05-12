package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.GuideFeedbackReportResponse;

/* loaded from: classes17.dex */
public final class _GuideFeedbackReportResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GuideFeedbackReportResponse.Data> {
    public static GuideFeedbackReportResponse.Data LIZIZ(Q9H q9h) {
        GuideFeedbackReportResponse.Data data = new GuideFeedbackReportResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideFeedbackReportResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
