package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class SwitchParams {

    @Serialized("perfAwareSwitch")
    public boolean perfAwareSwitch;

    @Serialized("rtmNetReport")
    public boolean rtmNetReport;

    @Serialized("rtmSendPacketProtect")
    public int rtmSendPacketProtect;

    @Serialized("rtsEnableDtls")
    public boolean rtsEnableDtls;

    @Serialized("IMPerfAlarm")
    public boolean imPerfAlarm = true;

    @Serialized("rtmNetPoorLos")
    public double rtmNetPoorLos = 0.1d;

    @Serialized("rtmNetBadLos")
    public double rtmNetBadLos = 0.3d;

    @Serialized("rtmNetPoorRtt")
    public int rtmNetPoorRtt = LiveChatShowDelayForHotLiveSetting.DEFAULT;

    @Serialized("rtmNetBadRtt")
    public int rtmNetBadRtt = 700;

    @Serialized("rtmNetPoorInterval")
    public int rtmNetPoorInterval = 2;

    @Serialized("rtmNetBadInterval")
    public int rtmNetBadInterval = 5;

    @Serialized("disableLiveCoreBinLog")
    public boolean disableLiveCoreBinLog = true;

    @Serialized("logLevel")
    public int logLevel = 5;

    @Serialized("StatisticsType")
    public int statisticsType = 2;

    @Serialized("EstRateStatisticsType")
    public int estRateStatisticsType = 2;

    public final boolean getDisableLiveCoreBinLog() {
        return this.disableLiveCoreBinLog;
    }

    public final int getEstRateStatisticsType() {
        return this.estRateStatisticsType;
    }

    public final boolean getImPerfAlarm() {
        return this.imPerfAlarm;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public final boolean getPerfAwareSwitch() {
        return this.perfAwareSwitch;
    }

    public final int getRtmNetBadInterval() {
        return this.rtmNetBadInterval;
    }

    public final double getRtmNetBadLos() {
        return this.rtmNetBadLos;
    }

    public final int getRtmNetBadRtt() {
        return this.rtmNetBadRtt;
    }

    public final int getRtmNetPoorInterval() {
        return this.rtmNetPoorInterval;
    }

    public final double getRtmNetPoorLos() {
        return this.rtmNetPoorLos;
    }

    public final int getRtmNetPoorRtt() {
        return this.rtmNetPoorRtt;
    }

    public final boolean getRtmNetReport() {
        return this.rtmNetReport;
    }

    public final int getRtmSendPacketProtect() {
        return this.rtmSendPacketProtect;
    }

    public final boolean getRtsEnableDtls() {
        return this.rtsEnableDtls;
    }

    public final int getStatisticsType() {
        return this.statisticsType;
    }

    public final void setDisableLiveCoreBinLog(boolean z) {
        this.disableLiveCoreBinLog = z;
    }

    public final void setEstRateStatisticsType(int i) {
        this.estRateStatisticsType = i;
    }

    public final void setImPerfAlarm(boolean z) {
        this.imPerfAlarm = z;
    }

    public final void setLogLevel(int i) {
        this.logLevel = i;
    }

    public final void setPerfAwareSwitch(boolean z) {
        this.perfAwareSwitch = z;
    }

    public final void setRtmNetBadInterval(int i) {
        this.rtmNetBadInterval = i;
    }

    public final void setRtmNetBadLos(double d) {
        this.rtmNetBadLos = d;
    }

    public final void setRtmNetBadRtt(int i) {
        this.rtmNetBadRtt = i;
    }

    public final void setRtmNetPoorInterval(int i) {
        this.rtmNetPoorInterval = i;
    }

    public final void setRtmNetPoorLos(double d) {
        this.rtmNetPoorLos = d;
    }

    public final void setRtmNetPoorRtt(int i) {
        this.rtmNetPoorRtt = i;
    }

    public final void setRtmNetReport(boolean z) {
        this.rtmNetReport = z;
    }

    public final void setRtmSendPacketProtect(int i) {
        this.rtmSendPacketProtect = i;
    }

    public final void setRtsEnableDtls(boolean z) {
        this.rtsEnableDtls = z;
    }

    public final void setStatisticsType(int i) {
        this.statisticsType = i;
    }
}
