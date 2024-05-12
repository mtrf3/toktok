package X;

import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS21S0000100_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VbU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80060VbU implements InterfaceC80068Vbc, InterfaceC80047VbH {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C80064VbY.LJLIL);

    public final C80071Vbf<InterfaceC80047VbH> LIZJ() {
        return (C80071Vbf) this.LJLIL.getValue();
    }

    public final void LJ() {
        LIZJ().LIZ.clear();
    }

    @Override // X.InterfaceC80047VbH
    public final void onCompletion() {
        LIZJ().LIZIZ(C80061VbV.LJLIL);
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepare() {
        LIZJ().LIZIZ(C80062VbW.LJLIL);
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepared() {
        LIZJ().LIZIZ(C80063VbX.LJLIL);
    }

    @Override // X.InterfaceC80047VbH
    public final void LIZ(EnumC48648J7k errorCode) {
        o.LJIIJ(errorCode, "errorCode");
        LIZJ().LIZIZ(new AqS180S0100000_14(errorCode, 339));
    }

    public final void LIZIZ(InterfaceC80047VbH listener) {
        o.LJIIJ(listener, "listener");
        LIZJ().LIZ(listener);
    }

    @Override // X.InterfaceC80047VbH
    public final void LIZLLL(C73363Sql c73363Sql) {
        LIZJ().LIZIZ(new AqS180S0100000_14(c73363Sql, 341));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJFF(EnumC48641J7d loadingState) {
        o.LJIIJ(loadingState, "loadingState");
        LIZJ().LIZIZ(new AqS180S0100000_14(loadingState, 340));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIIJJI(long j) {
        LIZJ().LIZIZ(new AqS21S0000100_14(j, 1));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILJJIL(EnumC79999VaV seekState) {
        o.LJIIJ(seekState, "seekState");
        LIZJ().LIZIZ(new AqS180S0100000_14(seekState, 343));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILLIIL(EnumC79954VZm currentState) {
        o.LJIIJ(currentState, "currentState");
        LIZJ().LIZIZ(new AqS180S0100000_14(currentState, 342));
    }

    @Override // X.InterfaceC80068Vbc
    public final void LJIJ(InterfaceC80047VbH listener) {
        o.LJIIJ(listener, "listener");
        LIZJ().LIZJ(listener);
    }

    @Override // X.InterfaceC80047VbH
    public final void onPlaybackTimeChanged(long j) {
        LIZJ().LIZIZ(new AqS21S0000100_14(j, 0));
    }
}
