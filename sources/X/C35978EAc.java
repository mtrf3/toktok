package X;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.EAc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35978EAc<K, V> {
    public final LinkedHashMap<K, V> LIZ = new LinkedHashMap<>(0, 0.75f, true);
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(X.C35978EAc.class.getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        throw new java.lang.IllegalStateException(X.X1D.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L62
            if (r0 < 0) goto L46
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L11
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L46
        L11:
            int r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> L62
            r0 = 31
            if (r1 <= r0) goto L1f
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L21
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L62
            goto L45
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L62
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L62
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L62
            r0.getValue()     // Catch: java.lang.Throwable -> L62
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L62
            r0.remove(r1)     // Catch: java.lang.Throwable -> L62
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L62
            int r0 = r0 + (-1)
            r3.LIZIZ = r0     // Catch: java.lang.Throwable -> L62
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L62
            goto L0
        L45:
            return
        L46:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L62
            java.lang.Class<X.EAc> r0 = X.C35978EAc.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L62
            r1.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L62
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L62
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35978EAc.LIZJ():void");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.LIZJ;
        int i3 = this.LIZLLL + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return C16880lQ.LLLZI(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{31, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(i)});
    }

    public final V LIZ(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.LIZ.get(k);
                if (v != null) {
                    this.LIZJ++;
                    return v;
                }
                this.LIZLLL++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final void LIZIZ(Object obj, C55005LiL c55005LiL) {
        if (obj != null) {
            synchronized (this) {
                this.LIZIZ++;
                if (this.LIZ.put(obj, c55005LiL) != null) {
                    this.LIZIZ--;
                }
            }
            LIZJ();
            return;
        }
        throw new NullPointerException("key == null || value == null");
    }
}
