package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.XLj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84683XLj extends AbstractC84676XLc implements RandomAccess, InterfaceC84688XLo {
    public boolean[] LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        int i2 = 1;
        for (int i3 = 0; i3 < this.LJLJI; i3++) {
            int i4 = i2 * 31;
            if (this.LJLILLLLZI[i3]) {
                i = 1231;
            } else {
                i = 1237;
            }
            i2 = i4 + i;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    static {
        new C84683XLj(0, new boolean[0]).LJLIL = false;
    }

    public C84683XLj() {
        this(0, new boolean[10]);
    }

    public final void LJFF(boolean z) {
        LIZJ();
        int i = this.LJLJI;
        boolean[] zArr = this.LJLILLLLZI;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.LJLILLLLZI = zArr2;
        }
        boolean[] zArr3 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        zArr3[i2] = z;
    }

    public final void LJII(int i) {
        if (i >= 0 && i < this.LJLJI) {
        } else {
            throw new IndexOutOfBoundsException(C48263Iwt.LIZIZ("Index:", i, ", Size:", this.LJLJI));
        }
    }

    @Override // X.XM7
    public final /* bridge */ /* synthetic */ XM7 LJIJI(int i) {
        if (i >= this.LJLJI) {
            return new C84683XLj(this.LJLJI, Arrays.copyOf(this.LJLILLLLZI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LJFF(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        LIZJ();
        collection.getClass();
        if (!(collection instanceof C84683XLj)) {
            return super.addAll(collection);
        }
        C84683XLj c84683XLj = (C84683XLj) collection;
        int i = c84683XLj.LJLJI;
        if (i == 0) {
            return false;
        }
        int i2 = this.LJLJI;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.LJLILLLLZI;
            if (i3 > zArr.length) {
                this.LJLILLLLZI = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c84683XLj.LJLILLLLZI, 0, this.LJLILLLLZI, this.LJLJI, c84683XLj.LJLJI);
            this.LJLJI = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84683XLj)) {
            return super.equals(obj);
        }
        C84683XLj c84683XLj = (C84683XLj) obj;
        if (this.LJLJI != c84683XLj.LJLJI) {
            return false;
        }
        boolean[] zArr = c84683XLj.LJLILLLLZI;
        for (int i = 0; i < this.LJLJI; i++) {
            if (this.LJLILLLLZI[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJII(i);
        return Boolean.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.LJLJI;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LJLILLLLZI[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        LIZJ();
        LJII(i);
        boolean[] zArr = this.LJLILLLLZI;
        boolean z = zArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    public C84683XLj(int i, boolean[] zArr) {
        this.LJLILLLLZI = zArr;
        this.LJLJI = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LJLJI)) {
            boolean[] zArr = this.LJLILLLLZI;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.LJLILLLLZI, i, zArr2, i + 1, this.LJLJI - i);
                this.LJLILLLLZI = zArr2;
            }
            this.LJLILLLLZI[i] = booleanValue;
            this.LJLJI++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(C48263Iwt.LIZIZ("Index:", i, ", Size:", this.LJLJI));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        LIZJ();
        if (i2 >= i) {
            boolean[] zArr = this.LJLILLLLZI;
            System.arraycopy(zArr, i2, zArr, i, this.LJLJI - i2);
            this.LJLJI -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LIZJ();
        LJII(i);
        boolean[] zArr = this.LJLILLLLZI;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }
}
