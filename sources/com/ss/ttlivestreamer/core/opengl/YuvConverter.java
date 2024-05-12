package com.ss.ttlivestreamer.core.opengl;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.JavaI420Buffer;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.GlobalControler;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* loaded from: classes12.dex */
public class YuvConverter {
    public static final float[][] RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX;
    public static float[][] RGB_TO_YUV_TRANSFORM_MATRIX;
    public int coeffsLoc;
    public ConverterBufferPool mConverterBufferPool;
    public boolean released;
    public GlShader shader;
    public VideoFrame.TextureBuffer.Type shaderTextureType;
    public int texMatrixLoc;
    public final GlTextureFrameBuffer textureFrameBuffer;
    public final ThreadUtils.ThreadChecker threadChecker;
    public int xUnitLoc;
    public YuvConverterCPU yuvConverterCPU;
    public static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    public static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    public static final float[][] RGB_TO_FULL_RANGE_YUV_TRANSFORM_MATRIX = {new float[]{0.299f, 0.587f, 0.114f, 0.0f}, new float[]{-0.169f, -0.331f, 0.499f, 0.5f}, new float[]{0.499f, -0.418f, -0.0813f, 0.5f}};

    public static native void nativeSetConvertColorRange(int i);

    /* renamed from: com.ss.ttlivestreamer.core.opengl.YuvConverter$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$ttlivestreamer$core$buffer$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$com$ss$ttlivestreamer$core$buffer$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$ttlivestreamer$core$buffer$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        float[][] fArr = {new float[]{0.257f, 0.504f, 0.098f, 0.0625f}, new float[]{-0.148f, -0.291f, 0.439f, 0.5f}, new float[]{0.439f, -0.368f, -0.071f, 0.5f}};
        RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX = fArr;
        RGB_TO_YUV_TRANSFORM_MATRIX = fArr;
    }

    private void setupVertexAttribArray() {
        this.shader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        this.textureFrameBuffer.release();
        YuvConverterCPU yuvConverterCPU = this.yuvConverterCPU;
        if (yuvConverterCPU != null) {
            yuvConverterCPU.release();
            this.yuvConverterCPU = null;
        }
        ConverterBufferPool converterBufferPool = this.mConverterBufferPool;
        if (converterBufferPool != null) {
            converterBufferPool.release();
        }
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.released = false;
        threadChecker.checkIsOnValidThread();
        this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
    }

    /* loaded from: classes12.dex */
    public static class ConverterBufferPool {
        public ByteBuffer[] mByteBuffers;
        public final int mMaxSize;
        public final Object mReleaseFence = new Object();
        public boolean mReleased;
        public boolean[] mRetained;

        public synchronized void release() {
            if (this.mMaxSize != 0 && !this.mReleased) {
                synchronized (this.mReleaseFence) {
                    if (this.mReleased) {
                        return;
                    }
                    this.mReleased = true;
                    for (int i = 0; i < this.mMaxSize; i++) {
                        ByteBuffer byteBuffer = this.mByteBuffers[i];
                        if (byteBuffer != null && !this.mRetained[i]) {
                            byteBuffer.rewind();
                            JniCommon.nativeFreeByteBuffer(this.mByteBuffers[i]);
                        }
                    }
                }
            }
        }

        public ConverterBufferPool(int i) {
            this.mMaxSize = i;
            if (i > 0) {
                this.mByteBuffers = new ByteBuffer[i];
                this.mRetained = new boolean[i];
            }
        }

        public synchronized ByteBuffer lock(int i) {
            if (this.mMaxSize == 0) {
                return JniCommon.nativeAllocateByteBuffer(i);
            }
            if (this.mReleased) {
                return null;
            }
            synchronized (this.mReleaseFence) {
                if (this.mReleased) {
                    return null;
                }
                for (int i2 = 0; i2 < this.mMaxSize; i2++) {
                    if (!this.mRetained[i2]) {
                        ByteBuffer[] byteBufferArr = this.mByteBuffers;
                        ByteBuffer byteBuffer = byteBufferArr[i2];
                        if (byteBuffer == null) {
                            byteBufferArr[i2] = JniCommon.nativeAllocateByteBuffer(i);
                        } else if (byteBuffer.capacity() < i) {
                            JniCommon.nativeFreeByteBuffer(this.mByteBuffers[i2]);
                            this.mByteBuffers[i2] = JniCommon.nativeAllocateByteBuffer(i);
                        }
                        this.mRetained[i2] = true;
                        this.mByteBuffers[i2].rewind();
                        return this.mByteBuffers[i2];
                    }
                }
                return null;
            }
        }

        public synchronized void unlock(ByteBuffer byteBuffer) {
            if (this.mMaxSize == 0) {
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                return;
            }
            if (!this.mReleased) {
                synchronized (this.mReleaseFence) {
                    if (this.mReleased) {
                        JniCommon.nativeFreeByteBuffer(byteBuffer);
                    }
                    for (int i = 0; i < this.mMaxSize; i++) {
                        if (this.mByteBuffers[i] == byteBuffer) {
                            boolean[] zArr = this.mRetained;
                            if (zArr[i]) {
                                zArr[i] = false;
                            } else {
                                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG, release a unretained buffer");
                                TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "YuvConverter.unlock");
                                if (TTLSBuildConfig.canThrowException()) {
                                    throw androidRuntimeException;
                                }
                            }
                        }
                    }
                }
            } else {
                JniCommon.nativeFreeByteBuffer(byteBuffer);
            }
        }
    }

    private void initShader(VideoFrame.TextureBuffer.Type type) {
        String str;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        int i = AnonymousClass2.$SwitchMap$com$ss$ttlivestreamer$core$buffer$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
            } else {
                throw new IllegalArgumentException("Unsupported texture type.");
            }
        } else {
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
        }
        this.shaderTextureType = type;
        GlShader glShader2 = new GlShader("varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n", str);
        this.shader = glShader2;
        glShader2.useProgram();
        this.texMatrixLoc = this.shader.getUniformLocation("texMatrix");
        this.xUnitLoc = this.shader.getUniformLocation("xUnit");
        this.coeffsLoc = this.shader.getUniformLocation("coeffs");
        GLES20.glUniform1i(this.shader.getUniformLocation("tex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        setupVertexAttribArray();
    }

    public static void setConvertColorRange(int i) {
        if (i == 1) {
            RGB_TO_YUV_TRANSFORM_MATRIX = RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX;
        } else if (i == 0) {
            RGB_TO_YUV_TRANSFORM_MATRIX = RGB_TO_FULL_RANGE_YUV_TRANSFORM_MATRIX;
        }
        nativeSetConvertColorRange(i);
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        try {
            i420BufferArr[0] = convertGPUInternal(textureBuffer);
        } catch (Exception unused) {
        }
        if (i420BufferArr[0] == null) {
            i420BufferArr[0] = convertCPUInternal(textureBuffer);
        }
        return i420BufferArr[0];
    }

    public VideoFrame.I420Buffer convertCPUInternal(VideoFrame.TextureBuffer textureBuffer) {
        if (this.yuvConverterCPU == null) {
            this.yuvConverterCPU = new YuvConverterCPU();
        }
        return this.yuvConverterCPU.readPixel(textureBuffer);
    }

    public VideoFrame.I420Buffer convertGPUInternal(VideoFrame.TextureBuffer textureBuffer) {
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = (height + i2 + 1) * i;
        if (this.mConverterBufferPool == null) {
            this.mConverterBufferPool = new ConverterBufferPool(GlobalControler.getYuvConverterBufferPoolCnt());
        }
        final ByteBuffer lock = this.mConverterBufferPool.lock(i3);
        if (lock == null) {
            return null;
        }
        convert(lock, width, height, i, textureBuffer.getTextureId(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), textureBuffer.getType());
        int i4 = i * height;
        int i5 = (i / 2) + i4;
        lock.position(0);
        lock.limit(i4);
        ByteBuffer slice = lock.slice();
        lock.position(i4);
        int i6 = i2 * i;
        lock.limit(i4 + i6);
        ByteBuffer slice2 = lock.slice();
        lock.position(i5);
        lock.limit(i5 + i6);
        return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, lock.slice(), i, textureBuffer.getCaptureMs(), new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.YuvConverter.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_opengl_YuvConverter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_opengl_YuvConverter$1__run$___twin___() {
                ConverterBufferPool converterBufferPool = YuvConverter.this.mConverterBufferPool;
                if (converterBufferPool != null) {
                    converterBufferPool.unlock(lock);
                }
            }

            public static void com_ss_ttlivestreamer_core_opengl_YuvConverter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_opengl_YuvConverter$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        convert(byteBuffer, i, i2, i3, i4, fArr, VideoFrame.TextureBuffer.Type.OES);
    }

    private void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr, VideoFrame.TextureBuffer.Type type) {
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            if (type != this.shaderTextureType) {
                initShader(type);
            }
            this.shader.useProgram();
            setupVertexAttribArray();
            if (i3 % 8 == 0) {
                if (i3 >= i) {
                    int i5 = (i + 3) / 4;
                    int i6 = (i + 7) / 8;
                    int i7 = (i2 + 1) / 2;
                    int i8 = i2 + i7;
                    if (byteBuffer.capacity() >= i3 * i8) {
                        float[] multiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
                        int i9 = i3 / 4;
                        this.textureFrameBuffer.setSize(i9, i8);
                        GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
                        GlUtil.checkNoGLES2Error("glBindFramebuffer");
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(type.getGlTarget(), i4);
                        GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, multiplyMatrices, 0);
                        GLES20.glViewport(0, 0, i5, i2);
                        float f = i;
                        GLES20.glUniform2f(this.xUnitLoc, multiplyMatrices[0] / f, multiplyMatrices[1] / f);
                        float[] fArr2 = RGB_TO_YUV_TRANSFORM_MATRIX[0];
                        GLES20.glUniform4f(this.coeffsLoc, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glViewport(0, i2, i6, i7);
                        GLES20.glUniform2f(this.xUnitLoc, (multiplyMatrices[0] * 2.0f) / f, (multiplyMatrices[1] * 2.0f) / f);
                        float[] fArr3 = RGB_TO_YUV_TRANSFORM_MATRIX[1];
                        GLES20.glUniform4f(this.coeffsLoc, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glViewport(i3 / 8, i2, i6, i7);
                        float[] fArr4 = RGB_TO_YUV_TRANSFORM_MATRIX[2];
                        GLES20.glUniform4f(this.coeffsLoc, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glReadPixels(0, 0, i9, i8, 6408, 5121, byteBuffer);
                        GlUtil.checkNoGLES2Error("YuvConverter.convert");
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glBindTexture(3553, 0);
                        GLES20.glBindTexture(type.getGlTarget(), 0);
                        return;
                    }
                    throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
                }
                throw new IllegalArgumentException("Invalid stride, must >= width");
            }
            throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }
}
