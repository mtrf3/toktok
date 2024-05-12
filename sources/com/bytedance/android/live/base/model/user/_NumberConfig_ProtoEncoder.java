package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes.dex */
public final class _NumberConfig_ProtoEncoder implements InterfaceC64604PXc<NumberConfig> {
    public static int LIZIZ(NumberConfig numberConfig) {
        int LJIIIZ = C30957CCz.LJIIIZ(1, numberConfig.number);
        int i = 0;
        FontStyle fontStyle = numberConfig.fontStyle;
        if (fontStyle != null) {
            int LIZJ = _FontStyle_ProtoEncoder.LIZJ(fontStyle);
            i = CD6.LIZ(2) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        return _CombineBadgeBackground_ProtoEncoder.LIZLLL(3, numberConfig.background) + i + LJIIIZ;
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, NumberConfig numberConfig) {
        NumberConfig numberConfig2 = numberConfig;
        long j = numberConfig2.number;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        FontStyle fontStyle = numberConfig2.fontStyle;
        if (fontStyle != null) {
            cd6.LIZLLL(2, 2);
            cd6.LJ(_FontStyle_ProtoEncoder.LIZJ(fontStyle));
            _FontStyle_ProtoEncoder.LIZIZ(cd6, fontStyle);
        }
        _CombineBadgeBackground_ProtoEncoder.LIZIZ(cd6, 3, numberConfig2.background);
    }
}
