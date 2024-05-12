package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubOnlyLiveInfo_ProtoDecoder implements InterfaceC31105CIr<SubOnlyLiveInfo> {
    public static SubOnlyLiveInfo LIZIZ(Q9H q9h) {
        SubOnlyLiveInfo subOnlyLiveInfo = new SubOnlyLiveInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subOnlyLiveInfo.hasPermission = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subOnlyLiveInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubOnlyLiveInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
