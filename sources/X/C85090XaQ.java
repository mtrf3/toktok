package X;

import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XaQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85090XaQ implements InterfaceC85092XaS {
    public final /* synthetic */ C85069Xa5 LIZ;

    public C85090XaQ(C85069Xa5 c85069Xa5) {
        this.LIZ = c85069Xa5;
    }

    @Override // X.InterfaceC85092XaS
    public final void LIZ(C85079XaF c85079XaF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Playable: ");
        LIZ.append(this.LIZ.LIZLLL);
        LIZ.append(", occurred an error ");
        LIZ.append(c85079XaF.LIZIZ);
        X1D.LIZIZ(LIZ);
        this.LIZ.LIZ.LIZ(c85079XaF);
    }

    @Override // X.InterfaceC85092XaS
    public final void LIZIZ(C85089XaP engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LIZ.onPrepared();
    }

    @Override // X.InterfaceC85092XaS
    public final void LIZLLL(C85089XaP engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LIZ.onCompletion();
    }

    @Override // X.InterfaceC85092XaS
    public final void LJI(C85089XaP engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LIZ.onRenderStart();
    }

    @Override // X.InterfaceC85092XaS
    public final void LJIIIIZZ(C85089XaP engine) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LIZ.onPrepare();
    }

    @Override // X.InterfaceC85092XaS
    public final void LIZJ(C85089XaP engine, EnumC85066Xa2 enumC85066Xa2) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LIZ.LIZIZ(enumC85066Xa2);
    }

    @Override // X.InterfaceC85092XaS
    public final void LJ(C85089XaP engine, XOX playbackState) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(playbackState, "playbackState");
        if (playbackState == XOX.PLAYBACK_STATE_STOPPED) {
            C85069Xa5 c85069Xa5 = this.LIZ;
            c85069Xa5.LJ = 0;
            c85069Xa5.LJFF = false;
        }
        C53820LAi.LIZ(new AqS162S0200000_15(this.LIZ, playbackState, 74));
    }

    @Override // X.InterfaceC85092XaS
    public final void LJFF(C85089XaP engine, long j) {
        o.LJIIIZ(engine, "engine");
        C53820LAi.LIZ(new C85093XaT(this.LIZ, j));
    }

    @Override // X.InterfaceC85092XaS
    public final void LJII(C85089XaP engine, int i) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LJ = i;
        if (this.LIZ.LJ >= 97) {
            this.LIZ.LJ = 100;
        }
        this.LIZ.LIZ.onBufferingUpdate(r0.LJ / 100.0f);
    }

    @Override // X.InterfaceC85092XaS
    public final void LJIIIZ(C85089XaP engine, int i, int i2) {
        o.LJIIIZ(engine, "engine");
        this.LIZ.LIZ.onVideoSizeChanged(i, i2);
    }
}
