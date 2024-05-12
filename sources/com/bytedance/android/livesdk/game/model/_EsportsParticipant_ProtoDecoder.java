package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _EsportsParticipant_ProtoDecoder implements InterfaceC31105CIr<EsportsParticipant> {
    public static EsportsParticipant LIZIZ(Q9H q9h) {
        EsportsParticipant esportsParticipant = new EsportsParticipant();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            esportsParticipant.matchScore = _EsportsParticipantMatchScore_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        esportsParticipant.icon = Q9J.LIZIZ(q9h);
                    }
                } else {
                    esportsParticipant.name = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return esportsParticipant;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EsportsParticipant LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
