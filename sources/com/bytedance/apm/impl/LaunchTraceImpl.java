package com.bytedance.apm.impl;

import X.C16880lQ;
import X.C63081OpJ;
import X.PFG;
import X.PFH;
import X.PFK;
import X.X1D;
import com.bytedance.services.apm.api.ILaunchTrace;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class LaunchTraceImpl implements ILaunchTrace {
    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void cancelTrace() {
        if (PFG.LIZIZ) {
            C63081OpJ.LLJLLL();
        }
        PFH pfh = PFG.LIZ;
        if (pfh != null) {
            pfh.LIZJ.clear();
            PFG.LIZ = null;
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startTrace() {
        PFG.LIZ();
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endSpan(String str, String str2) {
        PFH pfh = PFG.LIZ;
        if (pfh != null) {
            ConcurrentHashMap<String, PFK> concurrentHashMap = pfh.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("#");
            LIZ.append(str2);
            PFK pfk = concurrentHashMap.get(X1D.LIZIZ(LIZ));
            if (pfk == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String name = C16880lQ.LLLLIIIILLL().getName();
            pfk.LIZIZ = currentTimeMillis;
            pfk.LIZJ = name;
            ConcurrentHashMap<String, PFK> concurrentHashMap2 = pfh.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("#");
            LIZ2.append(str2);
            concurrentHashMap2.put(X1D.LIZIZ(LIZ2), pfk);
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startSpan(String str, String str2) {
        PFH pfh = PFG.LIZ;
        if (pfh != null) {
            ConcurrentHashMap<String, PFK> concurrentHashMap = pfh.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("#");
            LIZ.append(str2);
            if (concurrentHashMap.get(X1D.LIZIZ(LIZ)) != null) {
                return;
            }
            PFK pfk = new PFK(System.currentTimeMillis());
            ConcurrentHashMap<String, PFK> concurrentHashMap2 = pfh.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("#");
            LIZ2.append(str2);
            concurrentHashMap2.put(X1D.LIZIZ(LIZ2), pfk);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    @Override // com.bytedance.services.apm.api.ILaunchTrace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void endTrace(int r12, java.lang.String r13, long r14) {
        /*
            r11 = this;
            boolean r0 = X.PFG.LIZIZ
            if (r0 == 0) goto L7
            X.C63081OpJ.LLJLLL()
        L7:
            X.PFH r1 = X.PFG.LIZ
            if (r1 == 0) goto L32
            r0 = -1
            r10 = r12
            if (r10 != r0) goto L15
            boolean r0 = X.C09970aH.LJII()
            if (r0 != 0) goto Lb6
        L15:
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L1f
            boolean r0 = X.C39412FdQ.LJLIL
            if (r0 == 0) goto La5
        L1f:
            long r2 = java.lang.System.currentTimeMillis()
            r1.LIZIZ = r2
            long r4 = r1.LIZ
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L33
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L33
        L32:
            return
        L33:
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L63
            boolean r0 = X.PFC.LJLLJ
            if (r0 == 0) goto L63
            boolean r0 = X.PFH.LJFF
            if (r0 == 0) goto L63
            r0 = 0
            X.PFH.LJFF = r0
            long r8 = r1.LIZ
            long r6 = r1.LIZIZ
            X.0zJ r0 = X.C25500zK.LJIJJLI     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L52
            X.0zJ r3 = X.C25500zK.LJIL     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L52
            if (r0 != r3) goto L6d
        L52:
            r3 = 0
        L53:
            long r4 = android.os.SystemClock.uptimeMillis()
            if (r3 == 0) goto L63
            X.PE0 r0 = X.F9U.LIZ
            X.PFE r2 = new X.PFE
            r2.<init>(r3, r4, r6, r8, r10)
            r0.LIZJ(r2)
        L63:
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L92
            X.PEh r3 = X.C64113PEf.LIZ
            monitor-enter(r3)
            goto L7c
        L6d:
            int r2 = r0.LIZIZ     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L75
            int r0 = X.C25500zK.LJ     // Catch: java.lang.Throwable -> L52
            int r2 = r0 + (-1)
        L75:
            int r0 = r3.LIZ     // Catch: java.lang.Throwable -> L52
            long[] r3 = X.C25500zK.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L52
            goto L53
        L7c:
            X.PFJ r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L8c
            X.PFL r2 = new X.PFL     // Catch: java.lang.Throwable -> Lb3
            r2.<init>()     // Catch: java.lang.Throwable -> Lb3
            X.PFJ r0 = new X.PFJ     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            r3.LIZIZ = r0     // Catch: java.lang.Throwable -> Lb3
        L8c:
            X.PFJ r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r3)
            r0.getClass()
        L92:
            X.PE0 r3 = X.F9U.LIZ
            Y.ARunnableS1S2101000_11 r2 = new Y.ARunnableS1S2101000_11
            r0 = 3
            r2.<init>(r1, r10, r13, r0)
            r3.LIZJ(r2)
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L32
        La4:
            goto L32
        La5:
            r0 = 1
            X.C39412FdQ.LJLIL = r0
            X.PEh r0 = X.C64113PEf.LIZ
            X.PEi r0 = r0.LIZ()
            r0.getClass()
            goto L1f
        Lb3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lb6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Launch mode is both none"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void");
    }
}
