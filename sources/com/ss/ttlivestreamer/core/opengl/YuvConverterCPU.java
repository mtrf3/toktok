package com.ss.ttlivestreamer.core.opengl;

import X.C22510uV;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.JavaI420Buffer;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class YuvConverterCPU {
    public ByteBuffer mBuffer;
    public GlTextureFrameBuffer mFrameBuffer;
    public GlRenderDrawer mGlDrawer;

    public void release() {
        GlTextureFrameBuffer glTextureFrameBuffer = this.mFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.mFrameBuffer = null;
        }
        GlRenderDrawer glRenderDrawer = this.mGlDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mGlDrawer = null;
        }
    }

    public static int clamp(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public VideoFrame.I420Buffer readPixel(VideoFrame.TextureBuffer textureBuffer) {
        if (this.mFrameBuffer == null) {
            GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mFrameBuffer = glTextureFrameBuffer;
            glTextureFrameBuffer.setSize(textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        if (this.mGlDrawer == null) {
            this.mGlDrawer = new GlRenderDrawer();
        }
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        android.graphics.Matrix matrix = new android.graphics.Matrix(textureBuffer.getTransformMatrix());
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        Matrix.rotateM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix), 0);
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer.getFrameBufferId());
        if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
            this.mGlDrawer.drawOes(textureBuffer.getTextureId(), fArr, fArr2, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
        } else {
            this.mGlDrawer.drawRgb(textureBuffer.getTextureId(), fArr, fArr2, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        GLES20.glFinish();
        int height2 = textureBuffer.getHeight() * textureBuffer.getWidth() * 4;
        ByteBuffer byteBuffer = this.mBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < height2) {
            this.mBuffer = ByteBuffer.allocateDirect(height2);
        }
        this.mBuffer.rewind();
        GLES20.glReadPixels(0, 0, textureBuffer.getWidth(), textureBuffer.getHeight(), 6408, 5121, this.mBuffer);
        this.mBuffer.position(0);
        GLES20.glBindFramebuffer(36160, 0);
        byte[] bArr = new byte[this.mBuffer.limit()];
        this.mBuffer.get(bArr);
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = (height + i2 + 1) * i;
        byte[] bArr2 = new byte[i3];
        RGBA2_YUV420P_I420_YU12(bArr, bArr2, width, height);
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i3);
        nativeAllocateByteBuffer.clear();
        nativeAllocateByteBuffer.put(bArr2);
        int i4 = i * height;
        int i5 = (i / 2) + i4;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i4);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i4);
        int i6 = i2 * i;
        nativeAllocateByteBuffer.limit(i4 + i6);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i5);
        nativeAllocateByteBuffer.limit(i5 + i6);
        return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, nativeAllocateByteBuffer.slice(), i, textureBuffer.getCaptureMs(), new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.YuvConverterCPU.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_opengl_YuvConverterCPU$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_opengl_YuvConverterCPU$1__run$___twin___() {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }

            public static void com_ss_ttlivestreamer_core_opengl_YuvConverterCPU$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_opengl_YuvConverterCPU$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void RGBA2_YUV420P_I420_YU12(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = i5 + 1;
                int i11 = bArr[i5] & 255;
                int i12 = i10 + 1;
                int i13 = bArr[i10] & 255;
                int i14 = i12 + 1;
                int i15 = bArr[i12] & 255;
                i5 = i14 + 1;
                int LIZ = (C22510uV.LIZ(i15, 25, (i13 * 129) + (i11 * 66), 128) >> 8) + 16;
                int LIZ2 = (C22510uV.LIZ(i15, 112, (i11 * (-38)) - (i13 * 74), 128) >> 8) + 128;
                int i16 = (((((i11 * 112) - (i13 * 94)) - (i15 * 18)) + 128) >> 8) + 128;
                int i17 = i4 + 1;
                bArr2[i4] = (byte) clamp(LIZ);
                if (i8 % 2 == 0 && i6 % 2 == 0) {
                    int i18 = i3 + i7;
                    bArr2[i18] = (byte) clamp(LIZ2);
                    int i19 = i / 2;
                    bArr2[i18 + i19] = (byte) clamp(i16);
                    i7++;
                    if (i7 == i19) {
                        i3 += i;
                        i7 = 0;
                    }
                }
                i6++;
                i9++;
                i4 = i17;
            }
        }
    }
}
