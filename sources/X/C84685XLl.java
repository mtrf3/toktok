package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.XLl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84685XLl extends AbstractC84676XLc implements RandomAccess, InterfaceC84688XLo {
    public float[] LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.LJLILLLLZI[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI;
    }

    static {
        new C84685XLl(0, new float[0]).LJLIL = false;
    }

    public C84685XLl() {
        this(0, new float[10]);
    }

    public final void LJFF(float f) {
        LIZJ();
        int i = this.LJLJI;
        float[] fArr = this.LJLILLLLZI;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.LJLILLLLZI = fArr2;
        }
        float[] fArr3 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        fArr3[i2] = f;
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
            return new C84685XLl(this.LJLJI, Arrays.copyOf(this.LJLILLLLZI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LJFF(((Float) obj).floatValue());
        return true;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        LIZJ();
        collection.getClass();
        if (!(collection instanceof C84685XLl)) {
            return super.addAll(collection);
        }
        C84685XLl c84685XLl = (C84685XLl) collection;
        int i = c84685XLl.LJLJI;
        if (i == 0) {
            return false;
        }
        int i2 = this.LJLJI;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.LJLILLLLZI;
            if (i3 > fArr.length) {
                this.LJLILLLLZI = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c84685XLl.LJLILLLLZI, 0, this.LJLILLLLZI, this.LJLJI, c84685XLl.LJLJI);
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
        if (!(obj instanceof C84685XLl)) {
            return super.equals(obj);
        }
        C84685XLl c84685XLl = (C84685XLl) obj;
        if (this.LJLJI != c84685XLl.LJLJI) {
            return false;
        }
        float[] fArr = c84685XLl.LJLILLLLZI;
        for (int i = 0; i < this.LJLJI; i++) {
            if (Float.floatToIntBits(this.LJLILLLLZI[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJII(i);
        return Float.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.LJLJI;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LJLILLLLZI[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        LIZJ();
        LJII(i);
        float[] fArr = this.LJLILLLLZI;
        float f = fArr[i];
        if (i < this.LJLJI - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.LJLJI--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    public C84685XLl(int i, float[] fArr) {
        this.LJLILLLLZI = fArr;
        this.LJLJI = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LJLJI)) {
            float[] fArr = this.LJLILLLLZI;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.LJLILLLLZI, i, fArr2, i + 1, this.LJLJI - i);
                this.LJLILLLLZI = fArr2;
            }
            this.LJLILLLLZI[i] = floatValue;
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
            float[] fArr = this.LJLILLLLZI;
            System.arraycopy(fArr, i2, fArr, i, this.LJLJI - i2);
            this.LJLJI -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        LIZJ();
        LJII(i);
        float[] fArr = this.LJLILLLLZI;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }
}
