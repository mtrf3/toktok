package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TextPiece_ProtoDecoder implements InterfaceC31105CIr<TextPiece> {
    public static TextPiece LIZIZ(Q9H q9h) {
        TextPiece textPiece = new TextPiece();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 11) {
                            switch (LJI) {
                                case 21:
                                    textPiece.userValue = _TextPieceUser_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 22:
                                    textPiece.giftValue = _TextPieceGift_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 23:
                                    textPiece.heartValue = _TextPieceHeart_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 24:
                                    textPiece.patternRefValue = _TextPiecePatternRef_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 25:
                                    textPiece.imageValue = _TextPieceImage_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                default:
                                    Q9J.LIZJ(q9h);
                                    break;
                            }
                        } else {
                            textPiece.stringValue = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        textPiece.format = _TextFormat_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    textPiece.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return textPiece;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextPiece LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
