package com.ss.android.ttve.nativePort;

import X.P5A;
import X.P5D;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes12.dex */
public class TEVideoUtilsCallback {
    public P5D frameDataListener;
    public P5A frameListener;

    public P5A getFrameAvailableListener() {
        return this.frameListener;
    }

    public static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void setFrameDataListener(Object obj) {
        this.frameDataListener = (P5D) obj;
    }

    public void setListener(Object obj) {
        this.frameListener = (P5A) obj;
    }

    public static ByteBuffer allocateFrame(int i, int i2) {
        return ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean onFrameAvailable(ByteBuffer byteBuffer, int i, int i2, int i3) {
        P5A p5a = this.frameListener;
        if (p5a != null && p5a.processFrame(byteBuffer, i, i2, i3)) {
            return true;
        }
        return false;
    }

    public static boolean onFrameAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        P5A p5a;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (p5a = tEVideoUtilsCallback.frameListener) == null || !p5a.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable2(Object obj, byte[] bArr, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        P5A p5a;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (p5a = tEVideoUtilsCallback.frameListener) == null || !p5a.processFrame(ByteBuffer.wrap(bArr), i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameDataAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        P5D p5d;
        if ((obj instanceof TEVideoUtilsCallback) && (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) != null && (p5d = tEVideoUtilsCallback.frameDataListener) != null && p5d.LIZ()) {
            return true;
        }
        return false;
    }
}
