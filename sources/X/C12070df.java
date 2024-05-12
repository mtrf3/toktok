package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.0df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12070df<K, V> {
    public final C78605Ut7 LIZ = new C78605Ut7();
    public final HashMap<K, V> LIZIZ = new HashMap<>(0, 0.75f);
    public final LinkedHashSet<K> LIZJ = new LinkedHashSet<>();
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public final int LIZLLL() {
        int i;
        synchronized (this.LIZ) {
            i = this.LIZLLL;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r4 = this;
        L0:
            X.Ut7 r3 = r4.LIZ
            monitor-enter(r3)
            int r0 = r4.LIZLLL()     // Catch: java.lang.Throwable -> L80
            if (r0 < 0) goto L78
            java.util.HashMap<K, V> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L17
            int r0 = r4.LIZLLL()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L78
        L17:
            java.util.HashMap<K, V> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L80
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L80
            java.util.LinkedHashSet<K> r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L80
            if (r1 != r0) goto L78
            int r1 = r4.LIZLLL()     // Catch: java.lang.Throwable -> L80
            r0 = 16
            if (r1 <= r0) goto L61
            java.util.HashMap<K, V> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L61
            java.util.LinkedHashSet<K> r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = X.ORZ.LJLLILLLL(r0)     // Catch: java.lang.Throwable -> L80
            java.util.HashMap<K, V> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L80
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L70
            java.util.HashMap<K, V> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L80
            java.util.Map r0 = X.C65777Prh.LIZJ(r0)     // Catch: java.lang.Throwable -> L80
            r0.remove(r2)     // Catch: java.lang.Throwable -> L80
            java.util.LinkedHashSet<K> r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L80
            java.util.Collection r0 = X.C65777Prh.LIZ(r0)     // Catch: java.lang.Throwable -> L80
            r0.remove(r2)     // Catch: java.lang.Throwable -> L80
            int r0 = r4.LIZLLL()     // Catch: java.lang.Throwable -> L80
            kotlin.jvm.internal.o.LJI(r2)     // Catch: java.lang.Throwable -> L80
            int r0 = r0 + (-1)
            r4.LIZLLL = r0     // Catch: java.lang.Throwable -> L80
            goto L63
        L61:
            r2 = 0
            r1 = r2
        L63:
            monitor-exit(r3)
            if (r2 != 0) goto L69
            if (r1 != 0) goto L69
            return
        L69:
            kotlin.jvm.internal.o.LJI(r2)
            kotlin.jvm.internal.o.LJI(r1)
            goto L0
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "inconsistent state"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L80
            throw r1     // Catch: java.lang.Throwable -> L80
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "map/keySet size inconsistency"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L80
            throw r1     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12070df.LJ():void");
    }

    public final String toString() {
        int i;
        String LIZIZ;
        synchronized (this.LIZ) {
            int i2 = this.LJ;
            int i3 = this.LJFF + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LruCache[maxSize=");
            LIZ.append(16);
            LIZ.append(",hits=");
            LIZ.append(this.LJ);
            LIZ.append(",misses=");
            LIZ.append(this.LJFF);
            LIZ.append(",hitRate=");
            LIZ.append(i);
            LIZ.append("%]");
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        return LIZIZ;
    }

    public final V LIZ(K k) {
        synchronized (this.LIZ) {
            V v = this.LIZIZ.get(k);
            if (v != null) {
                this.LIZJ.remove(k);
                this.LIZJ.add(k);
                this.LJ++;
                return v;
            }
            this.LJFF++;
            return null;
        }
    }

    public final V LIZJ(K k) {
        V remove;
        k.getClass();
        synchronized (this.LIZ) {
            remove = this.LIZIZ.remove(k);
            this.LIZJ.remove(k);
            if (remove != null) {
                this.LIZLLL = LIZLLL() - 1;
            }
        }
        return remove;
    }

    public final V LIZIZ(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this.LIZ) {
                this.LIZLLL = LIZLLL() + 1;
                put = this.LIZIZ.put(k, v);
                if (put != null) {
                    this.LIZLLL = LIZLLL() - 1;
                }
                if (this.LIZJ.contains(k)) {
                    this.LIZJ.remove(k);
                }
                this.LIZJ.add(k);
            }
            LJ();
            return put;
        }
        throw null;
    }
}
