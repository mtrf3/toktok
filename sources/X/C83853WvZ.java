package X;

import android.content.Context;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WvZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83853WvZ implements InterfaceC83867Wvn {
    public final /* synthetic */ InterfaceC83852WvY LJLIL;

    @Override // X.InterfaceC83867Wvn
    public final void LJFF(C83869Wvp c83869Wvp) {
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJI(C83870Wvq c83870Wvq) {
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJII(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIIIZZ(C83854Wva c83854Wva) {
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIIZ(C83869Wvp c83869Wvp) {
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIJ(C83869Wvp c83869Wvp) {
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83759Wu3 LIZJ() {
        return this.LJLIL.LIZJ();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83886Ww6 LIZLLL() {
        return this.LJLIL.LIZLLL();
    }

    @Override // X.InterfaceC83867Wvn
    public final VERecorder LJ() {
        return this.LJLIL.s4().LJ();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83670Wsc getAudioController() {
        return this.LJLIL.getAudioController();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83863Wvj getCameraController() {
        return this.LJLIL.getCameraController();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83727WtX getEffectController() {
        return this.LJLIL.getEffectController();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83865Wvl getMediaController() {
        return this.LJLIL.getMediaController();
    }

    public C83853WvZ(InterfaceC83852WvY interfaceC83852WvY) {
        this.LJLIL = interfaceC83852WvY;
    }

    @Override // X.InterfaceC83867Wvn
    public final void LIZ(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.t4().LIZ(listener);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LIZIZ(AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL.t4().LIZIZ(aqS173S0100000_7);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIJJI(IDqS456S0100000_14 callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL.t4().LLLZI(callback);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LLLLLJLJLL(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.t4().LLLLLJLJLL(listener);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LLLLLJIL(C83932Wwq c83932Wwq, String workSpacePath) {
        o.LJIIIZ(workSpacePath, "workSpacePath");
        this.LJLIL.s4().LLLLLJIL(c83932Wwq, workSpacePath);
    }
}
