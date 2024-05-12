package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TextPieceGift_ProtoDecoder implements InterfaceC31105CIr<TextPieceGift> {
    public static TextPieceGift LIZIZ(Q9H q9h) {
        TextPieceGift textPieceGift = new TextPieceGift();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                textPieceGift.colorId = q9h.LJIIJJI();
                            }
                        } else {
                            textPieceGift.showType = q9h.LJIIJ();
                        }
                    } else {
                        textPieceGift.nameRef = _PatternRef_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    textPieceGift.giftId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return textPieceGift;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextPieceGift LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
