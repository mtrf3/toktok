package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.CreatorHubAnchorReportResponse;

/* loaded from: classes14.dex */
public final class _CreatorHubAnchorReportResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CreatorHubAnchorReportResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final CreatorHubAnchorReportResponse.ResponseData LIZ(Q9H q9h) {
        CreatorHubAnchorReportResponse.ResponseData responseData = new CreatorHubAnchorReportResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
