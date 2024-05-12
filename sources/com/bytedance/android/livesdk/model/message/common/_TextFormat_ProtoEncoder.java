package com.bytedance.android.livesdk.model.message.common;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes6.dex */
public final class _TextFormat_ProtoEncoder implements InterfaceC64604PXc<TextFormat> {
    public static int LIZJ(TextFormat textFormat) {
        if (textFormat == null) {
            return 0;
        }
        return C30957CCz.LJFF(8, textFormat.useRemoteColor) + C30957CCz.LJFF(7, textFormat.useHeighLightColor) + C30957CCz.LJII(6, textFormat.fontSize) + C30957CCz.LJII(5, textFormat.italicAngle) + C30957CCz.LJI(4, textFormat.weight) + C30957CCz.LJ(3) + C30957CCz.LJFF(2, textFormat.bold) + C30957CCz.LJIIL(1, textFormat.color);
    }

    public static void LIZIZ(CD6 cd6, TextFormat textFormat) {
        C30957CCz.LIZLLL(cd6, 1, textFormat.color);
        C30957CCz.LIZ(cd6, 2, textFormat.bold);
        boolean z = textFormat.italic;
        cd6.LIZLLL(3, 0);
        cd6.LJ(z ? 1 : 0);
        int i = textFormat.weight;
        cd6.LIZLLL(4, 0);
        cd6.LIZJ(i);
        C30957CCz.LIZIZ(cd6, 5, textFormat.italicAngle);
        C30957CCz.LIZIZ(cd6, 6, textFormat.fontSize);
        C30957CCz.LIZ(cd6, 7, textFormat.useHeighLightColor);
        C30957CCz.LIZ(cd6, 8, textFormat.useRemoteColor);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, TextFormat textFormat) {
        LIZIZ(cd6, textFormat);
    }
}
