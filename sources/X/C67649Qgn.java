package X;

/* renamed from: X.Qgn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67649Qgn<TResult> {
    public final C67646Qgk<TResult> LIZ = new C67646Qgk<>();

    public final void LIZ(Exception exc) {
        this.LIZ.LJIIZILJ(exc);
    }

    public final void LIZIZ(TResult tresult) {
        this.LIZ.LJIJ(tresult);
    }

    public final void LIZJ(Exception exc) {
        C67646Qgk<TResult> c67646Qgk = this.LIZ;
        c67646Qgk.getClass();
        QH7.LJIIIZ(exc, "Exception must not be null");
        synchronized (c67646Qgk.LIZ) {
            if (!c67646Qgk.LIZJ) {
                c67646Qgk.LIZJ = true;
                c67646Qgk.LJFF = exc;
                c67646Qgk.LIZIZ.LIZ(c67646Qgk);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(Object obj) {
        C67646Qgk<TResult> c67646Qgk = this.LIZ;
        synchronized (c67646Qgk.LIZ) {
            if (!c67646Qgk.LIZJ) {
                c67646Qgk.LIZJ = true;
                c67646Qgk.LJ = obj;
                c67646Qgk.LIZIZ.LIZ(c67646Qgk);
            }
        }
    }
}
