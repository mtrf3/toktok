package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CppAgeVerificationInfo_ProtoDecoder implements InterfaceC31105CIr<CppAgeVerificationInfo> {
    public static CppAgeVerificationInfo LIZIZ(Q9H q9h) {
        CppAgeVerificationInfo cppAgeVerificationInfo = new CppAgeVerificationInfo();
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
                                cppAgeVerificationInfo.ageVerifyTimes = q9h.LJIIJJI();
                            }
                        } else {
                            cppAgeVerificationInfo.ageVerifyProcessStatus = q9h.LJIIJ();
                        }
                    } else {
                        cppAgeVerificationInfo.ageVerifyStatus = q9h.LJIIJ();
                    }
                } else {
                    cppAgeVerificationInfo.cppAgeVerificationAb = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return cppAgeVerificationInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CppAgeVerificationInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
