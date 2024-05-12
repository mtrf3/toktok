package X;

import java.util.List;

/* renamed from: X.Zlt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90897Zlt extends AbstractC90754Zja {
    public final transient int LJLJI;
    public final transient int LJLJJI;
    public final /* synthetic */ AbstractC90754Zja LJLJJL;

    @Override // X.AbstractC90354Zd8
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.AbstractC90354Zd8
    public final Object[] LJIIIZ() {
        return this.LJLJJL.LJIIIZ();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC90354Zd8
    public final int LJFF() {
        return this.LJLJJL.LJII() + this.LJLJI + this.LJLJJI;
    }

    @Override // X.AbstractC90354Zd8
    public final int LJII() {
        return this.LJLJJL.LJII() + this.LJLJI;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C90329Zcj.LIZ(i, this.LJLJJI);
        return this.LJLJJL.get(i + this.LJLJI);
    }

    @Override // X.AbstractC90754Zja, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // X.AbstractC90754Zja
    /* renamed from: zzh */
    public final AbstractC90754Zja subList(int i, int i2) {
        C90329Zcj.LIZJ(i, i2, this.LJLJJI);
        AbstractC90754Zja abstractC90754Zja = this.LJLJJL;
        int i3 = this.LJLJI;
        return abstractC90754Zja.subList(i + i3, i2 + i3);
    }

    public C90897Zlt(AbstractC90754Zja abstractC90754Zja, int i, int i2) {
        this.LJLJJL = abstractC90754Zja;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
