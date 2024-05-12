package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes16.dex */
public final class _ActivityRewardInfo_ProtoDecoder implements InterfaceC31105CIr<ActivityRewardInfo> {
    public static ActivityRewardInfo LIZIZ(Q9H q9h) {
        ActivityRewardInfo activityRewardInfo = new ActivityRewardInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        activityRewardInfo.mStoryTag = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    activityRewardInfo.mBage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return activityRewardInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ActivityRewardInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
