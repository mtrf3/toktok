package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes16.dex */
public final class XM1 extends AbstractList implements RandomAccess, XM3 {
    public final XM3 LJLIL;

    @Override // X.XM3
    public final XM3 LJ() {
        return this;
    }

    @Override // X.XM3
    public final List LJI() {
        return this.LJLIL.LJI();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new XM0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL.size();
    }

    public XM1(XM3 xm3) {
        this.LJLIL = xm3;
    }

    @Override // X.XM3
    public final Object LJIIJJI(int i) {
        return this.LJLIL.LJIIJJI(i);
    }

    @Override // X.XM3
    public final void LJIILIIL(AbstractC87134YHq abstractC87134YHq) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((XM2) this.LJLIL).get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C84695XLv(this, i);
    }
}
