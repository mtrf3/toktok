package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RtcResolution extends F9E {
    public final String modeName;
    public final Resolution resolution;

    public static /* synthetic */ RtcResolution copy$default(RtcResolution rtcResolution, String str, Resolution resolution, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rtcResolution.modeName;
        }
        if ((i & 2) != 0) {
            resolution = rtcResolution.resolution;
        }
        return rtcResolution.copy(str, resolution);
    }

    public final RtcResolution copy(String modeName, Resolution resolution) {
        o.LJIIIZ(modeName, "modeName");
        o.LJIIIZ(resolution, "resolution");
        return new RtcResolution(modeName, resolution);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.modeName, this.resolution};
    }

    public final String getModeName() {
        return this.modeName;
    }

    public final Resolution getResolution() {
        return this.resolution;
    }

    public RtcResolution(String modeName, Resolution resolution) {
        o.LJIIIZ(modeName, "modeName");
        o.LJIIIZ(resolution, "resolution");
        this.modeName = modeName;
        this.resolution = resolution;
    }
}
