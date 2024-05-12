package X;

/* loaded from: classes12.dex */
public final class R32<T> extends R35<T> {
    public final R35<T> LJLIL;
    public boolean LJLILLLLZI;
    public R36<T> LJLJI;

    public final void LJJZ() {
        R36<T> r36;
        Object[] objArr;
        while (true) {
            synchronized (this) {
                r36 = this.LJLJI;
                if (r36 == null) {
                    this.LJLILLLLZI = false;
                    return;
                }
                this.LJLJI = null;
            }
            R35<T> r35 = this.LJLIL;
            for (Object[] objArr2 = r36.LIZ; objArr2 != null; objArr2 = objArr2[4]) {
                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                    r35.accept(objArr);
                }
            }
        }
    }

    public R32(R33 r33) {
        this.LJLIL = r33;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL.LIZ(interfaceC116954iR);
    }

    @Override // X.R35, X.InterfaceC64592gB
    public final void accept(T t) {
        synchronized (this) {
            if (this.LJLILLLLZI) {
                R36<T> r36 = this.LJLJI;
                if (r36 == null) {
                    r36 = new R36<>();
                    this.LJLJI = r36;
                }
                int i = r36.LIZJ;
                if (i == 4) {
                    Object[] objArr = new Object[5];
                    r36.LIZIZ[4] = objArr;
                    r36.LIZIZ = objArr;
                    i = 0;
                }
                r36.LIZIZ[i] = t;
                r36.LIZJ = i + 1;
                return;
            }
            this.LJLILLLLZI = true;
            this.LJLIL.accept(t);
            LJJZ();
        }
    }
}
