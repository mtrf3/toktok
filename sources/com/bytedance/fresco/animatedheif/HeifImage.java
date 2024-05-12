package com.bytedance.fresco.animatedheif;

import X.AbstractC81863WAx;
import X.C32151Nz;
import X.C81794W8g;
import X.C81828W9o;
import X.C81840WAa;
import X.InterfaceC81845WAf;
import X.WA7;
import X.WAY;
import X.WAZ;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public class HeifImage extends AbstractC81863WAx implements InterfaceC81845WAf {
    public long mNativeContext;

    private native HeifImage nativeCloneHeifImage();

    public static native HeifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native HeifImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native HeifFrame nativeGetFrame(int i);

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

    @Override // X.AbstractC81863WAx, X.WA7
    public WA7 cloneOrNull() {
        return nativeCloneHeifImage();
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
    public C81828W9o getImageFormat() {
        return C81794W8g.LIZIZ();
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

    public HeifImage() {
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public HeifImage(long j) {
        this.mNativeContext = j;
    }

    public static HeifImage create(byte[] bArr) {
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
        HeifFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            if (frame.isBlendWithPreviousFrame()) {
                waz = WAZ.BLEND_WITH_PREVIOUS;
            } else {
                waz = WAZ.NO_BLEND;
            }
            if (frame.shouldDisposeToBackgroundColor()) {
                way = WAY.DISPOSE_TO_BACKGROUND;
            } else {
                way = WAY.DISPOSE_DO_NOT;
            }
            return new C81840WAa(xOffset, yOffset, width, height, waz, way);
        } finally {
            frame.dispose();
        }
    }

    public static HeifImage create(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    @Override // X.WA7
    public HeifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static HeifImage create(long j, int i) {
        boolean z;
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
