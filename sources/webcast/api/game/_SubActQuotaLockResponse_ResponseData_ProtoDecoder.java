package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.SubActQuotaLockResponse;

/* loaded from: classes17.dex */
public final class _SubActQuotaLockResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SubActQuotaLockResponse.ResponseData> {
    public static SubActQuotaLockResponse.ResponseData LIZIZ(Q9H q9h) {
        SubActQuotaLockResponse.ResponseData responseData = new SubActQuotaLockResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.quotaLeft = q9h.LJIIJJI();
                    }
                } else {
                    responseData.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubActQuotaLockResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
