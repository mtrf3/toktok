package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _FollowInfo_ProtoDecoder implements InterfaceC31105CIr<FollowInfo> {
    public static FollowInfo LIZIZ(Q9H q9h) {
        FollowInfo followInfo = new FollowInfo();
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
                                followInfo.pushStatus = q9h.LJIIJJI();
                            }
                        } else {
                            followInfo.followStatus = q9h.LJIIJJI();
                        }
                    } else {
                        followInfo.followerCount = q9h.LJIIJJI();
                    }
                } else {
                    followInfo.followingCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return followInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FollowInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
