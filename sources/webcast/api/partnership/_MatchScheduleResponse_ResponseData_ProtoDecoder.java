package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._EsportsMatchInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.MatchScheduleResponse;

/* loaded from: classes17.dex */
public final class _MatchScheduleResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<MatchScheduleResponse.ResponseData> {
    public static MatchScheduleResponse.ResponseData LIZIZ(Q9H q9h) {
        MatchScheduleResponse.ResponseData responseData = new MatchScheduleResponse.ResponseData();
        responseData.batchMatchInfoList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.batchMatchInfoList.add(_EsportsMatchInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        responseData.tournamentName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    responseData.tournamentType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MatchScheduleResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
