package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TextFormat_ProtoDecoder implements InterfaceC31105CIr<TextFormat> {
    public static TextFormat LIZIZ(Q9H q9h) {
        TextFormat textFormat = new TextFormat();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        textFormat.color = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        textFormat.bold = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 3:
                        textFormat.italic = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        textFormat.weight = q9h.LJIIJ();
                        break;
                    case 5:
                        textFormat.italicAngle = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        textFormat.fontSize = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 7:
                        textFormat.useHeighLightColor = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 8:
                        textFormat.useRemoteColor = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return textFormat;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextFormat LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
