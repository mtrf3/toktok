package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AnchorEmailInfo_ProtoDecoder implements InterfaceC31105CIr<AnchorEmailInfo> {
    public static AnchorEmailInfo LIZIZ(Q9H q9h) {
        AnchorEmailInfo anchorEmailInfo = new AnchorEmailInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorEmailInfo.isAuthorizationEnabled = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorEmailInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorEmailInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
