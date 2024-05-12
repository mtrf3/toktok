package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubLiveBanner_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.gift._SubGifInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.sub.GetAnchorSubscriptionResponse;

/* loaded from: classes6.dex */
public final class _GetAnchorSubscriptionResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetAnchorSubscriptionResponse.Data> {
    public static GetAnchorSubscriptionResponse.Data LIZIZ(Q9H q9h) {
        GetAnchorSubscriptionResponse.Data data = new GetAnchorSubscriptionResponse.Data();
        data.countInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.tip = _Tip_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        data.countInfo.add(_SubscriberCountInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        data.subGoal = _SubGoal_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        data.perksPinPanel = _PerksPinPanel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        data.timerDetail = _TimerDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        data.enableWaveStatus = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        data.anchorGiftSubAuth = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        data.receivedSubs = q9h.LJIIJJI();
                        break;
                    case 9:
                        data.giftSub = _SubGifInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        data.banner = _SubLiveBanner_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetAnchorSubscriptionResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
