package X;

import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SIr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71873SIr implements InterfaceC71877SIv {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1224));
    public InterfaceC32188CkC LIZIZ;

    @Override // X.InterfaceC71877SIv
    public final InterfaceC86353Xun LIZ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-livePlayerHelper>(...)");
        return (InterfaceC86353Xun) value;
    }

    @Override // X.InterfaceC71877SIv
    public final void LIZIZ(InterfaceC32188CkC interfaceC32188CkC) {
        this.LIZIZ = interfaceC32188CkC;
    }

    @Override // X.InterfaceC71877SIv
    public final boolean LIZJ(InterfaceC32188CkC interfaceC32188CkC) {
        if (interfaceC32188CkC == null) {
            return false;
        }
        return o.LJ(this.LIZIZ, interfaceC32188CkC);
    }

    public final void LIZLLL(C71875SIt c71875SIt) {
        if (o.LJ(this.LIZIZ, c71875SIt)) {
            this.LIZIZ = null;
        }
    }
}
