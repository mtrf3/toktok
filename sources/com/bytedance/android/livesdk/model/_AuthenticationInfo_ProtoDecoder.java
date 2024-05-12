package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _AuthenticationInfo_ProtoDecoder implements InterfaceC31105CIr<AuthenticationInfo> {
    public static AuthenticationInfo LIZIZ(Q9H q9h) {
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            authenticationInfo.authenticationBadge = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        authenticationInfo.enterpriseVerifyReason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    authenticationInfo.customVerify = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return authenticationInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AuthenticationInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
