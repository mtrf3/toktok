package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.sub.GetSubGoalResponse;

/* loaded from: classes6.dex */
public final class _GetSubGoalResponse_SubGoalHistoryInfo_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalResponse.SubGoalHistoryInfo> {
    public static GetSubGoalResponse.SubGoalHistoryInfo LIZIZ(Q9H q9h) {
        GetSubGoalResponse.SubGoalHistoryInfo subGoalHistoryInfo = new GetSubGoalResponse.SubGoalHistoryInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subGoalHistoryInfo.hasCompletedGoal = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subGoalHistoryInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubGoalResponse.SubGoalHistoryInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
