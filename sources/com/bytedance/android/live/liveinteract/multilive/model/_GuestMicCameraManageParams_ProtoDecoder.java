package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GuestMicCameraManageParams_ProtoDecoder implements InterfaceC31105CIr<GuestMicCameraManageParams> {
    @Override // X.InterfaceC31105CIr
    public final GuestMicCameraManageParams LIZ(Q9H q9h) {
        GuestMicCameraManageParams guestMicCameraManageParams = new GuestMicCameraManageParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        guestMicCameraManageParams.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        guestMicCameraManageParams.guestUserId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        guestMicCameraManageParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        guestMicCameraManageParams.op = q9h.LJIIJ();
                        break;
                    case 5:
                        guestMicCameraManageParams.channelId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        guestMicCameraManageParams.changeScene = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return guestMicCameraManageParams;
            }
        }
    }
}
