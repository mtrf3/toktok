package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes.dex */
public final class _FollowInfo_ProtoEncoder implements InterfaceC64604PXc<FollowInfo> {
    public static int LIZJ(FollowInfo followInfo) {
        return C30957CCz.LJIIIZ(4, followInfo.pushStatus) + C30957CCz.LJIIIZ(3, followInfo.followStatus) + C30957CCz.LJIIIZ(2, followInfo.followerCount) + C30957CCz.LJIIIZ(1, followInfo.followingCount);
    }

    public static void LIZIZ(CD6 cd6, FollowInfo followInfo) {
        long j = followInfo.followingCount;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        long j2 = followInfo.followerCount;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j2);
        long j3 = followInfo.followStatus;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j3);
        long j4 = followInfo.pushStatus;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j4);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, FollowInfo followInfo) {
        LIZIZ(cd6, followInfo);
    }
}
