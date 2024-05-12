package X;

/* renamed from: X.W7m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81774W7m<T> implements InterfaceC81759W6x<T> {
    public final InterfaceC81759W6x<T> LIZ;
    public final W6T LIZIZ;

    public C81774W7m(InterfaceC81759W6x<T> interfaceC81759W6x, W6T w6t) {
        interfaceC81759W6x.getClass();
        this.LIZ = interfaceC81759W6x;
        this.LIZIZ = w6t;
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<T> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        InterfaceC81754W6s LIZ = interfaceC81770W7i.LIZ();
        String id = interfaceC81770W7i.getId();
        C81775W7n c81775W7n = new C81775W7n(this, w7f, LIZ, id, LIZ, id, w7f, interfaceC81770W7i);
        interfaceC81770W7i.LIZLLL(new C81776W7o(this, c81775W7n));
        W6T w6t = this.LIZIZ;
        synchronized (w6t) {
            if (w6t.LIZ) {
                w6t.LIZIZ.add(c81775W7n);
            } else {
                w6t.LIZJ.execute(c81775W7n);
            }
        }
    }
}
