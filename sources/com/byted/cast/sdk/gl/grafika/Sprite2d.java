package com.byted.cast.sdk.gl.grafika;

import X.X1D;
import android.opengl.Matrix;

/* loaded from: classes29.dex */
public class Sprite2d {
    public float mAngle;
    public float[] mColor;
    public Drawable2d mDrawable;
    public boolean mMatrixReady;
    public float[] mModelViewMatrix;
    public float mPosX;
    public float mPosY;
    public float mScaleX;
    public float mScaleY;
    public float[] mScratchMatrix = new float[16];
    public int mTextureId;

    private void recomputeMatrix() {
        float[] fArr = this.mModelViewMatrix;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.mPosX, this.mPosY, 0.0f);
        float f = this.mAngle;
        if (f != 0.0f) {
            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        }
        Matrix.scaleM(fArr, 0, this.mScaleX, this.mScaleY, 1.0f);
        this.mMatrixReady = true;
    }

    public float[] getModelViewMatrix() {
        if (!this.mMatrixReady) {
            recomputeMatrix();
        }
        return this.mModelViewMatrix;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Sprite2d pos=");
        LIZ.append(this.mPosX);
        LIZ.append(",");
        LIZ.append(this.mPosY);
        LIZ.append(" scale=");
        LIZ.append(this.mScaleX);
        LIZ.append(",");
        LIZ.append(this.mScaleY);
        LIZ.append(" angle=");
        LIZ.append(this.mAngle);
        LIZ.append(" color={");
        LIZ.append(this.mColor[0]);
        LIZ.append(",");
        LIZ.append(this.mColor[1]);
        LIZ.append(",");
        LIZ.append(this.mColor[2]);
        LIZ.append("} drawable=");
        LIZ.append(this.mDrawable);
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public float[] getColor() {
        return this.mColor;
    }

    public float getPositionX() {
        return this.mPosX;
    }

    public float getPositionY() {
        return this.mPosY;
    }

    public float getRotation() {
        return this.mAngle;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public Sprite2d(Drawable2d drawable2d) {
        this.mDrawable = drawable2d;
        float[] fArr = new float[4];
        this.mColor = fArr;
        fArr[3] = 1.0f;
        this.mTextureId = -1;
        this.mModelViewMatrix = new float[16];
    }

    public void setRotation(float f) {
        while (f >= 360.0f) {
            f -= 360.0f;
        }
        while (f <= -360.0f) {
            f += 360.0f;
        }
        this.mAngle = f;
        this.mMatrixReady = false;
    }

    public void setTexture(int i) {
        this.mTextureId = i;
    }

    public void draw(Texture2dProgram texture2dProgram, float[] fArr) {
        Matrix.multiplyMM(this.mScratchMatrix, 0, fArr, 0, getModelViewMatrix(), 0);
        texture2dProgram.draw(this.mScratchMatrix, this.mDrawable.getVertexArray(), 0, this.mDrawable.getVertexCount(), this.mDrawable.getCoordsPerVertex(), this.mDrawable.getVertexStride(), GlUtil.IDENTITY_MATRIX, this.mDrawable.getTexCoordArray(), this.mTextureId, this.mDrawable.getTexCoordStride());
    }

    public void setPosition(float f, float f2) {
        this.mPosX = f;
        this.mPosY = f2;
        this.mMatrixReady = false;
    }

    public void setScale(float f, float f2) {
        this.mScaleX = f;
        this.mScaleY = f2;
        this.mMatrixReady = false;
    }

    public void draw(FlatShadedProgram flatShadedProgram, float[] fArr) {
        Matrix.multiplyMM(this.mScratchMatrix, 0, fArr, 0, getModelViewMatrix(), 0);
        flatShadedProgram.draw(this.mScratchMatrix, this.mColor, this.mDrawable.getVertexArray(), 0, this.mDrawable.getVertexCount(), this.mDrawable.getCoordsPerVertex(), this.mDrawable.getVertexStride());
    }

    public void setColor(float f, float f2, float f3) {
        float[] fArr = this.mColor;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }
}
