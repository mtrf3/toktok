package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AnchorSubWaveCurrentSettings_ProtoDecoder implements InterfaceC31105CIr<AnchorSubWaveCurrentSettings> {
    public static AnchorSubWaveCurrentSettings LIZIZ(Q9H q9h) {
        AnchorSubWaveCurrentSettings anchorSubWaveCurrentSettings = new AnchorSubWaveCurrentSettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        anchorSubWaveCurrentSettings.anchorSubWaveChallengeSettings = _AnchorSubWaveChallengeSettings_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    anchorSubWaveCurrentSettings.anchorSubWaveTriggerSettings = _AnchorSubWaveTriggerSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorSubWaveCurrentSettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorSubWaveCurrentSettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
