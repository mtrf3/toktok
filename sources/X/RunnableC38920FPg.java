package X;

import com.ss.android.agilelogger.ALog;

/* renamed from: X.FPg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38920FPg implements Runnable {
    public static final RunnableC38920FPg LJLIL = new RunnableC38920FPg();

    public static void LIZ() {
        String str;
        long j = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j) - 10800;
        long currentTimeMillis2 = System.currentTimeMillis() / j;
        C66004PvM c66004PvM = ALog.sConfig;
        if (c66004PvM != null) {
            str = c66004PvM.LJFF;
        } else {
            str = null;
        }
        C38923FPj c38923FPj = C38923FPj.LIZ;
        if (new C03880Dg(2).LIZJ(10303, "com/bytedance/apm/ApmAgent", "activeUploadAlog", C09900aA.class, new Object[]{str, Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2), "Network", c38923FPj, null}, "void", new C65300Pk0(false, "(Ljava/lang/String;JJLjava/lang/String;Lcom/bytedance/apm/alog/IALogActiveUploadObserver;Lcom/bytedance/apm/alog/IALogActiveUploadCallback;)V", "3203282498697729194")).LIZ) {
            return;
        }
        C09900aA.LIZ(str, currentTimeMillis, currentTimeMillis2, "Network", c38923FPj, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
