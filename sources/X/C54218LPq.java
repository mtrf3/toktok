package X;

import com.ss.android.ugc.aweme.experiment.NowEnableModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.LPq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54218LPq implements LEA {
    public static final C54218LPq LJLIL = new C54218LPq();
    public static NowEnableModel LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.getGroup() == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZ() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ss.android.ugc.aweme.experiment.NowEnableModel r0 = X.C54218LPq.LJLILLLLZI     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L2f
            X.Z89 r0 = X.Z89.LIZIZ     // Catch: java.lang.Throwable -> L4f
            int r3 = r0.LJIILL()     // Catch: java.lang.Throwable -> L4f
            r0 = -1
            if (r3 == r0) goto L48
            LIZIZ()     // Catch: java.lang.Throwable -> L4f
        L11:
            java.lang.String r2 = "now_experiment"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "new NowEnableModel "
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            com.ss.android.ugc.aweme.experiment.NowEnableModel r0 = X.C54218LPq.LJLILLLLZI     // Catch: java.lang.Throwable -> L4f
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4f
            X.C7XD.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L4f
            com.ss.android.ugc.aweme.experiment.NowEnableModel r0 = new com.ss.android.ugc.aweme.experiment.NowEnableModel     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4f
            X.C54218LPq.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L4f
        L2f:
            LIZIZ()     // Catch: java.lang.Throwable -> L4f
            com.ss.android.ugc.aweme.experiment.NowEnableModel r0 = X.C54218LPq.LJLILLLLZI     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L46
            int r0 = r0.getGroup()     // Catch: java.lang.Throwable -> L4f
            r1 = 1
            if (r0 != r1) goto L46
        L3d:
            X.HG3.LJIIL()     // Catch: java.lang.Throwable -> L4f
            com.ss.android.ugc.aweme.IAccountService r0 = X.HG3.LJLJL     // Catch: java.lang.Throwable -> L4f
            r0.LJIILJJIL(r4)     // Catch: java.lang.Throwable -> L4f
            goto L4d
        L46:
            r1 = 0
            goto L3d
        L48:
            int r3 = LIZIZ()     // Catch: java.lang.Throwable -> L4f
            goto L11
        L4d:
            monitor-exit(r4)
            return r1
        L4f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54218LPq.LIZ():boolean");
    }

    public static final int LIZIZ() {
        int LIZ = C00F.LIZ(31744, 0, "tt_now_enabled", true);
        Z89.LIZIZ.LJIJ(LIZ);
        return LIZ;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 2 && z) {
            LJLILLLLZI = null;
        }
    }
}
