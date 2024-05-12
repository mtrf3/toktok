package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.XLi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84682XLi extends AbstractC84676XLc implements RandomAccess {
    public static final C84682XLi LJLJJI;
    public Object[] LJLILLLLZI;
    public int LJLJI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    static {
        C84682XLi c84682XLi = new C84682XLi(0, new Object[0]);
        LJLJJI = c84682XLi;
        c84682XLi.LJLIL = false;
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LJLJI) {
        } else {
            throw new IndexOutOfBoundsException(C48263Iwt.LIZIZ("Index:", i, ", Size:", this.LJLJI));
        }
    }

    @Override // X.XM7
    public final /* bridge */ /* synthetic */ XM7 LJIJI(int i) {
        if (i >= this.LJLJI) {
            return new C84682XLi(this.LJLJI, Arrays.copyOf(this.LJLILLLLZI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        LIZJ();
        int i = this.LJLJI;
        Object[] objArr = this.LJLILLLLZI;
        if (i == objArr.length) {
            this.LJLILLLLZI = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        LJFF(i);
        return this.LJLILLLLZI[i];
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        LJFF(i);
        Object[] objArr = this.LJLILLLLZI;
        Object obj = objArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    public C84682XLi(int i, Object[] objArr) {
        this.LJLILLLLZI = objArr;
        this.LJLJI = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LJLJI)) {
            Object[] objArr = this.LJLILLLLZI;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.LJLILLLLZI, i, objArr2, i + 1, this.LJLJI - i);
                this.LJLILLLLZI = objArr2;
            }
            this.LJLILLLLZI[i] = obj;
            this.LJLJI++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(C48263Iwt.LIZIZ("Index:", i, ", Size:", this.LJLJI));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        LIZJ();
        LJFF(i);
        Object[] objArr = this.LJLILLLLZI;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }
}
