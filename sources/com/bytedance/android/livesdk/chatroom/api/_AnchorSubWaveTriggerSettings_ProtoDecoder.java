package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AnchorSubWaveTriggerSettings_ProtoDecoder implements InterfaceC31105CIr<AnchorSubWaveTriggerSettings> {
    public static AnchorSubWaveTriggerSettings LIZIZ(Q9H q9h) {
        AnchorSubWaveTriggerSettings anchorSubWaveTriggerSettings = new AnchorSubWaveTriggerSettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            anchorSubWaveTriggerSettings.needSubCounts = q9h.LJIIJJI();
                        }
                    } else {
                        anchorSubWaveTriggerSettings.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    anchorSubWaveTriggerSettings.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorSubWaveTriggerSettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorSubWaveTriggerSettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
