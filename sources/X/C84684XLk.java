package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.XLk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84684XLk extends AbstractC84676XLc implements RandomAccess, InterfaceC68329Qrl, InterfaceC84688XLo {
    public static final C84684XLk LJLJJI;
    public int[] LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            i = (i * 31) + this.LJLILLLLZI[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    static {
        C84684XLk c84684XLk = new C84684XLk(new int[0], 0);
        LJLJJI = c84684XLk;
        c84684XLk.LJLIL = false;
    }

    public C84684XLk() {
        this(new int[10], 0);
    }

    public final void LJFF(int i) {
        LIZJ();
        int i2 = this.LJLJI;
        int[] iArr = this.LJLILLLLZI;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.LJLILLLLZI = iArr2;
        }
        int[] iArr3 = this.LJLILLLLZI;
        int i3 = this.LJLJI;
        this.LJLJI = i3 + 1;
        iArr3[i3] = i;
    }

    public final void LJII(int i) {
        if (i >= 0 && i < this.LJLJI) {
        } else {
            throw new IndexOutOfBoundsException(C48263Iwt.LIZIZ("Index:", i, ", Size:", this.LJLJI));
        }
    }

    @Override // X.XM7
    public final XM7 LJIJI(int i) {
        if (i >= this.LJLJI) {
            return new C84684XLk(Arrays.copyOf(this.LJLILLLLZI, i), this.LJLJI);
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LJFF(((Integer) obj).intValue());
        return true;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        LIZJ();
        collection.getClass();
        if (!(collection instanceof C84684XLk)) {
            return super.addAll(collection);
        }
        C84684XLk c84684XLk = (C84684XLk) collection;
        int i = c84684XLk.LJLJI;
        if (i == 0) {
            return false;
        }
        int i2 = this.LJLJI;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.LJLILLLLZI;
            if (i3 > iArr.length) {
                this.LJLILLLLZI = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c84684XLk.LJLILLLLZI, 0, this.LJLILLLLZI, this.LJLJI, c84684XLk.LJLJI);
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
        if (!(obj instanceof C84684XLk)) {
            return super.equals(obj);
        }
        C84684XLk c84684XLk = (C84684XLk) obj;
        if (this.LJLJI != c84684XLk.LJLJI) {
            return false;
        }
        int[] iArr = c84684XLk.LJLILLLLZI;
        for (int i = 0; i < this.LJLJI; i++) {
            if (this.LJLILLLLZI[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJII(i);
        return Integer.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.LJLJI;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LJLILLLLZI[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        LIZJ();
        LJII(i);
        int[] iArr = this.LJLILLLLZI;
        int i2 = iArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    public C84684XLk(int[] iArr, int i) {
        this.LJLILLLLZI = iArr;
        this.LJLJI = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LJLJI)) {
            int[] iArr = this.LJLILLLLZI;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.LJLILLLLZI, i, iArr2, i + 1, this.LJLJI - i);
                this.LJLILLLLZI = iArr2;
            }
            this.LJLILLLLZI[i] = intValue;
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
            int[] iArr = this.LJLILLLLZI;
            System.arraycopy(iArr, i2, iArr, i, this.LJLJI - i2);
            this.LJLJI -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        LIZJ();
        LJII(i);
        int[] iArr = this.LJLILLLLZI;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }
}
