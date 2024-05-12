package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RoomHostMultiGuestPermissionInfo_ProtoDecoder implements InterfaceC31105CIr<RoomHostMultiGuestPermissionInfo> {
    public static RoomHostMultiGuestPermissionInfo LIZIZ(Q9H q9h) {
        RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo = new RoomHostMultiGuestPermissionInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        roomHostMultiGuestPermissionInfo.permissionInfo = _MultiGuestPermissionInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    roomHostMultiGuestPermissionInfo.roomPackSuccessFlag = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return roomHostMultiGuestPermissionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomHostMultiGuestPermissionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
