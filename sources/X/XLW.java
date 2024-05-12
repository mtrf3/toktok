package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class XLW<E> extends AbstractC84675XLb<E> {
    public static final XLW<Object> LJLJI;
    public final List<E> LJLILLLLZI;

    static {
        XLW<Object> xlw = new XLW<>(new ArrayList(10));
        LJLJI = xlw;
        xlw.LJLIL = false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    public XLW(List<E> list) {
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC84678XLe
    public final /* synthetic */ InterfaceC84678XLe LJJIL(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.LJLILLLLZI);
            return new XLW(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return (E) ListProtector.get(this.LJLILLLLZI, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        LIZJ();
        E e = (E) ListProtector.remove(this.LJLILLLLZI, i);
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        LIZJ();
        ListProtector.add(this.LJLILLLLZI, i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        LIZJ();
        E e2 = (E) ListProtector.set(this.LJLILLLLZI, i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }
}
