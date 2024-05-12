package com.ss.ttlivestreamer.livestreamv2;

import android.graphics.Matrix;
import android.opengl.GLES20;
import com.ss.ttlivestreamer.core.buffer.JavaI420Buffer;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class VideoFrameRender {
    public int mYuvHeight;
    public int[] mYuvTexs;
    public int mYuvWidth;

    public void release() {
        int[] iArr = this.mYuvTexs;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.mYuvTexs = null;
        }
    }

    public boolean drawFrame(VideoFrame videoFrame, GlRenderDrawer glRenderDrawer, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4) {
        Matrix matrix;
        float[] fArr3 = fArr;
        Matrix matrix2 = new Matrix();
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        boolean z2 = videoFrame.getBuffer() instanceof JavaI420Buffer;
        if (z) {
            matrix = ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getTransformMatrix();
        } else if (z2) {
            matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        } else {
            matrix = null;
        }
        if (videoFrame.getRotation() != 0) {
            matrix2.preTranslate(0.5f, 0.5f);
            matrix2.preRotate(videoFrame.getRotation());
            matrix2.preTranslate(-0.5f, -0.5f);
        }
        if (fArr2 != null) {
            matrix2.preConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr2));
        }
        if (matrix != null) {
            matrix2.preConcat(matrix);
        }
        if (z) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
            GLES20.glClear(16640);
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                return glRenderDrawer.drawOes(textureBuffer.getTextureId(), fArr3, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2), i, i2, i3, i4);
            }
            return glRenderDrawer.drawRgb(textureBuffer.getTextureId(), fArr3, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2), i, i2, i3, i4);
        }
        JavaI420Buffer javaI420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
        int i5 = 0;
        ByteBuffer[] byteBufferArr = {javaI420Buffer.getDataY(), javaI420Buffer.getDataU(), javaI420Buffer.getDataV()};
        int[] iArr = {javaI420Buffer.getStrideY(), javaI420Buffer.getStrideU(), javaI420Buffer.getStrideV()};
        int[] iArr2 = {javaI420Buffer.getHeight(), javaI420Buffer.getHeight() / 2, javaI420Buffer.getHeight() / 2};
        int[] iArr3 = {33984, 33985, 33986};
        int i6 = 3553;
        if (this.mYuvTexs == null) {
            this.mYuvTexs = new int[3];
            int i7 = 0;
            do {
                GLES20.glActiveTexture(iArr3[i7]);
                this.mYuvTexs[i7] = GlUtil.generateTexture(3553);
                GLES20.glBindTexture(3553, 0);
                i7++;
            } while (i7 < 3);
        }
        if (this.mYuvWidth != javaI420Buffer.getWidth() || this.mYuvHeight != javaI420Buffer.getHeight()) {
            int i8 = 0;
            do {
                GLES20.glActiveTexture(iArr3[i8]);
                GLES20.glBindTexture(3553, this.mYuvTexs[i8]);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i8], iArr2[i8], 0, 6409, 5121, null);
                GLES20.glBindTexture(3553, 0);
                i8++;
            } while (i8 < 3);
            this.mYuvWidth = javaI420Buffer.getWidth();
            this.mYuvHeight = javaI420Buffer.getHeight();
        }
        int i9 = 0;
        do {
            GLES20.glActiveTexture(iArr3[i9]);
            GLES20.glBindTexture(i6, this.mYuvTexs[i9]);
            i6 = i6;
            i5 = i5;
            GLES20.glTexSubImage2D(i6, i5, i5, i5, iArr[i9], iArr2[i9], 6409, 5121, byteBufferArr[i9]);
            GLES20.glBindTexture(i6, i5);
            i9++;
        } while (i9 < 3);
        int[] iArr4 = this.mYuvTexs;
        if (fArr3 == null) {
            fArr3 = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(new Matrix());
        }
        return glRenderDrawer.drawYuv(iArr4, fArr3, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2), i, i2, i3, i4, i5);
    }
}
