package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _LivePermissionInfo_ProtoDecoder implements InterfaceC31105CIr<LivePermissionInfo> {
    public static LivePermissionInfo LIZIZ(Q9H q9h) {
        LivePermissionInfo livePermissionInfo = new LivePermissionInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        livePermissionInfo.reason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    livePermissionInfo.endTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return livePermissionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LivePermissionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
