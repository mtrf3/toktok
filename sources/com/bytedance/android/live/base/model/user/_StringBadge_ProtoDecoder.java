package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _StringBadge_ProtoDecoder implements InterfaceC31105CIr<StringBadge> {
    public static StringBadge LIZIZ(Q9H q9h) {
        StringBadge stringBadge = new StringBadge();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        stringBadge.contentStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    stringBadge.badgeDisplayType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return stringBadge;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StringBadge LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
