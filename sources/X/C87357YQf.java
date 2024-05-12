package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.YQf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87357YQf extends YQQ {
    public final InterfaceC87370YQs LJ;
    public AtomicBoolean LJFF;

    @Override // X.YQW
    public final int LLJJL() {
        return this.LJ.LIZ();
    }

    public C87357YQf(InterfaceC87370YQs interfaceC87370YQs) {
        this.LJ = interfaceC87370YQs;
    }

    @Override // X.YQW
    public final void LIZ(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // X.YQW
    public final CameraCaptureSession.CaptureCallback LIZIZ(boolean z) {
        return new C87354YQc(this, z);
    }

    @Override // X.YQW
    public final CameraCaptureSession.CaptureCallback LIZJ(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z) {
        this.LJFF = atomicBoolean;
        return new YQZ(this, z, builder);
    }
}
