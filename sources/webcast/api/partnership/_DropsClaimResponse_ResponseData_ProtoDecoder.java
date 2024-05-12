package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.DropsClaimResponse;

/* loaded from: classes17.dex */
public final class _DropsClaimResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DropsClaimResponse.ResponseData> {
    public static DropsClaimResponse.ResponseData LIZIZ(Q9H q9h) {
        DropsClaimResponse.ResponseData responseData = new DropsClaimResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                responseData.isAuth = Q9J.LIZ(q9h);
                            }
                        } else {
                            responseData.rewardType = q9h.LJIIJ();
                        }
                    } else {
                        responseData.rewardTime = q9h.LJIIJJI();
                    }
                } else {
                    responseData.cdkey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsClaimResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
