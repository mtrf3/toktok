package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _EsportsMatchInfo_ProtoDecoder implements InterfaceC31105CIr<EsportsMatchInfo> {
    public static EsportsMatchInfo LIZIZ(Q9H q9h) {
        EsportsMatchInfo esportsMatchInfo = new EsportsMatchInfo();
        esportsMatchInfo.participants = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        esportsMatchInfo.matchId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        esportsMatchInfo.matchName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        esportsMatchInfo.participants.add(_EsportsParticipant_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        esportsMatchInfo.totalParticipants = q9h.LJIIJJI();
                        break;
                    case 5:
                        esportsMatchInfo.startTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        esportsMatchInfo.endTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        esportsMatchInfo.matchStatus = q9h.LJIIJ();
                        break;
                    case 8:
                        esportsMatchInfo.reserveStatus = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return esportsMatchInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EsportsMatchInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
