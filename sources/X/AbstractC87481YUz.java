package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.YUz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87481YUz extends AbstractCollection implements Serializable {
    public static final Object[] LJLIL = new Object[0];

    public void LIZJ(Object[] objArr) {
        throw null;
    }

    public Object[] LJIIIIZZ() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public abstract YV5 iterator();

    public int LJFF() {
        throw new UnsupportedOperationException();
    }

    public int LJII() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(LJLIL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(LJIIIIZZ, LJII(), LJFF(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        LIZJ(objArr);
        return objArr;
    }
}
