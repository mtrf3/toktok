package com.bytedance.android.live.base.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _Ranking_ProtoDecoder implements InterfaceC31105CIr<Ranking> {
    @Override // X.InterfaceC31105CIr
    public final Ranking LIZ(Q9H q9h) {
        Ranking ranking = new Ranking();
        ranking.userList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return ranking;
    }
}
