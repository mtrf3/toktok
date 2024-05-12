package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Pry, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65794Pry extends AbstractC65792Prw implements List, RandomAccess {
    public static final C65797Ps1 LJLILLLLZI = new C65797Ps1(C65798Ps2.LJLJJL, 0);

    @Override // X.AbstractC65792Prw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC65792Prw
    public final AbstractC65794Pry zzd() {
        return this;
    }

    @Override // X.AbstractC65792Prw
    /* renamed from: zze */
    public final AbstractC65801Ps5 iterator() {
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

    public static AbstractC65794Pry zzl() {
        return C65798Ps2.LJLJJL;
    }

    public static AbstractC65794Pry zzk(Collection collection) {
        if (collection instanceof AbstractC65792Prw) {
            AbstractC65794Pry zzd = ((AbstractC65792Prw) collection).zzd();
            if (zzd.LJIIIIZZ()) {
                Object[] array = zzd.toArray();
                int length = array.length;
                if (length == 0) {
                    return C65798Ps2.LJLJJL;
                }
                return new C65798Ps2(length, array);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        for (int i = 0; i < length2; i++) {
            if (array2[i] == null) {
                throw new NullPointerException(C64.LIZIZ("at index ", i));
            }
        }
        if (length2 == 0) {
            return C65798Ps2.LJLJJL;
        }
        return new C65798Ps2(length2, array2);
    }

    @Override // X.AbstractC65792Prw
    public int LIZJ(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // X.AbstractC65792Prw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
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
                Iterator it2 = list.iterator();
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
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final AbstractC65800Ps4 listIterator(int i) {
        C47261Igj.LJJJLL(i, size());
        if (isEmpty()) {
            return LJLILLLLZI;
        }
        return new C65797Ps1(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public AbstractC65794Pry subList(int i, int i2) {
        C47261Igj.LJJJLZIJ(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C65798Ps2.LJLJJL;
        }
        return new C65795Prz(this, i, i3);
    }
}
