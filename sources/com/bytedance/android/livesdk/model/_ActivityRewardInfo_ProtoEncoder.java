package com.bytedance.android.livesdk.model;

import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes16.dex */
public final class _ActivityRewardInfo_ProtoEncoder implements InterfaceC64604PXc<ActivityRewardInfo> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ActivityRewardInfo activityRewardInfo) {
        ActivityRewardInfo activityRewardInfo2 = activityRewardInfo;
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, activityRewardInfo2.mBage);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, activityRewardInfo2.mStoryTag);
    }
}
