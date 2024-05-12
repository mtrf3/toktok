package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.InterfaceC30950CCs;
import com.bytedance.android.feed.api.ILiveFeedApiService;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class FeedDelayInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "feed_delay_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).T90();
    }
}
