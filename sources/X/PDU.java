package X;

import Y.ARunnableS47S0100000_11;
import java.util.LinkedList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PDU implements PE2 {
    public static String LJLJLJ = "https://i.isnssdk.com/monitor/collect/c/exception";
    public static final Object LJLJLLL = new Object();
    public static volatile PDU LJLL;
    public volatile long LJLIL;
    public volatile int LJLILLLLZI;
    public volatile boolean LJLJI;
    public volatile long LJLJJI;
    public volatile JSONObject LJLJJL;
    public final LinkedList<PDW> LJLJJLL = new LinkedList<>();
    public volatile PDV LJLJL;

    public static PDU LIZJ() {
        if (LJLL == null) {
            synchronized (LJLJLLL) {
                if (LJLL == null) {
                    LJLL = new PDU();
                }
            }
        }
        return LJLL;
    }

    public PDU() {
        F9U.LIZ.LIZ(this);
        this.LJLJL = new PDV();
    }

    @Override // X.PE2
    public final void LIZIZ(long j) {
        try {
            if (this.LJLJL != null) {
                PDV pdv = this.LJLJL;
                if (!pdv.LIZIZ) {
                    if (OIO.LIZ.LJLJL) {
                        pdv.LIZIZ = true;
                    }
                    F9U.LIZ.LJII(new ARunnableS47S0100000_11(pdv, 82));
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.LJLIL > 1200000 && this.LJLILLLLZI > 0) || this.LJLILLLLZI > 20) {
                this.LJLIL = System.currentTimeMillis();
                F9U.LIZ.LJII(new ARunnableS47S0100000_11(this, 83));
            }
            if (this.LJLJI && currentTimeMillis - this.LJLJJI > 1800000) {
                this.LJLJI = false;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL(String str, String str2) {
        int statusCode;
        try {
            if (OIO.LIZ.LJLJL) {
                P9Z.LIZJ(EZS.LIZ(str, C09970aH.LJ()), str2.getBytes(), EnumC63978P9a.GZIP);
            }
        } catch (Throwable th) {
            if ((th instanceof C63979P9b) && (statusCode = th.getStatusCode()) >= 500 && statusCode <= 600) {
                this.LJLJJI = System.currentTimeMillis();
                this.LJLJI = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L98
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto Le
            goto L98
        Le:
            r4 = 0
            if (r9 == 0) goto L30
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "log_type"
            java.lang.String r0 = "log_exception"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L30
            int r1 = r8.length()     // Catch: java.lang.Throwable -> L98
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 <= r0) goto L40
            java.lang.String r1 = "extraMessage"
            java.lang.String r0 = r8.substring(r4, r0)     // Catch: java.lang.Throwable -> L98
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L98
        L30:
            com.bytedance.apm.internal.ApmDelegate r2 = X.OIO.LIZ     // Catch: java.lang.Throwable -> L98
            boolean r0 = r2.LJLJL     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L47
            X.PDV r0 = r5.LJLJL     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L46
            X.PDV r0 = r5.LJLJL     // Catch: java.lang.Throwable -> L98
            r0.LIZ(r6, r7)     // Catch: java.lang.Throwable -> L98
            goto L46
        L40:
            java.lang.String r0 = "extraMessage"
            r2.put(r0, r8)     // Catch: java.lang.Throwable -> L98
            goto L30
        L46:
            return
        L47:
            boolean r1 = r2.LIZJ(r6)     // Catch: java.lang.Throwable -> L98
            boolean r0 = r2.LJLJL     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L59
            com.bytedance.apm.config.SlardarConfigManagerImpl r0 = r2.LJLJJLL     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L54
            goto L59
        L54:
            boolean r0 = r0.getServiceSwitch(r8)     // Catch: java.lang.Throwable -> L98
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r1 != 0) goto L5e
            if (r0 == 0) goto L62
        L5e:
            boolean r0 = r5.LJLJI     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L63
        L62:
            return
        L63:
            java.lang.Object r3 = X.PDU.LJLJLLL     // Catch: java.lang.Throwable -> L98
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L98
            java.util.LinkedList<X.PDW> r0 = r5.LJLJJLL     // Catch: java.lang.Throwable -> L95
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L95
            r0 = 20
            if (r2 < r0) goto L71
            r4 = 1
        L71:
            java.util.LinkedList<X.PDW> r1 = r5.LJLJJLL     // Catch: java.lang.Throwable -> L95
            X.PDW r0 = new X.PDW     // Catch: java.lang.Throwable -> L95
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L95
            r1.add(r0)     // Catch: java.lang.Throwable -> L95
            int r0 = r2 + 1
            r5.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L95
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L98
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L98
            r5.LJLIL = r0     // Catch: java.lang.Throwable -> L98
            X.PE0 r2 = X.F9U.LIZ     // Catch: java.lang.Throwable -> L98
            Y.ARunnableS47S0100000_11 r1 = new Y.ARunnableS47S0100000_11     // Catch: java.lang.Throwable -> L98
            r0 = 83
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L98
            r2.LJII(r1)     // Catch: java.lang.Throwable -> L98
            goto L98
        L95:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L95
            throw r0     // Catch: java.lang.Throwable -> L98
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PDU.LIZ(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
