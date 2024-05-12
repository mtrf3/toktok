package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraLensCallbackWrapper;

/* loaded from: classes6.dex */
public final class BZH implements CameraLensCallbackWrapper {
    public final /* synthetic */ InterfaceC88471Ynr<Float, Integer, C76800UCe> LIZ;

    public BZH(BZG bzg) {
        this.LIZ = bzg;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraLensCallbackWrapper
    public final void onError(int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(i2);
        LIZ.append(' ');
        LIZ.append(str);
        LIZ.append(' ');
        C0NB.LIZIZ("DirtyLenDetect", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraLensCallbackWrapper
    public final void onSuccess(int i, float f, int i2) {
        InterfaceC88471Ynr<Float, Integer, C76800UCe> interfaceC88471Ynr;
        double d = f;
        if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= d && d <= 1.0d && (interfaceC88471Ynr = this.LIZ) != null) {
            interfaceC88471Ynr.invoke(Float.valueOf(f), Integer.valueOf(i2));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraLensCallbackWrapper
    public final void onInfo(int i, int i2, int i3, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInfo ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(i2);
        LIZ.append(' ');
        LIZ.append(i3);
        LIZ.append(' ');
        LIZ.append(str);
        C0NB.LIZIZ("DirtyLenDetect", X1D.LIZIZ(LIZ));
    }
}
