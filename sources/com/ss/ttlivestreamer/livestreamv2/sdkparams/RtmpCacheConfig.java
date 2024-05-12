package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;

/* loaded from: classes12.dex */
public final class RtmpCacheConfig {

    @Serialized("dns_timeout")
    public int dnsTimeout;

    @Serialized("drop_encode_fps")
    public boolean dropEncodeFps;

    @Serialized("getaddrinfo_opt")
    public int getaddrinfoOpt;

    @Serialized("max_fps_factor")
    public double maxFpsFactor;

    @Serialized("min_fps_factor")
    public double minFpsFactor;

    @Serialized("rtmps_noblock_io")
    public int rtmpsNoblockIo;

    @Serialized("bw_est_cfg")
    public final BwEstCfg rtmpBwEstCfg = new BwEstCfg();

    @Serialized("lw_reconnect_cfg")
    public final LWReconnectCfg rtmpReconnectCfg = new LWReconnectCfg();
    public int initVideoFps = Integer.MAX_VALUE;

    @Serialized("min_video_fps")
    public int minVideoFps = Integer.MAX_VALUE;

    @Serialized("max_video_fps")
    public int maxVideoFps = Integer.MAX_VALUE;

    @Serialized("max_interleave_delta")
    public int maxInterLeaveDelta = Integer.MAX_VALUE;

    @Serialized("drop_video_frame_threshold_I")
    public int dropVideoFrameThresholdI = Integer.MAX_VALUE;

    @Serialized("drop_video_frame_threshold_P")
    public int dropVideoFrameThresholdP = Integer.MAX_VALUE;

    @Serialized("drop_video_frame_threshold_B")
    public int dropVideoFrameThresholdB = Integer.MAX_VALUE;

    @Serialized("audio_send_stall_threshold")
    public int audioSendStallThreshold = Integer.MAX_VALUE;

    @Serialized("video_send_stall_threshold")
    public int videoSendStallThreshold = Integer.MAX_VALUE;

    @Serialized("log_interval_ms")
    public int logIntervalMS = Integer.MAX_VALUE;

    @Serialized("android_net_info_opt")
    public int androidNetInfoOpt = Integer.MAX_VALUE;

    @Serialized("enable_report_stall_log")
    public int enableReportStallLog = Integer.MAX_VALUE;

    @Serialized("use_pkt_inTime")
    public int usePktInTime = Integer.MAX_VALUE;

    @Serialized("enable_report_net_info")
    public int enablereportNetInfo = Integer.MAX_VALUE;

    @Serialized("enable_refactor_report_net_info")
    public int enableRefactorReportNetInfo = Integer.MAX_VALUE;

    @Serialized("enable_fps_adjust")
    public int enableFpsAdjust = Integer.MAX_VALUE;

    @Serialized("open_timeout")
    public int openTimeOut = Integer.MAX_VALUE;

    @Serialized("read_write_timeout")
    public int rwTimeOut = Integer.MAX_VALUE;

    @Serialized("rtmp_time_rotation")
    public int rtmpTimeRotation = Integer.MAX_VALUE;

    @Serialized("enable_rtmp_stopPoll")
    public int enableRtmpStopPoll = Integer.MAX_VALUE;

    @Serialized("enable_report_bw_time")
    public int enableReportBwTime = Integer.MAX_VALUE;

    @Serialized("bw_time_report_threshold")
    public int bwTimeReportThreshold = Integer.MAX_VALUE;

    @Serialized("bw_time_report_keep_win")
    public int bwTimeReportKeepWin = Integer.MAX_VALUE;

    @Serialized("disable_dns_parse_with_ip")
    public int disableDnsParseWithIp = Integer.MAX_VALUE;

    @Serialized("disable_drop_frame")
    public int disableDropFrame = Integer.MAX_VALUE;

    @Serialized("change_drop_frame_order")
    public int changeDropFrameOrder = Integer.MAX_VALUE;

    @Serialized("bw_keep_win_for_fps")
    public int bwKeepWinForFps = Integer.MAX_VALUE;

    @Serialized("chunk_send_opt")
    public int chunkSendOpt = Integer.MAX_VALUE;

    @Serialized("set_fps_opt")
    public int setFpsOpt = Integer.MAX_VALUE;

    public RtmpCacheConfig() {
        double d = NumberInit.UNDEFINED_DOUBLE_VALUE;
        this.maxFpsFactor = d;
        this.minFpsFactor = d;
        this.rtmpsNoblockIo = Integer.MAX_VALUE;
        this.getaddrinfoOpt = Integer.MAX_VALUE;
        this.dnsTimeout = Integer.MAX_VALUE;
    }

    public final int getAndroidNetInfoOpt() {
        return this.androidNetInfoOpt;
    }

    public final int getAudioSendStallThreshold() {
        return this.audioSendStallThreshold;
    }

    public final int getBwKeepWinForFps() {
        return this.bwKeepWinForFps;
    }

    public final int getBwTimeReportKeepWin() {
        return this.bwTimeReportKeepWin;
    }

    public final int getBwTimeReportThreshold() {
        return this.bwTimeReportThreshold;
    }

    public final int getChangeDropFrameOrder() {
        return this.changeDropFrameOrder;
    }

    public final int getChunkSendOpt() {
        return this.chunkSendOpt;
    }

    public final int getDisableDnsParseWithIp() {
        return this.disableDnsParseWithIp;
    }

    public final int getDisableDropFrame() {
        return this.disableDropFrame;
    }

    public final int getDnsTimeout() {
        return this.dnsTimeout;
    }

    public final boolean getDropEncodeFps() {
        return this.dropEncodeFps;
    }

    public final int getDropVideoFrameThresholdB() {
        return this.dropVideoFrameThresholdB;
    }

    public final int getDropVideoFrameThresholdI() {
        return this.dropVideoFrameThresholdI;
    }

    public final int getDropVideoFrameThresholdP() {
        return this.dropVideoFrameThresholdP;
    }

    public final int getEnableFpsAdjust() {
        return this.enableFpsAdjust;
    }

    public final int getEnableRefactorReportNetInfo() {
        return this.enableRefactorReportNetInfo;
    }

    public final int getEnableReportBwTime() {
        return this.enableReportBwTime;
    }

    public final int getEnableReportStallLog() {
        return this.enableReportStallLog;
    }

    public final int getEnableRtmpStopPoll() {
        return this.enableRtmpStopPoll;
    }

    public final int getEnablereportNetInfo() {
        return this.enablereportNetInfo;
    }

    public final int getGetaddrinfoOpt() {
        return this.getaddrinfoOpt;
    }

    public final int getInitVideoFps() {
        return this.initVideoFps;
    }

    public final int getLogIntervalMS() {
        return this.logIntervalMS;
    }

    public final double getMaxFpsFactor() {
        return this.maxFpsFactor;
    }

    public final int getMaxInterLeaveDelta() {
        return this.maxInterLeaveDelta;
    }

    public final int getMaxVideoFps() {
        return this.maxVideoFps;
    }

    public final double getMinFpsFactor() {
        return this.minFpsFactor;
    }

    public final int getMinVideoFps() {
        return this.minVideoFps;
    }

    public final int getOpenTimeOut() {
        return this.openTimeOut;
    }

    public final BwEstCfg getRtmpBwEstCfg() {
        return this.rtmpBwEstCfg;
    }

    public final LWReconnectCfg getRtmpReconnectCfg() {
        return this.rtmpReconnectCfg;
    }

    public final int getRtmpTimeRotation() {
        return this.rtmpTimeRotation;
    }

    public final int getRtmpsNoblockIo() {
        return this.rtmpsNoblockIo;
    }

    public final int getRwTimeOut() {
        return this.rwTimeOut;
    }

    public final int getSetFpsOpt() {
        return this.setFpsOpt;
    }

    public final int getUsePktInTime() {
        return this.usePktInTime;
    }

    public final int getVideoSendStallThreshold() {
        return this.videoSendStallThreshold;
    }

    public final void setAndroidNetInfoOpt(int i) {
        this.androidNetInfoOpt = i;
    }

    public final void setAudioSendStallThreshold(int i) {
        this.audioSendStallThreshold = i;
    }

    public final void setBwKeepWinForFps(int i) {
        this.bwKeepWinForFps = i;
    }

    public final void setBwTimeReportKeepWin(int i) {
        this.bwTimeReportKeepWin = i;
    }

    public final void setBwTimeReportThreshold(int i) {
        this.bwTimeReportThreshold = i;
    }

    public final void setChangeDropFrameOrder(int i) {
        this.changeDropFrameOrder = i;
    }

    public final void setChunkSendOpt(int i) {
        this.chunkSendOpt = i;
    }

    public final void setDisableDnsParseWithIp(int i) {
        this.disableDnsParseWithIp = i;
    }

    public final void setDisableDropFrame(int i) {
        this.disableDropFrame = i;
    }

    public final void setDnsTimeout(int i) {
        this.dnsTimeout = i;
    }

    public final void setDropEncodeFps(boolean z) {
        this.dropEncodeFps = z;
    }

    public final void setDropVideoFrameThresholdB(int i) {
        this.dropVideoFrameThresholdB = i;
    }

    public final void setDropVideoFrameThresholdI(int i) {
        this.dropVideoFrameThresholdI = i;
    }

    public final void setDropVideoFrameThresholdP(int i) {
        this.dropVideoFrameThresholdP = i;
    }

    public final void setEnableFpsAdjust(int i) {
        this.enableFpsAdjust = i;
    }

    public final void setEnableRefactorReportNetInfo(int i) {
        this.enableRefactorReportNetInfo = i;
    }

    public final void setEnableReportBwTime(int i) {
        this.enableReportBwTime = i;
    }

    public final void setEnableReportStallLog(int i) {
        this.enableReportStallLog = i;
    }

    public final void setEnableRtmpStopPoll(int i) {
        this.enableRtmpStopPoll = i;
    }

    public final void setEnablereportNetInfo(int i) {
        this.enablereportNetInfo = i;
    }

    public final void setGetaddrinfoOpt(int i) {
        this.getaddrinfoOpt = i;
    }

    public final void setInitVideoFps(int i) {
        this.initVideoFps = i;
    }

    public final void setLogIntervalMS(int i) {
        this.logIntervalMS = i;
    }

    public final void setMaxFpsFactor(double d) {
        this.maxFpsFactor = d;
    }

    public final void setMaxInterLeaveDelta(int i) {
        this.maxInterLeaveDelta = i;
    }

    public final void setMaxVideoFps(int i) {
        this.maxVideoFps = i;
    }

    public final void setMinFpsFactor(double d) {
        this.minFpsFactor = d;
    }

    public final void setMinVideoFps(int i) {
        this.minVideoFps = i;
    }

    public final void setOpenTimeOut(int i) {
        this.openTimeOut = i;
    }

    public final void setRtmpTimeRotation(int i) {
        this.rtmpTimeRotation = i;
    }

    public final void setRtmpsNoblockIo(int i) {
        this.rtmpsNoblockIo = i;
    }

    public final void setRwTimeOut(int i) {
        this.rwTimeOut = i;
    }

    public final void setSetFpsOpt(int i) {
        this.setFpsOpt = i;
    }

    public final void setUsePktInTime(int i) {
        this.usePktInTime = i;
    }

    public final void setVideoSendStallThreshold(int i) {
        this.videoSendStallThreshold = i;
    }
}
