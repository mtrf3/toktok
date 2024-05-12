package X;

/* loaded from: classes15.dex */
public final class W7J implements InterfaceC81759W6x<C81392Vwy<W5A>> {
    public final InterfaceC81759W6x<C81392Vwy<W5A>> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        if (interfaceC81770W7i.LJFF() && !this.LIZLLL) {
            this.LIZ.LIZIZ(w7f, interfaceC81770W7i);
        } else {
            this.LIZ.LIZIZ(new W7I(w7f, this.LIZIZ, this.LIZJ), interfaceC81770W7i);
        }
    }

    public W7J(InterfaceC81759W6x<C81392Vwy<W5A>> interfaceC81759W6x, int i, int i2, boolean z) {
        boolean z2;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        interfaceC81759W6x.getClass();
        this.LIZ = interfaceC81759W6x;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
    }
}
