package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubActQuotaLockResponse_ProtoDecoder implements InterfaceC31105CIr<SubActQuotaLockResponse> {
    @Override // X.InterfaceC31105CIr
    public final SubActQuotaLockResponse LIZ(Q9H q9h) {
        SubActQuotaLockResponse subActQuotaLockResponse = new SubActQuotaLockResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subActQuotaLockResponse.data = _SubActQuotaLockResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subActQuotaLockResponse;
            }
        }
    }
}