package X;

import Y.ARunnableS25S0300000_14;
import android.os.Looper;

/* loaded from: classes15.dex */
public class W7N implements InterfaceC81759W6x<C81392Vwy<W5A>> {
    public final W6M<W6U, W5A> LIZ;
    public final W6O LIZIZ;
    public final InterfaceC81759W6x<C81392Vwy<W5A>> LIZJ;

    public String LIZJ() {
        return "BitmapMemoryCacheProducer";
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        ARunnableS25S0300000_14 aRunnableS25S0300000_14 = new ARunnableS25S0300000_14(this, interfaceC81770W7i, w7f, 32);
        if (((Boolean) W8E.LJII().LIZIZ.LIZ().LIZ.LJJIIJZLJL.LIZ()).booleanValue() && Looper.myLooper() == C16880lQ.LLJJJJ()) {
            W8E LJII = W8E.LJII();
            LJII.LJIILLIIL();
            LJII.LIZIZ.LIZ().LIZ().LIZIZ().execute(aRunnableS25S0300000_14);
            return;
        }
        aRunnableS25S0300000_14.run();
    }

    public W7N(W6M<W6U, W5A> w6m, W6O w6o, InterfaceC81759W6x<C81392Vwy<W5A>> interfaceC81759W6x) {
        this.LIZ = w6m;
        this.LIZIZ = w6o;
        this.LIZJ = interfaceC81759W6x;
    }

    public W7F<C81392Vwy<W5A>> LIZLLL(W7F<C81392Vwy<W5A>> w7f, W6U w6u, boolean z) {
        return new W7X(this, w7f, w6u, z);
    }
}
