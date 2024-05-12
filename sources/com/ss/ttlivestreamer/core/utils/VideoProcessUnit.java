package com.ss.ttlivestreamer.core.utils;

import X.V0N;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;

/* loaded from: classes12.dex */
public class VideoProcessUnit {
    public GlTextureFrameBuffer mBuffer;
    public GlRenderDrawer mDrawer;
    public Handler mGlHandler;
    public boolean mHorizontalMirror;
    public int mInputHeight;
    public int mInputWidth;
    public Mode mMode;
    public float[] mPrjMatrix = new float[16];
    public int mRotation;
    public int mTargetHeight;
    public int mTargetWidth;
    public boolean mUpdateProject;
    public boolean mVerticalMirror;

    public synchronized void release() {
        Handler handler = this.mGlHandler;
        if (handler == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.VideoProcessUnit.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_VideoProcessUnit$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_VideoProcessUnit$1__run$___twin___() {
                GlTextureFrameBuffer glTextureFrameBuffer = VideoProcessUnit.this.mBuffer;
                if (glTextureFrameBuffer != null) {
                    glTextureFrameBuffer.release();
                    VideoProcessUnit.this.mBuffer = null;
                }
                GlRenderDrawer glRenderDrawer = VideoProcessUnit.this.mDrawer;
                if (glRenderDrawer != null) {
                    glRenderDrawer.release();
                    VideoProcessUnit.this.mDrawer = null;
                }
                VideoProcessUnit.this.mGlHandler = null;
            }

            public static void com_ss_ttlivestreamer_core_utils_VideoProcessUnit$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_utils_VideoProcessUnit$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private void updateProject() {
        boolean z;
        if (this.mTargetHeight == 0 || this.mTargetWidth == 0) {
            this.mTargetHeight = this.mInputHeight;
            this.mTargetWidth = this.mInputWidth;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preRotate(-this.mRotation);
        this.mPrjMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        if (this.mBuffer == null) {
            this.mBuffer = new GlTextureFrameBuffer(6408);
        }
        this.mBuffer.setSize(this.mTargetWidth, this.mTargetHeight);
        if (this.mMode == Mode.MODE_FIT) {
            z = true;
        } else {
            z = false;
        }
        RendererCommon.calcWindRatio(z, this.mHorizontalMirror, this.mVerticalMirror, this.mTargetWidth, this.mTargetHeight, this.mInputWidth, this.mInputHeight, this.mPrjMatrix);
        this.mUpdateProject = false;
    }

    public void reset() {
        android.opengl.Matrix.setIdentityM(this.mPrjMatrix, 0);
    }

    /* loaded from: classes12.dex */
    public enum Mode {
        MODE_FIT,
        MODE_FILL;

        public static Mode valueOf(String str) {
            return (Mode) V0N.LJJJ(Mode.class, str);
        }
    }

    public void updateRotation(int i) {
        this.mRotation = i;
        this.mUpdateProject = true;
    }

    public VideoProcessUnit(Handler handler, Mode mode) {
        this.mMode = Mode.MODE_FIT;
        reset();
        this.mMode = mode;
        this.mGlHandler = handler;
        if (handler != null) {
        } else {
            throw new AndroidRuntimeException("Handler is null.");
        }
    }

    public void updateCrop(int i, int i2) {
        this.mTargetHeight = i2;
        this.mTargetWidth = i;
        this.mUpdateProject = true;
    }

    public void updateMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
        this.mUpdateProject = true;
    }

    public int onProcess(int i, int i2, int i3, boolean z, float[] fArr) {
        int i4;
        if (i2 >= 1 && i3 >= 1 && i >= 1) {
            if (this.mInputWidth != i2 || this.mInputHeight != i3) {
                this.mInputHeight = i3;
                this.mInputWidth = i2;
                this.mUpdateProject = true;
            }
            if (this.mUpdateProject) {
                updateProject();
            }
            if (this.mDrawer == null) {
                this.mDrawer = new GlRenderDrawer();
            }
            GLES20.glBindFramebuffer(36160, this.mBuffer.getFrameBufferId());
            GLES20.glClear(16640);
            if (z) {
                i4 = 0;
                this.mDrawer.drawOes(i, this.mPrjMatrix, fArr, 0, 0, this.mTargetWidth, this.mTargetHeight);
            } else {
                i4 = 0;
                this.mDrawer.drawRgb(i, this.mPrjMatrix, fArr, 0, 0, this.mTargetWidth, this.mTargetHeight);
            }
            GLES20.glFinish();
            GLES20.glBindFramebuffer(36160, i4);
            return this.mBuffer.getTextureId();
        }
        throw new AndroidRuntimeException("Bad parameter");
    }

    public int process(final int i, final int i2, final int i3, final boolean z, final float[] fArr) {
        final int[] iArr = {-1};
        Handler handler = this.mGlHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.VideoProcessUnit.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_utils_VideoProcessUnit$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_utils_VideoProcessUnit$2__run$___twin___() {
                    iArr[0] = VideoProcessUnit.this.onProcess(i, i2, i3, z, fArr);
                }

                public static void com_ss_ttlivestreamer_core_utils_VideoProcessUnit$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_core_utils_VideoProcessUnit$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        return iArr[0];
    }

    public int process(int i, int i2, int i3, boolean z, Matrix matrix) {
        return process(i, i2, i3, z, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix));
    }
}
