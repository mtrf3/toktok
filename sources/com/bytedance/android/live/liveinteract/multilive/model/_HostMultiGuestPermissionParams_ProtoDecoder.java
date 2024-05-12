package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _HostMultiGuestPermissionParams_ProtoDecoder implements InterfaceC31105CIr<HostMultiGuestPermissionParams> {
    @Override // X.InterfaceC31105CIr
    public final HostMultiGuestPermissionParams LIZ(Q9H q9h) {
        HostMultiGuestPermissionParams hostMultiGuestPermissionParams = new HostMultiGuestPermissionParams();
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
                                hostMultiGuestPermissionParams.liveRoomMode = q9h.LJIIJJI();
                            }
                        } else {
                            hostMultiGuestPermissionParams.liveId = q9h.LJIIJJI();
                        }
                    } else {
                        hostMultiGuestPermissionParams.appId = q9h.LJIIJJI();
                    }
                } else {
                    hostMultiGuestPermissionParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return hostMultiGuestPermissionParams;
            }
        }
    }
}
