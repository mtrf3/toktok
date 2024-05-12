package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _CaptchaCheckRequest_ProtoDecoder implements InterfaceC31105CIr<CaptchaCheckRequest> {
    @Override // X.InterfaceC31105CIr
    public final CaptchaCheckRequest LIZ(Q9H q9h) {
        CaptchaCheckRequest captchaCheckRequest = new CaptchaCheckRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            captchaCheckRequest.checkFailed = Q9J.LIZ(q9h);
                        }
                    } else {
                        captchaCheckRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    captchaCheckRequest.captchaRecordId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return captchaCheckRequest;
            }
        }
    }
}
