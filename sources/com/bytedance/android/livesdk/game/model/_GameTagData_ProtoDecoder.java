package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GameTagData_ProtoDecoder implements InterfaceC31105CIr<GameTagData> {
    @Override // X.InterfaceC31105CIr
    public final GameTagData LIZ(Q9H q9h) {
        GameTagData gameTagData = new GameTagData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gameTagData.gameName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameTagData;
            }
        }
    }
}
