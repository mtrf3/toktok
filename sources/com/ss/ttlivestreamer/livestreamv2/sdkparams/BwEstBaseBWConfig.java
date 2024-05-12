package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class BwEstBaseBWConfig {

    @Serialized("use_adaptive_fps")
    public int useAdaptiveFps;

    @Serialized("use_ewma_bandwidth_estimate")
    public int useEwmaBandwidthEstimate;

    @Serialized("transport_bw_est_1s")
    public int transportBwEst1 = 1000;

    @Serialized("transport_bw_est_2s")
    public int transportBwEst2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @Serialized("codetable_set_fps")
    public int codetableSetFps = 15;

    @Serialized("min_frame_rate")
    public int minFrameRate = 10;

    @Serialized("bwe_sample_dur_length")
    public int bweSampleDurLength = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

    @Serialized("transport_bw_est_1s_factor")
    public double transportBwest1sFactor = 1.5d;

    @Serialized("transport_bw_est_3s_factor")
    public double transportBwest3sFactor = 1.25d;

    @Serialized("durlist_rate_1s_factor")
    public double durlistRate1sFactor = 0.1d;

    @Serialized("durlist_rate_2s_factor")
    public double durlistRate2sFactor = 0.2d;

    @Serialized("bwe_factor")
    public double bweFactor = 0.95d;

    @Serialized("bitrate_adjust_interval")
    public int bitraAdjustInterval = 1;

    @Serialized("min_adjust_step")
    public int minAdjustStep = 30;

    public final int getBitraAdjustInterval() {
        return this.bitraAdjustInterval;
    }

    public final double getBweFactor() {
        return this.bweFactor;
    }

    public final int getBweSampleDurLength() {
        return this.bweSampleDurLength;
    }

    public final int getCodetableSetFps() {
        return this.codetableSetFps;
    }

    public final double getDurlistRate1sFactor() {
        return this.durlistRate1sFactor;
    }

    public final double getDurlistRate2sFactor() {
        return this.durlistRate2sFactor;
    }

    public final int getMinAdjustStep() {
        return this.minAdjustStep;
    }

    public final int getMinFrameRate() {
        return this.minFrameRate;
    }

    public final int getTransportBwEst1() {
        return this.transportBwEst1;
    }

    public final int getTransportBwEst2() {
        return this.transportBwEst2;
    }

    public final double getTransportBwest1sFactor() {
        return this.transportBwest1sFactor;
    }

    public final double getTransportBwest3sFactor() {
        return this.transportBwest3sFactor;
    }

    public final int getUseAdaptiveFps() {
        return this.useAdaptiveFps;
    }

    public final int getUseEwmaBandwidthEstimate() {
        return this.useEwmaBandwidthEstimate;
    }

    public final void setBitraAdjustInterval(int i) {
        this.bitraAdjustInterval = i;
    }

    public final void setBweFactor(double d) {
        this.bweFactor = d;
    }

    public final void setBweSampleDurLength(int i) {
        this.bweSampleDurLength = i;
    }

    public final void setCodetableSetFps(int i) {
        this.codetableSetFps = i;
    }

    public final void setDurlistRate1sFactor(double d) {
        this.durlistRate1sFactor = d;
    }

    public final void setDurlistRate2sFactor(double d) {
        this.durlistRate2sFactor = d;
    }

    public final void setMinAdjustStep(int i) {
        this.minAdjustStep = i;
    }

    public final void setMinFrameRate(int i) {
        this.minFrameRate = i;
    }

    public final void setTransportBwEst1(int i) {
        this.transportBwEst1 = i;
    }

    public final void setTransportBwEst2(int i) {
        this.transportBwEst2 = i;
    }

    public final void setTransportBwest1sFactor(double d) {
        this.transportBwest1sFactor = d;
    }

    public final void setTransportBwest3sFactor(double d) {
        this.transportBwest3sFactor = d;
    }

    public final void setUseAdaptiveFps(int i) {
        this.useAdaptiveFps = i;
    }

    public final void setUseEwmaBandwidthEstimate(int i) {
        this.useEwmaBandwidthEstimate = i;
    }
}
