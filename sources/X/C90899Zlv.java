package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.Zlv, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90899Zlv<E> extends AbstractC90703Zil<E> implements RandomAccess {
    public static final C90899Zlv<Object> LJLJJI;
    public E[] LJLILLLLZI;
    public int LJLJI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    static {
        C90899Zlv<Object> c90899Zlv = new C90899Zlv<>(0, new Object[0]);
        LJLJJI = c90899Zlv;
        c90899Zlv.LJLIL = false;
    }

    public final String LJFF(int i) {
        int i2 = this.LJLJI;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void LJII(int i) {
        if (i >= 0 && i < this.LJLJI) {
        } else {
            throw new IndexOutOfBoundsException(LJFF(i));
        }
    }

    @Override // X.InterfaceC90352Zd6
    public final /* bridge */ /* synthetic */ InterfaceC90352Zd6 LJIILL(int i) {
        if (i >= this.LJLJI) {
            return new C90899Zlv(this.LJLJI, Arrays.copyOf(this.LJLILLLLZI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC90703Zil, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        LIZJ();
        int i = this.LJLJI;
        E[] eArr = this.LJLILLLLZI;
        if (i == eArr.length) {
            this.LJLILLLLZI = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        LJII(i);
        return this.LJLILLLLZI[i];
    }

    @Override // X.AbstractC90703Zil, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        LIZJ();
        LJII(i);
        E[] eArr = this.LJLILLLLZI;
        E e = eArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C90899Zlv(int i, Object[] objArr) {
        this.LJLILLLLZI = objArr;
        this.LJLJI = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LJLJI)) {
            E[] eArr = this.LJLILLLLZI;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.LJLILLLLZI, i, eArr2, i + 1, this.LJLJI - i);
                this.LJLILLLLZI = eArr2;
            }
            this.LJLILLLLZI[i] = e;
            this.LJLJI++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(LJFF(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        LIZJ();
        LJII(i);
        E[] eArr = this.LJLILLLLZI;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }
}
