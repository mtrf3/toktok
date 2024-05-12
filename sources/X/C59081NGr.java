package X;

import android.view.View;

/* renamed from: X.NGr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59081NGr implements InterfaceC59118NIc {
    public boolean LIZ;
    public InterfaceC88471Ynr<? super String, ? super String, C76800UCe> LIZIZ;
    public InterfaceC65784Pro<Long> LIZJ;
    public InterfaceC65784Pro<Long> LIZLLL;
    public InterfaceC65784Pro<C59079NGp> LJ;

    @Override // X.InterfaceC59118NIc
    public final void LJ(String str) {
    }

    @Override // X.InterfaceC59118NIc
    public final View LJIILIIL() {
        return null;
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIILJJIL() {
        this.LIZ = true;
    }

    @Override // X.InterfaceC59118NIc
    public final InterfaceC65784Pro<Long> LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59118NIc
    public final InterfaceC88471Ynr<String, String, C76800UCe> LJIILL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC59118NIc
    public final boolean LJIJJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC59118NIc
    public final InterfaceC65784Pro<Long> getDuration() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC59118NIc
    public final InterfaceC65784Pro<C59079NGp> getTracker() {
        return this.LJ;
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIIIIZZ(InterfaceC65784Pro<Long> interfaceC65784Pro) {
        this.LIZLLL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIILLIIL(InterfaceC65784Pro<Long> interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIJI(InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LIZIZ = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC59118NIc
    public final void setTracker(InterfaceC65784Pro<C59079NGp> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
