package com.ss.ttlivestreamer.core.buffer;

import X.C16880lQ;
import X.C48263Iwt;
import X.KMP;
import X.X1D;
import X.YE1;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* loaded from: classes12.dex */
public class GlTextureFrameBuffer {
    public final Config config;
    public int frameBufferId;
    public int height;
    public final int pixelFormat;
    public int textureId;
    public int width;

    /* loaded from: classes12.dex */
    public static class Config {
        public boolean mDeleteTextureWhenResize;
    }

    private void createTexture() {
        String str;
        try {
            this.textureId = GlUtil.generateTexture(3553);
        } catch (Exception e) {
            String str2 = "";
            if (e.getMessage() == null) {
                str = "";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                str = KMP.LJFF(LIZ, "exception:", e, LIZ);
            }
            this.textureId = -1;
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            if (LLLLIIIILLL != null) {
                str2 = LLLLIIIILLL.getName();
            }
            String str3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            try {
                EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (eglGetCurrentContext != null) {
                    long nativeEGLContext = GLThreadManager.toNativeEGLContext(eglGetCurrentContext);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(eglGetCurrentContext);
                    LIZ2.append(" handle ");
                    LIZ2.append(nativeEGLContext);
                    str3 = X1D.LIZIZ(LIZ2);
                }
            } catch (Exception e2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("some error occurs:");
                LIZ3.append(e2.getCause());
                AVLog.ioe("OpenGL", X1D.LIZIZ(LIZ3));
            }
            int i = 0;
            String LLLZ = C16880lQ.LLLZ("[thread:%s context info:%s] create texture failed:%s", new Object[]{str3, str2, Log.getStackTraceString(new Throwable())});
            AVLog.ioe("OpenGL", LLLZ);
            int glGetError = GLES20.glGetError();
            while (glGetError != 0) {
                str = YE1.LIZIZ(str, ", error code:", glGetError);
                glGetError = GLES20.glGetError();
                i++;
                if (i >= 10) {
                    break;
                }
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LLLZ);
            LIZ4.append(", [opengl errors:");
            LIZ4.append(str);
            LIZ4.append("],loopCount:");
            LIZ4.append(i);
            AVLog.logKibana(6, "OpenGL", X1D.LIZIZ(LIZ4), null);
        }
        if (this.textureId == -1) {
            this.textureId = GlUtil.generateTexture(3553);
        }
    }

    private void releaseTexture() {
        int i = this.textureId;
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.textureId = 0;
        }
    }

    public void release() {
        int i = this.frameBufferId;
        if (i > 0) {
            GLES20.glBindFramebuffer(36160, i);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        }
        releaseTexture();
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public GlTextureFrameBuffer(int i) {
        this(i, null);
    }

    public GlTextureFrameBuffer(int i, Config config) {
        this.config = config;
        switch (i) {
            case 6407:
            case 6408:
            case 6409:
                this.pixelFormat = i;
                createTexture();
                this.width = 0;
                this.height = 0;
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
                return;
            default:
                throw new IllegalArgumentException(KMP.LJ("Invalid pixel format: ", i));
        }
    }

    private void reSizeTextureInner(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.textureId);
        int i3 = this.pixelFormat;
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
    }

    public boolean setSize(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (i == this.width && i2 == this.height) {
                return false;
            }
            this.width = i;
            this.height = i2;
            GlUtil.clearAllGLError();
            Config config = this.config;
            if (config != null && config.mDeleteTextureWhenResize) {
                releaseTexture();
                createTexture();
            }
            try {
                reSizeTextureInner(i, i2);
            } catch (Exception e) {
                AVLog.ioe("GLTextureFrameBuffer", "try reSizeTextureInner first time with exception", e);
                reSizeTextureInner(i, i2);
            }
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return true;
            }
            throw new IllegalStateException(KMP.LJ("Framebuffer not complete, status: ", glCheckFramebufferStatus));
        }
        throw new IllegalArgumentException(C48263Iwt.LIZLLL("Invalid size: ", i, "x", i2));
    }
}
