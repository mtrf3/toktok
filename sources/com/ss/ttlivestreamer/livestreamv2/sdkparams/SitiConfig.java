package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class SitiConfig {

    @Serialized("drop_encode_fps")
    public boolean dropEncodeFps;

    @Serialized("frames_counts_calc_siti")
    public int framesCountsCalcSiti;

    @Serialized("interact_disable_siti")
    public boolean interactDisableSiti;

    @Serialized("period_ms")
    public int periodMs;

    @Serialized("thread_count")
    public int threadCount;

    @Serialized("using_gpu")
    public boolean usingGpu;

    @Serialized("using_arm")
    public boolean usingArm = true;

    @Serialized("extract_duration")
    public int extractDuration = 1;

    public final boolean getDropEncodeFps() {
        return this.dropEncodeFps;
    }

    public final int getExtractDuration() {
        return this.extractDuration;
    }

    public final int getFramesCountsCalcSiti() {
        return this.framesCountsCalcSiti;
    }

    public final boolean getInteractDisableSiti() {
        return this.interactDisableSiti;
    }

    public final int getPeriodMs() {
        return this.periodMs;
    }

    public final int getThreadCount() {
        return this.threadCount;
    }

    public final boolean getUsingArm() {
        return this.usingArm;
    }

    public final boolean getUsingGpu() {
        return this.usingGpu;
    }

    public final void setDropEncodeFps(boolean z) {
        this.dropEncodeFps = z;
    }

    public final void setExtractDuration(int i) {
        this.extractDuration = i;
    }

    public final void setFramesCountsCalcSiti(int i) {
        this.framesCountsCalcSiti = i;
    }

    public final void setInteractDisableSiti(boolean z) {
        this.interactDisableSiti = z;
    }

    public final void setPeriodMs(int i) {
        this.periodMs = i;
    }

    public final void setThreadCount(int i) {
        this.threadCount = i;
    }

    public final void setUsingArm(boolean z) {
        this.usingArm = z;
    }

    public final void setUsingGpu(boolean z) {
        this.usingGpu = z;
    }
}
