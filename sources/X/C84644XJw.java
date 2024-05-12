package X;

/* renamed from: X.XJw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84644XJw<E> extends XK1 {
    public final E LJLJJI;
    public final XJL<C76800UCe> LJLJJL;

    @Override // X.XK1
    public final void LJJII() {
        this.LJLJJL.LJJIJIIJIL();
    }

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append('(');
        return U26.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.XK1
    public final E LJJIII() {
        return this.LJLJJI;
    }

    @Override // X.XK1
    public final void LJJIIJ(XK0<?> xk0) {
        XJL<C76800UCe> xjl = this.LJLJJL;
        Throwable th = xk0.LJLJJI;
        if (th == null) {
            th = new C84645XJx("Channel was closed");
        }
        C3C4 LIZ = C141335gf.LIZ(th);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.XK1
    public final C3BS LJJIIJZLJL(C84632XJk c84632XJk) {
        AbstractC84633XJl abstractC84633XJl;
        XJL<C76800UCe> xjl = this.LJLJJL;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        if (c84632XJk == null) {
            abstractC84633XJl = null;
        } else {
            abstractC84633XJl = c84632XJk.LIZJ;
        }
        if (xjl.LJJIZ(c76800UCe, abstractC84633XJl) == null) {
            return null;
        }
        if (c84632XJk != null) {
            c84632XJk.LIZLLL();
        }
        return C84646XJy.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C84644XJw(Object obj, XKS xks) {
        this.LJLJJI = obj;
        this.LJLJJL = xks;
    }
}
