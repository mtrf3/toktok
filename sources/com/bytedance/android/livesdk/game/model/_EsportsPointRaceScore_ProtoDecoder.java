package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _EsportsPointRaceScore_ProtoDecoder implements InterfaceC31105CIr<EsportsPointRaceScore> {
    public static EsportsPointRaceScore LIZIZ(Q9H q9h) {
        EsportsPointRaceScore esportsPointRaceScore = new EsportsPointRaceScore();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            esportsPointRaceScore.kill = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        esportsPointRaceScore.place = Q9J.LIZIZ(q9h);
                    }
                } else {
                    esportsPointRaceScore.total = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return esportsPointRaceScore;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EsportsPointRaceScore LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
