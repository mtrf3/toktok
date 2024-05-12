package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.CreatorHubAnchorReportResponse;

/* loaded from: classes14.dex */
public final class _CreatorHubAnchorReportResponse_ProtoDecoder implements InterfaceC31105CIr<CreatorHubAnchorReportResponse> {
    @Override // X.InterfaceC31105CIr
    public final CreatorHubAnchorReportResponse LIZ(Q9H q9h) {
        CreatorHubAnchorReportResponse creatorHubAnchorReportResponse = new CreatorHubAnchorReportResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    CreatorHubAnchorReportResponse.ResponseData responseData = new CreatorHubAnchorReportResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    creatorHubAnchorReportResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return creatorHubAnchorReportResponse;
            }
        }
    }
}
