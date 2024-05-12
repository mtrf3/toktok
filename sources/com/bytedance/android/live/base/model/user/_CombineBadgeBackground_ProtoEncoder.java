package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _CombineBadgeBackground_ProtoEncoder implements InterfaceC64604PXc<CombineBadgeBackground> {
    public static int LIZJ(CombineBadgeBackground combineBadgeBackground) {
        if (combineBadgeBackground == null) {
            return 0;
        }
        return C30957CCz.LJIIL(3, combineBadgeBackground.borderColorCode) + C30957CCz.LJIIL(2, combineBadgeBackground.backgroundColorCode) + _ImageModel_ProtoEncoder.LJ(1, combineBadgeBackground.image);
    }

    public static int LIZLLL(int i, CombineBadgeBackground combineBadgeBackground) {
        if (combineBadgeBackground == null) {
            return 0;
        }
        int LIZJ = LIZJ(combineBadgeBackground);
        return CD6.LIZ(i) + CD6.LIZIZ(LIZJ) + LIZJ;
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, CombineBadgeBackground combineBadgeBackground) {
        CombineBadgeBackground combineBadgeBackground2 = combineBadgeBackground;
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, combineBadgeBackground2.image);
        C30957CCz.LIZLLL(cd6, 2, combineBadgeBackground2.backgroundColorCode);
        C30957CCz.LIZLLL(cd6, 3, combineBadgeBackground2.borderColorCode);
    }

    public static void LIZIZ(CD6 cd6, int i, CombineBadgeBackground combineBadgeBackground) {
        if (combineBadgeBackground == null) {
            return;
        }
        cd6.LIZLLL(i, 2);
        cd6.LJ(LIZJ(combineBadgeBackground));
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, combineBadgeBackground.image);
        C30957CCz.LIZLLL(cd6, 2, combineBadgeBackground.backgroundColorCode);
        C30957CCz.LIZLLL(cd6, 3, combineBadgeBackground.borderColorCode);
    }
}
