package X;

import java.util.LinkedHashMap;

/* renamed from: X.EAb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35977EAb<K, V> {
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public void LIZ(Object obj, Object obj2, Object obj3) {
        throw null;
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
        return C16880lQ.LLLZ("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(i)});
    }

    public C35977EAb(int i) {
        if (i > 0) {
            this.LIZJ = i;
            this.LIZ = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V LIZIZ(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.LIZ.get(k);
                if (v != null) {
                    this.LIZLLL++;
                    return v;
                }
                this.LJ++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(getClass().getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        throw new java.lang.IllegalStateException(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            if (r0 < 0) goto L5d
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L11
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L5d
        L11:
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            if (r0 <= r5) goto L1d
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L1f
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7b
            goto L5c
        L1f:
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7b
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L7b
            r3 = 0
            if (r0 == 0) goto L42
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7b
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L44
        L42:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7b
            goto L5c
        L44:
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L7b
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7b
            r0.remove(r2)     // Catch: java.lang.Throwable -> L7b
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            int r0 = r0 + (-1)
            r4.LIZIZ = r0     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7b
            r4.LIZ(r2, r1, r3)
            goto L0
        L5c:
            return
        L5d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7b
            r1.append(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7b
            throw r2     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35977EAb.LIZLLL(int):void");
    }

    public final void LIZJ(Object obj, C84332X7w c84332X7w) {
        V put;
        if (obj != null) {
            synchronized (this) {
                this.LIZIZ++;
                put = this.LIZ.put(obj, c84332X7w);
                if (put != null) {
                    this.LIZIZ--;
                }
            }
            if (put != null) {
                LIZ(obj, put, c84332X7w);
            }
            LIZLLL(this.LIZJ);
            return;
        }
        throw new NullPointerException("key == null || value == null");
    }
}
