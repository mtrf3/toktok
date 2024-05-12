package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.AppealResponse;

/* loaded from: classes14.dex */
public final class _AppealResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AppealResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final AppealResponse.ResponseData LIZ(Q9H q9h) {
        AppealResponse.ResponseData responseData = new AppealResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
