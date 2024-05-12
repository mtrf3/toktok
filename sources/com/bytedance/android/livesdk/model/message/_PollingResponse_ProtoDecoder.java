package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PollingResponse_ProtoDecoder implements InterfaceC31105CIr<PollingResponse> {
    @Override // X.InterfaceC31105CIr
    public final PollingResponse LIZ(Q9H q9h) {
        PollingResponse pollingResponse = new PollingResponse();
        pollingResponse.data = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                pollingResponse.statusCode = q9h.LJIIJ();
                            }
                        } else {
                            pollingResponse.internalExt = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        pollingResponse.extra = _PollingResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    pollingResponse.data.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return pollingResponse;
            }
        }
    }
}
