package com.ss.bytertc.engine.utils;

import X.C16880lQ;
import X.X1D;
import X.ZVB;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.bytedance.realx.video.YuvHelper;
import com.ss.bytertc.engine.utils.TextureHelper;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes33.dex */
public class TextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public static float[] YUV_TEX_MATRIX = new float[16];
    public final EglBase mEglBase;
    public int mFrameBufferId;
    public final Handler mHandler;
    public int mHeight;
    public boolean mIsQuitting;
    public boolean mIsRelease;
    public boolean mIsTextureInUse;
    public int mTextureCnt;
    public GlRectDrawer mTextureDrawer;
    public List<Integer> mTextureFreeQueue = new LinkedList();
    public List<Integer> mTextureUsedQueue = new LinkedList();
    public int mWidth;
    public YuvConverter mYuvConverter;
    public YuvUploader mYuvUploader;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$7() {
        this.mIsQuitting = true;
        if (!this.mIsTextureInUse) {
            release();
        }
    }

    public int dequeueTexture() {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.ZVx
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.this.lambda$dequeueTexture$3(iArr);
            }
        });
        return iArr[0];
    }

    public synchronized void dispose() {
        LogUtil.d("TextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.ZVw
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.this.lambda$dispose$7();
            }
        });
    }

    public EglBase.Context getEglBaseContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public long getNativeEglContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0L;
    }

    public void release() {
        if (this.mHandler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            if (!this.mIsTextureInUse && this.mIsQuitting) {
                this.mIsRelease = true;
                YuvConverter yuvConverter = this.mYuvConverter;
                if (yuvConverter != null) {
                    yuvConverter.release();
                }
                YuvUploader yuvUploader = this.mYuvUploader;
                if (yuvUploader != null) {
                    yuvUploader.release();
                }
                List<Integer> list = this.mTextureFreeQueue;
                if (list != null && list.size() > 0) {
                    Iterator<Integer> it = this.mTextureFreeQueue.iterator();
                    while (it.hasNext()) {
                        GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
                    }
                }
                this.mTextureFreeQueue.clear();
                List<Integer> list2 = this.mTextureUsedQueue;
                if (list2 != null && list2.size() > 0) {
                    Iterator<Integer> it2 = this.mTextureUsedQueue.iterator();
                    while (it2.hasNext()) {
                        GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
                    }
                }
                this.mTextureUsedQueue.clear();
                GLES20.glDeleteFramebuffers(1, new int[]{this.mFrameBufferId}, 0);
                this.mFrameBufferId = 0;
                this.mEglBase.release();
                this.mHandler.getLooper().quit();
                return;
            }
            throw new IllegalStateException("Unexpected release.");
        }
        throw new IllegalStateException("Wrong thread.");
    }

    /* loaded from: classes33.dex */
    public static class YuvUploader {
        public ByteBuffer copyBuffer;
        public int[] yuvTextures;

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = 0;
            int i4 = i / 2;
            int[] iArr2 = {i, i4, i4};
            int i5 = i2 / 2;
            int[] iArr3 = {i2, i5, i5};
            int i6 = 0;
            int i7 = 0;
            do {
                int i8 = iArr[i6];
                int i9 = iArr2[i6];
                if (i8 > i9) {
                    i7 = Math.max(i7, i9 * iArr3[i6]);
                }
                i6++;
            } while (i6 < 3);
            if (i7 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i7)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i7);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                int i10 = 0;
                do {
                    this.yuvTextures[i10] = GlUtil.generateTexture(3553);
                    i10++;
                } while (i10 < 3);
            }
            do {
                GLES20.glPixelStorei(3317, 1);
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.yuvTextures[i3]);
                int i11 = iArr[i3];
                int i12 = iArr2[i3];
                if (i11 == i12) {
                    byteBuffer = byteBufferArr[i3];
                } else {
                    YuvHelper.nativeCopyPlane(byteBufferArr[i3], i11, this.copyBuffer, i12, i12, iArr3[i3]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i3], iArr3[i3], 0, 6409, 5121, byteBuffer);
                i3++;
            } while (i3 < 3);
            return this.yuvTextures;
        }
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dequeueTexture$3(int[] iArr) {
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null) {
            if (list.size() == 0) {
                int generateTexture = generateTexture(3553, this.mWidth, this.mHeight);
                iArr[0] = generateTexture;
                if (generateTexture > 0) {
                    this.mTextureUsedQueue.add(Integer.valueOf(generateTexture));
                    return;
                }
                return;
            }
            iArr[0] = ((Integer) ListProtector.get(this.mTextureFreeQueue, 0)).intValue();
            ListProtector.remove(this.mTextureFreeQueue, 0);
            this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueTexture$4(int i) {
        List<Integer> list = this.mTextureUsedQueue;
        if (list != null && list.contains(Integer.valueOf(i))) {
            this.mTextureUsedQueue.remove(new Integer(i));
            List<Integer> list2 = this.mTextureFreeQueue;
            if (list2 != null) {
                list2.add(Integer.valueOf(i));
            }
        }
    }

    public static /* synthetic */ void lambda$releaseTextureID$5(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    public void post(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void queueTexture(final int i) {
        this.mHandler.post(new Runnable() { // from class: X.ZVz
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.this.lambda$queueTexture$4(i);
            }
        });
    }

    public void releaseTextureID(final int i) {
        if (i <= 0 || this.mIsQuitting || this.mIsRelease) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.ZVu
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.lambda$releaseTextureID$5(i);
            }
        });
    }

    public synchronized VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr;
        i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_bytertc_engine_utils_TextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_bytertc_engine_utils_TextureHelper$3__run$___twin___() {
                TextureHelper textureHelper = TextureHelper.this;
                textureHelper.mIsTextureInUse = true;
                if (textureHelper.mYuvConverter == null) {
                    textureHelper.mYuvConverter = new YuvConverter();
                }
                TextureHelper textureHelper2 = TextureHelper.this;
                if (textureHelper2.mTextureDrawer == null) {
                    textureHelper2.mTextureDrawer = new GlRectDrawer();
                }
                i420BufferArr[0] = TextureHelper.this.mYuvConverter.convert(textureBuffer);
                TextureHelper textureHelper3 = TextureHelper.this;
                textureHelper3.mIsTextureInUse = false;
                if (textureHelper3.mIsQuitting) {
                    textureHelper3.release();
                }
            }

            public static void com_ss_bytertc_engine_utils_TextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_bytertc_engine_utils_TextureHelper$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return i420BufferArr[0];
    }

    public void yuvToTexture(VideoFrame.I420Buffer i420Buffer, int i) {
        yuvToTexture(i420Buffer, i, YUV_TEX_MATRIX);
    }

    private int generateTexture(final int i, final int i2, final int i3) {
        if (this.mTextureCnt == 45) {
            return 0;
        }
        return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Callable() { // from class: X.ZW1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer lambda$generateTexture$6;
                lambda$generateTexture$6 = TextureHelper.this.lambda$generateTexture$6(i, i2, i3);
                return lambda$generateTexture$6;
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$generateTexture$6(int i, int i2, int i3) {
        int generateTexture = GlUtil.generateTexture(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, generateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        if (GLES20.glGetError() != 0) {
            return 0;
        }
        this.mTextureCnt++;
        return Integer.valueOf(generateTexture);
    }

    public void drawTexture(int i, int i2, int i3) {
        drawTexture(i, i2, i3, TEX_MATRIX);
    }

    public void yuvToTexture(final VideoFrame.I420Buffer i420Buffer, final int i, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_bytertc_engine_utils_TextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_bytertc_engine_utils_TextureHelper$2__run$___twin___() {
                TextureHelper textureHelper = TextureHelper.this;
                if (textureHelper.mTextureDrawer != null && textureHelper.mYuvUploader != null) {
                    GlUtil.checkNoGLES2Error("TextureHelper construct");
                    GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                    TextureHelper.this.mYuvUploader.uploadFromBuffer(i420Buffer);
                    TextureHelper textureHelper2 = TextureHelper.this;
                    GlRectDrawer glRectDrawer = textureHelper2.mTextureDrawer;
                    int[] yuvTextures = textureHelper2.mYuvUploader.getYuvTextures();
                    float[] fArr2 = fArr;
                    TextureHelper textureHelper3 = TextureHelper.this;
                    int i2 = textureHelper3.mWidth;
                    int i3 = textureHelper3.mHeight;
                    glRectDrawer.drawYuv(yuvTextures, fArr2, i2, i3, 0, 0, i2, i3);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glFinish();
                    GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
                    return;
                }
                throw new IllegalStateException("mTextureDrawer and mYuvUploader can not null.");
            }

            public static void com_ss_bytertc_engine_utils_TextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_bytertc_engine_utils_TextureHelper$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public TextureHelper(Object obj, Handler handler, int i, int i2) {
        if (handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mHandler = handler;
            Matrix.setIdentityM(TEX_MATRIX, 0);
            Matrix.setIdentityM(YUV_TEX_MATRIX, 0);
            Matrix.translateM(YUV_TEX_MATRIX, 0, 0.5f, 0.5f, 0.0f);
            Matrix.scaleM(YUV_TEX_MATRIX, 0, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(YUV_TEX_MATRIX, 0, -0.5f, -0.5f, 0.0f);
            if (obj instanceof EGLContext) {
                this.mEglBase = ZVB.LIZLLL((EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (obj instanceof android.opengl.EGLContext) {
                this.mEglBase = ZVB.LJFF((android.opengl.EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (obj instanceof EglBase.Context) {
                this.mEglBase = ZVB.LIZIZ((EglBase.Context) obj);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unknown shareContext:");
                LIZ.append(obj);
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
            try {
                this.mEglBase.createPbufferSurface(this.mWidth, this.mHeight);
                this.mEglBase.makeCurrent();
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFrameBufferId = iArr[0];
                this.mTextureDrawer = new GlRectDrawer();
                this.mYuvUploader = new YuvUploader();
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                return;
            } catch (RuntimeException e) {
                this.mEglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw new IllegalStateException("TextureHelper must be created on the handler thread");
    }

    public static TextureHelper create(final String str, final android.opengl.EGLContext eGLContext, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: X.ZW0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$1(eGLContext, handler, i, i2, str);
            }
        });
    }

    public void drawTexture(final int i, final int i2, final int i3, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_bytertc_engine_utils_TextureHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_bytertc_engine_utils_TextureHelper$1__run$___twin___() {
                TextureHelper textureHelper = TextureHelper.this;
                if (textureHelper.mTextureDrawer == null) {
                    textureHelper.mTextureDrawer = new GlRectDrawer();
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                int i4 = i;
                if (i4 != 10) {
                    if (i4 != 11) {
                        LogUtil.e("TextureHelper", "draw texture type error");
                    } else {
                        TextureHelper textureHelper2 = TextureHelper.this;
                        GlRectDrawer glRectDrawer = textureHelper2.mTextureDrawer;
                        int i5 = i2;
                        float[] fArr2 = fArr;
                        int i6 = textureHelper2.mWidth;
                        int i7 = textureHelper2.mHeight;
                        glRectDrawer.drawOes(i5, fArr2, i6, i7, 0, 0, i6, i7);
                    }
                } else {
                    TextureHelper textureHelper3 = TextureHelper.this;
                    GlRectDrawer glRectDrawer2 = textureHelper3.mTextureDrawer;
                    int i8 = i2;
                    float[] fArr3 = fArr;
                    int i9 = textureHelper3.mWidth;
                    int i10 = textureHelper3.mHeight;
                    glRectDrawer2.drawRgb(i8, fArr3, i9, i10, 0, 0, i9, i10);
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }

            public static void com_ss_bytertc_engine_utils_TextureHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_bytertc_engine_utils_TextureHelper$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static TextureHelper create(final String str, final EglBase.Context context, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: X.ZVv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$2(EglBase.Context.this, handler, i, i2, str);
            }
        });
    }

    public static TextureHelper create(final String str, final EGLContext eGLContext, final int i, final int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: X.ZVy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$0(eGLContext, handler, i, i2, str);
            }
        });
    }

    public static /* synthetic */ TextureHelper lambda$create$0(EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" create failure");
            LogUtil.e("TextureHelper", X1D.LIZIZ(LIZ), e);
            return null;
        }
    }

    public static /* synthetic */ TextureHelper lambda$create$1(android.opengl.EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" create failure");
            LogUtil.e("TextureHelper", X1D.LIZIZ(LIZ), e);
            return null;
        }
    }

    public static /* synthetic */ TextureHelper lambda$create$2(EglBase.Context context, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(context, handler, i, i2);
        } catch (RuntimeException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" create failure");
            LogUtil.e("TextureHelper", X1D.LIZIZ(LIZ), e);
            return null;
        }
    }
}
