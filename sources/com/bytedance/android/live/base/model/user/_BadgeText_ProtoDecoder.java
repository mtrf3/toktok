package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _BadgeText_ProtoDecoder implements InterfaceC31105CIr<BadgeText> {
    public static BadgeText LIZIZ(Q9H q9h) {
        BadgeText badgeText = new BadgeText();
        badgeText.pieces = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            badgeText.pieces.add(Q9J.LIZIZ(q9h));
                        }
                    } else {
                        badgeText.defaultPattern = Q9J.LIZIZ(q9h);
                    }
                } else {
                    badgeText.key = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return badgeText;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BadgeText LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
