package X;

/* renamed from: X.Zlj, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90887Zlj extends AbstractC90754Zja<Object> {
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;

    @Override // X.AbstractC90354Zd8
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C90329Zcj.LIZ(i, 0);
        Object obj = this.LJLJI[i + i + this.LJLJJI];
        obj.getClass();
        return obj;
    }

    public C90887Zlj(int i, Object[] objArr) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
    }
}
