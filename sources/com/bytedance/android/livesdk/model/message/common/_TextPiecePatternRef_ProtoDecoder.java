package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TextPiecePatternRef_ProtoDecoder implements InterfaceC31105CIr<TextPiecePatternRef> {
    public static TextPiecePatternRef LIZIZ(Q9H q9h) {
        TextPiecePatternRef textPiecePatternRef = new TextPiecePatternRef();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        textPiecePatternRef.defaultPattern = Q9J.LIZIZ(q9h);
                    }
                } else {
                    textPiecePatternRef.key = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return textPiecePatternRef;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextPiecePatternRef LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
