package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PermissionLevelTaskAllResponse_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelTaskAllResponse> {
    @Override // X.InterfaceC31105CIr
    public final PermissionLevelTaskAllResponse LIZ(Q9H q9h) {
        PermissionLevelTaskAllResponse permissionLevelTaskAllResponse = new PermissionLevelTaskAllResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        permissionLevelTaskAllResponse.extra = _PermissionLevelTaskAllExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    permissionLevelTaskAllResponse.data = _PermissionLevelTaskAllResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelTaskAllResponse;
            }
        }
    }
}
