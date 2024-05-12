package com.bytedance.android.live.poll;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC68342mE;
import com.bytedance.android.livesdk.interaction.poll.network.EndPollResponse;
import com.bytedance.android.livesdk.interaction.poll.network.PollHistoryResponse;
import com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse;
import com.bytedance.android.livesdk.model.VoteResponseData;

/* loaded from: classes6.dex */
public interface PollApi {
    void LIZ(long j);

    @E8M("/webcast/room/poll/end")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<EndPollResponse>> endCustomPoll(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("poll_id") long j2, @InterfaceC64985Pev("end_type") int i);

    @E8M("/webcast/room/poll/end")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<EndPollResponse>> endMockPoll(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("poll_id") long j2, @InterfaceC64985Pev("end_type") int i, @InterfaceC64985Pev("mock_room_id") long j3);

    @E8M("/webcast/room/poll/end")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<EndPollResponse>> endPoll(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("poll_id") long j2, @InterfaceC64985Pev("end_type") int i);

    @E8L("/webcast/room/poll/latest")
    AbstractC73672Svk<C28467BFf<PollHistoryResponse>> getPollHistory(@InterfaceC64986Pew("room_id") long j);

    @E8M("/webcast/room/poll/start")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<StartPollResponse>> startPoll(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("option_list") String str, @InterfaceC64985Pev("duration_ms") long j2, @InterfaceC64985Pev("kind") int i);

    @E8M("/webcast/room/poll/vote")
    @InterfaceC195757mF
    InterfaceC68342mE<C28467BFf<VoteResponseData>> vote(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("poll_id") long j2, @InterfaceC64985Pev("option_index") int i);
}
