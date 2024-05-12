package X;

import java.util.HashMap;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WwT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83909WwT implements InterfaceC84017WyD {
    public final InterfaceC83727WtX LIZ;
    public final InterfaceC83863Wvj LIZIZ;
    public final C62822Ol8 LIZJ;

    @Override // X.InterfaceC84017WyD
    public final int D9() {
        return this.LIZ.D9();
    }

    @Override // X.InterfaceC84017WyD
    public final InterfaceC86960YAy LIZ() {
        return (InterfaceC86960YAy) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC84017WyD
    public final void D0(boolean z) {
        this.LIZ.D0(z);
    }

    public C83909WwT(InterfaceC83727WtX effectController, InterfaceC83863Wvj cameraController) {
        o.LJIIIZ(effectController, "effectController");
        o.LJIIIZ(cameraController, "cameraController");
        this.LIZ = effectController;
        this.LIZIZ = cameraController;
        new HashMap();
        this.LIZJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 304));
    }
}
