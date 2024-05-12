package X;

/* loaded from: classes15.dex */
public final class W6W implements InterfaceC81735W5z {
    public static final Object LIZJ = new Object();
    public static W6W LIZLLL;
    public static int LJ;
    public W6U LIZ;
    public W6W LIZIZ;

    public static W6W LIZ() {
        synchronized (LIZJ) {
            W6W w6w = LIZLLL;
            if (w6w != null) {
                LIZLLL = w6w.LIZIZ;
                w6w.LIZIZ = null;
                LJ--;
                return w6w;
            }
            return new W6W();
        }
    }

    public final void LIZIZ() {
        synchronized (LIZJ) {
            int i = LJ;
            if (i < 5) {
                this.LIZ = null;
                LJ = i + 1;
                W6W w6w = LIZLLL;
                if (w6w != null) {
                    this.LIZIZ = w6w;
                }
                LIZLLL = this;
            }
        }
    }

    @Override // X.InterfaceC81735W5z
    public final W6U getCacheKey() {
        W6U w6u = this.LIZ;
        if (w6u instanceof W6V) {
            return ((W6V) w6u).LIZ;
        }
        return w6u;
    }
}
