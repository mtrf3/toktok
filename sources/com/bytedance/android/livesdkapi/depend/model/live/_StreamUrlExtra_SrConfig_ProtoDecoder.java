package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;

/* loaded from: classes6.dex */
public final class _StreamUrlExtra_SrConfig_ProtoDecoder implements InterfaceC31105CIr<StreamUrlExtra.SrConfig> {
    public static StreamUrlExtra.SrConfig LIZIZ(Q9H q9h) {
        StreamUrlExtra.SrConfig srConfig = new StreamUrlExtra.SrConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            srConfig.antiAlias = Q9J.LIZ(q9h);
                        }
                    } else {
                        srConfig.strength = (int) q9h.LJIIJJI();
                    }
                } else {
                    srConfig.enabled = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return srConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StreamUrlExtra.SrConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
