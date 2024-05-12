package X;

/* renamed from: X.XJz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84647XJz<E> extends XK1 {
    public final E LJLJJI;

    @Override // X.XK1
    public final void LJJII() {
    }

    @Override // X.XK1
    public final void LJJIIJ(XK0<?> xk0) {
    }

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendBuffered@");
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append('(');
        return U26.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.XK1
    public final Object LJJIII() {
        return this.LJLJJI;
    }

    public C84647XJz(E e) {
        this.LJLJJI = e;
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
