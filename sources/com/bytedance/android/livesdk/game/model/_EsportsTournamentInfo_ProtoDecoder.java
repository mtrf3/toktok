package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _EsportsTournamentInfo_ProtoDecoder implements InterfaceC31105CIr<EsportsTournamentInfo> {
    public static EsportsTournamentInfo LIZIZ(Q9H q9h) {
        EsportsTournamentInfo esportsTournamentInfo = new EsportsTournamentInfo();
        esportsTournamentInfo.matchInfoList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        esportsTournamentInfo.tournamentId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        esportsTournamentInfo.tournamentName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        esportsTournamentInfo.tournamentIcon = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        esportsTournamentInfo.iconThemeColor = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        esportsTournamentInfo.tournamentType = q9h.LJIIJ();
                        break;
                    case 6:
                        esportsTournamentInfo.matchInfoList.add(_EsportsMatchInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return esportsTournamentInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EsportsTournamentInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
