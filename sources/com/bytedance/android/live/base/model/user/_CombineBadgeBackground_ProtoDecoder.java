package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _CombineBadgeBackground_ProtoDecoder implements InterfaceC31105CIr<CombineBadgeBackground> {
    public static CombineBadgeBackground LIZIZ(Q9H q9h) {
        CombineBadgeBackground combineBadgeBackground = new CombineBadgeBackground();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            combineBadgeBackground.borderColorCode = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        combineBadgeBackground.backgroundColorCode = Q9J.LIZIZ(q9h);
                    }
                } else {
                    combineBadgeBackground.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return combineBadgeBackground;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CombineBadgeBackground LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
