package com.bytedance.android.livesdk.model.linksetting;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model._MultiGuestPermissionInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RoomAudienceMultiGuestPermissionInfo_ProtoDecoder implements InterfaceC31105CIr<RoomAudienceMultiGuestPermissionInfo> {
    public static RoomAudienceMultiGuestPermissionInfo LIZIZ(Q9H q9h) {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo = new RoomAudienceMultiGuestPermissionInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        roomAudienceMultiGuestPermissionInfo.permissionInfo = _MultiGuestPermissionInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return roomAudienceMultiGuestPermissionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomAudienceMultiGuestPermissionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
