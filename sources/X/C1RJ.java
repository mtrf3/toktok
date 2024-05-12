package X;

/* renamed from: X.1RJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RJ<T> implements InterfaceC13010fB<T> {
    public final C25710zf<C13000fA<T>> LIZ = new C25710zf<>(new C13000fA[16]);
    public int LIZIZ;
    public C13000fA<? extends T> LIZJ;

    @Override // X.InterfaceC13010fB
    public final int getSize() {
        return this.LIZIZ;
    }

    public final void LIZIZ(int i) {
        if (i >= 0 && i < this.LIZIZ) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("Index ", i, ", size ");
        LJ.append(this.LIZIZ);
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    @Override // X.InterfaceC13010fB
    public final C13000fA<T> get(int i) {
        LIZIZ(i);
        C13000fA<? extends T> c13000fA = this.LIZJ;
        if (c13000fA != null) {
            int i2 = c13000fA.LIZ;
            if (i < c13000fA.LIZIZ + i2 && i2 <= i) {
                return c13000fA;
            }
        }
        C25710zf<C13000fA<T>> c25710zf = this.LIZ;
        C13000fA c13000fA2 = (C13000fA<? extends T>) c25710zf.LJLIL[O5Y.LJIIIIZZ(i, c25710zf)];
        this.LIZJ = c13000fA2;
        return c13000fA2;
    }

    public final void LIZ(int i, InterfaceC13030fD interfaceC13030fD) {
        if (i >= 0) {
            if (i == 0) {
                return;
            }
            C13000fA c13000fA = new C13000fA(this.LIZIZ, i, interfaceC13030fD);
            this.LIZIZ += i;
            this.LIZ.LIZLLL(c13000fA);
            return;
        }
        String LJ = KMP.LJ("size should be >=0, but was ", i);
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }

    public final void LIZJ(int i, int i2, C516020u c516020u) {
        LIZIZ(i);
        LIZIZ(i2);
        if (i2 >= i) {
            int LJIIIIZZ = O5Y.LJIIIIZZ(i, this.LIZ);
            int i3 = this.LIZ.LJLIL[LJIIIIZZ].LIZ;
            while (i3 <= i2) {
                C13000fA<? extends InterfaceC13030fD> c13000fA = this.LIZ.LJLIL[LJIIIIZZ];
                c516020u.invoke(c13000fA);
                i3 += c13000fA.LIZIZ;
                LJIIIIZZ++;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toIndex (");
        LIZ.append(i2);
        LIZ.append(") should be not smaller than fromIndex (");
        LIZ.append(i);
        LIZ.append(')');
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
