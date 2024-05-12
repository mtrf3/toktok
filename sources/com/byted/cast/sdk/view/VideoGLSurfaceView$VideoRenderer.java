package com.byted.cast.sdk.view;

import X.C90653Zhx;
import X.X1D;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.Surface;
import com.byted.cast.sdk.view.IRenderView;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes29.dex */
public final class VideoGLSurfaceView$VideoRenderer implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {
    public Context mContext;
    public int mProgram;
    public IRenderView.IRenderCallback mRenderCallback;
    public SurfaceTexture mSurface;
    public int mTextureID;
    public FloatBuffer mVertices;
    public final float[] mVerticesData;
    public WeakReference<C90653Zhx> mWeakSurfaceView;
    public int maPositionHandle;
    public int maTextureHandle;
    public int muMVPMatrixHandle;
    public int muSTMatrixHandle;
    public boolean updateSurface;
    public final String mVertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    public final String mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    public float[] mMVPMatrix = new float[16];
    public float[] mProjMatrix = new float[16];
    public float[] mMMatrix = new float[16];
    public float[] mVMatrix = new float[16];
    public float[] mSTMatrix = new float[16];
    public float mRatio = 1.0f;

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurface;
    }

    private void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(": glError ");
        LIZ.append(glGetError);
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public void addRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        this.mRenderCallback = iRenderCallback;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            if (this.updateSurface) {
                this.mSurface.updateTexImage();
                this.mSurface.getTransformMatrix(this.mSTMatrix);
                this.updateSurface = false;
            }
        }
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.mProgram);
        checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.mTextureID);
        this.mVertices.position(0);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 20, (Buffer) this.mVertices);
        checkGlError("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        checkGlError("glEnableVertexAttribArray maPositionHandle");
        this.mVertices.position(3);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 3, 5126, false, 20, (Buffer) this.mVertices);
        checkGlError("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        checkGlError("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glDrawArrays(5, 0, 4);
        checkGlError("glDrawArrays");
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.updateSurface = true;
        C90653Zhx c90653Zhx = this.mWeakSurfaceView.get();
        if (c90653Zhx != null) {
            c90653Zhx.requestRender();
        }
    }

    public void removeRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        this.mRenderCallback = null;
    }

    public VideoGLSurfaceView$VideoRenderer(Context context, C90653Zhx c90653Zhx) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.mVerticesData = fArr;
        this.mContext = context;
        this.mWeakSurfaceView = new WeakReference<>(c90653Zhx);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mVertices = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
        Matrix.setIdentityM(this.mMMatrix, 0);
    }

    private int createProgram(String str, String str2) {
        int loadShader;
        int loadShader2 = loadShader(35633, str);
        if (loadShader2 == 0 || (loadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, loadShader2);
            checkGlError("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, loadShader);
            checkGlError("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram);
                return 0;
            }
        }
        return glCreateProgram;
    }

    private int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int createProgram = createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.mProgram = createProgram;
        if (createProgram == 0) {
            return;
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(createProgram, "aPosition");
        checkGlError("glGetAttribLocation aPosition");
        if (this.maPositionHandle != -1) {
            this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
            checkGlError("glGetAttribLocation aTextureCoord");
            if (this.maTextureHandle != -1) {
                this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
                checkGlError("glGetUniformLocation uMVPMatrix");
                if (this.muMVPMatrixHandle != -1) {
                    this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
                    checkGlError("glGetUniformLocation uSTMatrix");
                    if (this.muMVPMatrixHandle != -1) {
                        checkGlError("glGetUniformLocation uCRatio");
                        if (this.muMVPMatrixHandle != -1) {
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            int i = iArr[0];
                            this.mTextureID = i;
                            GLES20.glBindTexture(36197, i);
                            checkGlError("glBindTexture mTextureID");
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            checkGlError("glTexParameteri mTextureID");
                            this.mSurface = new SurfaceTexture(this.mTextureID);
                            Surface surface = new Surface(this.mSurface);
                            IRenderView.IRenderCallback iRenderCallback = this.mRenderCallback;
                            if (iRenderCallback != null) {
                                iRenderCallback.onSurfaceTextureCreated(this.mWeakSurfaceView.get(), surface);
                            }
                            this.mSurface.setOnFrameAvailableListener(this);
                            Matrix.setLookAtM(this.mVMatrix, 0, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                            synchronized (this) {
                                this.updateSurface = false;
                            }
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for uCRatio");
                    }
                    throw new RuntimeException("Could not get attrib location for uSTMatrix");
                }
                throw new RuntimeException("Could not get attrib location for uMVPMatrix");
            }
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        throw new RuntimeException("Could not get attrib location for aPosition");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        float f2;
        GLES20.glViewport(0, 0, i, i2);
        if (i > i2) {
            f = i;
            f2 = i2;
        } else {
            f = i2;
            f2 = i;
        }
        float f3 = f / f2;
        if (i > i2) {
            Matrix.orthoM(this.mProjMatrix, 0, -f3, f3, -1.0f, 1.0f, 0.0f, 10.0f);
        } else {
            Matrix.orthoM(this.mProjMatrix, 0, -1.0f, 1.0f, -f3, f3, 0.0f, 10.0f);
        }
    }
}
