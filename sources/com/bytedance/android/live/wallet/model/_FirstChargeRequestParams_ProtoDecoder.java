package com.bytedance.android.live.wallet.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FirstChargeRequestParams_ProtoDecoder implements InterfaceC31105CIr<FirstChargeRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final FirstChargeRequestParams LIZ(Q9H q9h) {
        FirstChargeRequestParams firstChargeRequestParams = new FirstChargeRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    firstChargeRequestParams.forceSourceRegion = Q9J.LIZ(q9h);
                                }
                            } else {
                                firstChargeRequestParams.currency = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            firstChargeRequestParams.channel = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        firstChargeRequestParams.type = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    firstChargeRequestParams.liveId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return firstChargeRequestParams;
            }
        }
    }
}
