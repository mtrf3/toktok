package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.XLf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84679XLf extends AbstractC84675XLb<Integer> implements InterfaceC84677XLd, InterfaceC84681XLh, RandomAccess {
    public static final C84679XLf LJLJJI;
    public int[] LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC84675XLb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            i = (i * 31) + this.LJLILLLLZI[i2];
        }
        return i;
    }

    static {
        C84679XLf c84679XLf = new C84679XLf();
        LJLJJI = c84679XLf;
        c84679XLf.LJLIL = false;
    }

    public C84679XLf() {
        this(new int[10], 0);
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
    public final InterfaceC84678XLe<Integer> LJJIL(int i) {
        if (i >= this.LJLJI) {
            return new C84679XLf(Arrays.copyOf(this.LJLILLLLZI, i), this.LJLJI);
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        LIZJ();
        collection.getClass();
        if (!(collection instanceof C84679XLf)) {
            return super.addAll(collection);
        }
        C84679XLf c84679XLf = (C84679XLf) collection;
        int i = c84679XLf.LJLJI;
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
            System.arraycopy(c84679XLf.LJLILLLLZI, 0, this.LJLILLLLZI, this.LJLJI, c84679XLf.LJLJI);
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
        if (!(obj instanceof C84679XLf)) {
            return super.equals(obj);
        }
        C84679XLf c84679XLf = (C84679XLf) obj;
        if (this.LJLJI != c84679XLf.LJLJI) {
            return false;
        }
        int[] iArr = c84679XLf.LJLILLLLZI;
        for (int i = 0; i < this.LJLJI; i++) {
            if (this.LJLILLLLZI[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        LJFF(i);
        return Integer.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        LIZJ();
        for (int i = 0; i < this.LJLJI; i++) {
            if (obj.equals(Integer.valueOf(this.LJLILLLLZI[i]))) {
                int[] iArr = this.LJLILLLLZI;
                System.arraycopy(iArr, i + 1, iArr, i, (this.LJLJI - i) - 1);
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
        int[] iArr = this.LJLILLLLZI;
        int i2 = iArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    public C84679XLf(int[] iArr, int i) {
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
        throw new IndexOutOfBoundsException(LJII(i));
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
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        LIZJ();
        LJFF(i);
        int[] iArr = this.LJLILLLLZI;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }
}
