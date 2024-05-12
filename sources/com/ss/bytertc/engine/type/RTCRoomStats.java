package com.ss.bytertc.engine.type;

import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.bytertc.engine.InternalRTCStats;

/* loaded from: classes33.dex */
public class RTCRoomStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public long rxBytes;
    public int rxCellularKBitrate;
    public int rxJitter;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxScreenKBitRate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public long txBytes;
    public int txCellularKBitrate;
    public int txJitter;
    public int txKBitRate;
    public double txLostrate;
    public int txScreenKBitRate;
    public int txVideoKBitRate;
    public int users;

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0L;
        this.rxBytes = 0L;
        this.txKBitRate = 0;
        this.rxKBitRate = 0;
        this.txAudioKBitRate = 0;
        this.rxAudioKBitRate = 0;
        this.txVideoKBitRate = 0;
        this.rxVideoKBitRate = 0;
        this.txScreenKBitRate = 0;
        this.rxScreenKBitRate = 0;
        this.users = 0;
        this.cpuTotalUsage = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.cpuAppUsage = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.txJitter = 0;
        this.rxJitter = 0;
        this.txLostrate = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.rxLostrate = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.rtt = 0;
        this.txCellularKBitrate = 0;
        this.rxCellularKBitrate = 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RtcStats{totalDuration=");
        LIZ.append(this.totalDuration);
        LIZ.append(", txBytes=");
        LIZ.append(this.txBytes);
        LIZ.append(", rxBytes=");
        LIZ.append(this.rxBytes);
        LIZ.append(", txKBitRate=");
        LIZ.append(this.txKBitRate);
        LIZ.append(", rxKBitRate=");
        LIZ.append(this.rxKBitRate);
        LIZ.append(", txAudioKBitRate=");
        LIZ.append(this.txAudioKBitRate);
        LIZ.append(", rxAudioKBitRate=");
        LIZ.append(this.rxAudioKBitRate);
        LIZ.append(", txVideoKBitRate=");
        LIZ.append(this.txVideoKBitRate);
        LIZ.append(", rxVideoKBitRate=");
        LIZ.append(this.rxVideoKBitRate);
        LIZ.append(", txScreenKBitRate=");
        LIZ.append(this.txScreenKBitRate);
        LIZ.append(", rxScreenKBitRate=");
        LIZ.append(this.rxScreenKBitRate);
        LIZ.append(", users=");
        LIZ.append(this.users);
        LIZ.append(", cpuTotalUsage=");
        LIZ.append(this.cpuTotalUsage);
        LIZ.append(", cpuAppUsage=");
        LIZ.append(this.cpuAppUsage);
        LIZ.append(", txLostrate=");
        LIZ.append(this.txLostrate);
        LIZ.append(", rxLostrate=");
        LIZ.append(this.rxLostrate);
        LIZ.append(", rtt=");
        LIZ.append(this.rtt);
        LIZ.append(", txJitter=");
        LIZ.append(this.txJitter);
        LIZ.append(", rxJitter=");
        LIZ.append(this.rxJitter);
        LIZ.append(", txCellularKBitRate=");
        LIZ.append(this.txCellularKBitrate);
        LIZ.append(", rxCellularKBitRate=");
        LIZ.append(this.rxCellularKBitrate);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public RTCRoomStats() {
    }

    public RTCRoomStats(InternalRTCStats internalRTCStats) {
        this.totalDuration = internalRTCStats.totalDuration;
        this.txBytes = internalRTCStats.txBytes;
        this.rxBytes = internalRTCStats.rxBytes;
        this.txKBitRate = internalRTCStats.txKBitRate;
        this.rxKBitRate = internalRTCStats.rxKBitRate;
        this.txAudioKBitRate = internalRTCStats.txAudioKBitRate;
        this.rxAudioKBitRate = internalRTCStats.rxAudioKBitRate;
        this.txVideoKBitRate = internalRTCStats.txVideoKBitRate;
        this.rxVideoKBitRate = internalRTCStats.rxVideoKBitRate;
        this.txScreenKBitRate = internalRTCStats.txScreenKBitRate;
        this.rxScreenKBitRate = internalRTCStats.rxScreenKBitRate;
        this.users = internalRTCStats.users;
        this.cpuTotalUsage = internalRTCStats.cpuTotalUsage;
        this.cpuAppUsage = internalRTCStats.cpuAppUsage;
        this.txLostrate = internalRTCStats.txLostrate;
        this.rxLostrate = internalRTCStats.rxLostrate;
        this.rtt = internalRTCStats.rtt;
        this.txJitter = internalRTCStats.txJitter;
        this.rxJitter = internalRTCStats.rxJitter;
        this.txCellularKBitrate = internalRTCStats.txCellularKBitrate;
        this.rxCellularKBitrate = internalRTCStats.rxCellularKBitrate;
    }
}
