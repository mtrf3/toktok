package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _TimerConfig_ProtoDecoder implements InterfaceC31105CIr<TimerConfig> {
    public static TimerConfig LIZIZ(Q9H q9h) {
        TimerConfig timerConfig = new TimerConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        timerConfig.maxTitleLength = q9h.LJIIJ();
                        break;
                    case 2:
                        timerConfig.defaultStartCountdownTimeS = q9h.LJIIJJI();
                        break;
                    case 3:
                        timerConfig.maxStartCountdownTimeS = q9h.LJIIJJI();
                        break;
                    case 4:
                        timerConfig.defaultTimeIncreasePerSubS = q9h.LJIIJJI();
                        break;
                    case 5:
                        timerConfig.defaultTimeIncreaseCapS = q9h.LJIIJJI();
                        break;
                    case 6:
                        timerConfig.maxTimeIncreaseCapS = q9h.LJIIJJI();
                        break;
                    case 7:
                        timerConfig.bottomButtonText = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return timerConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TimerConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
