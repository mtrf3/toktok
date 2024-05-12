package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.XLm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84686XLm extends AbstractC84676XLc implements RandomAccess, InterfaceC68330Qrm, InterfaceC84688XLo {
    public static final C84686XLm LJLJJI;
    public long[] LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            i = (i * 31) + YIG.LIZ(this.LJLILLLLZI[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    static {
        C84686XLm c84686XLm = new C84686XLm(0, new long[0]);
        LJLJJI = c84686XLm;
        c84686XLm.LJLIL = false;
    }

    public C84686XLm() {
        this(0, new long[10]);
    }

    public final void LJFF(long j) {
        LIZJ();
        int i = this.LJLJI;
        long[] jArr = this.LJLILLLLZI;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.LJLILLLLZI = jArr2;
        }
        long[] jArr3 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        jArr3[i2] = j;
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
            return new C84686XLm(this.LJLJI, Arrays.copyOf(this.LJLILLLLZI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LJFF(((Long) obj).longValue());
        return true;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        LIZJ();
        collection.getClass();
        if (!(collection instanceof C84686XLm)) {
            return super.addAll(collection);
        }
        C84686XLm c84686XLm = (C84686XLm) collection;
        int i = c84686XLm.LJLJI;
        if (i == 0) {
            return false;
        }
        int i2 = this.LJLJI;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.LJLILLLLZI;
            if (i3 > jArr.length) {
                this.LJLILLLLZI = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c84686XLm.LJLILLLLZI, 0, this.LJLILLLLZI, this.LJLJI, c84686XLm.LJLJI);
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
        if (!(obj instanceof C84686XLm)) {
            return super.equals(obj);
        }
        C84686XLm c84686XLm = (C84686XLm) obj;
        if (this.LJLJI != c84686XLm.LJLJI) {
            return false;
        }
        long[] jArr = c84686XLm.LJLILLLLZI;
        for (int i = 0; i < this.LJLJI; i++) {
            if (this.LJLILLLLZI[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJII(i);
        return Long.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.LJLJI;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LJLILLLLZI[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        LIZJ();
        LJII(i);
        long[] jArr = this.LJLILLLLZI;
        long j = jArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    public C84686XLm(int i, long[] jArr) {
        this.LJLILLLLZI = jArr;
        this.LJLJI = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LJLJI)) {
            long[] jArr = this.LJLILLLLZI;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.LJLILLLLZI, i, jArr2, i + 1, this.LJLJI - i);
                this.LJLILLLLZI = jArr2;
            }
            this.LJLILLLLZI[i] = longValue;
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
            long[] jArr = this.LJLILLLLZI;
            System.arraycopy(jArr, i2, jArr, i, this.LJLJI - i2);
            this.LJLJI -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        LIZJ();
        LJII(i);
        long[] jArr = this.LJLILLLLZI;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }
}
