package com.bytedance.android.livesdk.wishlistv2.network;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributorsResponse;

/* loaded from: classes6.dex */
public interface IStreamGoalApi {
    @E8L("/webcast/goal/contributors/")
    AbstractC73672Svk<C28467BFf<LiveStreamGoalContributorsResponse>> getContributors(@InterfaceC64986Pew("sec_owner_id") String str, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("offset") long j2, @InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("limit") long j3, @InterfaceC64986Pew("goal_id") long j4);
}
