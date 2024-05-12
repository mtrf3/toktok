package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _NotificationConfirmResponse_ProtoDecoder implements InterfaceC31105CIr<NotificationConfirmResponse> {
    @Override // X.InterfaceC31105CIr
    public final NotificationConfirmResponse LIZ(Q9H q9h) {
        NotificationConfirmResponse notificationConfirmResponse = new NotificationConfirmResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    notificationConfirmResponse.statusCode = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return notificationConfirmResponse;
            }
        }
    }
}
