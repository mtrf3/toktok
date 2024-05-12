package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _PreviewTimeReportResponse_ProtoDecoder implements InterfaceC31105CIr<PreviewTimeReportResponse> {
    @Override // X.InterfaceC31105CIr
    public final PreviewTimeReportResponse LIZ(Q9H q9h) {
        PreviewTimeReportResponse previewTimeReportResponse = new PreviewTimeReportResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    previewTimeReportResponse.data = _PreviewTimeReportResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return previewTimeReportResponse;
            }
        }
    }
}
