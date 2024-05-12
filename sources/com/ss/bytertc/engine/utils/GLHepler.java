package com.ss.bytertc.engine.utils;

import X.X1D;
import X.ZVB;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlShader;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.utils.GLHepler;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;

/* loaded from: classes33.dex */
public class GLHepler {
    public static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    public static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    public final String TAG;
    public int frameBufferId;
    public Handler handler;
    public boolean mBInit;
    public EglBase mEglBase;
    public final String mFragmentShader;
    public GlShader mGlShader;
    public final String mVertorShader;
    public boolean released;
    public GlShader shader;
    public VideoFrame.TextureBuffer.Type shaderTextureType;
    public final ThreadUtils.ThreadChecker threadChecker;

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
    }

    private void initShader(VideoFrame.TextureBuffer.Type type) {
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        if (this.mBInit) {
            return;
        }
        this.mBInit = true;
        this.shaderTextureType = type;
        GlShader glShader2 = new GlShader("attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}");
        this.shader = glShader2;
        glShader2.useProgram();
        GLES20.glUniform1i(this.shader.getUniformLocation("s_texture"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        this.shader.setVertexAttribArray("vPosition", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("inputTextureCoordinate", 2, TEXTURE_RECTANGLE);
    }

    public GLHepler(EGLContext eGLContext, Handler handler) {
        this.TAG = "GLHepler";
        this.mVertorShader = "attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n";
        this.mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.released = false;
        this.handler = handler;
        EglBase LJFF = ZVB.LJFF(eGLContext, EglBase.CONFIG_PIXEL_BUFFER);
        this.mEglBase = LJFF;
        try {
            LJFF.createDummyPbufferSurface();
            this.mEglBase.makeCurrent();
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
            threadChecker.detachThread();
        } catch (RuntimeException e) {
            this.mEglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    public static GLHepler create(final String str, final EGLContext eGLContext) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (GLHepler) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<GLHepler>() { // from class: com.ss.bytertc.engine.utils.GLHepler.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GLHepler call() {
                try {
                    return new GLHepler(eGLContext, handler);
                } catch (RuntimeException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" create failure");
                    LogUtil.e("TextureHelper", X1D.LIZIZ(LIZ), e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverToTexture2D$0(int i, int i2, int i3, int i4) {
        long currentTimeMillis = System.currentTimeMillis();
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            if (!this.mBInit) {
                initShader(VideoFrame.TextureBuffer.Type.OES);
                this.shader.useProgram();
                GLES20.glBindFramebuffer(36160, this.frameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            }
            this.shader.useProgram();
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glViewport(0, 0, i3, i4);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glBindTexture(36197, 0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("usetime:");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            LogUtil.i("opnngl ToTexture2D", X1D.LIZIZ(LIZ));
            return;
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }

    public void deliverToTexture2D(final int i, final int i2, final int i3, final int i4, float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: X.ZVt
            @Override // java.lang.Runnable
            public final void run() {
                GLHepler.this.lambda$deliverToTexture2D$0(i4, i3, i, i2);
            }
        });
    }
}
