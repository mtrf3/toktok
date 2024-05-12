package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _PreviewPeriod_ProtoDecoder implements InterfaceC31105CIr<PreviewPeriod> {
    public static PreviewPeriod LIZIZ(Q9H q9h) {
        PreviewPeriod previewPeriod = new PreviewPeriod();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 25) {
                            Q9J.LIZJ(q9h);
                        } else {
                            previewPeriod.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        previewPeriod.promot = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    previewPeriod.duration = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return previewPeriod;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PreviewPeriod LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
