package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _Text_ProtoDecoder implements InterfaceC31105CIr<Text> {
    public static Text LIZIZ(Q9H q9h) {
        Text text = new Text();
        text.pieces = new ArrayList();
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
                                text.pieces.add(_TextPiece_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            text.defaultFormat = _TextFormat_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        text.defaultPattern = Q9J.LIZIZ(q9h);
                    }
                } else {
                    text.key = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return text;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Text LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
