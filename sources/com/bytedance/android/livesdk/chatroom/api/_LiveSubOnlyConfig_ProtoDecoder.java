package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveSubOnlyConfig_ProtoDecoder implements InterfaceC31105CIr<LiveSubOnlyConfig> {
    public static LiveSubOnlyConfig LIZIZ(Q9H q9h) {
        LiveSubOnlyConfig liveSubOnlyConfig = new LiveSubOnlyConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            liveSubOnlyConfig.disabledToast = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        liveSubOnlyConfig.disabledReason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    liveSubOnlyConfig.disabled = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveSubOnlyConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveSubOnlyConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
