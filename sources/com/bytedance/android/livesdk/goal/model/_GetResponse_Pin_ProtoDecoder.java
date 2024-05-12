package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goal.model.GetResponse;

/* loaded from: classes6.dex */
public final class _GetResponse_Pin_ProtoDecoder implements InterfaceC31105CIr<GetResponse.Pin> {
    public static GetResponse.Pin LIZIZ(Q9H q9h) {
        GetResponse.Pin pin = new GetResponse.Pin();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pin.pinEndTime = q9h.LJIIJJI();
                        }
                    } else {
                        pin.readyTime = q9h.LJIIJJI();
                    }
                } else {
                    pin.coldDown = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pin;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetResponse.Pin LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
