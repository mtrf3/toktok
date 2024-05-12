package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GuideFeedbackReportRequest_ProtoDecoder implements InterfaceC31105CIr<GuideFeedbackReportRequest> {
    @Override // X.InterfaceC31105CIr
    public final GuideFeedbackReportRequest LIZ(Q9H q9h) {
        GuideFeedbackReportRequest guideFeedbackReportRequest = new GuideFeedbackReportRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                guideFeedbackReportRequest.roomId = q9h.LJIIJJI();
                            }
                        } else {
                            guideFeedbackReportRequest.showStatus = q9h.LJIIJ();
                        }
                    } else {
                        guideFeedbackReportRequest.reportType = q9h.LJIIJ();
                    }
                } else {
                    guideFeedbackReportRequest.messageKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return guideFeedbackReportRequest;
            }
        }
    }
}
