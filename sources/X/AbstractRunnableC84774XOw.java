package X;

import defpackage.i0;
import java.lang.Throwable;

/* renamed from: X.XOw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractRunnableC84774XOw<V, X extends Throwable, F, T> extends XP4<V> implements Runnable {
    public static final /* synthetic */ int LJLLI = 0;
    public C76L<? extends V> LJLJLJ;
    public Class<X> LJLJLLL;
    public F LJLL;

    @Override // X.AbstractC84773XOv
    public final void LIZIZ() {
        boolean z;
        C76L<? extends V> c76l = this.LJLJLJ;
        boolean z2 = false;
        if (c76l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.LJLIL instanceof XPA)) {
            Object obj = this.LJLIL;
            if ((obj instanceof XPA) && ((XPA) obj).LIZ) {
                z2 = true;
            }
            c76l.cancel(z2);
        }
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        this.LJLL = null;
    }

    @Override // X.AbstractC84773XOv
    public final String LJIIIIZZ() {
        String str;
        C76L<? extends V> c76l = this.LJLJLJ;
        Class<X> cls = this.LJLJLLL;
        F f = this.LJLL;
        String LJIIIIZZ = super.LJIIIIZZ();
        if (c76l != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("inputFuture=[");
            LIZ.append(c76l);
            LIZ.append("], ");
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "";
        }
        if (cls != null && f != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("exceptionType=[");
            LIZ2.append(cls);
            LIZ2.append("], fallback=[");
            LIZ2.append(f);
            LIZ2.append("]");
            return X1D.LIZIZ(LIZ2);
        }
        if (LJIIIIZZ != null) {
            return i0.LJFF(str, LJIIIIZZ);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            r7 = this;
            X.76L<? extends V> r6 = r7.LJLJLJ
            java.lang.Class<X extends java.lang.Throwable> r5 = r7.LJLJLLL
            F r3 = r7.LJLL
            r2 = 0
            if (r6 != 0) goto L1c
            r1 = 1
        La:
            if (r5 != 0) goto L1a
            r0 = 1
        Ld:
            r1 = r1 | r0
            if (r3 != 0) goto L11
            r2 = 1
        L11:
            r2 = r2 | r1
            java.lang.Object r0 = r7.LJLIL
            boolean r0 = r0 instanceof X.XPA
            r2 = r2 | r0
            if (r2 == 0) goto L1e
            return
        L1a:
            r0 = 0
            goto Ld
        L1c:
            r1 = 0
            goto La
        L1e:
            r4 = 0
            r7.LJLJLJ = r4
            java.lang.Object r0 = X.C65734Pr0.LLLLZIL(r6)     // Catch: java.util.concurrent.ExecutionException -> L29 java.lang.Throwable -> L32
            r7.LJIIJ(r0)
            return
        L29:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            r1.getClass()
            goto L33
        L32:
            r1 = move-exception
        L33:
            boolean r0 = r5.isInstance(r1)
            if (r0 != 0) goto L3d
            r7.LJIIJJI(r1)
            return
        L3d:
            X.H12 r3 = (X.H12) r3     // Catch: java.lang.Throwable -> L96
            X.XPE r3 = r3.apply(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?"
            X.C76917UGr.LJII(r3, r0)     // Catch: java.lang.Throwable -> L96
            r7.LJLJLLL = r4
            r7.LJLL = r4
            java.lang.Object r1 = r7.LJLIL
            if (r1 != 0) goto L8a
            boolean r0 = r3.isDone()
            if (r0 == 0) goto L66
            java.lang.Object r1 = X.AbstractC84773XOv.LJI(r3)
            X.XOs r0 = X.AbstractC84773XOv.LJLJJLL
            boolean r0 = r0.LIZIZ(r7, r4, r1)
            if (r0 == 0) goto L65
            X.AbstractC84773XOv.LIZJ(r7)
        L65:
            return
        L66:
            X.XP2 r2 = new X.XP2
            r2.<init>(r7, r3)
            X.XOs r0 = X.AbstractC84773XOv.LJLJJLL
            boolean r0 = r0.LIZIZ(r7, r4, r2)
            if (r0 == 0) goto L88
            X.6l6 r0 = X.EnumC169566l6.LJLIL     // Catch: java.lang.Throwable -> L79
            r3.LJFF(r2, r0)     // Catch: java.lang.Throwable -> L79
            goto L65
        L79:
            r0 = move-exception
            X.XPC r1 = new X.XPC     // Catch: java.lang.Throwable -> L80
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            X.XPC r1 = X.XPC.LIZIZ
        L82:
            X.XOs r0 = X.AbstractC84773XOv.LJLJJLL
            r0.LIZIZ(r7, r2, r1)
            goto L65
        L88:
            java.lang.Object r1 = r7.LJLIL
        L8a:
            boolean r0 = r1 instanceof X.XPA
            if (r0 == 0) goto L65
            X.XPA r1 = (X.XPA) r1
            boolean r0 = r1.LIZ
            r3.cancel(r0)
            goto L65
        L96:
            r0 = move-exception
            r7.LJIIJJI(r0)     // Catch: java.lang.Throwable -> L9f
            r7.LJLJLLL = r4
            r7.LJLL = r4
            return
        L9f:
            r0 = move-exception
            r7.LJLJLLL = r4
            r7.LJLL = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC84774XOw.LJIIL():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJIIL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractRunnableC84774XOw(C76L c76l, Class cls, H11 h11) {
        c76l.getClass();
        this.LJLJLJ = c76l;
        this.LJLJLLL = cls;
        this.LJLL = h11;
    }
}
