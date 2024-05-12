package com.bytedance.realx.video.utils;

import X.X1D;
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
import com.bytedance.realx.video.RGBABuffer;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.memory.RXVideoTextureMemory;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class RgbaConverter {
    public final GlGenericDrawer drawer;
    public final GlTextureFrameBuffer rgbaTextureFrameBuffer;
    public final ShaderCallbacks shaderCallbacks;
    public final ThreadUtils.ThreadChecker threadChecker;

    /* renamed from: com.bytedance.realx.video.utils.RgbaConverter$1, reason: invalid class name */
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
        this.rgbaTextureFrameBuffer.release();
        this.threadChecker.detachThread();
    }

    public RgbaConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.rgbaTextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer("void main() {\n  gl_FragColor = sample(tc);\n}\n", shaderCallbacks);
        threadChecker.detachThread();
    }

    /* loaded from: classes33.dex */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public float stepSize;

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }

        public ShaderCallbacks() {
        }

        public /* synthetic */ ShaderCallbacks(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public RGBABuffer convert(RXVideoTextureMemory rXVideoTextureMemory) {
        this.threadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("RgbaConverter");
        int width = rXVideoTextureMemory.getWidth();
        int height = rXVideoTextureMemory.getHeight();
        int i = width * 4;
        int i2 = ((i + 63) / 64) * 64;
        int i3 = ((i + 7) / 8) * 8;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i2 * height) + i2);
        if (nativeAllocateByteBuffer == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        this.rgbaTextureFrameBuffer.setSize(i2 / 4, height);
        GLES20.glBindFramebuffer(36160, this.rgbaTextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        drawTexture(this.drawer, rXVideoTextureMemory, matrix, width, height, 0, 0, i3 / 4, height);
        GLES20.glReadPixels(0, 0, this.rgbaTextureFrameBuffer.getWidth(), this.rgbaTextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("convert rgba failed as opengl error ");
            LIZ.append(glGetError);
            RXLogging.e("RgbaConverter", X1D.LIZIZ(LIZ));
            if (1285 == glGetError || 1282 == glGetError) {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                return null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RgbaConverter.convert: GLES20 error: ");
            LIZ2.append(glGetError);
            throw new RuntimeException(X1D.LIZIZ(LIZ2));
        }
        GLES20.glBindFramebuffer(36160, 0);
        return new RGBABuffer(width, height, i2, nativeAllocateByteBuffer);
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
