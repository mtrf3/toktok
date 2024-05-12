package X;

import java.lang.ref.WeakReference;

/* renamed from: X.R2k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68902R2k<K, V> implements InterfaceC68905R2n<OSZ<? extends K, ? extends V>> {
    public final WeakReference<QDR<OSZ<K, V>>> LIZ;

    public C68902R2k(QDR<OSZ<K, V>> qdr) {
        this.LIZ = new WeakReference<>(qdr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        r1 = X.C68755Qyd.LIZ;
        r0 = r1.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r0.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        r0 = new java.util.concurrent.atomic.AtomicBoolean(false);
        r1.put(r4, r0);
     */
    @Override // X.InterfaceC68905R2n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.InterfaceC68901R2j<X.OSZ<K, V>> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "traceable"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            java.lang.ref.WeakReference<X.QDR<X.OSZ<K, V>>> r0 = r7.LIZ
            java.lang.Object r4 = r0.get()
            X.QDR r4 = (X.QDR) r4
            if (r4 == 0) goto Ldb
        Lf:
            java.util.Map<X.QDR<?>, java.util.concurrent.atomic.AtomicBoolean> r5 = X.C68755Qyd.LIZ
            java.lang.Object r1 = r5.get(r4)
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r3 = 0
            if (r1 == 0) goto L22
        L1a:
            r0 = 1
            boolean r0 = r1.compareAndSet(r3, r0)
            if (r0 == 0) goto Lf
            goto L2b
        L22:
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r3)
            r5.put(r4, r1)
            goto L1a
        L2b:
            java.util.Map<X.QDR<?>, java.util.Map<?, X.R2j<?>>> r6 = X.C68757Qyf.LIZ     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r6.get(r4)     // Catch: java.lang.Throwable -> Lb8
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto La4
        L35:
            java.util.Map r1 = X.C65777Prh.LIZJ(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r8.payload()     // Catch: java.lang.Throwable -> Lb8
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Throwable -> Lb8
            r1.put(r0, r8)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r4 instanceof X.InterfaceC68904R2m     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L83
            r2 = r4
            X.R2m r2 = (X.InterfaceC68904R2m) r2     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r8.payload()     // Catch: java.lang.Throwable -> Lb8
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r8.payload()     // Catch: java.lang.Throwable -> Lb8
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Throwable -> Lb8
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lb8
        L64:
            java.lang.Object r0 = r6.get(r4)     // Catch: java.lang.Throwable -> Lb8
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto Ld0
            java.util.Map r1 = X.C65777Prh.LIZJ(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto Ld0
            java.lang.Object r0 = r8.payload()     // Catch: java.lang.Throwable -> Lb8
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> Lb8
            X.R2j r0 = (X.InterfaceC68901R2j) r0     // Catch: java.lang.Throwable -> Lb8
            goto Ld0
        L83:
            boolean r0 = r4 instanceof X.InterfaceC68903R2l     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto Lad
            r2 = r4
            X.R2l r2 = (X.InterfaceC68903R2l) r2     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r8.payload()     // Catch: java.lang.Throwable -> Lb8
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r8.payload()     // Catch: java.lang.Throwable -> Lb8
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Throwable -> Lb8
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lb8
            r2.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> Lb8
            goto L64
        La4:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lb8
            r0.<init>()     // Catch: java.lang.Throwable -> Lb8
            r6.put(r4, r0)     // Catch: java.lang.Throwable -> Lb8
            goto L35
        Lad:
            java.lang.String r1 = "TraceableObserver should be ICache or IListCache"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb8
            r1.toString()     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r2 = move-exception
            java.util.Map<X.QDR<?>, java.util.concurrent.atomic.AtomicBoolean> r1 = X.C68755Qyd.LIZ
            java.lang.Object r0 = r1.get(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            if (r0 == 0) goto Lc7
        Lc3:
            r0.set(r3)
            throw r2
        Lc7:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r1.put(r4, r0)
            goto Lc3
        Ld0:
            java.lang.Object r0 = r5.get(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            if (r0 == 0) goto Ldc
        Ld8:
            r0.set(r3)
        Ldb:
            return
        Ldc:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r5.put(r4, r0)
            goto Ld8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68902R2k.LJI(X.R2j):void");
    }
}
