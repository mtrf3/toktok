package X;

import java.util.List;

/* renamed from: X.Prz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65795Prz extends AbstractC65794Pry {
    public final transient int LJLJI;
    public final transient int LJLJJI;
    public final /* synthetic */ AbstractC65794Pry LJLJJL;

    @Override // X.AbstractC65792Prw
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.AbstractC65792Prw
    public final Object[] LJIIIZ() {
        return this.LJLJJL.LJIIIZ();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC65792Prw
    public final int LJFF() {
        return this.LJLJJL.LJII() + this.LJLJI + this.LJLJJI;
    }

    @Override // X.AbstractC65792Prw
    public final int LJII() {
        return this.LJLJJL.LJII() + this.LJLJI;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C47261Igj.LJJJLIIL(i, this.LJLJJI);
        return this.LJLJJL.get(i + this.LJLJI);
    }

    @Override // X.AbstractC65794Pry, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // X.AbstractC65794Pry
    /* renamed from: zzh */
    public final AbstractC65794Pry subList(int i, int i2) {
        C47261Igj.LJJJLZIJ(i, i2, this.LJLJJI);
        AbstractC65794Pry abstractC65794Pry = this.LJLJJL;
        int i3 = this.LJLJI;
        return abstractC65794Pry.subList(i + i3, i2 + i3);
    }

    public C65795Prz(AbstractC65794Pry abstractC65794Pry, int i, int i2) {
        this.LJLJJL = abstractC65794Pry;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
