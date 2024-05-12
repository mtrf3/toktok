package com.ss.bytertc.engine;

import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes33.dex */
public class InternalRTCStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public int rxBytes;
    public int rxCellularKBitrate;
    public int rxJitter;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxScreenKBitRate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public int txBytes;
    public int txCellularKBitrate;
    public int txJitter;
    public int txKBitRate;
    public double txLostrate;
    public int txScreenKBitRate;
    public int txVideoKBitRate;
    public int users;

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0;
        this.rxBytes = 0;
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
        this.rxLostrate = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.txLostrate = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.rtt = 0;
        this.txJitter = 0;
        this.rxJitter = 0;
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
        LIZ.append(", txCellularKBitrate=");
        LIZ.append(this.txCellularKBitrate);
        LIZ.append(", rxCellularKBitrate=");
        LIZ.append(this.rxCellularKBitrate);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public InternalRTCStats() {
    }

    public InternalRTCStats(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, double d, double d2, double d3, double d4, int i13, int i14, int i15, int i16, int i17) {
        this.totalDuration = i;
        this.txBytes = i2;
        this.rxBytes = i3;
        this.txKBitRate = i4;
        this.rxKBitRate = i5;
        this.txAudioKBitRate = i6;
        this.rxAudioKBitRate = i7;
        this.txVideoKBitRate = i8;
        this.rxVideoKBitRate = i9;
        this.txScreenKBitRate = i10;
        this.rxScreenKBitRate = i11;
        this.users = i12;
        this.cpuTotalUsage = d;
        this.cpuAppUsage = d2;
        this.rxLostrate = d4;
        this.txLostrate = d3;
        this.rtt = i13;
        this.txJitter = i14;
        this.rxJitter = i15;
        this.txCellularKBitrate = i16;
        this.rxCellularKBitrate = i17;
    }

    public static InternalRTCStats create(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, double d, double d2, double d3, double d4, int i13, int i14, int i15, int i16, int i17) {
        return new InternalRTCStats(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, d, d2, d3, d4, i13, i14, i15, i16, i17);
    }
}
