package com.ss.bytertc.engine.utils;

import X.X1D;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import java.util.Objects;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes33.dex */
public class VideoFrameConverter {
    public long gl420ConverterNativeHandle;
    public long glNativeHandle;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public TextureHelper mI420TextureConverter;
    public boolean mIsStart;
    public TextureHelper mTextureHelper;

    public synchronized void dispose() {
        TextureHelper textureHelper = this.mTextureHelper;
        if (textureHelper != null) {
            textureHelper.dispose();
        }
        TextureHelper textureHelper2 = this.mI420TextureConverter;
        if (textureHelper2 != null) {
            textureHelper2.dispose();
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.mIsStart = false;
    }

    public long getNativeEglContext(EGLContext eGLContext) {
        return 0L;
    }

    /* renamed from: com.ss.bytertc.engine.utils.VideoFrameConverter$1, reason: invalid class name */
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
        }
    }

    public VideoFrameConverter() {
        HandlerThread handlerThread = new HandlerThread("video-frame-converter");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
        this.mIsStart = true;
    }

    public TextureHelper getTextureHelper() {
        return this.mTextureHelper;
    }

    private long getNativeEglContext(android.opengl.EGLContext eGLContext) {
        return eGLContext.getNativeHandle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert2WebrtcTextureFrame$0(int i) {
        this.mTextureHelper.queueTexture(i);
    }

    public synchronized VideoFrame convert2WebrtcI420Frame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        if (videoFrame == null) {
            LogUtil.w("VideoFrameConverter", "convert2WebrtcI420Frame frame is null");
            return null;
        }
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE) {
            LogUtil.w("VideoFrameConverter", "convert2WebrtcI420Frame: pushExternalVideoFrame VideoFrame type is not available");
            return null;
        }
        if (videoFrame.getEGLContext() == null || !updateInnerI420Converter(videoFrame.getEGLContext(), videoFrame.getWidth(), videoFrame.getHeight())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("video frame  error frame eglContext14:");
            LIZ.append(videoFrame.getEGLContext());
            LIZ.append(" isStart:");
            LIZ.append(this.mIsStart);
            LogUtil.e("VideoFrameConverter", X1D.LIZIZ(LIZ));
            return null;
        }
        TextureHelper textureHelper = this.mI420TextureConverter;
        if (textureHelper == null) {
            return null;
        }
        VideoFrame allocateVideoFrame = allocateVideoFrame(videoFrame, textureHelper, null);
        VideoFrame videoFrame2 = new VideoFrame(allocateVideoFrame.getBuffer().toI420(), allocateVideoFrame.getRotation(), allocateVideoFrame.getTimestampNs());
        allocateVideoFrame.release();
        return videoFrame2;
    }

    public synchronized VideoFrame convert2WebrtcTextureFrame(final com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        int i;
        VideoFrame videoFrame2 = null;
        if (videoFrame == null) {
            LogUtil.w("VideoFrameConverter", "convert2VideoFrame frame is null");
            return null;
        }
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE) {
            LogUtil.w("VideoFrameConverter", "pushExternalVideoFrame VideoFrame type is not available");
            return null;
        }
        if (videoFrame.getEGLContext() != null) {
            updateEglContext(videoFrame.getEGLContext(), videoFrame.getWidth(), videoFrame.getHeight());
        }
        if (this.mTextureHelper != null) {
            if (videoFrame.hasReleaseCallback()) {
                videoFrame2 = allocateVideoFrame(videoFrame, this.mTextureHelper, new Runnable() { // from class: X.ZW2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ss.bytertc.engine.video.VideoFrame.this.release();
                    }
                });
            } else {
                final int dequeueTexture = this.mTextureHelper.dequeueTexture();
                if (dequeueTexture == 0) {
                    return null;
                }
                VideoPixelFormat pixelFormat = videoFrame.getPixelFormat();
                VideoPixelFormat videoPixelFormat = VideoPixelFormat.TEXTURE_2D;
                if (pixelFormat == videoPixelFormat) {
                    i = 10;
                } else {
                    if (videoFrame.getPixelFormat() != VideoPixelFormat.TEXTURE_OES) {
                        return null;
                    }
                    i = 11;
                }
                this.mTextureHelper.drawTexture(i, videoFrame.getTextureID(), dequeueTexture);
                GLTextureVideoFrameBuilder gLTextureVideoFrameBuilder = new GLTextureVideoFrameBuilder(videoPixelFormat);
                gLTextureVideoFrameBuilder.setColorSpace(videoFrame.getColorSpace());
                gLTextureVideoFrameBuilder.setTextureID(dequeueTexture);
                gLTextureVideoFrameBuilder.setEGLContext(videoFrame.getEGLContext());
                gLTextureVideoFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
                gLTextureVideoFrameBuilder.setWidth(videoFrame.getWidth());
                gLTextureVideoFrameBuilder.setHeight(videoFrame.getHeight());
                gLTextureVideoFrameBuilder.setRotation(videoFrame.getRotation());
                gLTextureVideoFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.ZW3
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameConverter.this.lambda$convert2WebrtcTextureFrame$0(dequeueTexture);
                    }
                });
                final com.ss.bytertc.engine.video.VideoFrame build = gLTextureVideoFrameBuilder.build();
                TextureHelper textureHelper = this.mTextureHelper;
                Objects.requireNonNull(build);
                videoFrame2 = allocateVideoFrame(build, textureHelper, new Runnable() { // from class: X.ZW2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ss.bytertc.engine.video.VideoFrame.this.release();
                    }
                });
            }
        }
        return videoFrame2;
    }

    public synchronized void post(Runnable runnable) {
        if (!this.mIsStart) {
            return;
        }
        TextureHelper textureHelper = this.mTextureHelper;
        if (textureHelper != null) {
            textureHelper.post(runnable);
        } else {
            this.mHandler.post(runnable);
        }
    }

    private void updateEglContext(android.opengl.EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            this.glNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.i("VideoFrameConverter", "create  egl14 texture helper");
            return;
        }
        if (this.glNativeHandle == getNativeEglContext(eGLContext) && this.mTextureHelper.getWidth() == i && this.mTextureHelper.getHeight() == i2) {
            return;
        }
        this.glNativeHandle = getNativeEglContext(eGLContext);
        this.mTextureHelper.dispose();
        this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update egl14Context nativeHandle:");
        LIZ.append(this.glNativeHandle);
        LIZ.append(" ,eglContext:");
        LIZ.append(eGLContext);
        LIZ.append("frame size width:");
        LIZ.append(i);
        LIZ.append("height :");
        LIZ.append(i2);
        LogUtil.i("VideoFrameConverter", X1D.LIZIZ(LIZ));
    }

    private boolean updateInnerI420Converter(android.opengl.EGLContext eGLContext, int i, int i2) {
        if (this.mI420TextureConverter == null) {
            this.mI420TextureConverter = TextureHelper.create("EGLBaseTextureHelper", eGLContext, i, i2);
            this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.i("VideoFrameConverter", "create EglBase 420 texture converter");
            return true;
        }
        if (this.gl420ConverterNativeHandle == getNativeEglContext(eGLContext)) {
            return true;
        }
        this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
        this.mI420TextureConverter.dispose();
        this.mI420TextureConverter = TextureHelper.create("EGL14TextureConverter", eGLContext, i, i2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update egl14texture converter nativeHandle:");
        LIZ.append(this.glNativeHandle);
        LIZ.append(" ,eglContext:");
        LIZ.append(eGLContext);
        LogUtil.i("VideoFrameConverter", X1D.LIZIZ(LIZ));
        return true;
    }

    public VideoFrame allocateVideoFrame(com.ss.bytertc.engine.video.VideoFrame videoFrame, TextureHelper textureHelper, Runnable runnable) {
        VideoFrame.TextureBuffer.Type type;
        if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY) {
            LogUtil.w("VideoFrameConverter", "allocateVideoFrame only glTexture format is avaliable");
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[videoFrame.getPixelFormat().ordinal()];
        if (i != 1) {
            if (i != 2) {
                LogUtil.w("VideoFrameConverter", "texture format is not support");
                return null;
            }
            type = VideoFrame.TextureBuffer.Type.OES;
        } else {
            type = VideoFrame.TextureBuffer.Type.RGB;
        }
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getWidth(), videoFrame.getHeight(), type, videoFrame.getTextureID(), RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoFrame.getTextureMatrix()), textureHelper, runnable);
        textureBufferImpl.setEglBaseContext(textureHelper.getEglBaseContext());
        return new VideoFrame(textureBufferImpl, videoFrame.getRotation().value(), videoFrame.getTimeStampUs() * 1000);
    }
}
