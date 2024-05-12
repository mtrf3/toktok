package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _EnlargeScreenManageParams_ProtoDecoder implements InterfaceC31105CIr<EnlargeScreenManageParams> {
    @Override // X.InterfaceC31105CIr
    public final EnlargeScreenManageParams LIZ(Q9H q9h) {
        EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        enlargeScreenManageParams.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        enlargeScreenManageParams.guestUserId = q9h.LJIIJJI();
                        break;
                    case 3:
                        enlargeScreenManageParams.anchorId = q9h.LJIIJJI();
                        break;
                    case 4:
                        enlargeScreenManageParams.scene = q9h.LJIIJ();
                        break;
                    case 5:
                        enlargeScreenManageParams.channelId = q9h.LJIIJJI();
                        break;
                    case 6:
                        enlargeScreenManageParams.isRejectEnlargeScreen = q9h.LJIIJ();
                        break;
                    case 7:
                        enlargeScreenManageParams.linkmicId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return enlargeScreenManageParams;
            }
        }
    }
}
