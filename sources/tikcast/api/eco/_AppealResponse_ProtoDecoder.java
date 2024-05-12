package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.AppealResponse;

/* loaded from: classes14.dex */
public final class _AppealResponse_ProtoDecoder implements InterfaceC31105CIr<AppealResponse> {
    @Override // X.InterfaceC31105CIr
    public final AppealResponse LIZ(Q9H q9h) {
        AppealResponse appealResponse = new AppealResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    AppealResponse.ResponseData responseData = new AppealResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    appealResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return appealResponse;
            }
        }
    }
}
