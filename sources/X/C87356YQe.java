package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.YQe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87356YQe extends YQQ {
    public AtomicBoolean LJ;
    public final InterfaceC87370YQs LJFF;
    public boolean LJI = true;

    @Override // X.YQW
    public final int LLJJL() {
        return this.LJFF.LIZ();
    }

    public C87356YQe(InterfaceC87370YQs interfaceC87370YQs) {
        this.LJFF = interfaceC87370YQs;
    }

    @Override // X.YQW
    public final void LIZ(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // X.YQW
    public final CameraCaptureSession.CaptureCallback LIZIZ(boolean z) {
        return new C87355YQd(this, z);
    }

    @Override // X.YQQ
    public final void LJ(CaptureRequest.Builder builder, Rect rect) {
        if (Build.VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        super.LJ(builder, rect);
    }

    @Override // X.YQW
    public final CameraCaptureSession.CaptureCallback LIZJ(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.LJ = atomicBoolean;
        return new C87352YQa(this, z, builder);
    }
}
