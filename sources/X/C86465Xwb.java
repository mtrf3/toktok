package X;

import Y.ARunnableS51S0100000_15;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Xwb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86465Xwb implements InterfaceC32188CkC {
    public final /* synthetic */ C86464Xwa LJLIL;

    @Override // X.InterfaceC32188CkC
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJI(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LJII(C28272B7s c28272B7s) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIIZZ(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJ(int i, int i2, View view) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJJI(String str) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIL(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LLLZL() {
        this.LJLIL.LJLILLLLZI.setVisibility(0);
        this.LJLIL.LJLJJI.setVisibility(0);
        this.LJLIL.LJLJJL.setVisibility(0);
        this.LJLIL.LJLJI.setVisibility(8);
        this.LJLIL.LJLJJLL.setVisibility(8);
        C86464Xwa c86464Xwa = this.LJLIL;
        c86464Xwa.LJLJI.postDelayed(new ARunnableS51S0100000_15(c86464Xwa, 130), 1000L);
    }

    public C86465Xwb(C86464Xwa c86464Xwa) {
        this.LJLIL = c86464Xwa;
    }

    @Override // X.InterfaceC32188CkC
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        o.LJIIIZ(message, "message");
        int i = VC4.LIZ[message.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LJLIL.L();
                return;
            } else {
                C86464Xwa c86464Xwa = this.LJLIL;
                C86464Xwa.M(new View[]{c86464Xwa.LJLILLLLZI, c86464Xwa.LJLJJI, c86464Xwa.LJLJJL, c86464Xwa.LJLJJLL}, C86468Xwe.LJLIL);
                this.LJLIL.LJLJI.setVisibility(0);
                this.LJLIL.getClass();
                return;
            }
        }
        C86464Xwa c86464Xwa2 = this.LJLIL;
        C86464Xwa.M(new View[]{c86464Xwa2.LJLILLLLZI, c86464Xwa2.LJLJJI, c86464Xwa2.LJLJJL}, C86466Xwc.LJLIL);
        C86464Xwa c86464Xwa3 = this.LJLIL;
        C86464Xwa.M(new View[]{c86464Xwa3.LJLJI, c86464Xwa3.LJLJJLL}, C86467Xwd.LJLIL);
    }
}
