package com.ss.ttlivestreamer.core.buffer;

import X.V0N;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class VideoFrame {
    public final Buffer buffer;
    public final int rotation;
    public long timestampNs;

    /* loaded from: classes12.dex */
    public interface Buffer {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        long getCaptureMs();

        IExtraData getExtData();

        int getHeight();

        RoiInfo getROIInfo();

        int getWidth();

        boolean isTexture();

        void release();

        void retain();

        void setROIInfo(RoiInfo roiInfo);

        I420Buffer toI420();

        void updateCaptureMs(long j);
    }

    /* loaded from: classes12.dex */
    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    /* loaded from: classes12.dex */
    public interface IExtraData {
        long getExtraDataFlag();

        int peekParcelSize();

        int readParcel(ByteBuffer byteBuffer);

        void releaseExtraData(Object obj);
    }

    public static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public IExtraData getExtraData() {
        return this.buffer.getExtData();
    }

    public int getRotatedHeight() {
        if (this.rotation % 180 == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % 180 == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    public boolean isTexture() {
        return this.buffer instanceof TextureBuffer;
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }

    /* loaded from: classes12.dex */
    public interface TextureBuffer extends Buffer {
        int getRefCount();

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        /* loaded from: classes12.dex */
        public enum Type {
            OES(36197),
            RGB(3553);

            public final int glTarget;

            public int getGlTarget() {
                return this.glTarget;
            }

            public static Type valueOf(String str) {
                return (Type) V0N.LJJJ(Type.class, str);
            }

            Type(int i) {
                this.glTarget = i;
            }
        }
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public void setTimestampNs(long j) {
        this.timestampNs = j;
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    public static Buffer cropAndScaleI420(final I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == i5 && i4 == i6 && i == 0 && i2 == 0) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            i420Buffer.getStrideY();
            dataY.position(0);
            i420Buffer.getStrideU();
            dataU.position(0);
            i420Buffer.getStrideV();
            dataV.position(0);
            i420Buffer.retain();
            return JavaI420Buffer.wrap(i420Buffer.getWidth(), i420Buffer.getHeight(), dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), i420Buffer.getCaptureMs(), new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.VideoFrame.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_buffer_VideoFrame$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_buffer_VideoFrame$1__run$___twin___() {
                    I420Buffer.this.release();
                }

                public static void com_ss_ttlivestreamer_core_buffer_VideoFrame$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_core_buffer_VideoFrame$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i5, i6);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        allocate.updateCaptureMs(i420Buffer.getCaptureMs());
        return allocate;
    }
}
