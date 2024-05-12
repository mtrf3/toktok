package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VbM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80052VbM implements InterfaceC80059VbT, InterfaceC80018Vao, InterfaceC80047VbH {
    public C48651J7n LJLIL;
    public final C80050VbK LJLILLLLZI;

    @Override // X.InterfaceC80047VbH
    public final void LIZ(EnumC48648J7k errorCode) {
        o.LJIIJ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC80047VbH
    public final void LIZLLL(C73363Sql c73363Sql) {
    }

    @Override // X.InterfaceC80047VbH
    public final void LJFF(EnumC48641J7d loadingState) {
        o.LJIIJ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJI(C48651J7n c48651J7n) {
        return false;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJII(C48651J7n c48651J7n) {
        return false;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJIIIZ(C48651J7n c48651J7n) {
        return false;
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIIJJI(long j) {
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILJJIL(EnumC79999VaV seekState) {
        o.LJIIJ(seekState, "seekState");
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.InterfaceC80059VbT
    public final C73363Sql LJIJI(C73363Sql c73363Sql) {
        return c73363Sql;
    }

    @Override // X.InterfaceC80018Vao
    public final C48651J7n LJIJJ() {
        throw null;
    }

    @Override // X.InterfaceC80047VbH
    public final void onCompletion() {
    }

    @Override // X.InterfaceC80047VbH
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepare() {
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepared() {
    }

    public C80052VbM(C80050VbK mMusicPlayerController) {
        o.LJIIJ(mMusicPlayerController, "mMusicPlayerController");
        this.LJLILLLLZI = mMusicPlayerController;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LIZIZ(C48651J7n c48651J7n) {
        this.LJLIL = c48651J7n;
        return false;
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILLIIL(EnumC79954VZm currentState) {
        o.LJIIJ(currentState, "currentState");
        if (currentState == EnumC79954VZm.PLAYBACK_STATE_STOPPED) {
            C80049VbJ LJIIIIZZ = this.LJLILLLLZI.LJIIIIZZ();
            if (LJIIIIZZ.LIZJ != null && LJIIIIZZ.LJIIL().LJIIIIZZ()) {
                new C48651J7n("STOP_FROM_PLAY_COMPLETION");
            }
        }
    }
}
