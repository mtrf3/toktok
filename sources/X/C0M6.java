package X;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.0M6, reason: invalid class name */
/* loaded from: classes.dex */
public class C0M6<K, V> {
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public int LJ;

    public V LIZ(K k) {
        return null;
    }

    public final synchronized int LJFF() {
        return this.LIZIZ;
    }

    public int LJI(K k, V v) {
        return 1;
    }

    public final synchronized java.util.Map<K, V> LJII() {
        return new LinkedHashMap(this.LIZ);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.LIZLLL;
        int i3 = this.LJ + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return C16880lQ.LLLZI(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(i)});
    }

    public C0M6(int i) {
        if (i > 0) {
            this.LIZJ = i;
            this.LIZ = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V LIZIZ(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.LIZ.get(k);
                if (v != null) {
                    this.LIZLLL++;
                    return v;
                }
                this.LJ++;
                V LIZ = LIZ(k);
                if (LIZ == null) {
                    return null;
                }
                synchronized (this) {
                    put = this.LIZ.put(k, LIZ);
                    if (put != null) {
                        this.LIZ.put(k, put);
                    } else {
                        this.LIZIZ += LJ(k, LIZ);
                    }
                }
                if (put != null) {
                    return put;
                }
                LJIIIIZZ(this.LIZJ);
                return LIZ;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final V LIZLLL(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.LIZ.remove(k);
                if (remove != null) {
                    this.LIZIZ -= LJ(k, remove);
                }
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(getClass().getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(X.X1D.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L66
            if (r0 < 0) goto L48
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L66
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L11
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L48
        L11:
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L66
            if (r0 <= r5) goto L1d
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L66
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L1f
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            goto L47
        L1f:
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L66
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L66
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L66
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L66
            r0.remove(r3)     // Catch: java.lang.Throwable -> L66
            int r1 = r4.LIZIZ     // Catch: java.lang.Throwable -> L66
            int r0 = r4.LJ(r3, r2)     // Catch: java.lang.Throwable -> L66
            int r1 = r1 - r0
            r4.LIZIZ = r1     // Catch: java.lang.Throwable -> L66
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            goto L0
        L47:
            return
        L48:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L66
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L66
            r1.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L66
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L66
            throw r2     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M6.LJIIIIZZ(int):void");
    }

    public final V LIZJ(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.LIZIZ += LJ(k, v);
                put = this.LIZ.put(k, v);
                if (put != null) {
                    this.LIZIZ -= LJ(k, put);
                }
            }
            LJIIIIZZ(this.LIZJ);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final int LJ(K k, V v) {
        int LJI = LJI(k, v);
        if (LJI >= 0) {
            return LJI;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Negative size: ");
        LIZ.append(k);
        LIZ.append("=");
        LIZ.append(v);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }
}
