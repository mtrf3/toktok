package X;

import Y.ARunnableS27S0200000_8;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.Iyq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48384Iyq<T> implements W4W<T> {
    public boolean LIZIZ;
    public T LIZJ;
    public Throwable LIZLLL;
    public float LJ;
    public EnumC48385Iyr LIZ = EnumC48385Iyr.IN_PROGRESS;
    public final ConcurrentLinkedQueue<Pair<IHD<T>, Executor>> LJFF = new ConcurrentLinkedQueue<>();

    @Override // X.W4W
    public final synchronized float LIZ() {
        return this.LJ;
    }

    @Override // X.W4W
    public final synchronized boolean LIZIZ() {
        boolean z;
        if (this.LIZ == EnumC48385Iyr.IN_PROGRESS) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // X.W4W
    public synchronized boolean LIZJ() {
        boolean z;
        if (this.LIZJ == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // X.W4W
    public final void LIZLLL() {
    }

    @Override // X.W4W
    public final synchronized Throwable LJFF() {
        return this.LIZLLL;
    }

    public void LJI(T t) {
    }

    public final synchronized boolean LJII() {
        boolean z;
        if (this.LIZ != EnumC48385Iyr.FAILURE) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized boolean LJIIIIZZ() {
        return this.LIZIZ;
    }

    public final synchronized boolean LJIILIIL() {
        boolean z;
        if (LJIIIIZZ()) {
            if (!LIZIZ()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // X.W4W
    public boolean close() {
        synchronized (this) {
            if (this.LIZIZ) {
                return false;
            }
            this.LIZIZ = true;
            T t = this.LIZJ;
            this.LIZJ = null;
            if (t != null) {
                LJI(t);
            }
            if (!LIZIZ()) {
                LJIIIZ();
            }
            synchronized (this) {
                this.LJFF.clear();
            }
            return true;
        }
    }

    @Override // X.W4W
    public synchronized T getResult() {
        return this.LIZJ;
    }

    public final void LJIIIZ() {
        boolean LJII = LJII();
        boolean LJIILIIL = LJIILIIL();
        Iterator<Pair<IHD<T>, Executor>> it = this.LJFF.iterator();
        while (it.hasNext()) {
            Pair<IHD<T>, Executor> next = it.next();
            try {
            } finally {
                try {
                } finally {
                }
            }
            if (!C61831OOl.LIZLLL((IHD) next.first, (Executor) next.second, LJII, LJIILIIL, this)) {
            }
        }
    }

    public boolean LJIIJ(Throwable th) {
        synchronized (this) {
            if (!this.LIZIZ && this.LIZ == EnumC48385Iyr.IN_PROGRESS) {
                this.LIZ = EnumC48385Iyr.FAILURE;
                this.LIZLLL = th;
                LJIIIZ();
                return true;
            }
            return false;
        }
    }

    public final void LJIIJJI(float f) {
        synchronized (this) {
            if (!this.LIZIZ && this.LIZ == EnumC48385Iyr.IN_PROGRESS) {
                if (f >= this.LJ) {
                    this.LJ = f;
                    Iterator<Pair<IHD<T>, Executor>> it = this.LJFF.iterator();
                    while (it.hasNext()) {
                        Pair<IHD<T>, Executor> next = it.next();
                        ((Executor) next.second).execute(new ARunnableS27S0200000_8(this, (IHD) next.first, 59));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // X.W4W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.IHD<T> r5, java.util.concurrent.Executor r6) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            monitor-enter(r4)
            boolean r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto Ld
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
            return
        Ld:
            X.Iyr r1 = r4.LIZ     // Catch: java.lang.Throwable -> L5c
            X.Iyr r0 = X.EnumC48385Iyr.IN_PROGRESS     // Catch: java.lang.Throwable -> L5c
            if (r1 != r0) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<X.IHD<T>, java.util.concurrent.Executor>> r1 = r4.LJFF     // Catch: java.lang.Throwable -> L5c
            android.util.Pair r0 = android.util.Pair.create(r5, r6)     // Catch: java.lang.Throwable -> L5c
            r1.add(r0)     // Catch: java.lang.Throwable -> L5c
        L1c:
            boolean r0 = r4.LIZJ()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L31
            boolean r0 = r4.LIZIZ()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L31
            boolean r0 = r4.LJIILIIL()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5b
            boolean r3 = r4.LJII()
            boolean r2 = r4.LJIILIIL()
            boolean r0 = X.C61831OOl.LIZLLL(r5, r6, r3, r2, r4)     // Catch: java.lang.Throwable -> L42
            goto L51
        L42:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> L47
            goto L53
        L47:
            r1 = move-exception
            X.IHE r0 = new X.IHE
            r0.<init>(r4, r3, r5, r2)
            r6.execute(r0)
            throw r1
        L51:
            if (r0 != 0) goto L5b
        L53:
            X.IHE r0 = new X.IHE
            r0.<init>(r4, r3, r5, r2)
            r6.execute(r0)
        L5b:
            return
        L5c:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48384Iyq.LJ(X.IHD, java.util.concurrent.Executor):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        LJI(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r0 = true;
        LJIIIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x002f, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0031, code lost:
    
        LJI(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0034, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(T r4, boolean r5) {
        /*
            r3 = this;
            r2 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L47
            boolean r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L2e
            X.Iyr r1 = r3.LIZ     // Catch: java.lang.Throwable -> L3a
            X.Iyr r0 = X.EnumC48385Iyr.IN_PROGRESS     // Catch: java.lang.Throwable -> L3a
            if (r1 == r0) goto Ld
            goto L2e
        Ld:
            if (r5 == 0) goto L17
            X.Iyr r0 = X.EnumC48385Iyr.SUCCESS     // Catch: java.lang.Throwable -> L3a
            r3.LIZ = r0     // Catch: java.lang.Throwable -> L3a
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.LJ = r0     // Catch: java.lang.Throwable -> L3a
        L17:
            T r1 = r3.LIZJ     // Catch: java.lang.Throwable -> L3a
            if (r1 == r4) goto L22
            r3.LIZJ = r4     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L38
        L20:
            r4 = r1
            goto L23
        L22:
            r4 = r2
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L29
            r3.LJI(r4)
        L29:
            r0 = 1
            r3.LJIIIZ()
            goto L35
        L2e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L34
            r3.LJI(r4)
        L34:
            r0 = 0
        L35:
            return r0
        L36:
            r0 = move-exception
            r1 = r4
        L38:
            r2 = r1
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L3b
        L3f:
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            if (r2 == 0) goto L48
            r3.LJI(r2)
            goto L48
        L47:
            r0 = move-exception
        L48:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48384Iyq.LJIIL(java.lang.Object, boolean):boolean");
    }
}
