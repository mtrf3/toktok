package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _PreviewTimeReportRequest_ProtoDecoder implements InterfaceC31105CIr<PreviewTimeReportRequest> {
    @Override // X.InterfaceC31105CIr
    public final PreviewTimeReportRequest LIZ(Q9H q9h) {
        PreviewTimeReportRequest previewTimeReportRequest = new PreviewTimeReportRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        previewTimeReportRequest.previewTimeMs = q9h.LJIIJJI();
                    }
                } else {
                    previewTimeReportRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return previewTimeReportRequest;
            }
        }
    }
}
