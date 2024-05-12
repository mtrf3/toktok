package X;

import defpackage.g0;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.Ppm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65658Ppm<K, V> extends AbstractMap<K, V> implements Serializable {
    public transient int[] LJLIL;
    public transient long[] LJLILLLLZI;
    public transient Object[] LJLJI;
    public transient Object[] LJLJJI;
    public transient float LJLJJL;
    public transient int LJLJJLL;
    public transient int LJLJL;
    public transient int LJLJLJ;
    public transient C65678Pq6 LJLJLLL;
    public transient C65668Ppw LJLL;
    public transient C65686PqE LJLLI;

    /* renamed from: X.Ppm$b */
    /* loaded from: classes12.dex */
    public abstract class b<T> implements Iterator<T> {
        public int LJLIL;
        public int LJLILLLLZI;
        public int LJLJI = -1;

        public abstract T LIZ(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LJLILLLLZI >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (C65658Ppm.this.LJLJJLL == this.LJLIL) {
                if (hasNext()) {
                    int i = this.LJLILLLLZI;
                    this.LJLJI = i;
                    T LIZ = LIZ(i);
                    this.LJLILLLLZI = C65658Ppm.this.LIZLLL(this.LJLILLLLZI);
                    return LIZ;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            boolean z;
            if (C65658Ppm.this.LJLJJLL == this.LJLIL) {
                if (this.LJLJI >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                g0.LJIIJ(z);
                this.LJLIL++;
                C65658Ppm.this.LJIIJJI(this.LJLJI);
                this.LJLILLLLZI = C65658Ppm.this.LIZIZ(this.LJLILLLLZI, this.LJLJI);
                this.LJLJI = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }

        public b() {
            this.LJLIL = C65658Ppm.this.LJLJJLL;
            this.LJLILLLLZI = C65658Ppm.this.LIZJ();
        }
    }

    public void LIZ(int i) {
    }

    public int LIZIZ(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.LJLJJLL++;
        Arrays.fill(this.LJLJI, 0, this.LJLJLJ, (Object) null);
        Arrays.fill(this.LJLJJI, 0, this.LJLJLJ, (Object) null);
        Arrays.fill(this.LJLIL, -1);
        Arrays.fill(this.LJLILLLLZI, -1L);
        this.LJLJLJ = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        C65668Ppw c65668Ppw = this.LJLL;
        if (c65668Ppw == null) {
            C65668Ppw c65668Ppw2 = new C65668Ppw(this);
            this.LJLL = c65668Ppw2;
            return c65668Ppw2;
        }
        return c65668Ppw;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (this.LJLJLJ == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        C65678Pq6 c65678Pq6 = this.LJLJLLL;
        if (c65678Pq6 == null) {
            C65678Pq6 c65678Pq62 = new C65678Pq6(this);
            this.LJLJLLL = c65678Pq62;
            return c65678Pq62;
        }
        return c65678Pq6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C65686PqE c65686PqE = this.LJLLI;
        if (c65686PqE == null) {
            C65686PqE c65686PqE2 = new C65686PqE(this);
            this.LJLLI = c65686PqE2;
            return c65686PqE2;
        }
        return c65686PqE;
    }

    public C65658Ppm() {
        LJI(3);
    }

    public int LIZJ() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LJLJLJ;
    }

    public C65658Ppm(int i) {
        LJI(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        LJI(3);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.LJLJLJ);
        for (int i = 0; i < this.LJLJLJ; i++) {
            objectOutputStream.writeObject(this.LJLJI[i]);
            objectOutputStream.writeObject(this.LJLJJI[i]);
        }
    }

    public int LIZLLL(int i) {
        int i2 = i + 1;
        if (i2 < this.LJLJLJ) {
            return i2;
        }
        return -1;
    }

    public final int LJ(Object obj) {
        int LJIJJLI = C1FP.LJIJJLI(obj);
        int i = this.LJLIL[(r1.length - 1) & LJIJJLI];
        while (i != -1) {
            long j = this.LJLILLLLZI[i];
            if (((int) (j >>> 32)) == LJIJJLI && C78886Uxe.LJIIIIZZ(obj, this.LJLJI[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void LJI(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZJ("Initial capacity must be non-negative", z);
        int LJ = C1FP.LJ(1.0f, i);
        int[] iArr = new int[LJ];
        Arrays.fill(iArr, -1);
        this.LJLIL = iArr;
        this.LJLJJL = 1.0f;
        this.LJLJI = new Object[i];
        this.LJLJJI = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.LJLILLLLZI = jArr;
        this.LJLJL = Math.max(1, (int) (LJ * 1.0f));
    }

    public void LJIIIIZZ(int i) {
        int i2 = this.LJLJLJ - 1;
        if (i < i2) {
            Object[] objArr = this.LJLJI;
            objArr[i] = objArr[i2];
            Object[] objArr2 = this.LJLJJI;
            objArr2[i] = objArr2[i2];
            objArr[i2] = null;
            objArr2[i2] = null;
            long[] jArr = this.LJLILLLLZI;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int[] iArr = this.LJLIL;
            int length = ((int) (j >>> 32)) & (iArr.length - 1);
            int i3 = iArr[length];
            if (i3 == i2) {
                iArr[length] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.LJLILLLLZI;
                long j2 = jArr2[i3];
                int i4 = (int) j2;
                if (i4 == i2) {
                    jArr2[i3] = (j2 & (-4294967296L)) | (4294967295L & i);
                    return;
                }
                i3 = i4;
            }
        } else {
            this.LJLJI[i] = null;
            this.LJLJJI[i] = null;
            this.LJLILLLLZI[i] = -1;
        }
    }

    public final void LJIIJJI(int i) {
        LJIIIZ((int) (this.LJLILLLLZI[i] >>> 32), this.LJLJI[i]);
    }

    public void LJIIL(int i) {
        this.LJLJI = Arrays.copyOf(this.LJLJI, i);
        this.LJLJJI = Arrays.copyOf(this.LJLJJI, i);
        long[] jArr = this.LJLILLLLZI;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.LJLILLLLZI = copyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (LJ(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        for (int i = 0; i < this.LJLJLJ; i++) {
            if (C78886Uxe.LJIIIIZZ(obj, this.LJLJJI[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int LJ = LJ(obj);
        LIZ(LJ);
        if (LJ == -1) {
            return null;
        }
        return (V) this.LJLJJI[LJ];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return (V) LJIIIZ(C1FP.LJIJJLI(obj), obj);
    }

    public final Object LJIIIZ(int i, Object obj) {
        int length = (r1.length - 1) & i;
        int i2 = this.LJLIL[length];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.LJLILLLLZI[i2] >>> 32)) == i && C78886Uxe.LJIIIIZZ(obj, this.LJLJI[i2])) {
                Object obj2 = this.LJLJJI[i2];
                if (i3 == -1) {
                    this.LJLIL[length] = (int) this.LJLILLLLZI[i2];
                } else {
                    long[] jArr = this.LJLILLLLZI;
                    jArr[i3] = (jArr[i3] & (-4294967296L)) | (4294967295L & ((int) jArr[i2]));
                }
                LJIIIIZZ(i2);
                this.LJLJLJ--;
                this.LJLJJLL++;
                return obj2;
            }
            int i4 = (int) this.LJLILLLLZI[i2];
            if (i4 == -1) {
                return null;
            }
            i3 = i2;
            i2 = i4;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        long[] jArr = this.LJLILLLLZI;
        Object[] objArr = this.LJLJI;
        Object[] objArr2 = this.LJLJJI;
        int LJIJJLI = C1FP.LJIJJLI(k);
        int[] iArr = this.LJLIL;
        int length = (iArr.length - 1) & LJIJJLI;
        int i = this.LJLJLJ;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == LJIJJLI && C78886Uxe.LJIIIIZZ(k, objArr[i2])) {
                    V v2 = (V) objArr2[i2];
                    objArr2[i2] = v;
                    LIZ(i2);
                    return v2;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = ((-4294967296L) & j) | (i & 4294967295L);
                    break;
                }
                i2 = i3;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i4 = i + 1;
            int length2 = this.LJLILLLLZI.length;
            if (i4 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max < 0) {
                    max = Integer.MAX_VALUE;
                }
                if (max != length2) {
                    LJIIL(max);
                }
            }
            LJII(i, LJIJJLI, k, v);
            this.LJLJLJ = i4;
            if (i >= this.LJLJL) {
                int[] iArr2 = this.LJLIL;
                int length3 = iArr2.length * 2;
                if (iArr2.length >= 1073741824) {
                    this.LJLJL = Integer.MAX_VALUE;
                } else {
                    int i5 = ((int) (length3 * this.LJLJJL)) + 1;
                    int[] iArr3 = new int[length3];
                    Arrays.fill(iArr3, -1);
                    long[] jArr2 = this.LJLILLLLZI;
                    int i6 = length3 - 1;
                    for (int i7 = 0; i7 < this.LJLJLJ; i7++) {
                        int i8 = (int) (jArr2[i7] >>> 32);
                        int i9 = i8 & i6;
                        int i10 = iArr3[i9];
                        iArr3[i9] = i7;
                        jArr2[i7] = (i10 & 4294967295L) | (i8 << 32);
                    }
                    this.LJLJL = i5;
                    this.LJLIL = iArr3;
                }
            }
            this.LJLJJLL++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public void LJII(int i, int i2, Object obj, Object obj2) {
        this.LJLILLLLZI[i] = (i2 << 32) | 4294967295L;
        this.LJLJI[i] = obj;
        this.LJLJJI[i] = obj2;
    }
}
