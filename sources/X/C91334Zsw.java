package X;

import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.IDqS5S0100100_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zsw, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91334Zsw implements InterfaceC91292ZsG, InterfaceC91289ZsD {
    public final C91176ZqO<InterfaceC91289ZsD> LJLIL = new C91176ZqO<>();

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        throw null;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
        this.LJLIL.LIZIZ(C91519Zvv.LJLIL);
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        this.LJLIL.LIZ.clear();
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
        this.LJLIL.LIZIZ(C91521Zvx.LJLIL);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
        this.LJLIL.LIZIZ(C91522Zvy.LJLIL);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
        this.LJLIL.LIZIZ(C91523Zvz.LJLIL);
    }

    public final void LJII(InterfaceC91289ZsD listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ(listener);
    }

    public final void LJIIL(InterfaceC91289ZsD listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ.remove(listener);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
        this.LJLIL.LIZIZ(new C91518Zvu(f));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
        this.LJLIL.LIZIZ(new IDqS417S0100000_29(errorCode, 0));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
        this.LJLIL.LIZIZ(new IDqS417S0100000_29(loadingState, 1));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
        this.LJLIL.LIZIZ(new IDqS417S0100000_29(interfaceC91296ZsK, 2));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
        this.LJLIL.LIZIZ(new IDqS417S0100000_29(currentState, 3));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
        this.LJLIL.LIZIZ(new C91520Zvw(j));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
        this.LJLIL.LIZIZ(new IDqS5S0100100_29(seekState, j, 1));
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
        this.LJLIL.LIZIZ(new C91524Zw0(i, i2));
    }
}
