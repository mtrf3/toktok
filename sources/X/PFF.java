package X;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public class PFF {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LockInfo{timestamp=");
        LIZ.append(this.LIZ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rawAtrace='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", topActivityName='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", blockStackInfo='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", completeBlockStackInfo='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", ownerStackInfo='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", ownerThreadName='");
        return C77800Ug8.LIZJ(LIZ, this.LJII, '\'', '}', LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:14:0x0032, B:17:0x0044, B:19:0x0048, B:20:0x004a, B:22:0x0052, B:23:0x0055, B:36:0x0057, B:39:0x0041), top: B:13:0x0032, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.PFF LIZ(java.lang.String r10) {
        /*
            r2 = 0
            if (r10 == 0) goto L9
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto La
        L9:
            return r2
        La:
            java.lang.String r0 = "&#&"
            java.lang.String[] r3 = r10.split(r0)
            int r1 = r3.length
            r0 = 3
            if (r1 == r0) goto L15
            return r2
        L15:
            r0 = 0
            r0 = r3[r0]
            long r6 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            r0 = 1
            r0 = r3[r0]
            long r8 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            r0 = 2
            r10 = r3[r0]
            X.PFF r5 = new X.PFF
            r5.<init>(r6, r8, r10)
            boolean r0 = com.bytedance.monitor.collector.LockMonitorManager.openFetchStack
            if (r0 == 0) goto L81
            java.util.concurrent.BlockingQueue<java.lang.String> r4 = com.bytedance.monitor.collector.LockMonitorManager.sStackBlockingQueue
            monitor-enter(r4)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L40 java.lang.Throwable -> L5a
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r0 = r4.poll(r0, r3)     // Catch: java.lang.InterruptedException -> L40 java.lang.Throwable -> L5a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L40 java.lang.Throwable -> L5a
            r2 = r0
            if (r0 != 0) goto L57
            goto L44
        L40:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L5a
        L44:
            java.lang.String r0 = com.bytedance.monitor.collector.LockMonitorManager.lastJavaStack     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L57
            java.lang.String r2 = com.bytedance.monitor.collector.LockMonitorManager.lastJavaStack     // Catch: java.lang.Throwable -> L5a
        L4a:
            java.util.concurrent.BlockingQueue<java.lang.String> r1 = com.bytedance.monitor.collector.LockMonitorManager.sStackBlockingQueue     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L55
            r1.clear()     // Catch: java.lang.Throwable -> L5a
        L55:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
            goto L5d
        L57:
            com.bytedance.monitor.collector.LockMonitorManager.lastJavaStack = r2     // Catch: java.lang.Throwable -> L5a
            goto L4a
        L5a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
            throw r0
        L5d:
            if (r2 == 0) goto L81
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L82
            java.lang.String r0 = "at "
            int r0 = r2.indexOf(r0)
            int r1 = r0 + 3
            r0 = 40
            int r0 = r2.indexOf(r0)
            if (r1 >= r0) goto L82
            java.lang.String r0 = r2.substring(r1, r0)
        L79:
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L81
            r5.LJFF = r2
        L81:
            return r5
        L82:
            java.lang.String r0 = "unknownMethodName"
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PFF.LIZ(java.lang.String):X.PFF");
    }

    public PFF(long j, long j2, String str) {
        String substring;
        String substring2;
        this.LIZLLL = "unknown";
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        String substring3 = str.substring(str.indexOf("monitor contention with owner"));
        this.LJII = substring3.substring(30, substring3.indexOf("(") - 1);
        int indexOf = substring3.indexOf(" at ");
        if (indexOf != -1 && (substring = substring3.substring(indexOf + 5, substring3.indexOf("waiters=", indexOf))) != null && (substring2 = substring.substring(substring.indexOf(" "))) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(substring2.substring(1, substring2.indexOf("(")));
            LIZ.append(substring2.substring(substring2.indexOf(")") + 1, substring2.lastIndexOf(")") + 1));
            this.LJI = X1D.LIZIZ(LIZ);
        }
        String substring4 = substring3.substring(substring3.indexOf("blocking from") + 14);
        String substring5 = substring4.substring(substring4.indexOf(" ") + 1);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(substring5.substring(0, substring5.indexOf("(")));
        LIZ2.append(substring5.substring(substring5.indexOf(")") + 1, substring5.lastIndexOf(")") + 1));
        this.LJ = X1D.LIZIZ(LIZ2);
        PG9 pg9 = (PG9) PGH.LIZ(PG9.class);
        if (pg9 != null) {
            String LIZLLL = pg9.LIZLLL();
            if (!TextUtils.isEmpty(LIZLLL)) {
                this.LIZLLL = LIZLLL;
            }
        }
    }
}
