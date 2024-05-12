package X;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class W8F implements InterfaceC81759W6x<W8X> {
    public final Executor LIZ;
    public final W84 LIZIZ;
    public final InterfaceC81759W6x<W8X> LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC79240V8a LJ;
    public final C81808W8u LJFF;
    public final C81808W8u LJI;
    public final HashMap<String, C81808W8u> LJII;
    public final W6O LJIIIIZZ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        this.LIZJ.LIZIZ(new C81788W8a(this, w7f, interfaceC81770W7i, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ), interfaceC81770W7i);
    }

    public W8F(Executor executor, W84 w84, InterfaceC81759W6x interfaceC81759W6x, InterfaceC79240V8a interfaceC79240V8a, C81808W8u c81808W8u, C81808W8u c81808W8u2, HashMap hashMap, W6O w6o) {
        executor.getClass();
        this.LIZ = executor;
        w84.getClass();
        this.LIZIZ = w84;
        this.LIZJ = interfaceC81759W6x;
        interfaceC79240V8a.getClass();
        this.LJ = interfaceC79240V8a;
        this.LIZLLL = true;
        this.LJFF = c81808W8u;
        this.LJI = c81808W8u2;
        this.LJII = hashMap;
        this.LJIIIIZZ = w6o;
    }
}
