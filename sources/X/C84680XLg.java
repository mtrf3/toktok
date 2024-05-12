package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.XLg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84680XLg extends AbstractC84675XLb<Long> implements InterfaceC84681XLh, RandomAccess {
    public long[] LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC84675XLb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            i = (i * 31) + YI0.LIZ(this.LJLILLLLZI[i2]);
        }
        return i;
    }

    static {
        new C84680XLg().LJLIL = false;
    }

    public C84680XLg() {
        this(0, new long[10]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LJLJI) {
        } else {
            throw new IndexOutOfBoundsException(LJII(i));
        }
    }

    public final String LJII(int i) {
        int i2 = this.LJLJI;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // X.InterfaceC84678XLe
    public final /* synthetic */ InterfaceC84678XLe LJJIL(int i) {
        if (i >= this.LJLJI) {
            return new C84680XLg(this.LJLJI, Arrays.copyOf(this.LJLILLLLZI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        LIZJ();
        collection.getClass();
        if (!(collection instanceof C84680XLg)) {
            return super.addAll(collection);
        }
        C84680XLg c84680XLg = (C84680XLg) collection;
        int i = c84680XLg.LJLJI;
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
            System.arraycopy(c84680XLg.LJLILLLLZI, 0, this.LJLILLLLZI, this.LJLJI, c84680XLg.LJLJI);
            this.LJLJI = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84680XLg)) {
            return super.equals(obj);
        }
        C84680XLg c84680XLg = (C84680XLg) obj;
        if (this.LJLJI != c84680XLg.LJLJI) {
            return false;
        }
        long[] jArr = c84680XLg.LJLILLLLZI;
        for (int i = 0; i < this.LJLJI; i++) {
            if (this.LJLILLLLZI[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        LJFF(i);
        return Long.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        LIZJ();
        for (int i = 0; i < this.LJLJI; i++) {
            if (obj.equals(Long.valueOf(this.LJLILLLLZI[i]))) {
                long[] jArr = this.LJLILLLLZI;
                System.arraycopy(jArr, i + 1, jArr, i, (this.LJLJI - i) - 1);
                this.LJLJI--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        LIZJ();
        LJFF(i);
        long[] jArr = this.LJLILLLLZI;
        long j = jArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    public C84680XLg(int i, long[] jArr) {
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
        throw new IndexOutOfBoundsException(LJII(i));
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
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        LIZJ();
        LJFF(i);
        long[] jArr = this.LJLILLLLZI;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }
}
