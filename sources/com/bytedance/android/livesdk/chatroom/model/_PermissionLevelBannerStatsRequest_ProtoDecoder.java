package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _PermissionLevelBannerStatsRequest_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelBannerStatsRequest> {
    @Override // X.InterfaceC31105CIr
    public final PermissionLevelBannerStatsRequest LIZ(Q9H q9h) {
        PermissionLevelBannerStatsRequest permissionLevelBannerStatsRequest = new PermissionLevelBannerStatsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    permissionLevelBannerStatsRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelBannerStatsRequest;
            }
        }
    }
}
