package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _PrepareBattleRequest_ProtoDecoder implements InterfaceC31105CIr<PrepareBattleRequest> {
    @Override // X.InterfaceC31105CIr
    public final PrepareBattleRequest LIZ(Q9H q9h) {
        PrepareBattleRequest prepareBattleRequest = new PrepareBattleRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    prepareBattleRequest.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return prepareBattleRequest;
            }
        }
    }
}
