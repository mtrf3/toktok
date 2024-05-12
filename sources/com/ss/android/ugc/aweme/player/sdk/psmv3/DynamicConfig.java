package com.ss.android.ugc.aweme.player.sdk.psmv3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class DynamicConfig {
    public final boolean concurrentReleaseFix;
    public final boolean disable264Recycle;
    public final boolean disable266Recycle;
    public final boolean disableAudioRecycle;
    public final boolean disableSRRecycle;
    public final boolean disableSoftwareDecodeRecycle;
    public final boolean optSessionAutoReset;
    public final int recyclerType;
    public final boolean sourceEqualAccuracy;
    public final int threadPoolInitStrategy;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, null);
    }

    public final boolean getConcurrentReleaseFix() {
        return this.concurrentReleaseFix;
    }

    public final boolean getDisable264Recycle() {
        return this.disable264Recycle;
    }

    public final boolean getDisable266Recycle() {
        return this.disable266Recycle;
    }

    public final boolean getDisableAudioRecycle() {
        return this.disableAudioRecycle;
    }

    public final boolean getDisableSRRecycle() {
        return this.disableSRRecycle;
    }

    public final boolean getDisableSoftwareDecodeRecycle() {
        return this.disableSoftwareDecodeRecycle;
    }

    public final boolean getOptSessionAutoReset() {
        return this.optSessionAutoReset;
    }

    public final int getRecyclerType() {
        return this.recyclerType;
    }

    public final boolean getSourceEqualAccuracy() {
        return this.sourceEqualAccuracy;
    }

    public final int getThreadPoolInitStrategy() {
        return this.threadPoolInitStrategy;
    }

    public DynamicConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, boolean z8) {
        this.recyclerType = i;
        this.disableAudioRecycle = z;
        this.disable264Recycle = z2;
        this.disable266Recycle = z3;
        this.disableSoftwareDecodeRecycle = z4;
        this.disableSRRecycle = z5;
        this.sourceEqualAccuracy = z6;
        this.optSessionAutoReset = z7;
        this.threadPoolInitStrategy = i2;
        this.concurrentReleaseFix = z8;
    }

    public /* synthetic */ DynamicConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, boolean z8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? false : z4, (i3 & 32) != 0 ? false : z5, (i3 & 64) != 0 ? false : z6, (i3 & 128) != 0 ? false : z7, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) == 0 ? z8 : false);
    }
}
