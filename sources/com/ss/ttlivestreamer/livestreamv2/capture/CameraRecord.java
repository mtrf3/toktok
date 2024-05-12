package com.ss.ttlivestreamer.livestreamv2.capture;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes12.dex */
public class CameraRecord {
    public static final Object mFpsLock = new Object();
    public static double mStageCameraFpsSum = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public static int mCameraFpsCount = 0;
    public static final Object mExposureTimeLock = new Object();
    public static double mStageExposureTimeSum = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public static int mExposureTimeCount = 0;

    public static void clearCameraFps() {
        synchronized (mFpsLock) {
            mStageCameraFpsSum = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            mCameraFpsCount = 0;
        }
    }

    public static void clearExposureTime() {
        synchronized (mExposureTimeLock) {
            mStageExposureTimeSum = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            mExposureTimeCount = 0;
        }
    }

    public static long getAvgExposureTime() {
        long j;
        if (mExposureTimeCount <= 0) {
            return 0L;
        }
        synchronized (mExposureTimeLock) {
            j = (long) (mStageExposureTimeSum / mExposureTimeCount);
        }
        return j;
    }

    public static double getAvgFps() {
        double d;
        if (mCameraFpsCount <= 0) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        synchronized (mFpsLock) {
            d = mStageCameraFpsSum / mCameraFpsCount;
        }
        return d;
    }

    public static void addExposureTimeRecord(long j) {
        synchronized (mExposureTimeLock) {
            double d = mStageExposureTimeSum + j;
            mStageExposureTimeSum = d;
            int i = mExposureTimeCount + 1;
            mExposureTimeCount = i;
            if (i > 50) {
                mStageExposureTimeSum = d / i;
                mExposureTimeCount = 1;
            }
        }
    }

    public static void addFpsRecord(double d) {
        synchronized (mFpsLock) {
            double d2 = mStageCameraFpsSum + d;
            mStageCameraFpsSum = d2;
            int i = mCameraFpsCount + 1;
            mCameraFpsCount = i;
            if (i > 100) {
                mStageCameraFpsSum = d2 / i;
                mCameraFpsCount = 1;
            }
        }
    }
}
