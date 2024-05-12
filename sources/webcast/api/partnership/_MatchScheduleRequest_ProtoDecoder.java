package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MatchScheduleRequest_ProtoDecoder implements InterfaceC31105CIr<MatchScheduleRequest> {
    @Override // X.InterfaceC31105CIr
    public final MatchScheduleRequest LIZ(Q9H q9h) {
        MatchScheduleRequest matchScheduleRequest = new MatchScheduleRequest();
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
                                matchScheduleRequest.slideWay = q9h.LJIIJ();
                            }
                        } else {
                            matchScheduleRequest.batchSize = q9h.LJIIJJI();
                        }
                    } else {
                        matchScheduleRequest.timestamp = Q9J.LIZIZ(q9h);
                    }
                } else {
                    matchScheduleRequest.tournamentId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return matchScheduleRequest;
            }
        }
    }
}
