package com.ss.bytertc.engine.handler;

import X.RunnableC90024ZUu;
import X.ZW8;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglBase14;
import com.bytedance.realx.video.NV12Buffer;
import com.bytedance.realx.video.NV21Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.TextureBufferImpl;
import com.ss.bytertc.engine.utils.TextureHelper;
import com.ss.bytertc.engine.video.IVideoProcessor;
import com.ss.bytertc.engine.video.MultiVideoFrameWrapper;
import com.ss.bytertc.engine.video.impl.WebrtcWrapperVideoFrame;

/* loaded from: classes33.dex */
public class RTCVideoProcessor {
    public IVideoProcessor mCustomVideoPreprocessor;
    public EglBase14 mEglbase;
    public final Handler mHandler;
    public boolean mIsDisposed;
    public boolean mNeedRecreateTextureHelper;
    public VideoPixelFormat mRequiredFormat = VideoPixelFormat.UNKNOWN;
    public EglBase14.Context mSharedContext;
    public TextureHelperRef mTxtHelperRef;

    public void dispose() {
        this.mIsDisposed = true;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new RunnableC90024ZUu(1, this));
        this.mHandler.getLooper().quit();
        TextureHelperRef textureHelperRef = this.mTxtHelperRef;
        if (textureHelperRef != null) {
            textureHelperRef.release();
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.RTCVideoProcessor$1 */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat;

        static {
            int[] iArr = new int[VideoPixelFormat.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat = iArr;
            try {
                iArr[VideoPixelFormat.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_OES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.I420.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: releaseEGL */
    public void lambda$dispose$0() {
        if (this.mEglbase == null) {
            return;
        }
        IVideoProcessor customVideoPreprocessor = getCustomVideoPreprocessor();
        if (customVideoPreprocessor != null) {
            customVideoPreprocessor.onGLEnvRelease();
        }
        this.mEglbase.makeCurrent();
        this.mEglbase.release();
        this.mEglbase = null;
    }

    public RTCVideoProcessor() {
        HandlerThread handlerThread = new HandlerThread("RTCVideoProcessor");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }

    public IVideoProcessor getCustomVideoPreprocessor() {
        return this.mCustomVideoPreprocessor;
    }

    /* loaded from: classes33.dex */
    public static class TextureHelperRef {
        public TextureHelper mTextureHelper;
        public int refCount = 1;

        public void release() {
            TextureHelper textureHelper;
            synchronized (this) {
                int i = this.refCount - 1;
                this.refCount = i;
                if (i == 0 && (textureHelper = this.mTextureHelper) != null) {
                    textureHelper.dispose();
                    this.mTextureHelper = null;
                }
            }
        }

        public void retain() {
            synchronized (this) {
                this.refCount++;
            }
        }

        public TextureHelperRef(TextureHelper textureHelper) {
            this.mTextureHelper = textureHelper;
        }

        public static TextureHelperRef create(int i, int i2, EglBase eglBase) {
            TextureHelper create = TextureHelper.create("RTCVideoProcessorTextureHelper", eglBase.getEglBaseContext(), i, i2);
            if (create == null) {
                return null;
            }
            return new TextureHelperRef(create);
        }
    }

    public static boolean check_require_format(VideoPixelFormat videoPixelFormat) {
        if (videoPixelFormat != VideoPixelFormat.UNKNOWN && videoPixelFormat != VideoPixelFormat.I420 && videoPixelFormat != VideoPixelFormat.TEXTURE_2D) {
            return false;
        }
        return true;
    }

    public static boolean check_src_format(VideoPixelFormat videoPixelFormat) {
        if (videoPixelFormat != VideoPixelFormat.TEXTURE_OES && videoPixelFormat != VideoPixelFormat.TEXTURE_2D && videoPixelFormat != VideoPixelFormat.I420) {
            return false;
        }
        return true;
    }

    public static VideoPixelFormat get_frame_format(VideoFrame videoFrame) {
        VideoPixelFormat videoPixelFormat = VideoPixelFormat.UNKNOWN;
        if (videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer) {
            if (((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getType() == VideoFrame.TextureBuffer.Type.OES) {
                return VideoPixelFormat.TEXTURE_OES;
            }
            return VideoPixelFormat.TEXTURE_2D;
        }
        if (videoFrame.getBuffer() instanceof NV21Buffer) {
            return VideoPixelFormat.NV21;
        }
        if (videoFrame.getBuffer() instanceof NV12Buffer) {
            return VideoPixelFormat.NV21;
        }
        if (!(videoFrame.getBuffer() instanceof VideoFrame.I420Buffer)) {
            return videoPixelFormat;
        }
        return VideoPixelFormat.I420;
    }

    public VideoFrame byteTextureFrame2WebrtcTextureFrame(final com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        int i;
        Matrix matrix;
        Matrix matrix2;
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE) {
            return null;
        }
        updateTextureHelper(videoFrame.getWidth(), videoFrame.getHeight());
        if (this.mTxtHelperRef == null) {
            LogUtil.e("RTCVideoProcessor", "texture helper is invalid, ToVideoFrame failed.");
            return null;
        }
        if (videoFrame.hasReleaseCallback()) {
            VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.RGB;
            if (videoFrame.getPixelFormat() == VideoPixelFormat.TEXTURE_OES) {
                type = VideoFrame.TextureBuffer.Type.OES;
            }
            if (videoFrame.getTextureMatrix() != null) {
                matrix2 = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoFrame.getTextureMatrix());
            } else {
                matrix2 = new Matrix();
            }
            this.mTxtHelperRef.retain();
            final TextureHelperRef textureHelperRef = this.mTxtHelperRef;
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getWidth(), videoFrame.getHeight(), type, videoFrame.getTextureID(), matrix2, this.mTxtHelperRef.mTextureHelper, new Runnable() { // from class: X.ZVk
                @Override // java.lang.Runnable
                public final void run() {
                    RTCVideoProcessor.lambda$byteTextureFrame2WebrtcTextureFrame$4(com.ss.bytertc.engine.video.VideoFrame.this, textureHelperRef);
                }
            });
            textureBufferImpl.setEglBaseContext(this.mTxtHelperRef.mTextureHelper.getEglBaseContext());
            return new VideoFrame(textureBufferImpl, videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
        }
        final int dequeueTexture = this.mTxtHelperRef.mTextureHelper.dequeueTexture();
        if (dequeueTexture == 0) {
            LogUtil.e("RTCVideoProcessor", "failed to get a texture, ToVideoFrame failed.");
            return null;
        }
        try {
            if (videoFrame.getPixelFormat() == VideoPixelFormat.TEXTURE_OES) {
                i = 11;
            } else {
                i = 10;
            }
            this.mTxtHelperRef.mTextureHelper.drawTexture(i, videoFrame.getTextureID(), dequeueTexture);
            VideoFrame.TextureBuffer.Type type2 = VideoFrame.TextureBuffer.Type.RGB;
            if (videoFrame.getTextureMatrix() != null) {
                matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoFrame.getTextureMatrix());
            } else {
                matrix = new Matrix();
            }
            this.mTxtHelperRef.retain();
            final TextureHelperRef textureHelperRef2 = this.mTxtHelperRef;
            TextureBufferImpl textureBufferImpl2 = new TextureBufferImpl(videoFrame.getWidth(), videoFrame.getHeight(), type2, dequeueTexture, matrix, this.mTxtHelperRef.mTextureHelper, new Runnable() { // from class: X.ZVl
                @Override // java.lang.Runnable
                public final void run() {
                    RTCVideoProcessor.this.lambda$byteTextureFrame2WebrtcTextureFrame$5(dequeueTexture, textureHelperRef2);
                }
            });
            textureBufferImpl2.setEglBaseContext(this.mTxtHelperRef.mTextureHelper.getEglBaseContext());
            videoFrame.release();
            return new VideoFrame(textureBufferImpl2, videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
        } catch (RuntimeException unused) {
            LogUtil.e("RTCVideoProcessor", "failed to draw to target texture, ToVideoFrame failed.");
            this.mTxtHelperRef.mTextureHelper.queueTexture(dequeueTexture);
            return null;
        }
    }

    public MultiVideoFrameWrapper processVideoFrame(final VideoFrame videoFrame) {
        VideoFrame texture2DFrame;
        if (this.mIsDisposed) {
            LogUtil.e("RTCVideoProcessor", "engine is invalid, processVideoFrame failed.");
            return null;
        }
        IVideoProcessor customVideoPreprocessor = getCustomVideoPreprocessor();
        if (customVideoPreprocessor == null) {
            LogUtil.e("RTCVideoProcessor", "custom video preprocessor is invalid, processVideoFrame failed.");
            return null;
        }
        VideoPixelFormat videoPixelFormat = get_frame_format(videoFrame);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.ZVm
            @Override // java.lang.Runnable
            public final void run() {
                RTCVideoProcessor.this.lambda$processVideoFrame$2(videoFrame);
            }
        });
        VideoPixelFormat videoPixelFormat2 = this.mRequiredFormat;
        if (videoPixelFormat2 == VideoPixelFormat.UNKNOWN) {
            if (!check_src_format(videoPixelFormat)) {
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                if (i420 == null) {
                    LogUtil.e("RTCVideoProcessor", "fail to convert frame to i420");
                    return null;
                }
                texture2DFrame = new VideoFrame(i420, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getFlipState());
            }
            texture2DFrame = videoFrame;
        } else {
            if (videoPixelFormat2 != videoPixelFormat) {
                if (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[videoPixelFormat2.ordinal()] != 1) {
                    LogUtil.e("RTCVideoProcessor", "src format should be TEXTURE_2D.");
                    return null;
                }
                texture2DFrame = toTexture2DFrame(videoPixelFormat, videoFrame);
                if (texture2DFrame == null) {
                    return null;
                }
            }
            texture2DFrame = videoFrame;
        }
        MultiVideoFrameWrapper processVideoFrameInternal = processVideoFrameInternal(customVideoPreprocessor, texture2DFrame);
        if (texture2DFrame != videoFrame) {
            texture2DFrame.release();
        }
        return processVideoFrameInternal;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* renamed from: updateEGLEnv */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lambda$processVideoFrame$2(com.bytedance.realx.video.VideoFrame r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            boolean r0 = r9.mIsDisposed
            java.lang.String r4 = "RTCVideoProcessor"
            if (r0 != 0) goto L80
            r0 = 17
            int[] r6 = new int[r0]
            r6 = {x008c: FILL_ARRAY_DATA , data: [12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 8, 12326, 8, 12344} // fill-array
            com.bytedance.realx.video.VideoFrame$Buffer r1 = r10.getBuffer()
            boolean r0 = r1 instanceof com.bytedance.realx.video.VideoFrame.TextureBuffer
            r5 = 1
            if (r0 == 0) goto L46
            com.bytedance.realx.video.VideoFrame$TextureBuffer r1 = (com.bytedance.realx.video.VideoFrame.TextureBuffer) r1
            android.opengl.EGLContext r0 = r1.getEglContext()
            com.bytedance.realx.video.EglBase14$Context r3 = new com.bytedance.realx.video.EglBase14$Context
            r3.<init>(r0)
            com.bytedance.realx.video.EglBase14$Context r0 = r9.mSharedContext
            if (r0 == 0) goto L43
            long r7 = r0.getNativeEglContext()
        L2c:
            long r1 = r3.getNativeEglContext()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L46
            r9.mSharedContext = r3
            r1 = 1
        L37:
            com.bytedance.realx.video.EglBase14 r0 = r9.mEglbase
            if (r0 != 0) goto L3c
            r1 = 1
        L3c:
            com.ss.bytertc.engine.video.IVideoProcessor r3 = r9.getCustomVideoPreprocessor()
            if (r1 != 0) goto L48
            return
        L43:
            r7 = 0
            goto L2c
        L46:
            r1 = 0
            goto L37
        L48:
            r2 = 0
            com.bytedance.realx.video.EglBase14 r0 = r9.mEglbase     // Catch: java.lang.RuntimeException -> L72
            if (r0 == 0) goto L59
            if (r3 == 0) goto L52
            r3.onGLEnvRelease()     // Catch: java.lang.RuntimeException -> L72
        L52:
            com.bytedance.realx.video.EglBase14 r0 = r9.mEglbase     // Catch: java.lang.RuntimeException -> L72
            r0.release()     // Catch: java.lang.RuntimeException -> L72
            r9.mEglbase = r2     // Catch: java.lang.RuntimeException -> L72
        L59:
            com.bytedance.realx.video.EglBase14 r1 = new com.bytedance.realx.video.EglBase14     // Catch: java.lang.RuntimeException -> L72
            com.bytedance.realx.video.EglBase14$Context r0 = r9.mSharedContext     // Catch: java.lang.RuntimeException -> L72
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L72
            r9.mEglbase = r1     // Catch: java.lang.RuntimeException -> L72
            r1.createDummyPbufferSurface()     // Catch: java.lang.RuntimeException -> L72
            com.bytedance.realx.video.EglBase14 r0 = r9.mEglbase     // Catch: java.lang.RuntimeException -> L72
            r0.makeCurrent()     // Catch: java.lang.RuntimeException -> L72
            r9.mNeedRecreateTextureHelper = r5     // Catch: java.lang.RuntimeException -> L72
            if (r3 == 0) goto L7f
            r3.onGLEnvInitiated()     // Catch: java.lang.RuntimeException -> L72
            goto L7f
        L72:
            r1 = move-exception
            com.bytedance.realx.video.EglBase14 r0 = r9.mEglbase
            r0.release()
            r9.mEglbase = r2
            java.lang.String r0 = " failed to create mEglbase"
            com.ss.bytertc.engine.utils.LogUtil.e(r4, r0, r1)
        L7f:
            return
        L80:
            java.lang.String r1 = "engine is invalid, initEGL failed."
            com.ss.bytertc.engine.utils.LogUtil.e(r4, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.handler.RTCVideoProcessor.lambda$processVideoFrame$2(com.bytedance.realx.video.VideoFrame):void");
    }

    public static /* synthetic */ void lambda$byteTextureFrame2WebrtcTextureFrame$4(com.ss.bytertc.engine.video.VideoFrame videoFrame, TextureHelperRef textureHelperRef) {
        videoFrame.release();
        textureHelperRef.release();
    }

    public /* synthetic */ void lambda$byteTextureFrame2WebrtcTextureFrame$5(int i, TextureHelperRef textureHelperRef) {
        this.mTxtHelperRef.mTextureHelper.queueTexture(i);
        textureHelperRef.release();
    }

    public static /* synthetic */ com.ss.bytertc.engine.video.VideoFrame lambda$processVideoFrameInternal$3(VideoFrame videoFrame, IVideoProcessor iVideoProcessor) {
        com.ss.bytertc.engine.video.VideoFrame processVideoFrame;
        WebrtcWrapperVideoFrame webrtcWrapperVideoFrame = new WebrtcWrapperVideoFrame(videoFrame, EGL14.eglGetCurrentContext());
        try {
            processVideoFrame = iVideoProcessor.processVideoFrame(webrtcWrapperVideoFrame);
        } catch (Exception e) {
            LogUtil.e("RTCVideoProcessor", " failed to exec user's processVideoFrame callback", e);
        }
        if (processVideoFrame != null) {
            if (processVideoFrame.getFrameType() == VideoFrameType.GL_TEXTURE) {
                GLES20.glFinish();
            }
            if (webrtcWrapperVideoFrame != processVideoFrame) {
                webrtcWrapperVideoFrame.release();
            }
            return processVideoFrame;
        }
        LogUtil.e("RTCVideoProcessor", "return frame if null.");
        return null;
    }

    public /* synthetic */ void lambda$registerLocalVideoProcessor$1(VideoPixelFormat videoPixelFormat, IVideoProcessor iVideoProcessor) {
        IVideoProcessor customVideoPreprocessor = getCustomVideoPreprocessor();
        if (customVideoPreprocessor != null && this.mEglbase != null) {
            customVideoPreprocessor.onGLEnvRelease();
        }
        this.mRequiredFormat = videoPixelFormat;
        this.mCustomVideoPreprocessor = iVideoProcessor;
    }

    public /* synthetic */ void lambda$toTexture2DFrame$6(int i, TextureHelperRef textureHelperRef) {
        this.mTxtHelperRef.mTextureHelper.queueTexture(i);
        textureHelperRef.release();
    }

    public MultiVideoFrameWrapper processVideoFrameInternal(IVideoProcessor iVideoProcessor, VideoFrame videoFrame) {
        com.ss.bytertc.engine.video.VideoFrame videoFrame2;
        try {
            videoFrame2 = (com.ss.bytertc.engine.video.VideoFrame) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new ZW8(1, videoFrame, iVideoProcessor));
        } catch (RuntimeException e) {
            e = e;
            videoFrame2 = null;
        }
        try {
            if (videoFrame2 == null) {
                LogUtil.e("RTCVideoProcessor", "custom video process return null, processVideoFrameInternal failed.");
                return null;
            }
            if (videoFrame2.getFrameType() == VideoFrameType.GL_TEXTURE) {
                return new MultiVideoFrameWrapper(byteTextureFrame2WebrtcTextureFrame(videoFrame2));
            }
            if (videoFrame2.getFrameType() == VideoFrameType.RAW_MEMORY) {
                return new MultiVideoFrameWrapper(videoFrame2);
            }
            LogUtil.e("RTCVideoProcessor", "custom video process processed_frame type unknown, processVideoFrameInternal failed.");
            return null;
        } catch (RuntimeException e2) {
            e = e2;
            LogUtil.e("RTCVideoProcessor", " failed to do custom video process", e);
            if (videoFrame2 != null) {
                videoFrame2.release();
            }
            return null;
        }
    }

    public int registerLocalVideoProcessor(final IVideoProcessor iVideoProcessor, final VideoPixelFormat videoPixelFormat) {
        if (!check_require_format(videoPixelFormat)) {
            LogUtil.e("RTCVideoProcessor", "custom video preprocessor setRequiredFormat failed.");
            return -1;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.ZVn
            @Override // java.lang.Runnable
            public final void run() {
                RTCVideoProcessor.this.lambda$registerLocalVideoProcessor$1(videoPixelFormat, iVideoProcessor);
            }
        });
        return 0;
    }

    public VideoFrame toTexture2DFrame(VideoPixelFormat videoPixelFormat, VideoFrame videoFrame) {
        if (videoPixelFormat == VideoPixelFormat.TEXTURE_2D) {
            videoFrame.retain();
            return videoFrame;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        updateTextureHelper(buffer.getWidth(), buffer.getHeight());
        TextureHelperRef textureHelperRef = this.mTxtHelperRef;
        if (textureHelperRef == null) {
            LogUtil.e("RTCVideoProcessor", "texture helper is invalid, toTexture2DFrame failed.");
            return null;
        }
        final int dequeueTexture = textureHelperRef.mTextureHelper.dequeueTexture();
        if (dequeueTexture == 0) {
            LogUtil.e("RTCVideoProcessor", "failed to get a texture, toTexture2DFrame failed.");
            return null;
        }
        try {
            int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[videoPixelFormat.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    VideoFrame.I420Buffer i420 = buffer.toI420();
                    if (i420 == null) {
                        LogUtil.e("RTCVideoProcessor", "fail to convert frame to i420");
                        return null;
                    }
                    this.mTxtHelperRef.mTextureHelper.yuvToTexture(i420, dequeueTexture);
                    i420.release();
                } else {
                    this.mTxtHelperRef.mTextureHelper.yuvToTexture((VideoFrame.I420Buffer) buffer, dequeueTexture);
                }
            } else {
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                this.mTxtHelperRef.mTextureHelper.drawTexture(11, textureBuffer.getTextureId(), dequeueTexture, textureBuffer.nativeGetTransFormMatrix());
            }
            Matrix matrix = new Matrix();
            this.mTxtHelperRef.retain();
            final TextureHelperRef textureHelperRef2 = this.mTxtHelperRef;
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(buffer.getWidth(), buffer.getHeight(), VideoFrame.TextureBuffer.Type.RGB, dequeueTexture, matrix, this.mTxtHelperRef.mTextureHelper, new Runnable() { // from class: X.ZVj
                @Override // java.lang.Runnable
                public final void run() {
                    RTCVideoProcessor.this.lambda$toTexture2DFrame$6(dequeueTexture, textureHelperRef2);
                }
            });
            textureBufferImpl.setEglBaseContext(this.mTxtHelperRef.mTextureHelper.getEglBaseContext());
            return new VideoFrame(textureBufferImpl, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getFlipState());
        } catch (RuntimeException unused) {
            LogUtil.e("RTCVideoProcessor", "failed to draw, toTexture2DFrame failed.");
            return null;
        }
    }

    public void updateTextureHelper(int i, int i2) {
        if (this.mIsDisposed) {
            return;
        }
        TextureHelperRef textureHelperRef = this.mTxtHelperRef;
        if ((textureHelperRef == null || this.mNeedRecreateTextureHelper || textureHelperRef.mTextureHelper.getWidth() != i || this.mTxtHelperRef.mTextureHelper.getHeight() != i2) && this.mEglbase != null) {
            TextureHelperRef textureHelperRef2 = this.mTxtHelperRef;
            if (textureHelperRef2 != null) {
                textureHelperRef2.release();
            }
            this.mTxtHelperRef = TextureHelperRef.create(i, i2, this.mEglbase);
            this.mNeedRecreateTextureHelper = false;
        }
    }
}
