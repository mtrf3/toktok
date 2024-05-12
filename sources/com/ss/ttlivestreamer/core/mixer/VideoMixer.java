package com.ss.ttlivestreamer.core.mixer;

import X.AnonymousClass028;
import X.C0H1;
import X.X1D;
import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.TextureBufferImpl;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class VideoMixer extends NativeMixer implements TextureBufferImpl.ToI420Interface {
    public static int TEXTURE_TYPE_2D = 1;
    public static int TEXTURE_TYPE_OES = 2;
    public static int TEXTURE_TYPE_UNKNOWN = 0;
    public static int TEXTURE_TYPE_YUV = 3;
    public boolean mHaveNativeObj;
    public final long mWeakNativeThis;
    public YuvConverter mYuvConverter;

    /* loaded from: classes12.dex */
    public static class VideoMixerDescription {
        public float alpha;
        public float bottom;
        public long flags;
        public float left;
        public float right;
        public float top;
        public int zOrder;

        public static VideoMixerDescription CENTER() {
            return new VideoMixerDescription(0.25f, 0.25f, 0.75f, 0.75f, 0, 1L);
        }

        public static VideoMixerDescription FILL() {
            return new VideoMixerDescription(0.0f, 0.0f, 1.0f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription INVISIABLE() {
            return new VideoMixerDescription(1.0f, 1.0f, 1.1f, 1.1f, 0, 1L);
        }

        public static VideoMixerDescription LEFT_DOWN() {
            return new VideoMixerDescription(0.0f, 0.5f, 0.5f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription LEFT_HALF() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription LEFT_UP() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 0.5f, 0, 1L);
        }

        public static VideoMixerDescription RIGHT_DOWN() {
            return new VideoMixerDescription(0.5f, 0.5f, 1.0f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription RIGHT_HALF() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 1.0f, 0, 1L);
        }

        public static VideoMixerDescription RIGHT_UP() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 0.5f, 0, 1L);
        }

        public static VideoMixerDescription builder() {
            return new VideoMixerDescription();
        }

        public int getMode() {
            if ((this.flags & 1) != 0) {
                return 1;
            }
            return 2;
        }

        public boolean isEnableAlphaMode() {
            if ((this.flags & 16) > 0) {
                return true;
            }
            return false;
        }

        public boolean isVisible() {
            if ((this.flags & 8) == 0) {
                return true;
            }
            return false;
        }

        public VideoMixerDescription() {
            this.alpha = -1.0f;
            this.flags = 1L;
            this.right = 1.0f;
            this.bottom = 1.0f;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoDescription(this:");
            LIZ.append(super.toString());
            LIZ.append(",l:");
            LIZ.append(this.left);
            LIZ.append(",r:");
            LIZ.append(this.right);
            LIZ.append(",t:");
            LIZ.append(this.top);
            LIZ.append(",b:");
            LIZ.append(this.bottom);
            LIZ.append(",z:");
            LIZ.append(this.zOrder);
            LIZ.append(",f:");
            return C0H1.LIZJ(LIZ, this.flags, ")", LIZ);
        }

        public float getAlpha() {
            return this.alpha;
        }

        public float getBottom() {
            return this.bottom;
        }

        public long getFlags() {
            return this.flags;
        }

        public float getLeft() {
            return this.left;
        }

        public float getRight() {
            return this.right;
        }

        public float getTop() {
            return this.top;
        }

        public int getzOrder() {
            return this.zOrder;
        }

        public void copy(VideoMixerDescription videoMixerDescription) {
            this.left = videoMixerDescription.left;
            this.right = videoMixerDescription.right;
            this.top = videoMixerDescription.top;
            this.bottom = videoMixerDescription.bottom;
            this.zOrder = videoMixerDescription.zOrder;
            this.flags = videoMixerDescription.flags;
        }

        public boolean isMirror(boolean z) {
            long j = this.flags;
            if (z) {
                if ((j & 2) != 0) {
                    return true;
                }
            } else if ((j & 4) != 0) {
                return true;
            }
            return false;
        }

        public VideoMixerDescription setAlpha(float f) {
            this.alpha = f;
            return this;
        }

        public void setAutoFillOnFit(boolean z) {
            if (z) {
                this.flags |= 32;
            } else {
                this.flags &= -33;
            }
        }

        public VideoMixerDescription setBottom(float f) {
            this.bottom = f;
            return this;
        }

        public VideoMixerDescription setEnableAlphaMode(boolean z) {
            if (!z) {
                this.flags &= -17;
            } else {
                this.flags |= 16;
            }
            return this;
        }

        public VideoMixerDescription setLeft(float f) {
            this.left = f;
            return this;
        }

        public VideoMixerDescription setMode(int i) {
            if (i != 1) {
                if (i == 2) {
                    this.flags &= -2;
                }
            } else {
                this.flags |= 1;
            }
            return this;
        }

        public VideoMixerDescription setRight(float f) {
            this.right = f;
            return this;
        }

        public VideoMixerDescription setTop(float f) {
            this.top = f;
            return this;
        }

        public VideoMixerDescription setVisibility(boolean z) {
            if (z) {
                this.flags &= -9;
            } else {
                this.flags |= 8;
            }
            return this;
        }

        public VideoMixerDescription setzOrder(int i) {
            this.zOrder = i;
            return this;
        }

        public VideoMixerDescription setMirror(boolean z, boolean z2) {
            if (z) {
                if (z2) {
                    this.flags |= 2;
                } else {
                    this.flags &= -3;
                }
            } else if (z2) {
                this.flags |= 4;
            } else {
                this.flags &= -5;
            }
            return this;
        }

        public VideoMixerDescription(float f, float f2, float f3, float f4, int i, long j) {
            this.alpha = -1.0f;
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
            this.zOrder = i;
            this.flags = j;
        }
    }

    private native void nativeAddVideoSink(VideoSink videoSink);

    private native void nativeCreate();

    private native void nativeRemoveVideoSink(VideoSink videoSink);

    private native void nativeReportLayersInfo();

    private native void nativeSetIsGameMixer(boolean z);

    private native void nativeSetLayerName(int i, String str);

    private native void nativeSetWPublishMode(boolean z);

    private native VideoMixerTexture nativeUploadI420ImageToTexture(long j, int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5);

    private native void nativeVideoMixerRelease(long j);

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean isAudioMixer() {
        return false;
    }

    public native int nativeMixFrame(boolean z, int i, VideoFrame videoFrame);

    public native int nativeMixFrameTex(boolean z, int i, int i2, int i3, int i4, int i5, int[] iArr, float[] fArr);

    public native void nativeReleaseTexture();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.mHaveNativeObj) {
            super.release();
        } else {
            long j = this.mNativeObj;
            if (j != 0) {
                nativeVideoMixerRelease(j);
            }
        }
        this.mNativeObj = 0L;
    }

    public VideoMixer() {
        this.mHaveNativeObj = true;
        nativeCreate();
        this.mWeakNativeThis = this.mNativeObj;
    }

    public int createTrack() {
        return super.nativeCreateTrack(VideoMixerDescription.builder());
    }

    /* loaded from: classes12.dex */
    public static class VideoMixerTexture {
        public int height;
        public int rotation;
        public float[] texMatrix;
        public int[] textures;
        public int type;
        public int width;

        public VideoMixerTexture() {
        }

        public int getHeight() {
            return this.height;
        }

        public int getRotation() {
            return this.rotation;
        }

        public float[] getTexMatrix() {
            return this.texMatrix;
        }

        public int[] getTextures() {
            return this.textures;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public VideoMixerTexture(int i, int i2, int i3, int i4, int[] iArr, float[] fArr) {
            if (iArr.length != 3) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Texture array error!");
                if (AnonymousClass028.LJI(androidRuntimeException, "VideoMixer#VideoMixerTexture.VideoMixerTexture")) {
                    throw androidRuntimeException;
                }
            }
            this.textures = iArr;
            this.width = i;
            this.height = i2;
            this.rotation = i3;
            this.type = i4;
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                if (i3 % 180 != 0) {
                    this.width = i2;
                    this.height = i;
                }
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate(-i3);
                matrix.preTranslate(-0.5f, -0.5f);
                if (fArr != null) {
                    matrix.preConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
                }
                this.texMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
                return;
            }
            this.texMatrix = fArr == null ? RendererCommon.identityMatrix() : fArr;
        }
    }

    private boolean isHaveNativeObj() {
        return this.mHaveNativeObj;
    }

    public void reportLayersInfo() {
        nativeReportLayersInfo();
    }

    public VideoMixer(long j) {
        setNativeObj(j);
        this.mWeakNativeThis = j;
    }

    public void AddVideoSink(VideoSink videoSink) {
        addVideoSink(videoSink);
    }

    public void RemoveVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
    }

    public void addVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeAddVideoSink(videoSink);
        }
    }

    public int createTrack(VideoMixerDescription videoMixerDescription) {
        return super.nativeCreateTrack(videoMixerDescription);
    }

    public VideoMixerDescription getDescription(int i) {
        return (VideoMixerDescription) super.nativeGetDescription(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r3.type != com.ss.ttlivestreamer.core.mixer.VideoMixer.TEXTURE_TYPE_YUV) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.ttlivestreamer.core.mixer.VideoMixer.VideoMixerTexture getVideoMixerTexture(com.ss.ttlivestreamer.core.buffer.VideoFrame r15) {
        /*
            r14 = this;
            com.ss.ttlivestreamer.core.buffer.VideoFrame$Buffer r2 = r15.getBuffer()
            com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture r4 = new com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture
            r4.<init>()
            boolean r0 = r2 instanceof com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer
            if (r0 == 0) goto L48
            r3 = r2
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer r3 = (com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer) r3
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r1 = r3.getType()
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r0 = com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer.Type.OES
            if (r1 != r0) goto L45
            int r0 = com.ss.ttlivestreamer.core.mixer.VideoMixer.TEXTURE_TYPE_OES
        L1a:
            r4.type = r0
            int r0 = r2.getWidth()
            r4.width = r0
            int r0 = r2.getHeight()
            r4.height = r0
            int r0 = r15.getRotation()
            r4.rotation = r0
            android.graphics.Matrix r0 = r3.getTransformMatrix()
            float[] r0 = com.ss.ttlivestreamer.core.opengl.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(r0)
            r4.texMatrix = r0
            r0 = 1
            int[] r2 = new int[r0]
            r4.textures = r2
            r1 = 0
            int r0 = r3.getTextureId()
            r2[r1] = r0
            return r4
        L45:
            int r0 = com.ss.ttlivestreamer.core.mixer.VideoMixer.TEXTURE_TYPE_2D
            goto L1a
        L48:
            boolean r0 = r2 instanceof com.ss.ttlivestreamer.core.buffer.JavaI420Buffer
            if (r0 == 0) goto Lba
            com.ss.ttlivestreamer.core.buffer.JavaI420Buffer r2 = (com.ss.ttlivestreamer.core.buffer.JavaI420Buffer) r2
            r3 = r14
            long r4 = r3.mWeakNativeThis
            int r6 = r2.getWidth()
            int r7 = r2.getHeight()
            java.nio.ByteBuffer r8 = r2.getDataY()
            int r9 = r2.getStrideY()
            java.nio.ByteBuffer r10 = r2.getDataU()
            int r11 = r2.getStrideU()
            java.nio.ByteBuffer r12 = r2.getDataV()
            int r13 = r2.getStrideV()
            com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture r3 = r3.nativeUploadI420ImageToTexture(r4, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r3 == 0) goto L89
            float[] r1 = r3.texMatrix
            float[] r0 = com.ss.ttlivestreamer.core.opengl.RendererCommon.verticalFlipMatrix()
            float[] r0 = com.ss.ttlivestreamer.core.opengl.RendererCommon.multiplyMatrices(r1, r0)
            r3.texMatrix = r0
            int r1 = r3.type
            int r0 = com.ss.ttlivestreamer.core.mixer.VideoMixer.TEXTURE_TYPE_YUV
            if (r1 == r0) goto Lb5
        L89:
            android.util.AndroidRuntimeException r2 = new android.util.AndroidRuntimeException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Loading Y/U/V texture exception("
            r1.append(r0)
            if (r3 == 0) goto Lb6
            int r0 = r3.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L9e:
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            java.lang.String r0 = "VideoMixer.getVideoMixerTexture"
            boolean r0 = X.AnonymousClass028.LJI(r2, r0)
            if (r0 != 0) goto Lb9
        Lb5:
            return r3
        Lb6:
            java.lang.String r0 = "return is null."
            goto L9e
        Lb9:
            throw r2
        Lba:
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "No implement."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.mixer.VideoMixer.getVideoMixerTexture(com.ss.ttlivestreamer.core.buffer.VideoFrame):com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerTexture");
    }

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean isEnable(int i) {
        VideoMixerDescription description = getDescription(i);
        if (description == null || (description.flags & 8) != 0) {
            return false;
        }
        return true;
    }

    public void removeVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
    }

    public void setIsGameMixer(boolean z) {
        nativeSetIsGameMixer(z);
    }

    public void setWPublishMode(boolean z) {
        nativeSetWPublishMode(z);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        if (!GlUtil.nativeIsOpenGlThread()) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Must be gl thread.");
            if (AnonymousClass028.LJI(androidRuntimeException, "VideoMixer.toI420")) {
                throw androidRuntimeException;
            }
        }
        if (this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        return this.mYuvConverter.convert(textureBuffer);
    }

    public VideoFrame.Buffer wrapperTextureBuffer(VideoMixerTexture videoMixerTexture) {
        Matrix matrix;
        float[] fArr = videoMixerTexture.texMatrix;
        if (fArr != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        return new TextureBufferImpl(videoMixerTexture.width, videoMixerTexture.height, VideoFrame.TextureBuffer.Type.RGB, videoMixerTexture.getTextures()[0], matrix, this, new Runnable() { // from class: com.ss.ttlivestreamer.core.mixer.VideoMixer.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_mixer_VideoMixer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_mixer_VideoMixer$1__run$___twin___() {
                VideoMixer.this.nativeReleaseTexture();
            }

            public static void com_ss_ttlivestreamer_core_mixer_VideoMixer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_mixer_VideoMixer$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public int mixFrame(int i, VideoMixerTexture videoMixerTexture) {
        int i2 = videoMixerTexture.rotation;
        if (i2 != 0) {
            videoMixerTexture = new VideoMixerTexture(videoMixerTexture.width, videoMixerTexture.height, i2, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
        }
        return nativeMixFrameTex(this.mHaveNativeObj, i, videoMixerTexture.width, videoMixerTexture.height, videoMixerTexture.rotation, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
    }

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public void setEnable(int i, boolean z) {
        VideoMixerDescription description = getDescription(i);
        if (description != null) {
            if (z) {
                description.flags &= -9;
            } else {
                description.flags |= 8;
            }
            updateDescription(i, description);
        }
    }

    public void setLayerName(int i, String str) {
        nativeSetLayerName(i, str);
    }

    public void updateDescription(int i, VideoMixerDescription videoMixerDescription) {
        super.nativeUpdateDescription(i, videoMixerDescription);
    }

    public int mixFrame(int i, VideoFrame videoFrame) {
        return nativeMixFrame(this.mHaveNativeObj, i, videoFrame);
    }

    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, long j) {
        return wrapperTextureBuffer(i, i2, i3, i4, i5, null, j);
    }

    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, float[] fArr, long j) {
        Matrix matrix;
        if (fArr != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        return new VideoFrame(new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.RGB, i5, matrix, this, new Runnable() { // from class: com.ss.ttlivestreamer.core.mixer.VideoMixer.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_mixer_VideoMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_mixer_VideoMixer$2__run$___twin___() {
                VideoMixer.this.nativeReleaseTexture();
            }

            public static void com_ss_ttlivestreamer_core_mixer_VideoMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_mixer_VideoMixer$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }), i3, j);
    }
}
