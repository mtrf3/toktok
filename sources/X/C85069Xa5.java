package X;

import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xa5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85069Xa5 {
    public static final /* synthetic */ int LJI = 0;
    public final InterfaceC85091XaR LIZ;
    public final C62822Ol8 LIZIZ;
    public final C73318Sq2 LIZJ;
    public volatile InterfaceC85083XaJ LIZLLL;
    public volatile int LJ;
    public volatile boolean LJFF;

    static {
        C16880lQ.LJLLJ(C85069Xa5.class);
    }

    public final boolean LIZ() {
        if (this.LIZLLL != null) {
            return true;
        }
        return false;
    }

    public final C85089XaP LIZIZ() {
        return (C85089XaP) this.LIZIZ.getValue();
    }

    public final void LIZJ() {
        if (LIZ()) {
            C85089XaP LIZIZ = LIZIZ();
            LIZIZ.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZIZ);
            LIZ.append("  -> stop");
            X1D.LIZIZ(LIZ);
            LIZIZ.LIZIZ().LLJJJJJIL();
        }
    }

    public C85069Xa5(C85099XaZ mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LIZ = mListener;
        this.LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 813));
        this.LIZJ = new C73318Sq2();
    }
}
