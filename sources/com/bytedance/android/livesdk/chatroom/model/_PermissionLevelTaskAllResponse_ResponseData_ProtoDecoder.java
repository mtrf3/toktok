package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskAllResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PermissionLevelTaskAllResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelTaskAllResponse.ResponseData> {
    public static PermissionLevelTaskAllResponse.ResponseData LIZIZ(Q9H q9h) {
        PermissionLevelTaskAllResponse.ResponseData responseData = new PermissionLevelTaskAllResponse.ResponseData();
        responseData.stages = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.stages.add(_PermissionLevelStage_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermissionLevelTaskAllResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
