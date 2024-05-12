package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _TextBadge_ProtoDecoder implements InterfaceC31105CIr<TextBadge> {
    public static TextBadge LIZIZ(Q9H q9h) {
        TextBadge textBadge = new TextBadge();
        textBadge.pieces = new ArrayList();
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
                                textBadge.pieces.add(Q9J.LIZIZ(q9h));
                            }
                        } else {
                            textBadge.defaultPattern = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        textBadge.key = Q9J.LIZIZ(q9h);
                    }
                } else {
                    textBadge.badgeDisplayType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return textBadge;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextBadge LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
