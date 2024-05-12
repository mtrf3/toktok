package X;

import Y.IDRunnableS88S0100000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zss, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91330Zss implements InterfaceC91292ZsG {
    public static final /* synthetic */ int LJLJL = 0;
    public final InterfaceC91289ZsD LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C73318Sq2 LJLJI;
    public volatile InterfaceC91296ZsK LJLJJI;
    public volatile int LJLJJL;
    public volatile boolean LJLJJLL;

    static {
        C16880lQ.LJLLJ(C91330Zss.class);
    }

    public final boolean LJII() {
        if (this.LJLJJI != null) {
            return true;
        }
        return false;
    }

    public final C91061ZoX LJIIL() {
        return (C91061ZoX) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        YXW.LIZ.getClass();
        if (YXW.LIZLLL) {
            C38995FSd.LIZJ().execute(new IDRunnableS88S0100000_29(this, 0));
        }
    }

    public final void LJIILJJIL() {
        if (LJII()) {
            C91061ZoX LJIIL = LJIIL();
            LJIIL.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJIIL);
            LIZ.append("  -> stop");
            X1D.LIZIZ(LIZ);
            LJIIL.LIZIZ().LLJJJJJIL();
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        C91061ZoX LJIIL = LJIIL();
        LJIIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIL);
        LIZ.append("  -> release");
        X1D.LIZIZ(LIZ);
        LJIIL.LIZLLL();
        if (LJIIL.LIZIZ) {
            LJIIL.LIZIZ().LJZI(null);
            LJIIL.LIZIZ().LJJLIIIJILLIZJL();
        }
        this.LJLJI.dispose();
    }

    public C91330Zss(C91334Zsw mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LJLIL = mListener;
        this.LJLILLLLZI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 0));
        this.LJLJI = new C73318Sq2();
    }
}
