package X;

import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VbG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80046VbG implements InterfaceC80038Vb8, InterfaceC80044VbE {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C80065VbZ.LJLIL);

    public final C80071Vbf<InterfaceC80038Vb8> LIZIZ() {
        return (C80071Vbf) this.LJLIL.getValue();
    }

    public final void LIZJ() {
        LIZIZ().LIZ.clear();
    }

    public final void LIZ(InterfaceC80038Vb8 listener) {
        o.LJIIJ(listener, "listener");
        LIZIZ().LIZ(listener);
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIIJ(InterfaceC79968Va0 interfaceC79968Va0) {
        LIZIZ().LIZIZ(new AqS180S0100000_14(interfaceC79968Va0, 363));
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIILIIL(V1L v1l) {
        LIZIZ().LIZIZ(new AqS180S0100000_14(v1l, 361));
    }

    @Override // X.InterfaceC80044VbE
    public final void LJIILJJIL(InterfaceC80038Vb8 listener) {
        o.LJIIJ(listener, "listener");
        LIZIZ().LIZJ(listener);
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIIZILJ(EnumC79963VZv playMode) {
        o.LJIIJ(playMode, "playMode");
        LIZIZ().LIZIZ(new AqS180S0100000_14(playMode, 362));
    }
}
