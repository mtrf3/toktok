package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickerBitrateToResolution extends F9E {

    @InterfaceC65349Pkn("video_bitrate")
    public final float bitrate;

    @InterfaceC65349Pkn("resolution")
    public final String resolution;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.resolution, Float.valueOf(this.bitrate)};
    }

    public StickerBitrateToResolution(String resolution, float f) {
        o.LJIIIZ(resolution, "resolution");
        this.resolution = resolution;
        this.bitrate = f;
    }
}
