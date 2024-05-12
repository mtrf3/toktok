package X;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.VERenderContext;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.vesdk.VERecorder;
import java.nio.ByteBuffer;

/* renamed from: X.P6l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63911P6l implements NativeCallbacks.ICameraFrameCallback {
    public final /* synthetic */ VERecorder.OnFrameAvailableListenerExt LIZ;
    public final /* synthetic */ C84092WzQ LIZIZ;

    public C63911P6l(C84092WzQ c84092WzQ, VERecorder.OnFrameAvailableListenerExt onFrameAvailableListenerExt) {
        this.LIZIZ = c84092WzQ;
        this.LIZ = onFrameAvailableListenerExt;
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ICameraFrameCallback
    public final void onResult(ByteBuffer byteBuffer, int i, int i2, long j) {
        VEFrame createByteBufferFrame = VEFrame.createByteBufferFrame(byteBuffer, i, i2, 0, j * 1000, P6Z.TEPixFmt_YUV420P);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TERecorder-onResult return yuv frame ");
        LIZ.append(j);
        P7T.LIZ(X1D.LIZIZ(LIZ));
        this.LIZ.OnFrameAvailable(createByteBufferFrame);
        P7T.LIZIZ();
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ICameraFrameCallback
    public final void onResult(int i, float[] fArr, int i2, int i3, int i4, long j) {
        VERenderContext curVERenderContext = this.LIZIZ.getCurVERenderContext();
        if (curVERenderContext.getCurrentEnvType() == EnumC46487IMh.VE_RENDER_ENV_OPENGL) {
            VEFrame createTextureFrame = VEFrame.createTextureFrame(curVERenderContext.getEGLContext(), i, fArr, i2, i3, i4, j, P6Z.TEPixFmt_OpenGL_RGBA8);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TERecorder-onResult return texture frame ");
            LIZ.append(j);
            P7T.LIZ(X1D.LIZIZ(LIZ));
            this.LIZ.OnFrameAvailable(createTextureFrame);
            P7T.LIZIZ();
            return;
        }
        P4Q.LJII("TERecorder", "Current render env is not opengl, can not return gl texture frame");
    }
}
