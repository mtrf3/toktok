package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubEntrance_ProtoDecoder implements InterfaceC31105CIr<SubEntrance> {
    public static SubEntrance LIZIZ(Q9H q9h) {
        SubEntrance subEntrance = new SubEntrance();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subEntrance.showSubEntrance = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
