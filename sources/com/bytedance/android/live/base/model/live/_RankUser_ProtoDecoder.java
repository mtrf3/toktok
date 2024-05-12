package com.bytedance.android.live.base.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _RankUser_ProtoDecoder implements InterfaceC31105CIr<RankUser> {
    @Override // X.InterfaceC31105CIr
    public final RankUser LIZ(Q9H q9h) {
        RankUser rankUser = new RankUser();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return rankUser;
    }
}
