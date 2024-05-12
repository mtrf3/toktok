package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _AudienceMultiGuestPermissionParams_ProtoDecoder implements InterfaceC31105CIr<AudienceMultiGuestPermissionParams> {
    @Override // X.InterfaceC31105CIr
    public final AudienceMultiGuestPermissionParams LIZ(Q9H q9h) {
        AudienceMultiGuestPermissionParams audienceMultiGuestPermissionParams = new AudienceMultiGuestPermissionParams();
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
                                audienceMultiGuestPermissionParams.liveRoomMode = q9h.LJIIJJI();
                            }
                        } else {
                            audienceMultiGuestPermissionParams.liveId = q9h.LJIIJJI();
                        }
                    } else {
                        audienceMultiGuestPermissionParams.appId = q9h.LJIIJJI();
                    }
                } else {
                    audienceMultiGuestPermissionParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceMultiGuestPermissionParams;
            }
        }
    }
}
