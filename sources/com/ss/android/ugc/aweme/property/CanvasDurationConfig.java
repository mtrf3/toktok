package com.ss.android.ugc.aweme.property;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public final class CanvasDurationConfig extends F9E {

    @InterfaceC65349Pkn("canvas_default_duration_without_music")
    public final int defaultDuration;

    @InterfaceC65349Pkn("canvas_max_duration_with_music")
    public final int maxDuration;

    @InterfaceC65349Pkn("canvas_min_duration_with_music")
    public final int minDuration;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.defaultDuration), Integer.valueOf(this.minDuration), Integer.valueOf(this.maxDuration)};
    }

    public CanvasDurationConfig(int i, int i2, int i3) {
        this.defaultDuration = i;
        this.minDuration = i2;
        this.maxDuration = i3;
    }
}
