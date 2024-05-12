package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PatternRef_ProtoDecoder implements InterfaceC31105CIr<PatternRef> {
    public static PatternRef LIZIZ(Q9H q9h) {
        PatternRef patternRef = new PatternRef();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        patternRef.defaultPattern = Q9J.LIZIZ(q9h);
                    }
                } else {
                    patternRef.key = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return patternRef;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PatternRef LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
