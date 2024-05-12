package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ToUserInfo_ProtoDecoder implements InterfaceC31105CIr<ToUserInfo> {
    @Override // X.InterfaceC31105CIr
    public final ToUserInfo LIZ(Q9H q9h) {
        ToUserInfo toUserInfo = new ToUserInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            toUserInfo.secUid = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        toUserInfo.userId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    toUserInfo.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return toUserInfo;
            }
        }
    }
}
