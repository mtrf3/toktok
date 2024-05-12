package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PermissionLevelTaskFinishExtra_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelTaskFinishExtra> {
    public static PermissionLevelTaskFinishExtra LIZIZ(Q9H q9h) {
        PermissionLevelTaskFinishExtra permissionLevelTaskFinishExtra = new PermissionLevelTaskFinishExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    permissionLevelTaskFinishExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelTaskFinishExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermissionLevelTaskFinishExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
