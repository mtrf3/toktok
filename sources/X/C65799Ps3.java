package X;

/* renamed from: X.Ps3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65799Ps3 extends AbstractC65794Pry {
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;
    public final transient int LJLJJL;

    @Override // X.AbstractC65792Prw
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJL;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C47261Igj.LJJJLIIL(i, this.LJLJJL);
        Object obj = this.LJLJI[i + i + this.LJLJJI];
        obj.getClass();
        return obj;
    }

    public C65799Ps3(int i, int i2, Object[] objArr) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }
}
