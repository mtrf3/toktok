package com.ss.bytertc.engine.video.impl;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class DirectBufferVideoFrame extends VideoFrame {
    public ByteBuffer[] dataOfPlanes;
    public EGLContext eglContext;
    public ByteBuffer externalDataInfo;
    public VideoFrameType frameType;
    public int height;
    public VideoPixelFormat pixelFormat;
    public int[] strideOfPlanes;
    public ByteBuffer supplementaryInfo;
    public int textureID;
    public float[] textureMatrix;
    public long timestampUs;
    public int width;
    public ColorSpace colorSpace = ColorSpace.BT601_LIMITED_RANGE;
    public VideoRotation rotation = VideoRotation.VIDEO_ROTATION_0;

    /* renamed from: com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat;

        static {
            int[] iArr = new int[VideoPixelFormat.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat = iArr;
            try {
                iArr[VideoPixelFormat.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.RGBA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_2D.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_OES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        return this.dataOfPlanes.length;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public CameraId getCameraId() {
        return CameraId.CAMERA_ID_INVALID;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        return VideoContentType.NORMAL_FRAME;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        return this.eglContext;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        return this.externalDataInfo;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        return this.frameType;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        return this.rotation;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        return this.supplementaryInfo;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        return this.textureID;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        return this.textureMatrix;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        return this.timestampUs;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        return this.width;
    }

    public DirectBufferVideoFrame(VideoPixelFormat videoPixelFormat) {
        this.pixelFormat = videoPixelFormat;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[videoPixelFormat.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    this.frameType = VideoFrameType.GL_TEXTURE;
                    i2 = 0;
                } else {
                    this.frameType = VideoFrameType.RAW_MEMORY;
                    i2 = 1;
                }
            } else {
                this.frameType = VideoFrameType.RAW_MEMORY;
                i2 = 2;
            }
        } else {
            this.frameType = VideoFrameType.RAW_MEMORY;
        }
        this.dataOfPlanes = new ByteBuffer[i2];
        this.strideOfPlanes = new int[i2];
    }

    private ByteBuffer convert2DirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.position(0);
        allocateDirect.put(byteBuffer);
        allocateDirect.rewind();
        return allocateDirect;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i) {
        return this.dataOfPlanes[i];
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i) {
        return this.strideOfPlanes[i];
    }

    public void setColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
    }

    public void setEGLContext(EGLContext eGLContext) {
        this.eglContext = eGLContext;
    }

    public void setExternalDataInfo(ByteBuffer byteBuffer) {
        this.externalDataInfo = convert2DirectBuffer(byteBuffer);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void setReleaseCallback(Runnable runnable) {
        super.setReleaseCallback(runnable);
    }

    public void setRotation(VideoRotation videoRotation) {
        this.rotation = videoRotation;
    }

    public void setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.supplementaryInfo = convert2DirectBuffer(byteBuffer);
    }

    public void setTextureID(int i) {
        if (this.frameType == VideoFrameType.RAW_MEMORY) {
            return;
        }
        this.textureID = i;
    }

    public void setTextureMatrix(float[] fArr) {
        this.textureMatrix = fArr;
    }

    public void setTimeStampUs(long j) {
        this.timestampUs = j;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setPlaneData(int i, ByteBuffer byteBuffer) {
        if (this.frameType == VideoFrameType.GL_TEXTURE || i >= this.dataOfPlanes.length) {
            return;
        }
        this.dataOfPlanes[i] = convert2DirectBuffer(byteBuffer);
    }

    public void setPlaneStride(int i, int i2) {
        if (this.frameType == VideoFrameType.GL_TEXTURE || i >= this.dataOfPlanes.length) {
            return;
        }
        this.strideOfPlanes[i] = i2;
    }
}
