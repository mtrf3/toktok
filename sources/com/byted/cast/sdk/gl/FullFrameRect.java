package com.byted.cast.sdk.gl;

import X.X1D;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import com.byted.cast.common.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes29.dex */
public class FullFrameRect {
    public static final float[] FULL_RECTANGLE_COORDS = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] FULL_RECTANGLE_TEX_COORDS = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public Texture2DProgram program;
    public float[] mvpMatrix = new float[16];
    public boolean useCamera = true;
    public FloatBuffer FULL_RECTANGLE_BUF = createFloatBuffer(FULL_RECTANGLE_COORDS);
    public FloatBuffer FULL_RECTANGLE_TEX_BUF = createFloatBuffer(FULL_RECTANGLE_TEX_COORDS);

    public int createTextureObject() {
        return this.program.createTextureObject();
    }

    public FullFrameRect(Texture2DProgram texture2DProgram) {
        this.program = texture2DProgram;
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public void changeProgram(Texture2DProgram texture2DProgram) {
        this.program.release();
        this.program = texture2DProgram;
    }

    public void release(boolean z) {
        if (z) {
            this.program.release();
        }
    }

    public void setUseCamera(boolean z) {
        this.useCamera = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setUseCamera:");
        LIZ.append(z);
        Logger.i("FullFrameRect", X1D.LIZIZ(LIZ));
    }

    public void drawFrame(int i, float[] fArr) {
        this.program.draw(this.mvpMatrix, this.FULL_RECTANGLE_BUF, 0, 4, 2, 8, fArr, this.FULL_RECTANGLE_TEX_BUF, i, 8);
    }

    public void setMVPMatrixAndViewPort(float f, Size size) {
        float f2;
        float f3;
        Matrix.setIdentityM(this.mvpMatrix, 0);
        if (this.useCamera) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setMVPMatrixAndViewPort, rotateM:");
            if (f == 0.0f) {
                f2 = 270.0f;
            } else {
                f2 = f - 90.0f;
            }
            LIZ.append(f2);
            Logger.i("FullFrameRect", X1D.LIZIZ(LIZ));
            float[] fArr = this.mvpMatrix;
            if (f == 0.0f) {
                f3 = 270.0f;
            } else {
                f3 = f - 90.0f;
            }
            Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, -1.0f);
        } else {
            Logger.i("FullFrameRect", "setMVPMatrixAndViewPort, rotateM: 0");
            Matrix.rotateM(this.mvpMatrix, 0, 0.0f, 0.0f, 0.0f, -1.0f);
        }
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
    }
}
