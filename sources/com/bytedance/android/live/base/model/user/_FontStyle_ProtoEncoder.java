package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes.dex */
public final class _FontStyle_ProtoEncoder implements InterfaceC64604PXc<FontStyle> {
    public static int LIZJ(FontStyle fontStyle) {
        if (fontStyle == null) {
            return 0;
        }
        return C30957CCz.LJIIL(4, fontStyle.borderColor) + C30957CCz.LJIIL(3, fontStyle.fontColor) + C30957CCz.LJI(2, fontStyle.fontWidth) + C30957CCz.LJI(1, fontStyle.fontSize);
    }

    public static void LIZIZ(CD6 cd6, FontStyle fontStyle) {
        int i = fontStyle.fontSize;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        int i2 = fontStyle.fontWidth;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i2);
        C30957CCz.LIZLLL(cd6, 3, fontStyle.fontColor);
        C30957CCz.LIZLLL(cd6, 4, fontStyle.borderColor);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, FontStyle fontStyle) {
        LIZIZ(cd6, fontStyle);
    }
}
