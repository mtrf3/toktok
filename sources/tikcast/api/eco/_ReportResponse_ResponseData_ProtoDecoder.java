package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.ReportResponse;

/* loaded from: classes17.dex */
public final class _ReportResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ReportResponse.ResponseData> {
    public static ReportResponse.ResponseData LIZIZ(Q9H q9h) {
        ReportResponse.ResponseData responseData = new ReportResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReportResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
