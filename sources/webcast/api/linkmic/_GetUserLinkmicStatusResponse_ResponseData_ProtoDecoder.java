package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.linkmic.GetUserLinkmicStatusResponse;

/* loaded from: classes6.dex */
public final class _GetUserLinkmicStatusResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetUserLinkmicStatusResponse.ResponseData> {
    public static GetUserLinkmicStatusResponse.ResponseData LIZIZ(Q9H q9h) {
        GetUserLinkmicStatusResponse.ResponseData responseData = new GetUserLinkmicStatusResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.blockReason = q9h.LJIIJ();
                    }
                } else {
                    responseData.linkmicPlayType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetUserLinkmicStatusResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
