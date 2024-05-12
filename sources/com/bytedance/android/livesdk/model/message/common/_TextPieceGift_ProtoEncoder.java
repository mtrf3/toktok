package com.bytedance.android.livesdk.model.message.common;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes6.dex */
public final class _TextPieceGift_ProtoEncoder implements InterfaceC64604PXc<TextPieceGift> {
    public static int LIZJ(TextPieceGift textPieceGift) {
        int LJIIIZ = C30957CCz.LJIIIZ(1, textPieceGift.giftId);
        int i = 0;
        PatternRef patternRef = textPieceGift.nameRef;
        if (patternRef != null) {
            int LJIIL = C30957CCz.LJIIL(2, patternRef.defaultPattern) + C30957CCz.LJIIL(1, patternRef.key);
            i = CD6.LIZ(2) + CD6.LIZIZ(LJIIL) + LJIIL;
        }
        return C30957CCz.LJIIIZ(4, textPieceGift.colorId) + C30957CCz.LJI(3, textPieceGift.showType) + LJIIIZ + i;
    }

    public static void LIZIZ(CD6 cd6, TextPieceGift textPieceGift) {
        long j = textPieceGift.giftId;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        PatternRef patternRef = textPieceGift.nameRef;
        if (patternRef != null) {
            cd6.LIZLLL(2, 2);
            cd6.LJ(C30957CCz.LJIIL(2, patternRef.defaultPattern) + C30957CCz.LJIIL(1, patternRef.key));
            C30957CCz.LIZLLL(cd6, 1, patternRef.key);
            C30957CCz.LIZLLL(cd6, 2, patternRef.defaultPattern);
        }
        int i = textPieceGift.showType;
        cd6.LIZLLL(3, 0);
        cd6.LIZJ(i);
        long j2 = textPieceGift.colorId;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j2);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, TextPieceGift textPieceGift) {
        LIZIZ(cd6, textPieceGift);
    }
}
