package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* renamed from: X.ORb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61899ORb<E> extends ORP<E> implements RandomAccess, Serializable {
    public boolean LJLIL;
    public final C61899ORb<E> LJLILLLLZI;
    public final C61899ORb<E> LJLJI;
    public E[] array;
    public int length;
    public int offset;

    public C61899ORb() {
        this(10);
    }

    private final Object writeReplace() {
        C61899ORb<E> c61899ORb;
        if (this.LJLIL || ((c61899ORb = this.LJLJI) != null && c61899ORb.LJLIL)) {
            return new C65872PtE(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void LJIIIIZZ() {
        C61899ORb<E> c61899ORb;
        if (this.LJLIL || ((c61899ORb = this.LJLJI) != null && c61899ORb.LJLIL)) {
            throw new UnsupportedOperationException();
        }
    }

    public final List<E> build() {
        if (this.LJLILLLLZI == null) {
            LJIIIIZZ();
            this.LJLIL = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        E[] eArr = this.array;
        int i2 = this.offset;
        int i3 = this.length;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            E e = eArr[i2 + i5];
            int i6 = i4 * 31;
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i4 = i6 + i;
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C61900ORc(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new C61900ORc(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        return C61898ORa.LJIL(i, this.length + i, eArr);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        E[] eArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[i + i3]);
        }
        return C0EH.LIZJ(sb, "]", "sb.toString()");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        LJIIIIZZ();
        LJIILLIIL(this.offset, this.length);
    }

    @Override // X.ORP
    public int getSize() {
        return this.length;
    }

    public C61899ORb(int i) {
        this(C56509MFt.LIZIZ(i), 0, 0, false, null, null);
    }

    public final E LJIILJJIL(int i) {
        C61899ORb<E> c61899ORb = this.LJLILLLLZI;
        if (c61899ORb != null) {
            this.length--;
            return c61899ORb.LJIILJJIL(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        C61898ORa.LJIIZILJ(i, i + 1, this.offset + this.length, eArr, eArr);
        E[] eArr2 = this.array;
        int i2 = (this.offset + this.length) - 1;
        o.LJIIIZ(eArr2, "<this>");
        eArr2[i2] = null;
        this.length--;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        LJIIIIZZ();
        LJII(this.offset + this.length, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        o.LJIIIZ(elements, "elements");
        LJIIIIZZ();
        int size = elements.size();
        LIZJ(this.offset + this.length, size, elements);
        if (size > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.array;
            int i = this.offset;
            int i2 = this.length;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (o.LJ(eArr[i + i3], ListProtector.get(list, i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        C61880OQi.LIZ(i, this.length);
        return this.array[this.offset + i];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (o.LJ(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (o.LJ(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        C61880OQi.LIZIZ(i, this.length);
        return new C61900ORc(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        LJIIIIZZ();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        LJIIIIZZ();
        if (LJIIZILJ(this.offset, this.length, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.ORP
    public E removeAt(int i) {
        LJIIIIZZ();
        C61880OQi.LIZ(i, this.length);
        return LJIILJJIL(this.offset + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        LJIIIIZZ();
        if (LJIIZILJ(this.offset, this.length, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        o.LJIIIZ(destination, "destination");
        int length = destination.length;
        int i = this.length;
        if (length < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, destination.getClass());
            o.LJIIIIZZ(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.array;
        int i3 = this.offset;
        C61898ORa.LJIIZILJ(0, i3, i + i3, eArr2, destination);
        int length2 = destination.length;
        int i4 = this.length;
        if (length2 > i4) {
            destination[i4] = null;
        }
        return destination;
    }

    public final void LJII(int i, E e) {
        C61899ORb<E> c61899ORb = this.LJLILLLLZI;
        if (c61899ORb != null) {
            c61899ORb.LJII(i, e);
            this.array = this.LJLILLLLZI.array;
            this.length++;
        } else {
            LJIIIZ(i, 1);
            this.array[i] = e;
        }
    }

    public final void LJIIIZ(int i, int i2) {
        int i3 = this.length + i2;
        if (this.LJLILLLLZI == null) {
            if (i3 >= 0) {
                E[] eArr = this.array;
                if (i3 > eArr.length) {
                    int length = eArr.length;
                    int i4 = length + (length >> 1);
                    if (i4 - i3 < 0) {
                        i4 = i3;
                    }
                    if (i4 - 2147483639 > 0) {
                        if (i3 > 2147483639) {
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i4 = 2147483639;
                        }
                    }
                    o.LJIIIZ(eArr, "<this>");
                    E[] eArr2 = (E[]) Arrays.copyOf(eArr, i4);
                    o.LJIIIIZZ(eArr2, "copyOf(this, newSize)");
                    this.array = eArr2;
                }
                E[] eArr3 = this.array;
                C61898ORa.LJIIZILJ(i + i2, i, this.offset + this.length, eArr3, eArr3);
                this.length += i2;
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    public final void LJIILLIIL(int i, int i2) {
        C61899ORb<E> c61899ORb = this.LJLILLLLZI;
        if (c61899ORb != null) {
            c61899ORb.LJIILLIIL(i, i2);
        } else {
            E[] eArr = this.array;
            C61898ORa.LJIIZILJ(i, i + i2, this.length, eArr, eArr);
            E[] eArr2 = this.array;
            int i3 = this.length;
            C56509MFt.LJIILJJIL(i3 - i2, i3, eArr2);
        }
        this.length -= i2;
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        LJIIIIZZ();
        C61880OQi.LIZIZ(i, this.length);
        LJII(this.offset + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        o.LJIIIZ(elements, "elements");
        LJIIIIZZ();
        C61880OQi.LIZIZ(i, this.length);
        int size = elements.size();
        LIZJ(this.offset + i, size, elements);
        if (size > 0) {
            return true;
        }
        return false;
    }

    @Override // X.ORP, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        LJIIIIZZ();
        C61880OQi.LIZ(i, this.length);
        E[] eArr = this.array;
        int i2 = this.offset + i;
        E e2 = eArr[i2];
        eArr[i2] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        C61880OQi.LIZJ(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.LJLIL;
        C61899ORb<E> c61899ORb = this.LJLJI;
        if (c61899ORb == null) {
            c61899ORb = this;
        }
        return new C61899ORb(eArr, i3, i4, z, this, c61899ORb);
    }

    public final void LIZJ(int i, int i2, Collection collection) {
        C61899ORb<E> c61899ORb = this.LJLILLLLZI;
        if (c61899ORb != null) {
            c61899ORb.LIZJ(i, i2, collection);
            this.array = this.LJLILLLLZI.array;
            this.length += i2;
        } else {
            LJIIIZ(i, i2);
            Iterator<E> it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.array[i + i3] = it.next();
            }
        }
    }

    public final int LJIIZILJ(int i, int i2, Collection<? extends E> collection, boolean z) {
        C61899ORb<E> c61899ORb = this.LJLILLLLZI;
        if (c61899ORb != null) {
            int LJIIZILJ = c61899ORb.LJIIZILJ(i, i2, collection, z);
            this.length -= LJIIZILJ;
            return LJIIZILJ;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        C61898ORa.LJIIZILJ(i + i4, i2 + i, this.length, eArr2, eArr2);
        E[] eArr3 = this.array;
        int i7 = this.length;
        C56509MFt.LJIILJJIL(i7 - i6, i7, eArr3);
        this.length -= i6;
        return i6;
    }

    public C61899ORb(E[] eArr, int i, int i2, boolean z, C61899ORb<E> c61899ORb, C61899ORb<E> c61899ORb2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.LJLIL = z;
        this.LJLILLLLZI = c61899ORb;
        this.LJLJI = c61899ORb2;
    }
}
