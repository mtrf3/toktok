package com.ss.android.vesdk;

import X.C1I0;
import X.C7MY;
import X.P4Q;
import X.X1D;
import com.ss.android.ttve.nativePort.TEVideoUtils;

/* loaded from: classes3.dex */
public class VECurveSpeedUtils {
    public double mAveSpeed;
    public float[] mCurveSpeedPointX;
    public float[] mCurveSpeedPointY;
    public volatile long mNative;

    public synchronized void destroy() {
        P4Q.LJFF("VECurveSpeedUtils", "destroy...");
        if (this.mNative == 0) {
            P4Q.LIZJ("VECurveSpeedUtils", "destroy, mNative == 0");
        } else {
            TEVideoUtils.nativeCurveSpeedDestroy(this.mNative);
            this.mNative = 0L;
        }
    }

    public double getAveCurveSpeed() {
        if (this.mNative == 0) {
            P4Q.LIZJ("VECurveSpeedUtils", "getAveCurveSpeed, mNative == 0");
            return -112.0d;
        }
        double nativeGetAveCurveSpeed = TEVideoUtils.nativeGetAveCurveSpeed(this.mNative);
        this.mAveSpeed = nativeGetAveCurveSpeed;
        return nativeGetAveCurveSpeed;
    }

    public double getCurveSpeedWithSeqDelta(long j) {
        if (this.mNative == 0) {
            P4Q.LIZJ("VECurveSpeedUtils", "getCurveSpeedWithSeqDelta, mNative == 0");
            return -112.0d;
        }
        return TEVideoUtils.nativeGetCurveSpeedWithSeqDelta(this.mNative, j * 1000);
    }

    public long mapSeqDeltaToTrimDelta(long j) {
        if (this.mNative == 0) {
            P4Q.LIZJ("VECurveSpeedUtils", "mapSeqDeltaToTrimDelta, mNative == 0");
            return -112L;
        }
        return TEVideoUtils.nativeMapSeqDeltaToTrimDelta(this.mNative, j * 1000) / 1000;
    }

    public long mapTrimDeltaToSeqDelta(long j) {
        if (this.mNative == 0) {
            P4Q.LIZJ("VECurveSpeedUtils", "mapTrimDeltaToSeqDelta, mNative == 0");
            return -112L;
        }
        return TEVideoUtils.nativeMapTrimDeltaToSeqDelta(this.mNative, j * 1000) / 1000;
    }

    public void setSeqDuration(long j) {
        if (this.mNative == 0) {
            P4Q.LIZJ("VECurveSpeedUtils", "setSeqDuration, mNative == 0");
        } else {
            TEVideoUtils.nativeSetSeqDuration(this.mNative, j * 1000);
        }
    }

    public VECurveSpeedUtils(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            this.mNative = 0L;
            P4Q.LIZJ("VECurveSpeedUtils", "incorrect curve anchors, mNative == 0");
            return;
        }
        this.mNative = TEVideoUtils.nativeCreateCurveSpeedUtils(fArr, fArr2);
        this.mCurveSpeedPointX = fArr;
        this.mCurveSpeedPointY = fArr2;
        int curveSpeed = setCurveSpeed(fArr, fArr2);
        double aveCurveSpeed = getAveCurveSpeed();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECurveSpeedUtils ret1 ");
        LIZ.append(curveSpeed);
        LIZ.append(" ret2 ");
        LIZ.append(aveCurveSpeed);
        P4Q.LIZ("VECurveSpeedUtils", X1D.LIZIZ(LIZ));
    }

    public static float[] transferTrimPointXtoSeqPointX(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float[] fArr3 = new float[length];
        int i = 0;
        float f = 0.0f;
        fArr3[0] = 0.0f;
        while (i < length - 1) {
            int i2 = i + 1;
            f = C1I0.LIZ(fArr[i2], fArr[i], (fArr2[i2] + fArr2[i]) * 0.5f, f);
            fArr3[i2] = f;
            i = i2;
        }
        for (int i3 = 1; i3 < length; i3++) {
            fArr3[i3] = fArr3[i3] / f;
            StringBuilder LJ = C7MY.LJ("transferTrimPointXtoSeqPointX SeqPointX[", i3, "]= ");
            LJ.append(fArr3[i3]);
            P4Q.LIZ("TAG", X1D.LIZIZ(LJ));
        }
        return fArr3;
    }

    public int setCurveSpeed(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            P4Q.LIZJ("VECurveSpeedUtils", "setCurveSpeed,incorrect curve anchors, mNative == 0");
            return -100;
        }
        if (this.mNative == 0) {
            P4Q.LIZJ("VECurveSpeedUtils", "setCurveSpeed, mNative == 0");
            return -112;
        }
        return TEVideoUtils.nativeSetCurveSpeedData(this.mNative, fArr, fArr2);
    }
}
