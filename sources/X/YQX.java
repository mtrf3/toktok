package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public class YQX extends YQQ {
    public final InterfaceC87370YQs LJ;
    public AtomicBoolean LJFF;

    @Override // X.YQW
    public final int LLJJL() {
        return this.LJ.LIZ();
    }

    public YQX(InterfaceC87370YQs interfaceC87370YQs) {
        this.LJ = interfaceC87370YQs;
    }

    @Override // X.YQW
    public final CameraCaptureSession.CaptureCallback LIZIZ(boolean z) {
        return new C87353YQb(this, z);
    }

    @Override // X.YQQ
    public final void LIZLLL(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // X.YQQ
    public final void LJ(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // X.YQW
    public final CameraCaptureSession.CaptureCallback LIZJ(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.LJFF = atomicBoolean;
        return new YQY(this, z, builder);
    }
}
