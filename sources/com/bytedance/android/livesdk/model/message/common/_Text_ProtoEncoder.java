package com.bytedance.android.livesdk.model.message.common;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes6.dex */
public final class _Text_ProtoEncoder implements InterfaceC64604PXc<Text> {
    public static int LIZJ(Text text) {
        int LIZ;
        int LIZ2;
        int LJIIL = C30957CCz.LJIIL(2, text.defaultPattern) + C30957CCz.LJIIL(1, text.key);
        TextFormat textFormat = text.defaultFormat;
        if (textFormat == null) {
            LIZ = 0;
        } else {
            int LIZJ = _TextFormat_ProtoEncoder.LIZJ(textFormat);
            LIZ = CD6.LIZ(3) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int i = LIZ + LJIIL;
        List<TextPiece> list = text.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < text.pieces.size(); i2++) {
                TextPiece textPiece = (TextPiece) ListProtector.get(text.pieces, i2);
                if (textPiece == null) {
                    LIZ2 = 0;
                } else {
                    int LIZJ2 = _TextPiece_ProtoEncoder.LIZJ(textPiece);
                    LIZ2 = CD6.LIZ(4) + CD6.LIZIZ(LIZJ2) + LIZJ2;
                }
                i += LIZ2;
            }
        }
        return i;
    }

    public static void LIZIZ(CD6 cd6, Text text) {
        C30957CCz.LIZLLL(cd6, 1, text.key);
        C30957CCz.LIZLLL(cd6, 2, text.defaultPattern);
        TextFormat textFormat = text.defaultFormat;
        if (textFormat != null) {
            cd6.LIZLLL(3, 2);
            cd6.LJ(_TextFormat_ProtoEncoder.LIZJ(textFormat));
            _TextFormat_ProtoEncoder.LIZIZ(cd6, textFormat);
        }
        List<TextPiece> list = text.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < text.pieces.size(); i++) {
                TextPiece textPiece = (TextPiece) ListProtector.get(text.pieces, i);
                if (textPiece != null) {
                    cd6.LIZLLL(4, 2);
                    cd6.LJ(_TextPiece_ProtoEncoder.LIZJ(textPiece));
                    _TextPiece_ProtoEncoder.LIZIZ(cd6, textPiece);
                }
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, Text text) {
        LIZIZ(cd6, text);
    }
}
