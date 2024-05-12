package com.bytedance.realx.video.utils;

import X.X1D;
import X.ZVO;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.GlGenericDrawer;
import com.bytedance.realx.video.GlShader;
import com.bytedance.realx.video.GlTextureFrameBuffer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.memory.RXVideoTextureMemory;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class YuvConverter {
    public final GlGenericDrawer drawer;
    public final GlTextureFrameBuffer i420TextureFrameBuffer;
    public final ShaderCallbacks shaderCallbacks;
    public final ThreadUtils.ThreadChecker threadChecker;

    /* loaded from: classes33.dex */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public float[] coeffs;
        public int coeffsLoc;
        public float stepSize;
        public int xUnitLoc;
        public static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        public static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        public static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }

        public ShaderCallbacks() {
        }

        public /* synthetic */ ShaderCallbacks(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }
    }

    /* renamed from: com.bytedance.realx.video.utils.YuvConverter$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kVideoPixelFormatTextureOES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kVideoPixelFormatTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.threadChecker.detachThread();
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", shaderCallbacks);
        threadChecker.detachThread();
    }

    public VideoFrame.I420Buffer convert(RXVideoTextureMemory rXVideoTextureMemory) {
        this.threadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("YUVConverter");
        int width = rXVideoTextureMemory.getWidth();
        int height = rXVideoTextureMemory.getHeight();
        int i = ((width + 63) / 64) * 64;
        int i2 = ((width + 7) / 8) * 8;
        int i3 = (height + 1) / 2;
        int i4 = height + i3;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i * i4) + i);
        if (nativeAllocateByteBuffer == null) {
            return null;
        }
        int i5 = i / 4;
        int i6 = i2 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        this.i420TextureFrameBuffer.setSize(i5, i4);
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        drawTexture(this.drawer, rXVideoTextureMemory, matrix, width, height, 0, 0, i6, height);
        this.shaderCallbacks.setPlaneU();
        int i7 = i6 / 2;
        drawTexture(this.drawer, rXVideoTextureMemory, matrix, width, height, 0, height, i7, i3);
        this.shaderCallbacks.setPlaneV();
        drawTexture(this.drawer, rXVideoTextureMemory, matrix, width, height, i5 / 2, height, i7, i3);
        GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("convert i420 failed as opengl error ");
            LIZ.append(glGetError);
            RXLogging.e("YUVConverter", X1D.LIZIZ(LIZ));
            if (1285 == glGetError || 1282 == glGetError) {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                return null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("YuvConverter.convert: GLES20 error: ");
            LIZ2.append(glGetError);
            throw new RuntimeException(X1D.LIZIZ(LIZ2));
        }
        GLES20.glBindFramebuffer(36160, 0);
        int i8 = i * height;
        int i9 = i / 2;
        int i10 = i8 + i9;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i8);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i8);
        int i11 = (i * (i3 - 1)) + i9;
        nativeAllocateByteBuffer.limit(i8 + i11);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i10);
        nativeAllocateByteBuffer.limit(i10 + i11);
        return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, nativeAllocateByteBuffer.slice(), i, new ZVO(0, nativeAllocateByteBuffer));
    }

    private void drawTexture(RendererCommon.GlDrawer glDrawer, RXVideoTextureMemory rXVideoTextureMemory, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(rXVideoTextureMemory.getTextureMatrix());
        convertMatrixToAndroidGraphicsMatrix.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
        FilterType fromValue = FilterType.fromValue(rXVideoTextureMemory.getScaleFilter().value());
        int i7 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[rXVideoTextureMemory.getTextureTarget().ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                glDrawer.drawRgb(rXVideoTextureMemory.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, fromValue, rXVideoTextureMemory.getUnScaledWidth(), rXVideoTextureMemory.getUnScaledHeight());
                return;
            }
            throw new RuntimeException("Unknown texture type.");
        }
        glDrawer.drawOes(rXVideoTextureMemory.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, fromValue, rXVideoTextureMemory.getUnScaledWidth(), rXVideoTextureMemory.getUnScaledHeight());
    }
}
