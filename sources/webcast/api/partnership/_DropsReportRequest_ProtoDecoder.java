package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DropsReportRequest_ProtoDecoder implements InterfaceC31105CIr<DropsReportRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsReportRequest LIZ(Q9H q9h) {
        DropsReportRequest dropsReportRequest = new DropsReportRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    dropsReportRequest.roomId = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                dropsReportRequest.anchorId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            dropsReportRequest.status = q9h.LJIIJ();
                        }
                    } else {
                        dropsReportRequest.round = q9h.LJIIJ();
                    }
                } else {
                    dropsReportRequest.dropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsReportRequest;
            }
        }
    }
}
