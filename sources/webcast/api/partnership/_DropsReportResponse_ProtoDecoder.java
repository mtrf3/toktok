package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _DropsReportResponse_ProtoDecoder implements InterfaceC31105CIr<DropsReportResponse> {
    @Override // X.InterfaceC31105CIr
    public final DropsReportResponse LIZ(Q9H q9h) {
        DropsReportResponse dropsReportResponse = new DropsReportResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return dropsReportResponse;
    }
}
