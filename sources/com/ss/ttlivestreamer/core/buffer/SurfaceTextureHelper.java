package com.ss.ttlivestreamer.core.buffer;

import X.AnonymousClass028;
import X.C16880lQ;
import X.X1D;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public class SurfaceTextureHelper {
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public OnTextureFrameAvailableListener listener;
    public final int oesTextureId;
    public SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    public OnTextureFrameAvailableListener pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public YuvConverter yuvConverter;

    /* loaded from: classes12.dex */
    public interface OnTextureFrameAvailableListener {
        void onTextureFrameAvailable(int i, float[] fArr, long j);
    }

    /* loaded from: classes12.dex */
    public class SurfaceTextureInternal extends SurfaceTexture {
        public Boolean isFinalize;

        @Override // android.graphics.SurfaceTexture
        public void finalize() {
            if (this.isFinalize.booleanValue()) {
                return;
            }
            synchronized (this.isFinalize) {
                if (this.isFinalize.booleanValue()) {
                    return;
                }
                this.isFinalize = Boolean.TRUE;
                super.finalize();
            }
        }

        @Override // android.graphics.SurfaceTexture
        public void release() {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG, texture already finalized!");
            if (this.isFinalize.booleanValue()) {
                if (!AnonymousClass028.LJI(androidRuntimeException, "SurfaceTextureHelper.release")) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("BUG, texture already finalized.");
                    LIZ.append(this);
                    AVLog.ioe("SurfaceTextureHelper", X1D.LIZIZ(LIZ));
                    return;
                }
                throw androidRuntimeException;
            }
            synchronized (this.isFinalize) {
                if (this.isFinalize.booleanValue()) {
                    TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "SurfaceTextureHelper.release");
                    if (!TTLSBuildConfig.canThrowException()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("BUG, texture already finalized.");
                        LIZ2.append(this);
                        AVLog.ioe("SurfaceTextureHelper", X1D.LIZIZ(LIZ2));
                        return;
                    }
                    throw androidRuntimeException;
                }
                super.release();
            }
        }

        public SurfaceTextureInternal(int i) {
            super(i);
            this.isFinalize = Boolean.FALSE;
        }
    }

    public void returnTextureFrame() {
        returnTextureFrame(false);
    }

    public void dispose() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$6__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.isQuitting = true;
                if (!surfaceTextureHelper.isTextureInUse) {
                    SurfaceTextureHelper.this.release();
                }
            }

            public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void handlerExit() {
        this.handler.getLooper().quit();
    }

    public void insertTextureFrameIfNeed() {
        if (this.handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            if (this.isQuitting || this.isTextureInUse || this.listener == null) {
                return;
            }
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            long currentTimeMillis = System.currentTimeMillis() * 1000 * 1000;
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, currentTimeMillis);
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public void release() {
        if (this.handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            if (!this.isTextureInUse && this.isQuitting) {
                YuvConverter yuvConverter = this.yuvConverter;
                if (yuvConverter != null) {
                    yuvConverter.release();
                }
                GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
                this.surfaceTexture.release();
                handlerExit();
                return;
            }
            throw new IllegalStateException("Unexpected release.");
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public void stopListening() {
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$4__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = null;
                surfaceTextureHelper.pendingListener = null;
            }

            public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void updateTexImage() {
        this.surfaceTexture.updateTexImage();
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public int getTextureId() {
        return this.oesTextureId;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public SurfaceTextureHelper(Handler handler) {
        this(handler, false);
    }

    public static SurfaceTextureHelper create(String str) {
        GLThread gLThread = new GLThread(str, TTLSThreadConfigHelper.getPriority(str, 0));
        gLThread.start();
        final Handler handler = new Handler(gLThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(handler);
                } catch (RuntimeException unused) {
                    DebugLogUtils.isEnableDebugLog();
                    return null;
                }
            }
        });
    }

    public void returnTextureFrame(final boolean z) {
        this.handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$5__run$___twin___() {
                SurfaceTextureHelper.this.isTextureInUse = false;
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (surfaceTextureHelper.isQuitting) {
                    surfaceTextureHelper.release();
                } else {
                    surfaceTextureHelper.tryDeliverTextureFrame(z);
                }
            }

            public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = onTextureFrameAvailableListener;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$8__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (surfaceTextureHelper.yuvConverter == null) {
                    surfaceTextureHelper.yuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = SurfaceTextureHelper.this.yuvConverter.convert(textureBuffer);
            }

            public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return i420BufferArr[0];
    }

    public void tryDeliverTextureFrame(boolean z) {
        if (this.handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
                return;
            }
            this.isTextureInUse = !z;
            this.hasPendingTexture = false;
            updateTexImage();
            if (z) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() * 1000 * 1000;
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, currentTimeMillis);
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public SurfaceTextureHelper(Handler handler, boolean z) {
        this.setListenerRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$2__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                surfaceTextureHelper.pendingListener = null;
                if (surfaceTextureHelper.hasPendingTexture) {
                    surfaceTextureHelper.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }

            public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.onFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.3
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.hasPendingTexture = true;
                surfaceTextureHelper.tryDeliverTextureFrame(false);
            }
        };
        if (handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            this.handler = handler;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Using finalizeCheck ");
            LIZ.append(z);
            AVLog.iow("SurfaceTextureHelper", X1D.LIZIZ(LIZ));
            int generateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = generateTexture;
            if (z) {
                this.surfaceTexture = new SurfaceTextureInternal(generateTexture);
            } else {
                this.surfaceTexture = new SurfaceTexture(generateTexture);
            }
            setOnFrameAvailableListener(this.surfaceTexture, this.onFrameAvailableListener, handler);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public VideoFrame.TextureBuffer createTextureBuffer(int i, int i2, Matrix matrix) {
        return new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, matrix, this, new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.9
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$9__run$___twin___() {
                SurfaceTextureHelper.this.returnTextureFrame();
            }

            public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void textureToYUV(final ByteBuffer byteBuffer, final int i, final int i2, final int i3, final int i4, final float[] fArr) {
        if (i4 == this.oesTextureId) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.7
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$7__run$___twin___() {
                    SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                    if (surfaceTextureHelper.yuvConverter == null) {
                        surfaceTextureHelper.yuvConverter = new YuvConverter();
                    }
                    SurfaceTextureHelper.this.yuvConverter.convert(byteBuffer, i, i2, i3, i4, fArr);
                }

                public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ;
                    try {
                        anonymousClass7.com_ss_ttlivestreamer_core_buffer_SurfaceTextureHelper$7__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("textureToByteBuffer called with unexpected textureId");
    }
}
