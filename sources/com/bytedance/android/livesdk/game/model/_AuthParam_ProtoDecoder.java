package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AuthParam_ProtoDecoder implements InterfaceC31105CIr<AuthParam> {
    public static AuthParam LIZIZ(Q9H q9h) {
        AuthParam authParam = new AuthParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 4:
                        authParam.authType = q9h.LJIIJ();
                        break;
                    case 5:
                        authParam.authLink = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        authParam.authLinkAndroid = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        authParam.authLinkIos = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        authParam.fallbackLink = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        authParam.androidPackageName = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return authParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AuthParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
