package com.bytedance.android.livesdk.programmedlive.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.programmedlive.model.FollowCardCloseRequest;
import com.bytedance.android.live.programmedlive.model.FollowCardResponse;

/* loaded from: classes6.dex */
public interface ProgrammedLiveApi {
    @E8M("/webcast/room/follow_card_close/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> closeFollowCard(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("card_id") long j2, @InterfaceC64985Pev("card_anchor_id") long j3, @InterfaceC64985Pev("user_close") boolean z);

    @E8M("/webcast/room/follow_card_close/")
    AbstractC73672Svk<C28467BFf<C76800UCe>> closeFollowCard(@InterfaceC195727mC FollowCardCloseRequest followCardCloseRequest);

    @E8L("/webcast/room/follow_card/")
    AbstractC73672Svk<C28467BFf<FollowCardResponse>> getFollowCard(@InterfaceC64986Pew("room_id") long j);
}
