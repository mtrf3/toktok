package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CeremonyEffect_ProtoDecoder implements InterfaceC31105CIr<CeremonyEffect> {
    public static CeremonyEffect LIZIZ(Q9H q9h) {
        CeremonyEffect ceremonyEffect = new CeremonyEffect();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        ceremonyEffect.avatarBorder = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    ceremonyEffect.gradeBackground = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ceremonyEffect;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CeremonyEffect LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
