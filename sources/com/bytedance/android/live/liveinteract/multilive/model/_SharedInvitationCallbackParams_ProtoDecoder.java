package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _SharedInvitationCallbackParams_ProtoDecoder implements InterfaceC31105CIr<SharedInvitationCallbackParams> {
    @Override // X.InterfaceC31105CIr
    public final SharedInvitationCallbackParams LIZ(Q9H q9h) {
        SharedInvitationCallbackParams sharedInvitationCallbackParams = new SharedInvitationCallbackParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            sharedInvitationCallbackParams.channelId = q9h.LJIIJJI();
                        }
                    } else {
                        sharedInvitationCallbackParams.sharedInviteeUserIdsJsonStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    sharedInvitationCallbackParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return sharedInvitationCallbackParams;
            }
        }
    }
}
