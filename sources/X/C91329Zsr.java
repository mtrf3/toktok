package X;

import kotlin.jvm.internal.IDqS177S0200000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zsr, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91329Zsr implements InterfaceC91060ZoW {
    public final /* synthetic */ C91330Zss LIZ;

    public C91329Zsr(C91330Zss c91330Zss) {
        this.LIZ = c91330Zss;
    }

    @Override // X.InterfaceC91060ZoW
    public final void LIZ(C91061ZoX engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJLIL.onCompletion();
    }

    @Override // X.InterfaceC91060ZoW
    public final void LIZIZ(C91061ZoX engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJLIL.onPrepared();
    }

    @Override // X.InterfaceC91060ZoW
    public final void LIZJ(C91061ZoX engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJLIL.onPrepare();
    }

    @Override // X.InterfaceC91060ZoW
    public final void LJIIIIZZ(C91061ZoX engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJLIL.onRenderStart();
    }

    @Override // X.InterfaceC91060ZoW
    public final void onError(C91304ZsS c91304ZsS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Playable: ");
        LIZ.append(this.LIZ.LJLJJI);
        LIZ.append(", occurred an error ");
        LIZ.append(c91304ZsS.LIZIZ);
        X1D.LIZIZ(LIZ);
        this.LIZ.LJLIL.onError(c91304ZsS);
    }

    @Override // X.InterfaceC91060ZoW
    public final void LIZLLL(C91061ZoX engine, long j) {
        o.LJIIIZ(engine, "engine");
        C243119gR.LIZIZ(new C91517Zvt(this.LIZ, j));
    }

    @Override // X.InterfaceC91060ZoW
    public final void LJ(C91061ZoX engine, EnumC91305ZsT enumC91305ZsT) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJLIL.onLoadStateChanged(enumC91305ZsT);
    }

    @Override // X.InterfaceC91060ZoW
    public final void LJI(C91061ZoX engine, EnumC91310ZsY playbackState) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(playbackState, "playbackState");
        if (playbackState == EnumC91310ZsY.PLAYBACK_STATE_STOPPED) {
            C91330Zss c91330Zss = this.LIZ;
            c91330Zss.LJLJJL = 0;
            c91330Zss.LJLJJLL = false;
        }
        C243119gR.LIZIZ(new IDqS177S0200000_29(this.LIZ, playbackState, 0));
    }

    @Override // X.InterfaceC91060ZoW
    public final void LJII(C91061ZoX engine, int i) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJLJJL = i;
        if (this.LIZ.LJLJJL >= 97) {
            this.LIZ.LJLJJL = 100;
        }
        this.LIZ.LJLIL.onBufferingUpdate(r0.LJLJJL / 100.0f);
    }

    @Override // X.InterfaceC91060ZoW
    public final void LJFF(C91061ZoX engine, int i, int i2) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJLIL.onVideoSizeChanged(i, i2);
    }
}
