package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.InterfaceC30950CCs;
import com.bytedance.android.live.broadcast.api.IBroadcastService;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class LiveReplayVideoListTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "fetch_live_reply_video_list_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).checkScheduledLiveReplayVideoTask(true, null);
    }
}
