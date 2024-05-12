package X;

/* loaded from: classes15.dex */
public final class W7A extends W7G {
    public final /* synthetic */ W76 LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        C81392Vwy<W5A> c81392Vwy;
        int i;
        synchronized (this.LJLIL) {
            W76 w76 = this.LJLIL;
            c81392Vwy = w76.LJII;
            i = w76.LJIIIIZZ;
            w76.LJII = null;
            w76.LJIIIZ = false;
        }
        if (C81392Vwy.LJIIJJI(c81392Vwy)) {
            try {
                this.LJLIL.LJIILIIL(c81392Vwy, i);
            } finally {
                C81392Vwy.LJ(c81392Vwy);
            }
        }
        this.LJLIL.LJIIJJI();
    }

    public W7A(W76 w76, int i) {
        this.LJLIL = w76;
    }
}
