package X;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Ppr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65663Ppr<F, T> extends AbstractSequentialList<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final List<F> LJLIL;
    public final InterfaceC65644PpY<? super F, ? extends T> LJLILLLLZI;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C65690PqI(this, this.LJLIL.listIterator(i));
    }

    public C65663Ppr(List<F> list, InterfaceC65644PpY<? super F, ? extends T> interfaceC65644PpY) {
        list.getClass();
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC65644PpY;
    }
}
