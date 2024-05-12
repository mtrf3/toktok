package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _NoticesResult_ProtoDecoder implements InterfaceC31105CIr<NoticesResult> {
    @Override // X.InterfaceC31105CIr
    public final NoticesResult LIZ(Q9H q9h) {
        NoticesResult noticesResult = new NoticesResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    noticesResult.data = _NoticesResult_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return noticesResult;
            }
        }
    }
}
