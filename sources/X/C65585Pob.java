package X;

import java.util.Iterator;

/* renamed from: X.Pob, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65585Pob<E> extends AbstractC65583PoZ<E> {
    public static final C65585Pob<Object> LJLJLJ = new C65585Pob<>(0, 0, 0, new Object[0], null);
    public final transient Object[] LJLJI;
    public final transient Object[] LJLJJI;
    public final transient int LJLJJL;
    public final transient int LJLJJLL;
    public final transient int LJLJL;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return false;
    }

    @Override // X.AbstractC65583PoZ
    public final AbstractC65590Pog<E> LJIIIIZZ() {
        return AbstractC65590Pog.LJII(this.LJLJL, this.LJLJI);
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<E> iterator() {
        return asList().iterator();
    }

    @Override // X.AbstractC65583PoZ, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LJLJJLL;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJL;
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.LJLJJI;
        if (obj == null || objArr == null) {
            return false;
        }
        int LJIJJLI = C1FP.LJIJJLI(obj);
        while (true) {
            int i = LJIJJLI & this.LJLJJL;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            LJIJJLI = i + 1;
        }
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        System.arraycopy(this.LJLJI, 0, objArr, i, this.LJLJL);
        return i + this.LJLJL;
    }

    public C65585Pob(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.LJLJI = objArr;
        this.LJLJJI = objArr2;
        this.LJLJJL = i2;
        this.LJLJJLL = i;
        this.LJLJL = i3;
    }
}
