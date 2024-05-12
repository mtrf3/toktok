package com.bytedance.realx.video.memory.helper;

import X.C16880lQ;
import X.X1D;
import X.ZVB;
import X.ZW8;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RGBABuffer;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.memory.RXVideoTextureMemory;
import com.bytedance.realx.video.memory.helper.AndroidOpenGLTextureMemoryHelper;
import com.bytedance.realx.video.utils.RgbaConverter;
import com.bytedance.realx.video.utils.YuvConverter;
import java.util.concurrent.Callable;

/* loaded from: classes33.dex */
public class AndroidOpenGLTextureMemoryHelper {
    public final EglBase eglBase;
    public final Handler handler;
    public boolean isQuitting;
    public final YuvConverter yuvConverter = new YuvConverter();
    public final RgbaConverter rgbaConverter = new RgbaConverter();

    public /* synthetic */ void lambda$dispose$3() {
        this.isQuitting = true;
        release();
    }

    public synchronized void dispose() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: X.ZW9
            @Override // java.lang.Runnable
            public final void run() {
                AndroidOpenGLTextureMemoryHelper.this.lambda$dispose$3();
            }
        });
    }

    private void release() {
        if (this.handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            this.yuvConverter.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public /* synthetic */ RGBABuffer lambda$textureToRgba$2(RXVideoTextureMemory rXVideoTextureMemory) {
        return this.rgbaConverter.convert(rXVideoTextureMemory);
    }

    public /* synthetic */ VideoFrame.I420Buffer lambda$textureToYuv$1(RXVideoTextureMemory rXVideoTextureMemory) {
        return this.yuvConverter.convert(rXVideoTextureMemory);
    }

    public synchronized RGBABuffer textureToRgba(RXVideoTextureMemory rXVideoTextureMemory) {
        try {
            if (!this.isQuitting) {
            } else {
                throw new IllegalStateException("Wrong call state, current tetxure memory helper has quited.");
            }
        } catch (Exception e) {
            RXLogging.e("AndroidOpenGLTextureMemoryHelper", "textureToRgba failure", e);
            C16880lQ.LLLLIIL(e);
            return null;
        }
        return (RGBABuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new ZW8(0, this, rXVideoTextureMemory));
    }

    public synchronized VideoFrame.I420Buffer textureToYuv(final RXVideoTextureMemory rXVideoTextureMemory) {
        try {
            if (!this.isQuitting) {
            } else {
                throw new IllegalStateException("Wrong call state, current tetxure memory helper has quited.");
            }
        } catch (Exception e) {
            RXLogging.e("AndroidOpenGLTextureMemoryHelper", "textureToYuv failure", e);
            C16880lQ.LLLLIIL(e);
            return null;
        }
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable() { // from class: X.ZWA
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VideoFrame.I420Buffer lambda$textureToYuv$1;
                lambda$textureToYuv$1 = AndroidOpenGLTextureMemoryHelper.this.lambda$textureToYuv$1(rXVideoTextureMemory);
                return lambda$textureToYuv$1;
            }
        });
    }

    public AndroidOpenGLTextureMemoryHelper(EGLContext eGLContext, Handler handler) {
        if (handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            this.handler = handler;
            EglBase LJFF = ZVB.LJFF(eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = LJFF;
            try {
                LJFF.createDummyPbufferSurface();
                LJFF.makeCurrent();
                return;
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw new IllegalStateException("AndroidOpenGLTextureMemoryHelper must be created on the handler thread");
    }

    public static AndroidOpenGLTextureMemoryHelper create(final String str, final EGLContext eGLContext) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (AndroidOpenGLTextureMemoryHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: X.ZWB
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AndroidOpenGLTextureMemoryHelper.lambda$create$0(eGLContext, handler, str);
            }
        });
    }

    public static /* synthetic */ AndroidOpenGLTextureMemoryHelper lambda$create$0(EGLContext eGLContext, Handler handler, String str) {
        try {
            return new AndroidOpenGLTextureMemoryHelper(eGLContext, handler);
        } catch (RuntimeException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" create failure");
            RXLogging.e("AndroidOpenGLTextureMemoryHelper", X1D.LIZIZ(LIZ), e);
            return null;
        }
    }
}
