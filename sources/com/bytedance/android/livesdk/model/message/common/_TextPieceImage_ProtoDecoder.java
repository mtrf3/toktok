package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _TextPieceImage_ProtoDecoder implements InterfaceC31105CIr<TextPieceImage> {
    public static TextPieceImage LIZIZ(Q9H q9h) {
        TextPieceImage textPieceImage = new TextPieceImage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    textPieceImage.imageModel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return textPieceImage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextPieceImage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
