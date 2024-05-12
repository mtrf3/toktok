package com.bef.effectsdk.game;

import X.C16880lQ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class NativeInterface {
    public static final List<String> list;

    /* loaded from: classes.dex */
    public interface NativeMessageListener {
        int nativeOnMsgReceived(long j, long j2, long j3, String str);
    }

    public static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native void nativeCreateHandle(long[] jArr);

    public static native int nativeDestroy(long j);

    public static native int nativeInit(long j, int i, int i2);

    public static native int nativePause(long j);

    public static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    public static native int nativeProcess(long j, int i, int i2, double d);

    public static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native int nativeResume(long j);

    public static native int nativeSetSize(long j, int i, int i2);

    public static native int nativeSetStickerPath(long j, String str);

    public static native int nativeTouchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2);

    public static native int nativeTouchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2);

    public static native int nativeTouchesMove(long j, int[] iArr, float[] fArr, float[] fArr2);

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

    public static void createHandle(long[] jArr) {
        nativeCreateHandle(jArr);
    }

    public static int destroy(long j) {
        return nativeDestroy(j);
    }

    public static int pause(long j) {
        return nativePause(j);
    }

    public static int resume(long j) {
        return nativeResume(j);
    }

    public static int addMessageListener(long j, NativeMessageListener nativeMessageListener) {
        return nativeAddMessageListener(j, nativeMessageListener);
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        return nativeRemoveMessageListener(j, nativeMessageListener);
    }

    public static int setGameBundlePath(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    public static int init(long j, int i, int i2) {
        return nativeInit(j, i, i2);
    }

    public static int setSize(long j, int i, int i2) {
        return nativeSetSize(j, i, i2);
    }

    public static int processFrame(long j, int i, int i2, double d) {
        return nativeProcess(j, i, i2, d);
    }

    public static int touchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesBegin(j, iArr, fArr, fArr2);
    }

    public static int touchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesEnd(j, iArr, fArr, fArr2);
    }

    public static int touchesMove(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesMove(j, iArr, fArr, fArr2);
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        return nativePostMessage(j, j2, j3, j4, str);
    }
}
