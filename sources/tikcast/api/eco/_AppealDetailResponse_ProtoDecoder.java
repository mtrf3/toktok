package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AppealDetailResponse_ProtoDecoder implements InterfaceC31105CIr<AppealDetailResponse> {
    @Override // X.InterfaceC31105CIr
    public final AppealDetailResponse LIZ(Q9H q9h) {
        AppealDetailResponse appealDetailResponse = new AppealDetailResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    appealDetailResponse.data = _AppealDetail_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return appealDetailResponse;
            }
        }
    }
}
