package com.bytedance.android.livesdk.model.linksetting;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LinkmicUser_ProtoDecoder implements InterfaceC31105CIr<LinkmicUser> {
    public static LinkmicUser LIZIZ(Q9H q9h) {
        LinkmicUser linkmicUser = new LinkmicUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkmicUser.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        linkmicUser.roomId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkmicUser.linkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        linkmicUser.nickName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        linkmicUser.displayId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        linkmicUser.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkmicUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
