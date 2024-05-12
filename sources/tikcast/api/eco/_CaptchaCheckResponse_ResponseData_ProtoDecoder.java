package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.CaptchaCheckResponse;

/* loaded from: classes6.dex */
public final class _CaptchaCheckResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CaptchaCheckResponse.ResponseData> {
    public static CaptchaCheckResponse.ResponseData LIZIZ(Q9H q9h) {
        CaptchaCheckResponse.ResponseData responseData = new CaptchaCheckResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.captchaDecision = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        responseData.checkApproved = Q9J.LIZ(q9h);
                    }
                } else {
                    responseData.captchaRecordId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CaptchaCheckResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
