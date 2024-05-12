package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _HostCheckOtherAudienceMultiGuestPermissionParams_ProtoDecoder implements InterfaceC31105CIr<HostCheckOtherAudienceMultiGuestPermissionParams> {
    @Override // X.InterfaceC31105CIr
    public final HostCheckOtherAudienceMultiGuestPermissionParams LIZ(Q9H q9h) {
        HostCheckOtherAudienceMultiGuestPermissionParams hostCheckOtherAudienceMultiGuestPermissionParams = new HostCheckOtherAudienceMultiGuestPermissionParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        hostCheckOtherAudienceMultiGuestPermissionParams.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        hostCheckOtherAudienceMultiGuestPermissionParams.appId = q9h.LJIIJJI();
                        break;
                    case 3:
                        hostCheckOtherAudienceMultiGuestPermissionParams.liveId = q9h.LJIIJJI();
                        break;
                    case 4:
                        hostCheckOtherAudienceMultiGuestPermissionParams.checkUserId = q9h.LJIIJJI();
                        break;
                    case 5:
                        hostCheckOtherAudienceMultiGuestPermissionParams.scene = q9h.LJIIJ();
                        break;
                    case 6:
                        hostCheckOtherAudienceMultiGuestPermissionParams.liveRoomMode = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return hostCheckOtherAudienceMultiGuestPermissionParams;
            }
        }
    }
}
