package X;

import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class W51 implements HW9 {
    public final WeakReference<InterfaceC81694W4k> LIZ;

    @Override // X.HW9
    public final void cancel() {
        InterfaceC81694W4k interfaceC81694W4k = this.LIZ.get();
        if (interfaceC81694W4k != null) {
            C79083V1z.LIZ(0, "ControllerCancellable", "cancel", "");
            interfaceC81694W4k.release();
        }
    }

    public W51(W4R w4r) {
        this.LIZ = new WeakReference<>(w4r);
    }
}
