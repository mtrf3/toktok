package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Poj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65593Poj<E> extends AbstractC65590Pog<E> {
    public final transient AbstractC65590Pog<E> LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return this.LJLJI.LJFF();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC65590Pog, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // X.AbstractC65590Pog
    public final AbstractC65590Pog<E> reverse() {
        return this.LJLJI;
    }

    public C65593Poj(AbstractC65590Pog<E> abstractC65590Pog) {
        this.LJLJI = abstractC65590Pog;
    }

    @Override // X.AbstractC65590Pog, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLJI.contains(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        C76917UGr.LJFF(i, size());
        return this.LJLJI.get((size() - 1) - i);
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.LJLJI.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (size() - 1) - lastIndexOf;
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.LJLJI.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (size() - 1) - indexOf;
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final AbstractC65590Pog<E> subList(int i, int i2) {
        C76917UGr.LJIIIZ(i, i2, size());
        return this.LJLJI.subList(size() - i2, size() - i).reverse();
    }

    @Override // X.AbstractC65590Pog, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
