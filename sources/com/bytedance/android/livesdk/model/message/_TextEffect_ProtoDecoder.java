package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _TextEffect_ProtoDecoder implements InterfaceC31105CIr<TextEffect> {
    public static TextEffect LIZIZ(Q9H q9h) {
        TextEffect textEffect = new TextEffect();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        textEffect.landscapeDetail = _TextEffect_Detail_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    textEffect.portraitDetail = _TextEffect_Detail_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return textEffect;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextEffect LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
