package com.bytedance.android.livesdk.interaction.poll.network;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;

/* loaded from: classes6.dex */
public final class StartPollResponse {

    @InterfaceC65349Pkn("end_time")
    public final long endTime;

    @InterfaceC65349Pkn("sei")
    public LiveMessageSEI liveMessageSEI;

    @InterfaceC65349Pkn("poll_id")
    public final long pollId;
}
