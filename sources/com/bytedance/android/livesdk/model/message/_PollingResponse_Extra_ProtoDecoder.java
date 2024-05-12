package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.PollingResponse;

/* loaded from: classes17.dex */
public final class _PollingResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<PollingResponse.Extra> {
    public static PollingResponse.Extra LIZIZ(Q9H q9h) {
        PollingResponse.Extra extra = new PollingResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            extra.now = q9h.LJIIJJI();
                        }
                    } else {
                        extra.fetchInterval = q9h.LJIIJJI();
                    }
                } else {
                    extra.cursor = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PollingResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
