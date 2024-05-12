package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubAdminPermission_ProtoDecoder implements InterfaceC31105CIr<SubAdminPermission> {
    public static SubAdminPermission LIZIZ(Q9H q9h) {
        SubAdminPermission subAdminPermission = new SubAdminPermission();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subAdminPermission.allowPinPerk = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subAdminPermission;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubAdminPermission LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
