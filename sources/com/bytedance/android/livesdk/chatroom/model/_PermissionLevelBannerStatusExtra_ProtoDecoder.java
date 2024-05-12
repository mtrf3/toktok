package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PermissionLevelBannerStatusExtra_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelBannerStatusExtra> {
    public static PermissionLevelBannerStatusExtra LIZIZ(Q9H q9h) {
        PermissionLevelBannerStatusExtra permissionLevelBannerStatusExtra = new PermissionLevelBannerStatusExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    permissionLevelBannerStatusExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelBannerStatusExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermissionLevelBannerStatusExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
