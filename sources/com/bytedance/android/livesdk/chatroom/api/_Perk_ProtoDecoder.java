package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _Perk_ProtoDecoder implements InterfaceC31105CIr<Perk> {
    public static Perk LIZIZ(Q9H q9h) {
        Perk perk = new Perk();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    perk.title = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return perk;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Perk LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}