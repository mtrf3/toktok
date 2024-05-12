package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AudienceRoomInfoResponse_EsportsBriefTournamentInfo_ProtoDecoder implements InterfaceC31105CIr<AudienceRoomInfoResponse.EsportsBriefTournamentInfo> {
    public static AudienceRoomInfoResponse.EsportsBriefTournamentInfo LIZIZ(Q9H q9h) {
        AudienceRoomInfoResponse.EsportsBriefTournamentInfo esportsBriefTournamentInfo = new AudienceRoomInfoResponse.EsportsBriefTournamentInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                esportsBriefTournamentInfo.briefMatchInfo = _AudienceRoomInfoResponse_EsportsBriefMatchInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            esportsBriefTournamentInfo.esportsTournamentType = q9h.LJIIJ();
                        }
                    } else {
                        esportsBriefTournamentInfo.tournamentName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    esportsBriefTournamentInfo.tournamentId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return esportsBriefTournamentInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceRoomInfoResponse.EsportsBriefTournamentInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
