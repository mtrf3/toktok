package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AccessControlCaptcha_ProtoDecoder implements InterfaceC31105CIr<AccessControlCaptcha> {
    public static AccessControlCaptcha LIZIZ(Q9H q9h) {
        AccessControlCaptcha accessControlCaptcha = new AccessControlCaptcha();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            accessControlCaptcha.verifyDurationInSec = q9h.LJIIJJI();
                        }
                    } else {
                        accessControlCaptcha.roomId = q9h.LJIIJJI();
                    }
                } else {
                    accessControlCaptcha.captchaRecordId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return accessControlCaptcha;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AccessControlCaptcha LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
