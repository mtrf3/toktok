package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goal.model._GetResponse_Data_ProtoDecoder;
import webcast.api.sub._GetSubGoalResponse_Data_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RoomGoalsResponse_ProtoDecoder implements InterfaceC31105CIr<RoomGoalsResponse> {
    @Override // X.InterfaceC31105CIr
    public final RoomGoalsResponse LIZ(Q9H q9h) {
        RoomGoalsResponse roomGoalsResponse = new RoomGoalsResponse();
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
                                roomGoalsResponse.subGoal = _GetSubGoalResponse_Data_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            roomGoalsResponse.subGoalStatus = q9h.LJIIJJI();
                        }
                    } else {
                        roomGoalsResponse.liveGoal = _GetResponse_Data_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    roomGoalsResponse.liveGoalStatus = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomGoalsResponse;
            }
        }
    }
}
