package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class LiveFollowFeedDrawLoop {

    @InterfaceC65349Pkn("loop_enable")
    public boolean enable;

    @InterfaceC65349Pkn("threshold")
    public int threshold;

    public static LiveFollowFeedDrawLoop getDefault() {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = new LiveFollowFeedDrawLoop();
        liveFollowFeedDrawLoop.enable = false;
        liveFollowFeedDrawLoop.threshold = 3;
        return liveFollowFeedDrawLoop;
    }

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
