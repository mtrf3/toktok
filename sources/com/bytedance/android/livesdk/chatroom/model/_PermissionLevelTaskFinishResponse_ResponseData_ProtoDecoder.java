package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskFinishResponse;

/* loaded from: classes14.dex */
public final class _PermissionLevelTaskFinishResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelTaskFinishResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final PermissionLevelTaskFinishResponse.ResponseData LIZ(Q9H q9h) {
        PermissionLevelTaskFinishResponse.ResponseData responseData = new PermissionLevelTaskFinishResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
