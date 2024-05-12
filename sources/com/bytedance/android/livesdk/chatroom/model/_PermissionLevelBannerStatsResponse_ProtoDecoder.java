package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PermissionLevelBannerStatsResponse_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelBannerStatsResponse> {
    @Override // X.InterfaceC31105CIr
    public final PermissionLevelBannerStatsResponse LIZ(Q9H q9h) {
        PermissionLevelBannerStatsResponse permissionLevelBannerStatsResponse = new PermissionLevelBannerStatsResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        permissionLevelBannerStatsResponse.extra = _PermissionLevelBannerStatusExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    permissionLevelBannerStatsResponse.data = _PermissionLevelBannerStatsResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelBannerStatsResponse;
            }
        }
    }
}
