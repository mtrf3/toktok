package com.facebook.animated.gif;

import X.AbstractC81863WAx;
import X.C32151Nz;
import X.C81713W5d;
import X.C81796W8i;
import X.C81810W8w;
import X.C81828W9o;
import X.C81840WAa;
import X.InterfaceC81845WAf;
import X.WA7;
import X.WAY;
import X.WAZ;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public class GifImage extends AbstractC81863WAx implements InterfaceC81845WAf {
    public static volatile boolean sInitialized;
    public long mNativeContext;

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // X.WA7
    public boolean doesRenderSupportScaling() {
        return false;
    }

    public static synchronized void ensure() {
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                C81713W5d.LIZ("gifimage");
            }
        }
    }

    @Override // X.WA7
    public int getDuration() {
        return nativeGetDuration();
    }

    @Override // X.WA7
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // X.WA7
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // X.WA7
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.WA7
    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // X.WA7
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.WA7
    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }

    public GifImage() {
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.WA7
    public C81828W9o getImageFormat() {
        return C81796W8i.LIZJ;
    }

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public static GifImage createFromByteArray(byte[] bArr) {
        bArr.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return createFromByteBuffer(allocateDirect, C81810W8w.LJIILIIL);
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer) {
        return createFromByteBuffer(byteBuffer, C81810W8w.LJIILIIL);
    }

    public static WAY fromGifDisposalMethod(int i) {
        if (i == 0) {
            return WAY.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return WAY.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return WAY.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return WAY.DISPOSE_TO_PREVIOUS;
        }
        return WAY.DISPOSE_DO_NOT;
    }

    @Override // X.InterfaceC81845WAf
    public WA7 decode(ByteBuffer byteBuffer) {
        return createFromByteBuffer(byteBuffer, null);
    }

    @Override // X.WA7
    public C81840WAa getFrameInfo(int i) {
        GifFrame frame = getFrame(i);
        try {
            return new C81840WAa(frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), WAZ.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.LIZ()));
        } finally {
            frame.dispose();
        }
    }

    @Override // X.WA7
    public GifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer, C81810W8w c81810W8w) {
        ensure();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
    }

    public static GifImage createFromFileDescriptor(int i, C81810W8w c81810W8w) {
        ensure();
        return nativeCreateFromFileDescriptor(i, Integer.MAX_VALUE, false);
    }

    @Override // X.InterfaceC81845WAf
    public WA7 decode(long j, int i) {
        return createFromNativeMemory(j, i, null);
    }

    public static GifImage createFromNativeMemory(long j, int i, C81810W8w c81810W8w) {
        boolean z;
        ensure();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        return nativeCreateFromNativeMemory(j, i, 65534, false);
    }
}
