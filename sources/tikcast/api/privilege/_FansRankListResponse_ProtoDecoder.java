package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansRankListResponse_ProtoDecoder implements InterfaceC31105CIr<FansRankListResponse> {
    @Override // X.InterfaceC31105CIr
    public final FansRankListResponse LIZ(Q9H q9h) {
        FansRankListResponse fansRankListResponse = new FansRankListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    fansRankListResponse.data = _FansRankListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansRankListResponse;
            }
        }
    }
}