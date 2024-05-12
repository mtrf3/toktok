package X;

import androidx.work.impl.WorkDatabase;

/* renamed from: X.0rD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20470rD {
    public final WorkDatabase LIZ;

    public C20470rD(WorkDatabase workDatabase) {
        this.LIZ = workDatabase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4 == Integer.MAX_VALUE) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(java.lang.String r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.LIZ
            r0.LIZJ()
            androidx.work.impl.WorkDatabase r0 = r5.LIZ     // Catch: java.lang.Throwable -> L3e
            X.0pJ r0 = r0.LJIJI()     // Catch: java.lang.Throwable -> L3e
            X.1Xw r0 = (X.C34721Xw) r0     // Catch: java.lang.Throwable -> L3e
            java.lang.Long r0 = r0.LIZ(r6)     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 == 0) goto L34
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L3e
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r0) goto L35
        L1d:
            androidx.work.impl.WorkDatabase r0 = r5.LIZ     // Catch: java.lang.Throwable -> L3e
            X.0pJ r3 = r0.LJIJI()     // Catch: java.lang.Throwable -> L3e
            X.0pI r2 = new X.0pI     // Catch: java.lang.Throwable -> L3e
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> L3e
            X.1Xw r3 = (X.C34721Xw) r3     // Catch: java.lang.Throwable -> L3e
            r3.LIZIZ(r2)     // Catch: java.lang.Throwable -> L3e
            androidx.work.impl.WorkDatabase r0 = r5.LIZ     // Catch: java.lang.Throwable -> L3e
            r0.LJIILLIIL()     // Catch: java.lang.Throwable -> L3e
            goto L38
        L34:
            r4 = 0
        L35:
            int r1 = r4 + 1
            goto L1d
        L38:
            androidx.work.impl.WorkDatabase r0 = r5.LIZ
            r0.LJIIJJI()
            return r4
        L3e:
            r1 = move-exception
            androidx.work.impl.WorkDatabase r0 = r5.LIZ
            r0.LJIIJJI()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20470rD.LIZ(java.lang.String):int");
    }

    public final int LIZIZ(int i) {
        int LIZ;
        synchronized (C20470rD.class) {
            LIZ = LIZ("next_job_scheduler_id");
            if (LIZ < 0 || LIZ > i) {
                ((C34721Xw) this.LIZ.LJIJI()).LIZIZ(new C19280pI("next_job_scheduler_id", 1));
                LIZ = 0;
            }
        }
        return LIZ;
    }
}
