package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskFinishResponse;

/* loaded from: classes14.dex */
public final class _PermissionLevelTaskFinishResponse_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelTaskFinishResponse> {
    @Override // X.InterfaceC31105CIr
    public final PermissionLevelTaskFinishResponse LIZ(Q9H q9h) {
        PermissionLevelTaskFinishResponse permissionLevelTaskFinishResponse = new PermissionLevelTaskFinishResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        permissionLevelTaskFinishResponse.extra = _PermissionLevelTaskFinishExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    PermissionLevelTaskFinishResponse.ResponseData responseData = new PermissionLevelTaskFinishResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    permissionLevelTaskFinishResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelTaskFinishResponse;
            }
        }
    }
}
