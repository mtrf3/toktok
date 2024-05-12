package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _FontStyle_ProtoDecoder implements InterfaceC31105CIr<FontStyle> {
    public static FontStyle LIZIZ(Q9H q9h) {
        FontStyle fontStyle = new FontStyle();
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
                                fontStyle.borderColor = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            fontStyle.fontColor = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        fontStyle.fontWidth = q9h.LJIIJ();
                    }
                } else {
                    fontStyle.fontSize = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return fontStyle;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FontStyle LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
