package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS188S0100000_6;

/* renamed from: X.EAe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35980EAe<K, V> {
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final int LJ;
    public final InterfaceC88471Ynr<K, V, Boolean> LJFF;
    public final InterfaceC88471Ynr<K, V, C76800UCe> LJI;

    public final synchronized String toString() {
        int i;
        StringBuilder LIZ;
        int i2 = this.LIZJ;
        int i3 = this.LIZLLL + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        LIZ = X1D.LIZ();
        LIZ.append("LruCache[maxSize=");
        LIZ.append(this.LJ);
        LIZ.append(",hits=");
        LIZ.append(this.LIZJ);
        LIZ.append(",misses=");
        LIZ.append(this.LIZLLL);
        LIZ.append(",hitRate=");
        LIZ.append(i);
        LIZ.append("%%]");
        return X1D.LIZIZ(LIZ);
    }

    public final V LIZ(K k) {
        new C68322mC();
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(X.C35980EAe.class.getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        throw new java.lang.IllegalStateException(X.X1D.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L6b
            if (r0 < 0) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L11
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L4f
        L11:
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L6b
            if (r0 > r5) goto L16
            goto L43
        L16:
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L6b
            java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "map.entries"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = X.ORZ.LJLLL(r1)     // Catch: java.lang.Throwable -> L6b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L4d
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L6b
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L6b
            r1 = 0
            if (r3 == 0) goto L49
            r0.remove(r3)     // Catch: java.lang.Throwable -> L6b
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L45
            int r0 = r0 + (-1)
            r4.LIZIZ = r0     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r4)
            goto L0
        L43:
            monitor-exit(r4)
            return
        L45:
            kotlin.jvm.internal.o.LJIIZILJ()     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L6b
        L49:
            kotlin.jvm.internal.o.LJIIZILJ()     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L6b
        L4d:
            monitor-exit(r4)
            return
        L4f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class<X.EAe> r0 = X.C35980EAe.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L6b
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            throw r2     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35980EAe.LIZJ(int):void");
    }

    public final void LIZIZ(K k, V v) {
        new C68322mC();
        synchronized (this) {
            this.LIZIZ++;
            if (this.LIZ.put(k, v) != null) {
                this.LIZIZ--;
            }
        }
        LIZJ(this.LJ);
    }

    public C35980EAe(int i, AqS188S0100000_6 aqS188S0100000_6, AqS188S0100000_6 aqS188S0100000_62) {
        this.LJ = i;
        this.LJFF = aqS188S0100000_6;
        this.LJI = aqS188S0100000_62;
        if (i > 0) {
            this.LIZ = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
