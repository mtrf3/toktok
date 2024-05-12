package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayDeleteResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoResponse;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;
import tikcast.api.anchor.CancelAutoDownloadResponse;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;

/* loaded from: classes6.dex */
public interface LiveReplyVideoPlayerApi {
    @E8M("/webcast/anchor/replay/cancel_auto_download/")
    @InterfaceC195757mF
    AbstractC73672Svk<CancelAutoDownloadResponse> cancelAutoDownload(@InterfaceC64985Pev("room_id") long j);

    @E8M("/webcast/anchor/live_fragment/edit/")
    @InterfaceC195757mF
    AbstractC73672Svk<AnchorLiveFragmentEditResponse> clipOrSaveLiveReplayFragment(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("start_time") long j2, @InterfaceC64985Pev("end_time") long j3, @InterfaceC64985Pev("action") int i);

    @E8M("/webcast/room/replay/delete/")
    @InterfaceC195757mF
    AbstractC73672Svk<AnchorReplayDeleteResponse> deleteLiveReplayAutoDownload(@InterfaceC64985Pev("replay_id") long j);

    @E8L("/webcast/anchor/live_fragment/info/")
    AbstractC73672Svk<AnchorLiveFragmentInfoResponse> getLiveReplayFragment(@InterfaceC64986Pew("fragment_id") long j);

    @E8M("/webcast/anchor/replay/frame/")
    @InterfaceC195757mF
    AbstractC73672Svk<AnchorLiveReplayFrameResponse> getLiveReplayFrame(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("start_time") long j2, @InterfaceC64985Pev("end_time") long j3, @InterfaceC64985Pev("generate_if_not_get") boolean z);

    @E8L("/webcast/room/replay/info/")
    AbstractC73672Svk<AnchorReplayInfoResponse> getLiveReplayVideoInfo(@InterfaceC64986Pew("room_ids") String str);

    @E8M("/webcast/anchor/replay/schedule_auto_download/")
    @InterfaceC195757mF
    AbstractC73672Svk<ScheduleAutoDownloadResponse> scheduleAutoDownload(@InterfaceC64985Pev("room_id") long j);
}
