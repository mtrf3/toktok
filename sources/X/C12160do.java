package X;

import android.graphics.Typeface;
import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12160do {
    public static final C0M6<String, Typeface> LIZ = new C0M6<>(16);
    public static final PThreadPoolExecutor LIZIZ;
    public static final Object LIZJ;
    public static final C0MA<String, ArrayList<InterfaceC15040iS<C12150dn>>> LIZLLL;

    static {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: X.0dr
            public final String LJLIL = "fonts-androidx";
            public final int LJLILLLLZI = 10;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                final String str = this.LJLIL;
                final int i = this.LJLILLLLZI;
                return new PthreadThread(runnable, i, str) { // from class: X.1ls
                    public final int LJLIL;

                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            Process.setThreadPriority(this.LJLIL);
                            super.run();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }

                    {
                        this.LJLIL = i;
                    }
                };
            }
        });
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        LIZIZ = pThreadPoolExecutor;
        LIZJ = new Object();
        LIZLLL = new C0MA<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r4 < 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        if (1 != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C12150dn LIZ(java.lang.String r7, android.content.Context r8, X.C12120dk r9, int r10) {
        /*
            X.0M6<java.lang.String, android.graphics.Typeface> r0 = X.C12160do.LIZ
            java.lang.Object r1 = r0.LIZIZ(r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            X.0dn r0 = new X.0dn
            r0.<init>(r1)
            return r0
        L10:
            X.0dp r6 = X.C12110dj.LIZ(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            int r0 = r6.LIZ
            r5 = -3
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 == r4) goto L23
        L1c:
            r4 = -3
        L1d:
            X.0dn r0 = new X.0dn
            r0.<init>(r4)
            return r0
        L23:
            r4 = -2
            goto L1d
        L25:
            X.0dq[] r3 = r6.LIZIZ
            if (r3 == 0) goto L2c
            int r0 = r3.length
            if (r0 != 0) goto L2f
        L2c:
            if (r4 == 0) goto L3f
            goto L1d
        L2f:
            int r2 = r3.length
            r1 = 0
        L31:
            if (r1 >= r2) goto L3f
            r0 = r3[r1]
            int r4 = r0.LJ
            if (r4 == 0) goto L3c
            if (r4 >= 0) goto L1d
            goto L1c
        L3c:
            int r1 = r1 + 1
            goto L31
        L3f:
            X.0dq[] r1 = r6.LIZIZ
            X.0Qt r0 = X.C07370Qr.LIZ
            android.graphics.Typeface r1 = r0.LIZIZ(r8, r1, r10)
            if (r1 == 0) goto L54
            X.0M6<java.lang.String, android.graphics.Typeface> r0 = X.C12160do.LIZ
            r0.LIZJ(r7, r1)
            X.0dn r0 = new X.0dn
            r0.<init>(r1)
            return r0
        L54:
            X.0dn r0 = new X.0dn
            r0.<init>(r5)
            return r0
        L5a:
            X.0dn r1 = new X.0dn
            r0 = -1
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12160do.LIZ(java.lang.String, android.content.Context, X.0dk, int):X.0dn");
    }
}
