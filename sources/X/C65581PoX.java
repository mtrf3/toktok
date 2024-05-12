package X;

import java.util.Iterator;

/* renamed from: X.PoX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65581PoX<E> extends AbstractC65583PoZ<E> {
    public final transient E LJLJI;
    public transient int LJLJJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // X.AbstractC65583PoZ
    public final AbstractC65590Pog<E> LJIIIIZZ() {
        return AbstractC65590Pog.of((Object) this.LJLJI);
    }

    @Override // X.AbstractC65583PoZ
    public final boolean LJIIIZ() {
        if (this.LJLJJI != 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65583PoZ, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.LJLJJI;
        if (i == 0) {
            int hashCode = this.LJLJI.hashCode();
            this.LJLJJI = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<E> iterator() {
        return new C65582PoY(this.LJLJI);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.LJLJI.toString());
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public C65581PoX(E e) {
        e.getClass();
        this.LJLJI = e;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLJI.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C65581PoX(int i, Object obj) {
        this.LJLJI = obj;
        this.LJLJJI = i;
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        objArr[i] = this.LJLJI;
        return i + 1;
    }
}
