package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TextPieceHeart_ProtoDecoder implements InterfaceC31105CIr<TextPieceHeart> {
    public static TextPieceHeart LIZIZ(Q9H q9h) {
        TextPieceHeart textPieceHeart = new TextPieceHeart();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    textPieceHeart.color = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return textPieceHeart;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextPieceHeart LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
