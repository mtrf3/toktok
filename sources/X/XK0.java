package X;

/* loaded from: classes16.dex */
public final class XK0<E> extends XK1 implements XKL<E> {
    public final Throwable LJLJJI;

    @Override // X.XKL
    public final Object LIZIZ() {
        return this;
    }

    @Override // X.XKL
    public final void LJIIIIZZ(E e) {
    }

    @Override // X.XK1
    public final void LJJII() {
    }

    @Override // X.XK1
    public final Object LJJIII() {
        return this;
    }

    @Override // X.XK1
    public final void LJJIIJ(XK0<?> xk0) {
    }

    public final Throwable LJJIJ() {
        Throwable th = this.LJLJJI;
        if (th == null) {
            return new XK2("Channel was closed");
        }
        return th;
    }

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Closed@");
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append('[');
        return C169696lJ.LIZLLL(LIZ, this.LJLJJI, ']', LIZ);
    }

    public XK0(Throwable th) {
        this.LJLJJI = th;
    }

    @Override // X.XKL
    public final C3BS LJI(Object obj) {
        return C84646XJy.LIZ;
    }

    @Override // X.XK1
    public final C3BS LJJIIJZLJL(C84632XJk c84632XJk) {
        C3BS c3bs = C84646XJy.LIZ;
        if (c84632XJk != null) {
            c84632XJk.LIZLLL();
        }
        return c3bs;
    }
}
