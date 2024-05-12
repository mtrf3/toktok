package com.ss.lens.algorithm;

import X.C16880lQ;
import X.V0N;

/* loaded from: classes12.dex */
public class SmartCodec {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native SmartCodecResult nativeGetSmartCodecBufferOutput(long j, SmartCodecResult smartCodecResult);

    private native SmartCodecResult nativeGetSmartCodecGLOutput(long j, SmartCodecResult smartCodecResult);

    private native long nativeInitSmartCodec(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, String str, String str2, String str3, boolean z);

    private native void nativeReleaseSmartCodec(long j);

    private native int nativeSmartCodecBufferProcess(long j, byte[] bArr, int i, int i2, float f, float f2, int i3);

    private native int nativeSmartCodecGLProcess(long j, int i, int i2, int i3, float[] fArr, float f, float f2, int i4);

    public void ReleaseSmartCodec() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseSmartCodec(j);
        this.mNativePtr = 0L;
    }

    /* loaded from: classes9.dex */
    public enum InputMode {
        UNKNOWN,
        SURFACE_RGBA,
        BUFFER_YUV,
        BUFFER_RGBA;

        public static InputMode valueOf(String str) {
            return (InputMode) V0N.LJJJ(InputMode.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum Preset {
        SLOW,
        MEDIUM,
        FAST;

        public static Preset valueOf(String str) {
            return (Preset) V0N.LJJJ(Preset.class, str);
        }
    }

    public SmartCodecResult GetSmartCodecBufferOutput(SmartCodecResult smartCodecResult) {
        long j = this.mNativePtr;
        if (j == 0) {
            return smartCodecResult;
        }
        return nativeGetSmartCodecBufferOutput(j, smartCodecResult);
    }

    public SmartCodecResult GetSmartCodecGLOutput(SmartCodecResult smartCodecResult) {
        long j = this.mNativePtr;
        if (j == 0) {
            return smartCodecResult;
        }
        return nativeGetSmartCodecGLOutput(j, smartCodecResult);
    }

    public int SmartCodecBufferProcess(byte[] bArr, int i, int i2, int i3, float f, float f2, int i4) {
        long j = this.mNativePtr;
        if (j == 0 || i <= 0 || i2 <= 0) {
            return -1;
        }
        return nativeSmartCodecBufferProcess(j, bArr, i, i2, f, f2, i4);
    }

    public int SmartCodecProcess(int i, int i2, int i3, float[] fArr, float f, float f2, int i4) {
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeSmartCodecGLProcess(j, i, i2, i3, fArr, f, f2, i4);
    }

    public synchronized boolean InitSmartCodec(int i, int i2, int i3, int i4, float f, int i5, Preset preset, InputMode inputMode, String str, String str2, boolean z, String str3) {
        if (!isLibLoaded) {
            try {
                C16880lQ.LLJJJIL("c++_shared");
                C16880lQ.LLJJJIL("bytenn");
                C16880lQ.LLJJJIL("fastcv");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                C16880lQ.LLJJJIL("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        long nativeInitSmartCodec = nativeInitSmartCodec(i2, i, i4, i3, f, i5, preset.ordinal(), inputMode.ordinal(), str, str2, str3, z);
        this.mNativePtr = nativeInitSmartCodec;
        if (nativeInitSmartCodec == 0) {
            return false;
        }
        return true;
    }
}
