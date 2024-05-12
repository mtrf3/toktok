package X;

/* renamed from: X.Zlx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90901Zlx<E> extends AbstractC90754Zja<E> {
    public static final C90901Zlx LJLJJL = new C90901Zlx(0, new Object[0]);
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;

    @Override // X.AbstractC90354Zd8
    public final int LJFF() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC90354Zd8
    public final int LJII() {
        return 0;
    }

    @Override // X.AbstractC90354Zd8
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC90354Zd8
    public final Object[] LJIIIZ() {
        return this.LJLJI;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC90754Zja, X.AbstractC90354Zd8
    public final int LIZJ(Object[] objArr) {
        System.arraycopy(this.LJLJI, 0, objArr, 0, this.LJLJJI);
        return this.LJLJJI;
    }

    @Override // java.util.List
    public final E get(int i) {
        C90329Zcj.LIZ(i, this.LJLJJI);
        E e = (E) this.LJLJI[i];
        e.getClass();
        return e;
    }

    public C90901Zlx(int i, Object[] objArr) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
    }
}
