package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UserInfo_ProtoDecoder implements InterfaceC31105CIr<UserInfo> {
    public static UserInfo LIZIZ(Q9H q9h) {
        UserInfo userInfo = new UserInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            userInfo.minAge = q9h.LJIIJ();
                        }
                    } else {
                        userInfo.eventPermission = Q9J.LIZ(q9h);
                    }
                } else {
                    userInfo.cpPermission = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
