package X;

import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS21S0000100_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VbF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80045VbF implements InterfaceC80047VbH, InterfaceC80038Vb8 {
    public final C62822Ol8 LJLIL;
    public final InterfaceC80026Vaw LJLILLLLZI;

    public final C80071Vbf<InterfaceC80013Vaj> LIZJ() {
        return (C80071Vbf) this.LJLIL.getValue();
    }

    public final void LJ() {
        this.LJLILLLLZI.LJIILJJIL(this);
        this.LJLILLLLZI.LJIJ(this);
        LIZJ().LIZIZ(C80030Vb0.LJLIL);
        LIZJ().LIZ.clear();
    }

    @Override // X.InterfaceC80047VbH
    public final void onCompletion() {
        LIZJ().LIZIZ(C80056VbQ.LJLIL);
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepare() {
        LIZJ().LIZIZ(C80057VbR.LJLIL);
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepared() {
        LIZJ().LIZIZ(C80058VbS.LJLIL);
    }

    public C80045VbF(C80029Vaz playerService) {
        o.LJIIJ(playerService, "playerService");
        this.LJLILLLLZI = playerService;
        this.LJLIL = C221108m2.LIZIZ(C80066Vba.LJLIL);
        playerService.LJJIFFI(this);
        playerService.LJJI(this);
    }

    @Override // X.InterfaceC80047VbH
    public final void LIZ(EnumC48648J7k errorCode) {
        o.LJIIJ(errorCode, "errorCode");
        LIZJ().LIZIZ(new AqS180S0100000_14(errorCode, 348));
    }

    public final void LIZIZ(InterfaceC80013Vaj plugin) {
        o.LJIIJ(plugin, "plugin");
        InterfaceC80026Vaw interfaceC80026Vaw = this.LJLILLLLZI;
        C80024Vau c80024Vau = new C80024Vau(interfaceC80026Vaw, interfaceC80026Vaw, interfaceC80026Vaw, interfaceC80026Vaw, interfaceC80026Vaw, interfaceC80026Vaw, interfaceC80026Vaw);
        C80071Vbf<InterfaceC80013Vaj> LIZJ = LIZJ();
        plugin.LJIILL(c80024Vau);
        LIZJ.LIZ(plugin);
    }

    @Override // X.InterfaceC80047VbH
    public final void LIZLLL(C73363Sql c73363Sql) {
        LIZJ().LIZIZ(new AqS180S0100000_14(c73363Sql, 351));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJFF(EnumC48641J7d loadingState) {
        o.LJIIJ(loadingState, "loadingState");
        LIZJ().LIZIZ(new AqS180S0100000_14(loadingState, 349));
    }

    public final void LJI(InterfaceC80013Vaj plugin) {
        o.LJIIJ(plugin, "plugin");
        C80071Vbf<InterfaceC80013Vaj> LIZJ = LIZJ();
        plugin.onDetach();
        LIZJ.LIZJ(plugin);
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIIJ(InterfaceC79968Va0 interfaceC79968Va0) {
        LIZJ().LIZIZ(new AqS180S0100000_14(interfaceC79968Va0, 353));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIIJJI(long j) {
        LIZJ().LIZIZ(new AqS21S0000100_14(j, 3));
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIILIIL(V1L v1l) {
        LIZJ().LIZIZ(new AqS180S0100000_14(v1l, 347));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILJJIL(EnumC79999VaV seekState) {
        o.LJIIJ(seekState, "seekState");
        LIZJ().LIZIZ(new AqS180S0100000_14(seekState, 354));
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILLIIL(EnumC79954VZm currentState) {
        o.LJIIJ(currentState, "currentState");
        LIZJ().LIZIZ(new AqS180S0100000_14(currentState, 352));
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIIZILJ(EnumC79963VZv playMode) {
        o.LJIIJ(playMode, "playMode");
        LIZJ().LIZIZ(new AqS180S0100000_14(playMode, 350));
    }

    @Override // X.InterfaceC80047VbH
    public final void onPlaybackTimeChanged(long j) {
        LIZJ().LIZIZ(new AqS21S0000100_14(j, 2));
    }
}
