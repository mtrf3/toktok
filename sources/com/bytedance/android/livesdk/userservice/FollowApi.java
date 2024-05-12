package com.bytedance.android.livesdk.userservice;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes6.dex */
public interface FollowApi {
    @E8M("/webcast/user/relation/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<FollowResult>> follow(@InterfaceC64985Pev("follow_type") int i, @InterfaceC64985Pev("to_user_id") long j, @InterfaceC64985Pev("current_room_id") long j2, @InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("sec_to_user_id") String str2);

    @E8M("/webcast/user/relation/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<FollowResult>> follow(@InterfaceC64985Pev("follow_type") int i, @InterfaceC64985Pev("to_user_id") long j, @InterfaceC64985Pev("current_room_id") long j2, @InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("sec_to_user_id") String str2, @InterfaceC64985Pev("need_block_check") boolean z);

    @E8M("/webcast/user/relation/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<FollowResult>> unfollow(@InterfaceC64985Pev("follow_type") int i, @InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("to_user_id") long j, @InterfaceC64985Pev("sec_to_user_id") String str2, @InterfaceC64985Pev("current_room_id") long j2);
}
