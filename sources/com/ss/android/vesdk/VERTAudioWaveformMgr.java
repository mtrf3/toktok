package com.ss.android.vesdk;

import X.C15890jp;
import X.C22510uV;
import X.P4Q;
import X.X1D;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.lang.reflect.Array;

/* loaded from: classes15.dex */
public class VERTAudioWaveformMgr {
    public final int mAudioFormat;
    public final int mChannelNum;
    public long mNative;

    public int destroy() {
        long j = this.mNative;
        if (j == 0) {
            P4Q.LIZJ("VERTAudioWaveformMgr", "destroy, mNative == 0");
            return -112;
        }
        int nativeDeleteRTAudioWaveformMgr = TEVideoUtils.nativeDeleteRTAudioWaveformMgr(j);
        this.mNative = 0L;
        return nativeDeleteRTAudioWaveformMgr;
    }

    public int finish() {
        long j = this.mNative;
        if (j == 0) {
            P4Q.LIZJ("VERTAudioWaveformMgr", "finish, mNative == 0");
            return -112;
        }
        return TEVideoUtils.nativeRTAudioWaveformFinish(j);
    }

    public int reset() {
        long j = this.mNative;
        if (j == 0) {
            P4Q.LIZJ("VERTAudioWaveformMgr", "reset, mNative == 0");
            return -112;
        }
        return TEVideoUtils.nativeRTAudioWaveformReset(j);
    }

    public int getRemainedPoints(float[] fArr, int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            P4Q.LIZJ("VERTAudioWaveformMgr", "getRemainedPoints, mNative == 0");
            return -112;
        }
        return TEVideoUtils.nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
    }

    public int process(short[] sArr, int i, int i2) {
        if (this.mNative == 0) {
            P4Q.LIZJ("VERTAudioWaveformMgr", "process, mNative == 0");
            return -112;
        }
        int i3 = this.mChannelNum;
        if (i3 < 0 || i2 < 0 || i2 * i3 > sArr.length - i || this.mAudioFormat != 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("process param error mChannelNum ");
            LIZ.append(this.mChannelNum);
            LIZ.append(", bufSize ");
            C15890jp.LIZIZ(LIZ, sArr.length, ", offset ", i, ", frameNum ");
            LIZ.append(i2);
            LIZ.append(", mAudioFormat ");
            LIZ.append(this.mAudioFormat);
            P4Q.LIZJ("VERTAudioWaveformMgr", X1D.LIZIZ(LIZ));
            return -100;
        }
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i3, i2);
        int i4 = 0;
        while (true) {
            int i5 = this.mChannelNum;
            if (i4 < i5) {
                for (int i6 = 0; i6 < i2; i6++) {
                    fArr[i4][i6] = sArr[C22510uV.LIZ(this.mChannelNum, i6, i4, i)] / 32767.0f;
                }
                i4++;
            } else {
                return TEVideoUtils.nativeRTAudioWaveformProcess(this.mNative, fArr, i5, i2);
            }
        }
    }

    public int process(float[] fArr, int i, int i2) {
        if (this.mNative == 0) {
            P4Q.LIZJ("VERTAudioWaveformMgr", "process, mNative == 0");
            return -112;
        }
        int i3 = this.mChannelNum;
        if (i3 < 0 || i2 < 0 || i2 * i3 > fArr.length - i || this.mAudioFormat != 4) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("process param error mChannelNum ");
            LIZ.append(this.mChannelNum);
            LIZ.append(", bufSize ");
            C15890jp.LIZIZ(LIZ, fArr.length, ", offset ", i, ", frameNum ");
            LIZ.append(i2);
            LIZ.append(", mAudioFormat ");
            LIZ.append(this.mAudioFormat);
            P4Q.LIZJ("VERTAudioWaveformMgr", X1D.LIZIZ(LIZ));
            return -100;
        }
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i3, i2);
        int i4 = 0;
        while (true) {
            int i5 = this.mChannelNum;
            if (i4 < i5) {
                for (int i6 = 0; i6 < i2; i6++) {
                    fArr2[i4][i6] = fArr[C22510uV.LIZ(this.mChannelNum, i6, i4, i)];
                }
                i4++;
            } else {
                return TEVideoUtils.nativeRTAudioWaveformProcess(this.mNative, fArr2, i5, i2);
            }
        }
    }

    public VERTAudioWaveformMgr(int i, int i2, int i3, float f, int i4) {
        this.mNative = TEVideoUtils.nativeCreateRTAudioWaveformMgr(i2, i3, f, i4);
        this.mChannelNum = i2;
        this.mAudioFormat = i;
    }
}
