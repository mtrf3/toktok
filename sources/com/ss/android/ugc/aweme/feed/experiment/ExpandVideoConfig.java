package com.ss.android.ugc.aweme.feed.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class ExpandVideoConfig extends F9E {

    @InterfaceC65349Pkn("allow_expand_on_video")
    public final boolean allowExpandOnVideo;

    @InterfaceC65349Pkn("video_expand_vibration_type")
    public final int expandVibrationType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.allowExpandOnVideo), Integer.valueOf(this.expandVibrationType)};
    }

    public ExpandVideoConfig(boolean z, int i) {
        this.allowExpandOnVideo = z;
        this.expandVibrationType = i;
    }
}
