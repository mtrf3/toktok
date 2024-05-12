package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import java.util.List;

/* renamed from: X.BpB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29949BpB<T> implements InterfaceC64592gB {
    public static final C29949BpB<T> LJLIL = new C29949BpB<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        LiveStreamGoal liveStreamGoal;
        List<LiveStreamSubGoal> list;
        LiveStreamSubGoal liveStreamSubGoal;
        GetResponse.Data data = (GetResponse.Data) ((BaseResponse) obj).data;
        if (data != null && (liveStreamGoal = data.ongoingGoal) != null && (list = liveStreamGoal.subGoals) != null && (liveStreamSubGoal = (LiveStreamSubGoal) ORZ.LJLLLL(list)) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getGoalInfo ");
            LIZ.append(liveStreamSubGoal);
            C0NB.LJIIIZ("GiftWidgetViewModel", X1D.LIZIZ(LIZ));
            C32502CpG.LIZJ(liveStreamSubGoal.id, liveStreamSubGoal.progress, liveStreamSubGoal.target);
        }
    }
}
