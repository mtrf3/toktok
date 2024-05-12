package com.bytedance.android.live.base.model.banner;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _RankRoundBanner_ProtoDecoder implements InterfaceC31105CIr<RankRoundBanner> {
    @Override // X.InterfaceC31105CIr
    public final RankRoundBanner LIZ(Q9H q9h) {
        RankRoundBanner rankRoundBanner = new RankRoundBanner();
        rankRoundBanner.rankList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return rankRoundBanner;
    }
}
