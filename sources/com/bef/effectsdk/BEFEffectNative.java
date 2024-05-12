package com.bef.effectsdk;

import X.C16880lQ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BEFEffectNative {
    public static final List<String> list;

    public static native long nativeCreateHandle(boolean z);

    public static native int nativeDestroyHandle(long j);

    public static native String nativeGetEffectSDKVersion();

    public static native int nativeInitResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str);

    public static native int nativeProcessAlgorithm(long j, int i, int i2, int i3, double d);

    public static native int nativeProcessFrame(long j, int i, int i2, int i3, int i4, double d);

    public static native int nativeReleaseResourceFinder(long j, ResourceFinder resourceFinder);

    public static native int nativeSendMessage(long j, long j2, long j3, long j4, String str);

    public static native void nativeSetCameraPosition(long j, boolean z);

    public static native void nativeSetFrameOrientation(long j, int i);

    public static native void nativeSetOrientation(long j, int i);

    public static native int nativeSetStickerPath(long j, String str);

    public static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    static {
        List<String> asList = Arrays.asList("effect");
        list = asList;
        try {
            Iterator<String> it = asList.iterator();
            while (it.hasNext()) {
                C16880lQ.LLJJJIL(it.next());
            }
        } catch (Throwable unused) {
        }
    }

    public static String getEffectSDKVersion() {
        return nativeGetEffectSDKVersion();
    }

    public static long createHandle(boolean z) {
        return nativeCreateHandle(z);
    }

    public static int destroyHandle(long j) {
        return nativeDestroyHandle(j);
    }

    public static int releaseResourceFinder(long j, ResourceFinder resourceFinder) {
        return nativeReleaseResourceFinder(j, resourceFinder);
    }

    public static void setCameraPosition(long j, boolean z) {
        nativeSetCameraPosition(j, z);
    }

    public static void setFrameOrientation(long j, int i) {
        nativeSetFrameOrientation(j, i);
    }

    public static void setOrientation(long j, int i) {
        nativeSetOrientation(j, i);
    }

    public static int setStickerPath(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 0, iArr, fArr, fArr2);
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 2, iArr, fArr, fArr2);
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 1, iArr, fArr, fArr2);
    }

    public static int initResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str) {
        return nativeInitResourceFinder(j, resourceFinder, i, i2, str);
    }

    public static int processAlgorithm(long j, int i, int i2, int i3, double d) {
        return nativeProcessAlgorithm(j, i, i2, i3, d);
    }

    public static int sendMessage(long j, long j2, long j3, long j4, String str) {
        return nativeSendMessage(j, j2, j3, j4, str);
    }

    public static int processFrame(long j, int i, int i2, int i3, int i4, double d) {
        return nativeProcessFrame(j, i, i2, i3, i4, d);
    }
}
