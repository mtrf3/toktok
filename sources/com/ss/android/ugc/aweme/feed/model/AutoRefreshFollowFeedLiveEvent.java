package com.ss.android.ugc.aweme.feed.model;

import X.C2U8;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes10.dex */
public final class AutoRefreshFollowFeedLiveEvent implements IEvent {
    public final boolean isOpenWindow;
    public final boolean isRefreshLive;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public AutoRefreshFollowFeedLiveEvent(boolean z, boolean z2) {
        this.isOpenWindow = z;
        this.isRefreshLive = z2;
    }
}
