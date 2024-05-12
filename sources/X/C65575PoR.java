package X;

/* renamed from: X.PoR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65575PoR extends AbstractC65590Pog<Object> {
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;
    public final transient int LJLJJL;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJL;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C76917UGr.LJFF(i, this.LJLJJL);
        return this.LJLJI[(i * 2) + this.LJLJJI];
    }

    public C65575PoR(int i, int i2, Object[] objArr) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }
}
