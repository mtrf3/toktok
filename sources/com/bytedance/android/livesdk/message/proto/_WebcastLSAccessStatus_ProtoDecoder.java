package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _WebcastLSAccessStatus_ProtoDecoder implements InterfaceC31105CIr<WebcastLSAccessStatus> {
    @Override // X.InterfaceC31105CIr
    public final WebcastLSAccessStatus LIZ(Q9H q9h) {
        WebcastLSAccessStatus webcastLSAccessStatus = new WebcastLSAccessStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    webcastLSAccessStatus.userAccessStatus = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return webcastLSAccessStatus;
            }
        }
    }
}
