package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes.dex */
public final class _SubscribeInfo_ProtoDecoder implements InterfaceC31105CIr<SubscribeInfo> {
    public static SubscribeInfo LIZIZ(Q9H q9h) {
        SubscribeInfo subscribeInfo = new SubscribeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subscribeInfo.isAnchorQualified = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        subscribeInfo.isSubscribed = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        subscribeInfo.subscribeBadge = _SubscribeBadge_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        subscribeInfo.anchorEnableSubscription = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        subscribeInfo.subscriberCount = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        subscribeInfo.isInGracePeriod = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        subscribeInfo.isSubscribedToCurrentAnchor = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        subscribeInfo.timerDetail = _TimerDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        subscribeInfo.userGiftSubAuth = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        subscribeInfo.anchorGiftSubAuth = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        subscribeInfo.status = q9h.LJIIJ();
                        break;
                    case 12:
                        subscribeInfo.subEndTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subscribeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscribeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
