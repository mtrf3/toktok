package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CheckPermissionResponse_ProtoDecoder implements InterfaceC31105CIr<CheckPermissionResponse> {
    @Override // X.InterfaceC31105CIr
    public final CheckPermissionResponse LIZ(Q9H q9h) {
        CheckPermissionResponse checkPermissionResponse = new CheckPermissionResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 4) {
                    if (LJI != 5) {
                        Q9J.LIZJ(q9h);
                    } else {
                        checkPermissionResponse.anchorOnboardPermit = Q9J.LIZ(q9h);
                    }
                } else {
                    checkPermissionResponse.multiHostPermission = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return checkPermissionResponse;
            }
        }
    }
}
