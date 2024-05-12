package com.ss.ttlivestreamer.core.utils;

import X.AnonymousClass028;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class LoadYUVHelper {
    public GlRenderDrawer mGlDrawer;
    public int mHeight;
    public ByteBuffer mNewBuffersU;
    public ByteBuffer mNewBuffersV;
    public ByteBuffer mNewBuffersY;
    public float[] mProj;
    public boolean mRelease;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public int mWidth;
    public int[] mYuvTex = {0, 0, 0};

    public void release() {
        if (this.mGlDrawer != null || this.mTextureFrameBuffer != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.LoadYUVHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_utils_LoadYUVHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_utils_LoadYUVHelper$3__run$___twin___() {
                    AVLog.ioi("LoadYUVHelper", "Release Yuv texture on LoadYUVHelper.");
                    LoadYUVHelper.this.releaseTextureOnGlThread();
                }

                public static void com_ss_ttlivestreamer_core_utils_LoadYUVHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_core_utils_LoadYUVHelper$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void releaseYuvTexturesOnGlThread() {
        int[] iArr = this.mYuvTex;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int i = 0;
            while (true) {
                int[] iArr2 = this.mYuvTex;
                if (i < iArr2.length) {
                    iArr2[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void releaseTextureOnGlThread() {
        releaseYuvTexturesOnGlThread();
        GlRenderDrawer glRenderDrawer = this.mGlDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mGlDrawer = null;
        }
        GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.mTextureFrameBuffer = null;
        }
        if (this.mNewBuffersY != null) {
            this.mNewBuffersY = null;
        }
        if (this.mNewBuffersU != null) {
            this.mNewBuffersU = null;
        }
        if (this.mNewBuffersV != null) {
            this.mNewBuffersV = null;
        }
    }

    public int align(int i) {
        return (((i + 8) - 1) / 8) * 8;
    }

    public LoadYUVHelper(int i, int i2) {
        createTexture(i, i2);
    }

    public void createTexture(final int i, final int i2) {
        ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.LoadYUVHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_LoadYUVHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_LoadYUVHelper$1__run$___twin___() {
                LoadYUVHelper loadYUVHelper = LoadYUVHelper.this;
                if (loadYUVHelper.mRelease) {
                    return;
                }
                if (loadYUVHelper.mGlDrawer == null) {
                    loadYUVHelper.mGlDrawer = new GlRenderDrawer();
                }
                LoadYUVHelper loadYUVHelper2 = LoadYUVHelper.this;
                GlTextureFrameBuffer glTextureFrameBuffer = loadYUVHelper2.mTextureFrameBuffer;
                if (glTextureFrameBuffer != null) {
                    glTextureFrameBuffer.setSize(i, i2);
                } else {
                    loadYUVHelper2.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
                    LoadYUVHelper.this.mTextureFrameBuffer.setSize(i, i2);
                }
                int align = LoadYUVHelper.this.align(i);
                int i3 = (align + 1) >> 1;
                int i4 = (i2 + 1) >> 1;
                LoadYUVHelper.this.releaseYuvTexturesOnGlThread();
                LoadYUVHelper loadYUVHelper3 = LoadYUVHelper.this;
                loadYUVHelper3.mYuvTex[0] = loadYUVHelper3.genTextureWithInit(33984, align, i2);
                LoadYUVHelper loadYUVHelper4 = LoadYUVHelper.this;
                loadYUVHelper4.mYuvTex[1] = loadYUVHelper4.genTextureWithInit(33985, i3, i4);
                LoadYUVHelper loadYUVHelper5 = LoadYUVHelper.this;
                loadYUVHelper5.mYuvTex[2] = loadYUVHelper5.genTextureWithInit(33986, i3, i4);
                LoadYUVHelper loadYUVHelper6 = LoadYUVHelper.this;
                loadYUVHelper6.mWidth = i;
                loadYUVHelper6.mHeight = i2;
                loadYUVHelper6.mProj = null;
                AVLog.ioi("LoadYUVHelper", "create Yuv texture on LoadYUVHelper.");
            }

            public static void com_ss_ttlivestreamer_core_utils_LoadYUVHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_utils_LoadYUVHelper$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public int genTextureWithInit(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10240, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
        return iArr[0];
    }

    private void updateTexSubImage(int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
    }

    public boolean loadYuvAndDraw(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final ByteBuffer byteBuffer3, final int i, final int i2) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null || this.mTextureFrameBuffer == null || this.mGlDrawer == null || this.mYuvTex[0] <= 0) {
            return atomicBoolean.get();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.LoadYUVHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_LoadYUVHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_LoadYUVHelper$2__run$___twin___() {
                LoadYUVHelper loadYUVHelper = LoadYUVHelper.this;
                if (loadYUVHelper.mRelease) {
                    return;
                }
                int align = loadYUVHelper.align(i);
                if (align != i) {
                    int i3 = i2;
                    int i4 = align * i3;
                    int i5 = (align * i3) / 4;
                    int i6 = (i3 * align) / 4;
                    ByteBuffer byteBuffer4 = LoadYUVHelper.this.mNewBuffersY;
                    if (byteBuffer4 == null || byteBuffer4.capacity() != i4) {
                        LoadYUVHelper.this.mNewBuffersY = ByteBuffer.allocateDirect(i2 * align);
                    }
                    ByteBuffer byteBuffer5 = LoadYUVHelper.this.mNewBuffersU;
                    if (byteBuffer5 == null || byteBuffer5.capacity() != i5) {
                        LoadYUVHelper.this.mNewBuffersU = ByteBuffer.allocateDirect((i2 * align) / 4);
                    }
                    ByteBuffer byteBuffer6 = LoadYUVHelper.this.mNewBuffersV;
                    if (byteBuffer6 == null || byteBuffer6.capacity() != i6) {
                        LoadYUVHelper.this.mNewBuffersV = ByteBuffer.allocateDirect((i2 * align) / 4);
                    }
                    LoadYUVHelper.this.mNewBuffersY.clear();
                    LoadYUVHelper.this.mNewBuffersU.clear();
                    LoadYUVHelper.this.mNewBuffersV.clear();
                    byteBuffer.position(0);
                    for (int i7 = 0; i7 < i2; i7++) {
                        ByteBuffer byteBuffer7 = byteBuffer;
                        byteBuffer7.limit(byteBuffer7.position() + i);
                        LoadYUVHelper.this.mNewBuffersY.put(byteBuffer);
                        ByteBuffer byteBuffer8 = LoadYUVHelper.this.mNewBuffersY;
                        byteBuffer8.position((byteBuffer8.position() + align) - i);
                    }
                    LoadYUVHelper.this.mNewBuffersY.position(0);
                    byteBuffer2.position(0);
                    for (int i8 = 0; i8 < i2 / 2; i8++) {
                        ByteBuffer byteBuffer9 = byteBuffer2;
                        byteBuffer9.limit((i / 2) + byteBuffer9.position());
                        LoadYUVHelper.this.mNewBuffersU.put(byteBuffer2);
                        ByteBuffer byteBuffer10 = LoadYUVHelper.this.mNewBuffersU;
                        byteBuffer10.position(((align - i) / 2) + byteBuffer10.position());
                    }
                    LoadYUVHelper.this.mNewBuffersU.position(0);
                    byteBuffer3.position(0);
                    for (int i9 = 0; i9 < i2 / 2; i9++) {
                        ByteBuffer byteBuffer11 = byteBuffer3;
                        byteBuffer11.limit((i / 2) + byteBuffer11.position());
                        LoadYUVHelper.this.mNewBuffersV.put(byteBuffer3);
                        ByteBuffer byteBuffer12 = LoadYUVHelper.this.mNewBuffersV;
                        byteBuffer12.position(((align - i) / 2) + byteBuffer12.position());
                    }
                    LoadYUVHelper.this.mNewBuffersV.position(0);
                    LoadYUVHelper loadYUVHelper2 = LoadYUVHelper.this;
                    loadYUVHelper2.updateI420Image(loadYUVHelper2.mYuvTex, align, i2, loadYUVHelper2.mNewBuffersY, loadYUVHelper2.mNewBuffersU, loadYUVHelper2.mNewBuffersV, null);
                } else {
                    LoadYUVHelper loadYUVHelper3 = LoadYUVHelper.this;
                    loadYUVHelper3.updateI420Image(loadYUVHelper3.mYuvTex, align, i2, byteBuffer, byteBuffer2, byteBuffer3, null);
                }
                LoadYUVHelper.this.mTextureFrameBuffer.setSize(i, i2);
                GLES20.glBindFramebuffer(36160, LoadYUVHelper.this.mTextureFrameBuffer.getFrameBufferId());
                LoadYUVHelper loadYUVHelper4 = LoadYUVHelper.this;
                if (loadYUVHelper4.mProj == null) {
                    loadYUVHelper4.mProj = RendererCommon.identityMatrix();
                    int i10 = i;
                    if (align != i10) {
                        Matrix.orthoM(LoadYUVHelper.this.mProj, 0, -1.0f, ((((i10 * 1.0f) - 0.45f) / align) * 2.0f) - 1.0f, -1.0f, 1.0f, 1.0f, -1.0f);
                    }
                }
                LoadYUVHelper loadYUVHelper5 = LoadYUVHelper.this;
                loadYUVHelper5.mGlDrawer.drawYuv(loadYUVHelper5.mYuvTex, loadYUVHelper5.mProj, RendererCommon.identityMatrix(), 0, 0, i, i2, 0);
                GLES20.glFinish();
                GLES20.glBindFramebuffer(36160, 0);
                atomicBoolean.set(true);
            }

            public static void com_ss_ttlivestreamer_core_utils_LoadYUVHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_utils_LoadYUVHelper$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return atomicBoolean.get();
    }

    public void updateI420Image(int[] iArr, int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int[] iArr2) {
        int i3 = (i + 1) >> 1;
        int i4 = (i2 + 1) >> 1;
        if (iArr2 != null && (i != iArr2[0] || i3 != iArr2[1])) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("I420 format exception");
            if (AnonymousClass028.LJI(androidRuntimeException, "LoadYUVHelper.updateI420Image")) {
                throw androidRuntimeException;
            }
        }
        updateTexSubImage(33984, iArr[0], i, i2, byteBuffer);
        updateTexSubImage(33985, iArr[1], i3, i4, byteBuffer2);
        updateTexSubImage(33986, iArr[2], i3, i4, byteBuffer3);
    }
}
