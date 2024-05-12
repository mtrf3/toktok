package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Ppt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65665Ppt<T> extends AbstractList<T> {
    public final List<T> LJLIL;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    public C65665Ppt(List<T> list) {
        list.getClass();
        this.LJLIL = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        List<T> list = this.LJLIL;
        int size = size();
        C76917UGr.LJFF(i, size);
        return (T) ListProtector.get(list, (size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        int size = size();
        C76917UGr.LJIIIIZZ(i, size);
        return new C65666Ppu(this, this.LJLIL.listIterator(size - i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        List<T> list = this.LJLIL;
        int size = size();
        C76917UGr.LJFF(i, size);
        return (T) ListProtector.remove(list, (size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        List<T> list = this.LJLIL;
        int size = size();
        C76917UGr.LJIIIIZZ(i, size);
        ListProtector.add(list, size - i, t);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        List<T> list = this.LJLIL;
        int size = size();
        C76917UGr.LJFF(i, size);
        return (T) ListProtector.set(list, (size - 1) - i, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<T> subList(int i, int i2) {
        C76917UGr.LJIIIZ(i, i2, size());
        List<T> list = this.LJLIL;
        int size = size();
        C76917UGr.LJIIIIZZ(i2, size);
        int size2 = size();
        C76917UGr.LJIIIIZZ(i, size2);
        return C65661Ppp.LIZJ(list.subList(size - i2, size2 - i));
    }
}
