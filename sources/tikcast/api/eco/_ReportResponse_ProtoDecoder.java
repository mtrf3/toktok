package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ReportResponse_ProtoDecoder implements InterfaceC31105CIr<ReportResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReportResponse LIZ(Q9H q9h) {
        ReportResponse reportResponse = new ReportResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    reportResponse.data = _ReportResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reportResponse;
            }
        }
    }
}
