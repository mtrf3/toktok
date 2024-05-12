package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoEncoder;

/* loaded from: classes.dex */
public final class _SubscribeInfo_ProtoEncoder implements InterfaceC64604PXc<SubscribeInfo> {
    public static int LIZJ(SubscribeInfo subscribeInfo) {
        int LIZ;
        int i = 0;
        int LJ = C30957CCz.LJ(2) + C30957CCz.LJ(1);
        SubscribeBadge subscribeBadge = subscribeInfo.subscribeBadge;
        if (subscribeBadge == null) {
            LIZ = 0;
        } else {
            int LJ2 = _ImageModel_ProtoEncoder.LJ(4, subscribeBadge.previewImage) + _ImageModel_ProtoEncoder.LJ(3, subscribeBadge.originImage);
            LIZ = CD6.LIZ(3) + CD6.LIZIZ(LJ2) + LJ2;
        }
        int LJ3 = C30957CCz.LJ(7) + C30957CCz.LJ(6) + C30957CCz.LJIIIZ(5, subscribeInfo.subscriberCount) + C30957CCz.LJ(4) + LJ + LIZ;
        TimerDetail timerDetail = subscribeInfo.timerDetail;
        if (timerDetail != null) {
            int LIZJ = _TimerDetail_ProtoEncoder.LIZJ(timerDetail);
            i = CD6.LIZIZ(LIZJ) + LIZJ + CD6.LIZ(8);
        }
        return C30957CCz.LJIIIZ(12, subscribeInfo.subEndTime) + C30957CCz.LJI(11, subscribeInfo.status) + C30957CCz.LJ(10) + C30957CCz.LJ(9) + LJ3 + i;
    }

    public static void LIZIZ(CD6 cd6, SubscribeInfo subscribeInfo) {
        boolean z = subscribeInfo.isAnchorQualified;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        boolean z2 = subscribeInfo.isSubscribed;
        cd6.LIZLLL(2, 0);
        cd6.LJ(z2 ? 1 : 0);
        SubscribeBadge subscribeBadge = subscribeInfo.subscribeBadge;
        if (subscribeBadge != null) {
            cd6.LIZLLL(3, 2);
            cd6.LJ(_ImageModel_ProtoEncoder.LJ(4, subscribeBadge.previewImage) + _ImageModel_ProtoEncoder.LJ(3, subscribeBadge.originImage));
            _ImageModel_ProtoEncoder.LIZJ(cd6, 3, subscribeBadge.originImage);
            _ImageModel_ProtoEncoder.LIZJ(cd6, 4, subscribeBadge.previewImage);
        }
        boolean z3 = subscribeInfo.anchorEnableSubscription;
        cd6.LIZLLL(4, 0);
        cd6.LJ(z3 ? 1 : 0);
        long j = subscribeInfo.subscriberCount;
        cd6.LIZLLL(5, 0);
        cd6.LJFF(j);
        boolean z4 = subscribeInfo.isInGracePeriod;
        cd6.LIZLLL(6, 0);
        cd6.LJ(z4 ? 1 : 0);
        boolean z5 = subscribeInfo.isSubscribedToCurrentAnchor;
        cd6.LIZLLL(7, 0);
        cd6.LJ(z5 ? 1 : 0);
        TimerDetail timerDetail = subscribeInfo.timerDetail;
        if (timerDetail != null) {
            cd6.LIZLLL(8, 2);
            cd6.LJ(_TimerDetail_ProtoEncoder.LIZJ(timerDetail));
            _TimerDetail_ProtoEncoder.LIZIZ(cd6, timerDetail);
        }
        boolean z6 = subscribeInfo.userGiftSubAuth;
        cd6.LIZLLL(9, 0);
        cd6.LJ(z6 ? 1 : 0);
        boolean z7 = subscribeInfo.anchorGiftSubAuth;
        cd6.LIZLLL(10, 0);
        cd6.LJ(z7 ? 1 : 0);
        int i = subscribeInfo.status;
        cd6.LIZLLL(11, 0);
        cd6.LIZJ(i);
        long j2 = subscribeInfo.subEndTime;
        cd6.LIZLLL(12, 0);
        cd6.LJFF(j2);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, SubscribeInfo subscribeInfo) {
        LIZIZ(cd6, subscribeInfo);
    }
}
