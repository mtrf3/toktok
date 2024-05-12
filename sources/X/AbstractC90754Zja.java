package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Zja, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90754Zja<E> extends AbstractC90354Zd8<E> implements List<E>, RandomAccess {
    public static final C90896Zls LJLILLLLZI = new C90896Zls(C90901Zlx.LJLJJL, 0);

    public static <E> C90744ZjQ<E> zzi() {
        return new C90744ZjQ<>();
    }

    @Override // X.AbstractC90354Zd8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC90354Zd8
    public final AbstractC90754Zja<E> zzd() {
        return this;
    }

    @Override // X.AbstractC90354Zd8
    /* renamed from: zze */
    public final AbstractC90278Zbu<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public static <E> AbstractC90754Zja<E> zzl(Collection<? extends E> collection) {
        if (collection instanceof AbstractC90354Zd8) {
            AbstractC90754Zja<E> zzd = ((AbstractC90354Zd8) collection).zzd();
            if (zzd.LJIIIIZZ()) {
                Object[] array = zzd.toArray();
                int length = array.length;
                if (length == 0) {
                    return C90901Zlx.LJLJJL;
                }
                return new C90901Zlx(length, array);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        for (int i = 0; i < length2; i++) {
            if (array2[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        if (length2 == 0) {
            return C90901Zlx.LJLJJL;
        }
        return new C90901Zlx(length2, array2);
    }

    @Override // X.AbstractC90354Zd8
    public int LIZJ(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // X.AbstractC90354Zd8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        E next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = ListProtector.get(this, i);
                        Object obj3 = ListProtector.get(list, i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(ListProtector.get(this, i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(ListProtector.get(this, size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final AbstractC90685ZiT<E> listIterator(int i) {
        C90329Zcj.LIZIZ(i, size());
        if (isEmpty()) {
            return LJLILLLLZI;
        }
        return new C90896Zls(this, i);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public AbstractC90754Zja<E> subList(int i, int i2) {
        C90329Zcj.LIZJ(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C90901Zlx.LJLJJL;
        }
        return new C90897Zlt(this, i, i3);
    }
}
