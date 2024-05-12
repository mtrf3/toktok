package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateShowContentParams_ProtoDecoder implements InterfaceC31105CIr<UpdateShowContentParams> {
    @Override // X.InterfaceC31105CIr
    public final UpdateShowContentParams LIZ(Q9H q9h) {
        UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        updateShowContentParams.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        updateShowContentParams.channelId = q9h.LJIIJJI();
                        break;
                    case 3:
                        updateShowContentParams.showId = q9h.LJIIJJI();
                        break;
                    case 4:
                        updateShowContentParams.updateType = q9h.LJIIJ();
                        break;
                    case 5:
                        updateShowContentParams.allowOpenMicFreely = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        updateShowContentParams.targetUserId = q9h.LJIIJJI();
                        break;
                    case 7:
                        updateShowContentParams.preUserId = q9h.LJIIJJI();
                        break;
                    case 8:
                        updateShowContentParams.nextUserId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return updateShowContentParams;
            }
        }
    }
}
