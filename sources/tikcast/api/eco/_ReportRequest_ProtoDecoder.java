package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ReportRequest_ProtoDecoder implements InterfaceC31105CIr<ReportRequest> {
    @Override // X.InterfaceC31105CIr
    public final ReportRequest LIZ(Q9H q9h) {
        ReportRequest reportRequest = new ReportRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            reportRequest.detectRoomCount = q9h.LJIIJJI();
                        }
                    } else {
                        reportRequest.actionType = q9h.LJIIJ();
                    }
                } else {
                    reportRequest.detectorUserId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return reportRequest;
            }
        }
    }
}
