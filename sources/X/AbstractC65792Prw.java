package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.Prw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65792Prw extends AbstractCollection implements Serializable {
    public static final Object[] LJLIL = new Object[0];

    public int LIZJ(Object[] objArr) {
        throw null;
    }

    public abstract boolean LJIIIIZZ();

    public Object[] LJIIIZ() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public AbstractC65794Pry zzd() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC65801Ps5 iterator();

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
            Object[] LJIIIZ = LJIIIZ();
            if (LJIIIZ == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                return Arrays.copyOfRange(LJIIIZ, LJII(), LJFF(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        LIZJ(objArr);
        return objArr;
    }
}
