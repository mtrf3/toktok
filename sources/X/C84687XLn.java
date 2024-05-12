package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.XLn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84687XLn extends AbstractC84676XLc implements RandomAccess, InterfaceC84688XLo {
    public double[] LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            i = (i * 31) + YIG.LIZ(Double.doubleToLongBits(this.LJLILLLLZI[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    static {
        new C84687XLn(0, new double[0]).LJLIL = false;
    }

    public C84687XLn() {
        this(0, new double[10]);
    }

    public final void LJFF(double d) {
        LIZJ();
        int i = this.LJLJI;
        double[] dArr = this.LJLILLLLZI;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.LJLILLLLZI = dArr2;
        }
        double[] dArr3 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        dArr3[i2] = d;
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
            return new C84687XLn(this.LJLJI, Arrays.copyOf(this.LJLILLLLZI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LJFF(((Double) obj).doubleValue());
        return true;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        LIZJ();
        collection.getClass();
        if (!(collection instanceof C84687XLn)) {
            return super.addAll(collection);
        }
        C84687XLn c84687XLn = (C84687XLn) collection;
        int i = c84687XLn.LJLJI;
        if (i == 0) {
            return false;
        }
        int i2 = this.LJLJI;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.LJLILLLLZI;
            if (i3 > dArr.length) {
                this.LJLILLLLZI = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c84687XLn.LJLILLLLZI, 0, this.LJLILLLLZI, this.LJLJI, c84687XLn.LJLJI);
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
        if (!(obj instanceof C84687XLn)) {
            return super.equals(obj);
        }
        C84687XLn c84687XLn = (C84687XLn) obj;
        if (this.LJLJI != c84687XLn.LJLJI) {
            return false;
        }
        double[] dArr = c84687XLn.LJLILLLLZI;
        for (int i = 0; i < this.LJLJI; i++) {
            if (Double.doubleToLongBits(this.LJLILLLLZI[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJII(i);
        return Double.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.LJLJI;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LJLILLLLZI[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        LIZJ();
        LJII(i);
        double[] dArr = this.LJLILLLLZI;
        double d = dArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    public C84687XLn(int i, double[] dArr) {
        this.LJLILLLLZI = dArr;
        this.LJLJI = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LJLJI)) {
            double[] dArr = this.LJLILLLLZI;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.LJLILLLLZI, i, dArr2, i + 1, this.LJLJI - i);
                this.LJLILLLLZI = dArr2;
            }
            this.LJLILLLLZI[i] = doubleValue;
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
            double[] dArr = this.LJLILLLLZI;
            System.arraycopy(dArr, i2, dArr, i, this.LJLJI - i2);
            this.LJLJI -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        LIZJ();
        LJII(i);
        double[] dArr = this.LJLILLLLZI;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }
}
