package X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public abstract class W8J<V> implements W81<V> {
    public final Class<?> LJLIL = getClass();
    public final WB6 LJLILLLLZI;
    public final W9W LJLJI;
    public final SparseArray<W8N<V>> LJLJJI;
    public final java.util.Set<V> LJLJJL;
    public boolean LJLJJLL;
    public final W9B LJLJL;
    public final W9B LJLJLJ;
    public final InterfaceC81823W9j LJLJLLL;

    public abstract V LIZIZ(int i);

    public final synchronized void LJ() {
        boolean z;
        if (LJIIL() && this.LJLJLJ.LIZIZ != 0) {
            z = false;
            C32151Nz.LJIIIZ(z);
        }
        z = true;
        C32151Nz.LJIIIZ(z);
    }

    public abstract void LJFF(V v);

    public abstract int LJIIIIZZ(int i);

    public abstract int LJIIIZ(V v);

    public abstract int LJIIJ(int i);

    public final synchronized boolean LJIIL() {
        boolean z;
        if (this.LJLJL.LIZIZ + this.LJLJLJ.LIZIZ > this.LJLJI.LIZIZ) {
            z = true;
            this.LJLJLLL.LIZLLL();
        } else {
            z = false;
        }
        return z;
    }

    public final void LJIILL() {
        if (W58.LJIIJ(2)) {
            W58.LJIILJJIL(this.LJLIL, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.LJLJL.LIZ), Integer.valueOf(this.LJLJL.LIZIZ), Integer.valueOf(this.LJLJLJ.LIZ), Integer.valueOf(this.LJLJLJ.LIZIZ));
        }
    }

    public final synchronized void LJIJ() {
        if (LJIIL()) {
            LJIIZILJ(this.LJLJI.LIZIZ);
        }
    }

    @Override // X.W81, X.VWQ
    public final void LIZ(V v) {
        v.getClass();
        int LJIIIZ = LJIIIZ(v);
        LJIIJ(LJIIIZ);
        synchronized (this) {
            W8N<V> LJII = LJII(LJIIIZ);
            boolean z = false;
            if (!this.LJLJJL.remove(v)) {
                W58.LJFF(this.LJLIL, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(LJIIIZ));
                LJFF(v);
                this.LJLJLLL.LJI();
            } else {
                if (LJII != null) {
                    if (((LinkedList) LJII.LIZJ).size() + LJII.LJ <= LJII.LIZIZ && !LJIIL() && LJIILIIL(v)) {
                        LJII.LIZJ(v);
                        W9B w9b = this.LJLJLJ;
                        w9b.LIZ++;
                        w9b.LIZIZ += LJIIIZ;
                        this.LJLJL.LIZ(LJIIIZ);
                        this.LJLJLLL.LJ();
                        if (W58.LJIIJ(2)) {
                            W58.LJIIL(this.LJLIL, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(LJIIIZ));
                        }
                    }
                    if (LJII.LJ > 0) {
                        z = true;
                    }
                    C32151Nz.LJIIIZ(z);
                    LJII.LJ--;
                }
                if (W58.LJIIJ(2)) {
                    W58.LJIIL(this.LJLIL, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(LJIIIZ));
                }
                LJFF(v);
                this.LJLJL.LIZ(LJIIIZ);
                this.LJLJLLL.LJI();
            }
            LJIILL();
        }
    }

    public final synchronized boolean LIZJ(int i) {
        W9W w9w = this.LJLJI;
        int i2 = w9w.LIZ;
        int i3 = this.LJLJL.LIZIZ;
        if (i > i2 - i3) {
            this.LJLJLLL.LJII();
            return false;
        }
        int i4 = w9w.LIZIZ;
        if (i > i4 - (i3 + this.LJLJLJ.LIZIZ)) {
            LJIIZILJ(i4 - i);
        }
        if (i > i2 - (this.LJLJL.LIZIZ + this.LJLJLJ.LIZIZ)) {
            this.LJLJLLL.LJII();
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.PML
    public final void LIZLLL(EnumC81745W6j enumC81745W6j) {
        ArrayList arrayList;
        int i;
        synchronized (this) {
            this.LJLJI.getClass();
            arrayList = new ArrayList(this.LJLJJI.size());
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (int i2 = 0; i2 < this.LJLJJI.size(); i2++) {
                W8N<V> valueAt = this.LJLJJI.valueAt(i2);
                if (((LinkedList) valueAt.LIZJ).size() > 0) {
                    arrayList.add(valueAt);
                }
                sparseIntArray.put(this.LJLJJI.keyAt(i2), valueAt.LJ);
            }
            LJIILJJIL(sparseIntArray);
            W9B w9b = this.LJLJLJ;
            w9b.LIZ = 0;
            w9b.LIZIZ = 0;
            LJIILL();
        }
        for (i = 0; i < arrayList.size(); i++) {
            W8N w8n = (W8N) arrayList.get(i);
            while (true) {
                Object LIZIZ = w8n.LIZIZ();
                if (LIZIZ == null) {
                    break;
                } else {
                    LJFF(LIZIZ);
                }
            }
        }
    }

    public final synchronized W8N<V> LJI(int i) {
        W8N<V> w8n = this.LJLJJI.get(i);
        if (w8n == null && this.LJLJJLL) {
            if (W58.LJIIJ(2)) {
                W58.LJIIJJI(this.LJLIL, "creating new bucket %s", Integer.valueOf(i));
            }
            W8N<V> LJIILLIIL = LJIILLIIL(i);
            this.LJLJJI.put(i, LJIILLIIL);
            return LJIILLIIL;
        }
        return w8n;
    }

    public final synchronized W8N<V> LJII(int i) {
        return this.LJLJJI.get(i);
    }

    public synchronized V LJIIJJI(W8N<V> w8n) {
        V LIZIZ;
        LIZIZ = w8n.LIZIZ();
        if (LIZIZ != null) {
            w8n.LJ++;
        }
        return LIZIZ;
    }

    public boolean LJIILIIL(V v) {
        v.getClass();
        return true;
    }

    public final synchronized void LJIILJJIL(SparseIntArray sparseIntArray) {
        this.LJLJJI.clear();
        SparseIntArray sparseIntArray2 = this.LJLJI.LIZJ;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                int valueAt = sparseIntArray2.valueAt(i);
                int i2 = sparseIntArray.get(keyAt, 0);
                SparseArray<W8N<V>> sparseArray = this.LJLJJI;
                LJIIJ(keyAt);
                this.LJLJI.getClass();
                sparseArray.put(keyAt, new W8N<>(keyAt, valueAt, i2));
            }
            this.LJLJJLL = false;
        } else {
            this.LJLJJLL = true;
        }
    }

    public W8N<V> LJIILLIIL(int i) {
        LJIIJ(i);
        this.LJLJI.getClass();
        return new W8N<>(i, Integer.MAX_VALUE, 0);
    }

    public final synchronized void LJIIZILJ(int i) {
        int i2 = this.LJLJL.LIZIZ;
        int i3 = this.LJLJLJ.LIZIZ;
        int min = Math.min((i2 + i3) - i, i3);
        if (min <= 0) {
            return;
        }
        if (W58.LJIIJ(2)) {
            W58.LJIILIIL(this.LJLIL, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.LJLJL.LIZIZ + this.LJLJLJ.LIZIZ), Integer.valueOf(min));
        }
        LJIILL();
        for (int i4 = 0; i4 < this.LJLJJI.size() && min > 0; i4++) {
            W8N<V> valueAt = this.LJLJJI.valueAt(i4);
            do {
                V LIZIZ = valueAt.LIZIZ();
                if (LIZIZ == null) {
                    break;
                }
                LJFF(LIZIZ);
                int i5 = valueAt.LIZ;
                min -= i5;
                this.LJLJLJ.LIZ(i5);
            } while (min > 0);
        }
        LJIILL();
        if (W58.LJIIJ(2)) {
            W58.LJIIL(this.LJLIL, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.LJLJL.LIZIZ + this.LJLJLJ.LIZIZ));
        }
    }

    @Override // X.W81
    public final V get(int i) {
        V v;
        boolean z;
        V LJIIJJI;
        LJ();
        int LJIIIIZZ = LJIIIIZZ(i);
        synchronized (this) {
            W8N<V> LJI = LJI(LJIIIIZZ);
            if (LJI != null && (LJIIJJI = LJIIJJI(LJI)) != null) {
                C32151Nz.LJIIIZ(this.LJLJJL.add(LJIIJJI));
                int LJIIIZ = LJIIIZ(LJIIJJI);
                LJIIJ(LJIIIZ);
                W9B w9b = this.LJLJL;
                w9b.LIZ++;
                w9b.LIZIZ += LJIIIZ;
                this.LJLJLJ.LIZ(LJIIIZ);
                this.LJLJLLL.LIZJ();
                LJIILL();
                if (W58.LJIIJ(2)) {
                    W58.LJIIL(this.LJLIL, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(LJIIJJI)), Integer.valueOf(LJIIIZ));
                }
                return LJIIJJI;
            }
            LJIIJ(LJIIIIZZ);
            if (LIZJ(LJIIIIZZ)) {
                W9B w9b2 = this.LJLJL;
                w9b2.LIZ++;
                w9b2.LIZIZ += LJIIIIZZ;
                if (LJI != null) {
                    LJI.LJ++;
                }
                try {
                    v = LIZIZ(LJIIIIZZ);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.LJLJL.LIZ(LJIIIIZZ);
                        W8N<V> LJI2 = LJI(LJIIIIZZ);
                        if (LJI2 != null) {
                            if (LJI2.LJ > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C32151Nz.LJIIIZ(z);
                            LJI2.LJ--;
                        }
                        if (!Error.class.isInstance(th)) {
                            if (!RuntimeException.class.isInstance(th)) {
                                v = null;
                            } else {
                                throw ((Throwable) RuntimeException.class.cast(th));
                            }
                        } else {
                            throw ((Throwable) Error.class.cast(th));
                        }
                    }
                }
                synchronized (this) {
                    C32151Nz.LJIIIZ(this.LJLJJL.add(v));
                    LJIJ();
                    this.LJLJLLL.LIZIZ();
                    LJIILL();
                    if (W58.LJIIJ(2)) {
                        W58.LJIIL(this.LJLIL, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(LJIIIIZZ));
                    }
                }
                return v;
            }
            throw new H77(this.LJLJI.LIZ, this.LJLJL.LIZIZ, this.LJLJLJ.LIZIZ, LJIIIIZZ);
        }
    }

    public W8J(WB6 wb6, W9W w9w, C78937UyT c78937UyT) {
        wb6.getClass();
        this.LJLILLLLZI = wb6;
        w9w.getClass();
        this.LJLJI = w9w;
        c78937UyT.getClass();
        this.LJLJLLL = c78937UyT;
        this.LJLJJI = new SparseArray<>();
        LJIILJJIL(new SparseIntArray(0));
        this.LJLJJL = Collections.newSetFromMap(new IdentityHashMap());
        this.LJLJLJ = new W9B();
        this.LJLJL = new W9B();
    }
}
