package com.bytedance.covode.number;

import X.C16880lQ;
import X.C38774FJq;
import X.C38775FJr;
import X.C39742Fik;
import X.C39743Fil;
import Y.ARunnableS42S0100000_6;
import java.io.File;

/* loaded from: classes7.dex */
public class CovodeNumberImpl extends Covode {
    public static final CovodeNumberImpl LIZIZ = new CovodeNumberImpl();
    public static C39743Fil LIZJ = new C39743Fil();
    public C38774FJq LIZ;

    public static native void initRecorder(String str, int i, boolean z);

    public native void clearBitmap();

    public native void recordClassIndexToFile(int i);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r2 = new java.io.File(X.C39742Fik.LIZ, "record.dat");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        X.C39742Fik.LIZ(r3, r2, r7);
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        ((java.util.HashMap) X.C59032Tj.LIZ).put("tag_upload", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        r10.LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0057, code lost:
    
        if (r4 == null) goto L32;
     */
    @Override // com.bytedance.covode.number.Covode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean report(X.F3N r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r1 = com.bytedance.covode.number.MaxIndexGetter.getMaxIndex()     // Catch: java.lang.Throwable -> L71
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            if (r1 != r0) goto Lc
            monitor-exit(r9)
            return r8
        Lc:
            X.FJq r0 = r9.LIZ     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L12
            monitor-exit(r9)
            return r8
        L12:
            X.FJr r1 = r0.LIZ     // Catch: java.lang.Throwable -> L71
            boolean r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L1a
            monitor-exit(r9)
            return r8
        L1a:
            java.io.File r0 = X.C39742Fik.LIZJ(r1)     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L22
            monitor-exit(r9)
            return r8
        L22:
            X.Fim r7 = new X.Fim     // Catch: java.lang.Throwable -> L71
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L71
            java.io.File r0 = X.C39742Fik.LIZ     // Catch: java.lang.Throwable -> L71
            r4 = 0
            if (r0 != 0) goto L2d
            goto L59
        L2d:
            java.io.File[] r6 = r0.listFiles()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L59
            int r5 = r6.length     // Catch: java.lang.Throwable -> L71
            r2 = 0
        L35:
            if (r2 >= r5) goto L59
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "record"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L4f
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L71
            java.io.File r1 = X.C39742Fik.LIZ     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "record.dat"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L71
            goto L52
        L4f:
            int r2 = r2 + 1
            goto L35
        L52:
            X.C39742Fik.LIZ(r3, r2, r7)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L71
            r4 = r2
            goto L5b
        L57:
            if (r4 != 0) goto L5b
        L59:
            monitor-exit(r9)
            return r8
        L5b:
            java.lang.String r3 = "tag_upload"
            java.util.Map<java.lang.String, java.lang.Long> r2 = X.C59032Tj.LIZ     // Catch: java.lang.Throwable -> L71
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L71
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L71
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L71
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L71
            r10.LIZ(r4)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r9)
            return r8
        L71:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.covode.number.CovodeNumberImpl.report(X.F3N):boolean");
    }

    @Override // com.bytedance.covode.number.Covode
    public final synchronized boolean start(C38774FJq c38774FJq) {
        if (MaxIndexGetter.getMaxIndex() == Integer.MIN_VALUE) {
            return false;
        }
        if (!c38774FJq.LIZIZ) {
            this.LIZ = c38774FJq;
            LIZJ.LIZ.clear();
            LIZJ.LIZIZ.clear();
            return false;
        }
        C38775FJr c38775FJr = c38774FJq.LIZ;
        File LIZJ2 = C39742Fik.LIZJ(c38775FJr);
        if (LIZJ2 == null) {
            return false;
        }
        try {
            System.loadLibrary("covode_number");
            initRecorder(new File(LIZJ2, "record").getPath(), MaxIndexGetter.getMaxIndex(), c38775FJr.LIZJ);
            this.LIZ = c38774FJq;
            C16880lQ.LLLLZ(1).execute(new ARunnableS42S0100000_6(this, 16));
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        return true;
    }
}
