package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;

/* loaded from: classes12.dex */
public final class BwEstCfg {

    @Serialized("bw_adjust_step_opt")
    public int bwAdjustStepOpt;

    @Serialized("bw_drop_frame_ratio")
    public double bwDropFrameRatio;

    @Serialized("bw_go_down_ratio")
    public double bwGoDownRatio;

    @Serialized("bw_go_up_ratio")
    public double bwGoUpRatio;

    @Serialized("bw_long_period_alpha")
    public double bwLongPeriodAlpha;

    @Serialized("bw_long_period_opt")
    public int bwLongPeriodOpt;

    @Serialized("bw_long_period_queue_size")
    public int bwLongPeriodQueueSize;

    @Serialized("bw_long_period_score")
    public double bwLongPeriodScore;

    @Serialized("bw_start_up_opt")
    public int bwStartUpOpt;

    @Serialized("bw_go_down_window_size")
    public int bwGoDownWindowSize = Integer.MAX_VALUE;

    @Serialized("bw_go_up_window_size")
    public int bwGoUpWindownSize = Integer.MAX_VALUE;

    @Serialized("bw_go_up_packet_thresh")
    public int bwGoUpPacketThresh = Integer.MAX_VALUE;

    @Serialized("bw_go_down_score")
    public int bwGoDownScore = Integer.MAX_VALUE;

    @Serialized("bitrate_adjust_interval")
    public int bitrateAdjustInterval = Integer.MAX_VALUE;

    @Serialized("bw_go_up_bw_thresh")
    public int bwGoUpBwThresh = Integer.MAX_VALUE;

    @Serialized("bw_go_down_bw_thresh")
    public int bwGoDownBwThresh = Integer.MAX_VALUE;

    public BwEstCfg() {
        double d = NumberInit.UNDEFINED_DOUBLE_VALUE;
        this.bwGoDownRatio = d;
        this.bwGoUpRatio = d;
        this.bwDropFrameRatio = d;
        this.bwStartUpOpt = Integer.MAX_VALUE;
        this.bwAdjustStepOpt = Integer.MAX_VALUE;
        this.bwLongPeriodOpt = Integer.MAX_VALUE;
        this.bwLongPeriodQueueSize = Integer.MAX_VALUE;
        this.bwLongPeriodScore = d;
        this.bwLongPeriodAlpha = d;
    }

    public final int getBitrateAdjustInterval() {
        return this.bitrateAdjustInterval;
    }

    public final int getBwAdjustStepOpt() {
        return this.bwAdjustStepOpt;
    }

    public final double getBwDropFrameRatio() {
        return this.bwDropFrameRatio;
    }

    public final int getBwGoDownBwThresh() {
        return this.bwGoDownBwThresh;
    }

    public final double getBwGoDownRatio() {
        return this.bwGoDownRatio;
    }

    public final int getBwGoDownScore() {
        return this.bwGoDownScore;
    }

    public final int getBwGoDownWindowSize() {
        return this.bwGoDownWindowSize;
    }

    public final int getBwGoUpBwThresh() {
        return this.bwGoUpBwThresh;
    }

    public final int getBwGoUpPacketThresh() {
        return this.bwGoUpPacketThresh;
    }

    public final double getBwGoUpRatio() {
        return this.bwGoUpRatio;
    }

    public final int getBwGoUpWindownSize() {
        return this.bwGoUpWindownSize;
    }

    public final double getBwLongPeriodAlpha() {
        return this.bwLongPeriodAlpha;
    }

    public final int getBwLongPeriodOpt() {
        return this.bwLongPeriodOpt;
    }

    public final int getBwLongPeriodQueueSize() {
        return this.bwLongPeriodQueueSize;
    }

    public final double getBwLongPeriodScore() {
        return this.bwLongPeriodScore;
    }

    public final int getBwStartUpOpt() {
        return this.bwStartUpOpt;
    }

    public final void setBitrateAdjustInterval(int i) {
        this.bitrateAdjustInterval = i;
    }

    public final void setBwAdjustStepOpt(int i) {
        this.bwAdjustStepOpt = i;
    }

    public final void setBwDropFrameRatio(double d) {
        this.bwDropFrameRatio = d;
    }

    public final void setBwGoDownBwThresh(int i) {
        this.bwGoDownBwThresh = i;
    }

    public final void setBwGoDownRatio(double d) {
        this.bwGoDownRatio = d;
    }

    public final void setBwGoDownScore(int i) {
        this.bwGoDownScore = i;
    }

    public final void setBwGoDownWindowSize(int i) {
        this.bwGoDownWindowSize = i;
    }

    public final void setBwGoUpBwThresh(int i) {
        this.bwGoUpBwThresh = i;
    }

    public final void setBwGoUpPacketThresh(int i) {
        this.bwGoUpPacketThresh = i;
    }

    public final void setBwGoUpRatio(double d) {
        this.bwGoUpRatio = d;
    }

    public final void setBwGoUpWindownSize(int i) {
        this.bwGoUpWindownSize = i;
    }

    public final void setBwLongPeriodAlpha(double d) {
        this.bwLongPeriodAlpha = d;
    }

    public final void setBwLongPeriodOpt(int i) {
        this.bwLongPeriodOpt = i;
    }

    public final void setBwLongPeriodQueueSize(int i) {
        this.bwLongPeriodQueueSize = i;
    }

    public final void setBwLongPeriodScore(double d) {
        this.bwLongPeriodScore = d;
    }

    public final void setBwStartUpOpt(int i) {
        this.bwStartUpOpt = i;
    }
}
