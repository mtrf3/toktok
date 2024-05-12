package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RankEntranceV3Response_ProtoDecoder implements InterfaceC31105CIr<RankEntranceV3Response> {
    @Override // X.InterfaceC31105CIr
    public final RankEntranceV3Response LIZ(Q9H q9h) {
        RankEntranceV3Response rankEntranceV3Response = new RankEntranceV3Response();
        rankEntranceV3Response.entranceGroups = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rankEntranceV3Response.entranceGroups.add(_RankEntranceV3Response_EntranceGroup_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return rankEntranceV3Response;
            }
        }
    }
}
