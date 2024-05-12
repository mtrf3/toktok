package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _SubscriberMsg_ProtoDecoder implements InterfaceC31105CIr<SubscriberMsg> {
    public static SubscriberMsg LIZIZ(Q9H q9h) {
        SubscriberMsg subscriberMsg = new SubscriberMsg();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subscriberMsg.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        subscriberMsg.nickName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        subscriberMsg.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        subscriberMsg.status = q9h.LJIIJ();
                        break;
                    case 5:
                        subscriberMsg.statusTxt = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        subscriberMsg.subscribeTimeTxt = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        subscriberMsg.badge = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        subscriberMsg.isWatchingLive = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        subscriberMsg.sendSubs = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subscriberMsg;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscriberMsg LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
