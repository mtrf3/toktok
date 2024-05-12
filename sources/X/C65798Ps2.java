package X;

/* renamed from: X.Ps2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65798Ps2 extends AbstractC65794Pry {
    public static final C65798Ps2 LJLJJL = new C65798Ps2(0, new Object[0]);
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;

    @Override // X.AbstractC65792Prw
    public final int LJFF() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC65792Prw
    public final int LJII() {
        return 0;
    }

    @Override // X.AbstractC65792Prw
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC65792Prw
    public final Object[] LJIIIZ() {
        return this.LJLJI;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC65794Pry, X.AbstractC65792Prw
    public final int LIZJ(Object[] objArr) {
        System.arraycopy(this.LJLJI, 0, objArr, 0, this.LJLJJI);
        return this.LJLJJI;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C47261Igj.LJJJLIIL(i, this.LJLJJI);
        Object obj = this.LJLJI[i];
        obj.getClass();
        return obj;
    }

    public C65798Ps2(int i, Object[] objArr) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
    }
}
