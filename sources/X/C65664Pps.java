package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Pps, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65664Pps<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final List<F> LJLIL;
    public final InterfaceC65644PpY<? super F, ? extends T> LJLILLLLZI;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.LJLILLLLZI.apply((Object) ListProtector.get(this.LJLIL, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C65689PqH(this, this.LJLIL.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return this.LJLILLLLZI.apply((Object) ListProtector.remove(this.LJLIL, i));
    }

    public C65664Pps(List<F> list, InterfaceC65644PpY<? super F, ? extends T> interfaceC65644PpY) {
        list.getClass();
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC65644PpY;
    }
}
