package com.facebook.animated.webp;

import X.AbstractC81863WAx;
import X.C32151Nz;
import X.C81796W8i;
import X.C81828W9o;
import X.C81840WAa;
import X.C81860WAu;
import X.InterfaceC81845WAf;
import X.WA7;
import X.WAY;
import X.WAZ;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public class WebPImage extends AbstractC81863WAx implements InterfaceC81845WAf {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // X.WA7
    public boolean doesRenderSupportScaling() {
        return false;
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
        return nativeGetLoopCount();
    }

    @Override // X.WA7
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.WA7
    public int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage() {
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.WA7
    public C81828W9o getImageFormat() {
        return C81796W8i.LJIIIZ;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage create(byte[] bArr) {
        C81860WAu.LIZ();
        bArr.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    @Override // X.InterfaceC81845WAf
    public WA7 decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    @Override // X.WA7
    public C81840WAa getFrameInfo(int i) {
        WAZ waz;
        WAY way;
        WebPFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            if (frame.LIZ()) {
                waz = WAZ.BLEND_WITH_PREVIOUS;
            } else {
                waz = WAZ.NO_BLEND;
            }
            if (frame.LIZIZ()) {
                way = WAY.DISPOSE_TO_BACKGROUND;
            } else {
                way = WAY.DISPOSE_DO_NOT;
            }
            return new C81840WAa(xOffset, yOffset, width, height, waz, way);
        } finally {
            frame.dispose();
        }
    }

    public static WebPImage create(ByteBuffer byteBuffer) {
        C81860WAu.LIZ();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    @Override // X.WA7
    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static WebPImage create(long j, int i) {
        boolean z;
        C81860WAu.LIZ();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        return nativeCreateFromNativeMemory(j, i);
    }

    @Override // X.InterfaceC81845WAf
    public WA7 decode(long j, int i) {
        return create(j, i);
    }
}
