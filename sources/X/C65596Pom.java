package X;

/* renamed from: X.Pom, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65596Pom<E> extends AbstractC65590Pog<E> {
    public static final C65596Pom LJLJJL = new C65596Pom(0, new Object[0]);
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // java.util.List
    public final E get(int i) {
        C76917UGr.LJFF(i, this.LJLJJI);
        return (E) this.LJLJI[i];
    }

    public C65596Pom(int i, Object[] objArr) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
    }

    @Override // X.AbstractC65590Pog, X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        System.arraycopy(this.LJLJI, 0, objArr, i, this.LJLJJI);
        return i + this.LJLJJI;
    }
}
