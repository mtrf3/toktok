package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _PermissionLevelTaskFinishRequest_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelTaskFinishRequest> {
    @Override // X.InterfaceC31105CIr
    public final PermissionLevelTaskFinishRequest LIZ(Q9H q9h) {
        PermissionLevelTaskFinishRequest permissionLevelTaskFinishRequest = new PermissionLevelTaskFinishRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    permissionLevelTaskFinishRequest.taskType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelTaskFinishRequest;
            }
        }
    }
}
