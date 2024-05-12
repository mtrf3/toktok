package com.ss.ttlivestreamer.core.buffer;

import X.C16880lQ;
import X.X1D;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.Surface;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;

/* loaded from: classes12.dex */
public class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
    public static final String TAG = C16880lQ.LJLLJ(SurfaceTextureSharedHandler.class);
    public SurfaceInternal surface;

    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
    public void handlerExit() {
    }

    /* loaded from: classes12.dex */
    public static class SurfaceInternal extends Surface implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
        public final int mHeight;
        public SurfaceTextureHelper.OnTextureFrameAvailableListener mListerne;
        public SurfaceTextureSharedHandler mParent;
        public final int mWidth;

        @Override // android.view.Surface
        public void release() {
            super.release();
            SurfaceTextureSharedHandler surfaceTextureSharedHandler = this.mParent;
            if (surfaceTextureSharedHandler != null) {
                surfaceTextureSharedHandler.dispose();
                this.mParent = null;
            }
            String str = SurfaceTextureSharedHandler.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Release surface ");
            LIZ.append(this);
            LIZ.append(" with w ");
            LIZ.append(this.mWidth);
            LIZ.append(" h ");
            LIZ.append(this.mHeight);
            AVLog.iow(str, X1D.LIZIZ(LIZ));
        }

        public int getHeight() {
            return this.mHeight;
        }

        public SurfaceTextureHelper getSurfaceTextureHelper() {
            return this.mParent;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public void setListener(SurfaceTextureHelper.OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
            this.mListerne = onTextureFrameAvailableListener;
        }

        @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
        public void onTextureFrameAvailable(int i, float[] fArr, long j) {
            SurfaceTextureHelper.OnTextureFrameAvailableListener onTextureFrameAvailableListener = this.mListerne;
            if (onTextureFrameAvailableListener != null) {
                onTextureFrameAvailableListener.onTextureFrameAvailable(i, fArr, j);
            }
            this.mParent.returnTextureFrame();
        }

        public SurfaceInternal(SurfaceTexture surfaceTexture, SurfaceTextureSharedHandler surfaceTextureSharedHandler, int i, int i2) {
            super(surfaceTexture);
            this.mParent = surfaceTextureSharedHandler;
            surfaceTextureSharedHandler.startListening(this);
            this.mWidth = i;
            this.mHeight = i2;
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
    public void dispose() {
        super.dispose();
        GLThreadManager.get().decrementRef();
    }

    public SurfaceTextureSharedHandler(Handler handler) {
        super(handler, true);
    }

    public static Surface createSurface(int i, int i2) {
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager == null) {
            return null;
        }
        gLThreadManager.addRef();
        final Handler mainGlHandle = GLThreadManager.getMainGlHandle();
        final SurfaceTextureSharedHandler[] surfaceTextureSharedHandlerArr = new SurfaceTextureSharedHandler[1];
        ThreadUtils.invokeAtFrontUninterruptibly(mainGlHandle, new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.SurfaceTextureSharedHandler.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_SurfaceTextureSharedHandler$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_SurfaceTextureSharedHandler$1__run$___twin___() {
                surfaceTextureSharedHandlerArr[0] = new SurfaceTextureSharedHandler(mainGlHandle);
            }

            public static void com_ss_ttlivestreamer_core_buffer_SurfaceTextureSharedHandler$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_buffer_SurfaceTextureSharedHandler$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return surfaceTextureSharedHandlerArr[0].getSurface(i, i2);
    }

    public synchronized Surface getSurface(int i, int i2) {
        if (this.surface == null) {
            if (i < 1 || i2 < 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Invalid w ");
                LIZ.append(i);
                LIZ.append(" or h ");
                LIZ.append(i2);
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
                TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(TAG);
                LIZ2.append(".getSurface");
                tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ2));
                if (TTLSBuildConfig.canThrowException()) {
                    throw androidRuntimeException;
                }
            }
            getSurfaceTexture().setDefaultBufferSize(i, i2);
            this.surface = new SurfaceInternal(getSurfaceTexture(), this, i, i2);
            AVLog.iow(TAG, "Create surface " + this.surface + " with w " + i + " h " + i2 + " tex " + getTextureId());
        }
        return this.surface;
    }
}
