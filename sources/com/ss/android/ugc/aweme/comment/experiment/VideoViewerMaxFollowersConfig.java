package com.ss.android.ugc.aweme.comment.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class VideoViewerMaxFollowersConfig extends F9E {

    @InterfaceC65349Pkn("enabled_max_followers")
    public final int enabledMaxFollowers;

    public static /* synthetic */ VideoViewerMaxFollowersConfig copy$default(VideoViewerMaxFollowersConfig videoViewerMaxFollowersConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoViewerMaxFollowersConfig.enabledMaxFollowers;
        }
        return videoViewerMaxFollowersConfig.copy(i);
    }

    public final VideoViewerMaxFollowersConfig copy(int i) {
        return new VideoViewerMaxFollowersConfig(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.enabledMaxFollowers)};
    }

    public final int getEnabledMaxFollowers() {
        return this.enabledMaxFollowers;
    }

    public VideoViewerMaxFollowersConfig(int i) {
        this.enabledMaxFollowers = i;
    }
}
