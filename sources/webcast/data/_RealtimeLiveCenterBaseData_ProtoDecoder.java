package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RealtimeLiveCenterBaseData_ProtoDecoder implements InterfaceC31105CIr<RealtimeLiveCenterBaseData> {
    public static RealtimeLiveCenterBaseData LIZIZ(Q9H q9h) {
        RealtimeLiveCenterBaseData realtimeLiveCenterBaseData = new RealtimeLiveCenterBaseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        realtimeLiveCenterBaseData.liveStartTime = q9h.LJIIJJI();
                        break;
                    case 2:
                        realtimeLiveCenterBaseData.liveEndTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        realtimeLiveCenterBaseData.totalScore = q9h.LJIIJJI();
                        break;
                    case 4:
                        realtimeLiveCenterBaseData.liveWatchCnt = q9h.LJIIJJI();
                        break;
                    case 5:
                        realtimeLiveCenterBaseData.liveNewFansUcnt = q9h.LJIIJJI();
                        break;
                    case 6:
                        realtimeLiveCenterBaseData.liveConsumeUcnt = q9h.LJIIJJI();
                        break;
                    case 7:
                        realtimeLiveCenterBaseData.liveCommentCnt = q9h.LJIIJJI();
                        break;
                    case 8:
                        realtimeLiveCenterBaseData.liveLikeCnt = q9h.LJIIJJI();
                        break;
                    case 9:
                        realtimeLiveCenterBaseData.newSubscribersCnt = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeLiveCenterBaseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RealtimeLiveCenterBaseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
