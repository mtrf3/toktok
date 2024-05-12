package X;

import android.hardware.camera2.CaptureRequest;

/* renamed from: X.YQh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87359YQh extends YQX {
    public C87359YQh(InterfaceC87370YQs interfaceC87370YQs) {
        super(interfaceC87370YQs);
    }

    @Override // X.YQW
    public final void LIZ(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
