package com.byted.cast.sdk.gl.drawer;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import com.byted.cast.sdk.gl.utils.GLUtils;
import com.byted.cast.sdk.log.Logger;
import com.byted.cast.sdk.log.LoggerManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes29.dex */
public class TextureDrawer {
    public float[] mCustomMVP;
    public int mDrawX;
    public int mDrawY;
    public int mHeight;
    public boolean mIsSetup;
    public Logger mLogger;
    public int mMVPMatrixLoc;
    public String mMirrorId;
    public int mProgram;
    public float mRotation;
    public int mTexCoordsLoc;
    public int mTexTransMatrixLoc;
    public int mVao;
    public int mVboTexCoords;
    public int mVboVertices;
    public int mVerticesLoc;
    public int mWidth;
    public float[] mVertexPosition = GLUtils.VERTEX_POSITION;
    public float[] mTextureCoordinate = GLUtils.TEXTURE_COORDINATE;

    private void afterDraw() {
    }

    private void beforeDraw() {
    }

    public int getTextureTarget() {
        return 3553;
    }

    private boolean setupLocations() {
        this.mVerticesLoc = GLES20.glGetAttribLocation(this.mProgram, "a_pos");
        this.mTexCoordsLoc = GLES20.glGetAttribLocation(this.mProgram, "a_tex");
        this.mMVPMatrixLoc = GLES20.glGetUniformLocation(this.mProgram, "u_mvp");
        this.mTexTransMatrixLoc = GLES20.glGetUniformLocation(this.mProgram, "u_tex_trans");
        return GLUtils.checkGlError("TextureDrawer glBindAttribLocation", this.mMirrorId);
    }

    private void setupVBO() {
        GLES20.glBindBuffer(34962, this.mVboVertices);
        GLES20.glEnableVertexAttribArray(this.mVerticesLoc);
        GLES20.glVertexAttribPointer(this.mVerticesLoc, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.mVboTexCoords);
        GLES20.glEnableVertexAttribArray(this.mTexCoordsLoc);
        GLES20.glVertexAttribPointer(this.mTexCoordsLoc, 2, 5126, false, 0, 0);
    }

    public String[] getShaderSources() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex_coord;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex_coord = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "precision mediump float;\nuniform sampler2D u_tex;\nvarying vec2 v_tex_coord;\nvoid main() {\n  gl_FragColor = texture2D(u_tex, v_tex_coord);\n}\n"};
    }

    public void release() {
        int i = this.mProgram;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.mProgram = 0;
        }
        int i2 = this.mVboVertices;
        if (i2 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i2}, 0);
            this.mVboVertices = 0;
        }
        int i3 = this.mVboTexCoords;
        if (i3 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i3}, 0);
            this.mVboTexCoords = 0;
        }
        int i4 = this.mVao;
        if (i4 != 0) {
            GLES30.glDeleteVertexArrays(1, new int[]{i4}, 0);
            this.mVao = 0;
        }
    }

    private boolean setupBuffers() {
        float[] vertexPosition = getVertexPosition();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(vertexPosition.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(vertexPosition);
        asFloatBuffer.rewind();
        float[] textureCoordinate = getTextureCoordinate();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(textureCoordinate.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(textureCoordinate);
        asFloatBuffer2.rewind();
        int[] iArr = new int[2];
        GLES20.glGenBuffers(2, iArr, 0);
        int i = iArr[0];
        this.mVboVertices = i;
        this.mVboTexCoords = iArr[1];
        GLES20.glBindBuffer(34962, i);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        GLES20.glBindBuffer(34962, this.mVboTexCoords);
        GLES20.glBufferData(34962, 32, asFloatBuffer2, 35044);
        GLES20.glBindBuffer(34962, 0);
        if (GLUtils.isGL3()) {
            int createVAO = GLUtils.createVAO();
            this.mVao = createVAO;
            GLES30.glBindVertexArray(createVAO);
        }
        setupVBO();
        if (GLUtils.isGL3()) {
            GLES30.glBindVertexArray(0);
        }
        GLES20.glBindBuffer(34962, 0);
        return GLUtils.checkGlError("TextureDrawer setup VAO, VBOs.", this.mMirrorId);
    }

    private boolean setupShaders() {
        String[] shaderSources = getShaderSources();
        int createProgram = GLUtils.createProgram(shaderSources[0], shaderSources[1], this.mMirrorId);
        this.mProgram = createProgram;
        if (createProgram == 0) {
            return false;
        }
        return true;
    }

    public boolean setup() {
        if (!setupShaders() || !setupLocations() || !setupBuffers()) {
            return false;
        }
        this.mIsSetup = true;
        return true;
    }

    private float[] getTextureCoordinate() {
        return this.mTextureCoordinate;
    }

    private float[] getVertexPosition() {
        return this.mVertexPosition;
    }

    public int getDrawX() {
        return this.mDrawX;
    }

    public int getDrawY() {
        return this.mDrawY;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isSetup() {
        return this.mIsSetup;
    }

    public TextureDrawer(String str) {
        this.mMirrorId = str;
        this.mLogger = LoggerManager.getLogger(str);
    }

    public void draw(int i) {
        draw(i, null);
    }

    public void setRotation(float f) {
        if (this.mCustomMVP == null) {
            this.mCustomMVP = new float[16];
        }
        this.mRotation = f;
        Matrix.setIdentityM(this.mCustomMVP, 0);
        Matrix.rotateM(this.mCustomMVP, 0, f, 0.0f, 0.0f, -1.0f);
    }

    public void setTextureCoordinate(float[] fArr) {
        this.mTextureCoordinate = fArr;
    }

    private void generateFitConfig(int i, int i2) {
        float f;
        float f2;
        this.mTextureCoordinate = GLUtils.TEXTURE_COORDINATE;
        int i3 = this.mWidth;
        float f3 = 1.0f;
        int i4 = this.mHeight;
        float f4 = (i * 1.0f) / i2;
        float f5 = 0.0f;
        if (f4 < (i3 * 1.0f) / i4) {
            float f6 = i4 * f4;
            f5 = 0.5f - ((f6 / i3) / 2.0f);
            f3 = ((f6 / i3) / 2.0f) + 0.5f;
            this.mDrawX = (int) (i3 * f5);
            f = 0.0f;
            f2 = 1.0f;
        } else {
            float f7 = i3 / f4;
            f = 0.5f - ((f7 / i4) / 2.0f);
            f2 = ((f7 / i4) / 2.0f) + 0.5f;
            this.mDrawY = (int) (i4 * f);
        }
        ortho(f5, f3, f, f2);
    }

    private void generateFullConfig(int i, int i2) {
        this.mVertexPosition = GLUtils.VERTEX_POSITION;
        float f = (this.mWidth * 1.0f) / this.mHeight;
        float f2 = i;
        float f3 = i2;
        if ((f2 * 1.0f) / f3 < f) {
            float f4 = ((f3 - (f2 / f)) / 2.0f) / f3;
            float f5 = 1.0f - f4;
            this.mTextureCoordinate = new float[]{0.0f, f4, 0.0f, f5, 1.0f, f4, 1.0f, f5};
        } else {
            float f6 = ((f2 - (f3 * f)) / 2.0f) / f2;
            float f7 = 1.0f - f6;
            this.mTextureCoordinate = new float[]{f6, 0.0f, f6, 1.0f, f7, 0.0f, f7, 1.0f};
        }
    }

    public void draw(int i, float[] fArr) {
        GLES20.glUseProgram(this.mProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(getTextureTarget(), i);
        if (GLUtils.isGL3()) {
            GLES30.glBindVertexArray(this.mVao);
        } else {
            setupVBO();
        }
        int i2 = this.mMVPMatrixLoc;
        float[] fArr2 = this.mCustomMVP;
        if (fArr2 == null) {
            fArr2 = GLUtils.IDENTITY_MATRIX;
        }
        GLES20.glUniformMatrix4fv(i2, 1, false, fArr2, 0);
        if (fArr == null) {
            fArr = GLUtils.IDENTITY_MATRIX;
        }
        GLES20.glUniformMatrix4fv(this.mTexTransMatrixLoc, 1, false, fArr, 0);
        GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
        beforeDraw();
        GLES20.glDrawArrays(5, 0, 4);
        afterDraw();
        if (GLUtils.isGL3()) {
            GLES30.glBindVertexArray(0);
        }
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindTexture(getTextureTarget(), 0);
    }

    public boolean setViewportSize(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        return true;
    }

    public boolean setup(int i, int i2, GLUtils.DISPLAY_MODE display_mode) {
        if (display_mode == GLUtils.DISPLAY_MODE.FULL) {
            generateFullConfig(i, i2);
        } else if (display_mode == GLUtils.DISPLAY_MODE.FIT) {
            generateFitConfig(i, i2);
        }
        return setup();
    }

    private void ortho(float f, float f2, float f3, float f4) {
        float f5 = (this.mWidth * 1.0f) / this.mHeight;
        float f6 = f5 * 2.0f;
        float f7 = (f * f6) - f5;
        float f8 = (f6 * f2) - f5;
        float f9 = ((f3 * 2.0f) - 1.0f) * (-1.0f);
        float f10 = ((2.0f * f4) - 1.0f) * (-1.0f);
        float[] fArr = new float[16];
        this.mCustomMVP = fArr;
        Matrix.orthoM(fArr, 0, -f5, f5, -1.0f, 1.0f, -1.0f, 1.0f);
        Matrix.rotateM(this.mCustomMVP, 0, this.mRotation, 0.0f, 0.0f, -1.0f);
        this.mVertexPosition = new float[]{f7, f10, f7, f9, f8, f10, f8, f9};
    }
}
