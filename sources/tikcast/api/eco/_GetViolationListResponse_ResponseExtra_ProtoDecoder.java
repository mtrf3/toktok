package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.GetViolationListResponse;

/* loaded from: classes17.dex */
public final class _GetViolationListResponse_ResponseExtra_ProtoDecoder implements InterfaceC31105CIr<GetViolationListResponse.ResponseExtra> {
    public static GetViolationListResponse.ResponseExtra LIZIZ(Q9H q9h) {
        GetViolationListResponse.ResponseExtra responseExtra = new GetViolationListResponse.ResponseExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetViolationListResponse.ResponseExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
