package com.bytedance.android.live.broadcast.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.goal.model.GetResponse;

/* loaded from: classes.dex */
public interface LiveGetGoalInfoApi {
    @E8M("/webcast/goal/get/")
    AbstractC73672Svk<C28467BFf<GetResponse.Data>> getGoalInfo(@InterfaceC64986Pew("sec_owner_id") String str, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("source") Integer num);
}
