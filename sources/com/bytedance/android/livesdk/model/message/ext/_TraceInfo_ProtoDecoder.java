package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _TraceInfo_ProtoDecoder implements InterfaceC31105CIr<TraceInfo> {
    public static TraceInfo LIZIZ(Q9H q9h) {
        TraceInfo traceInfo = new TraceInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            traceInfo.sendTime = q9h.LJIIJJI();
                        }
                    } else {
                        traceInfo.arrivalTime = q9h.LJIIJJI();
                    }
                } else {
                    traceInfo.operateTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return traceInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TraceInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
