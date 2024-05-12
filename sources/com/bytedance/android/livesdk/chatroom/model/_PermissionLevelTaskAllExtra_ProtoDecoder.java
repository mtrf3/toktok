package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PermissionLevelTaskAllExtra_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelTaskAllExtra> {
    public static PermissionLevelTaskAllExtra LIZIZ(Q9H q9h) {
        PermissionLevelTaskAllExtra permissionLevelTaskAllExtra = new PermissionLevelTaskAllExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    permissionLevelTaskAllExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelTaskAllExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermissionLevelTaskAllExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
