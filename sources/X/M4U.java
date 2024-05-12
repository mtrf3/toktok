package X;

import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M4U extends MP2 {
    public volatile long LJIJ;
    public volatile long LJIJI;
    public volatile long LJIJJ;
    public volatile boolean LJIJJLI = true;
    public boolean LJIL;

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e6, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r10.LJIJJ) >= com.ss.android.ugc.aweme.notification.perf.NoticePerfManager.LIZ().refreshAgainDurationMs) goto L42;
     */
    @Override // X.MP2, X.C56757MPh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(X.MLW r11) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M4U.LJIIL(X.MLW):boolean");
    }

    @Override // X.MP2
    public final void LJIJI(MLW reason) {
        o.LJIIIZ(reason, "reason");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDataCombinedEnd, reason:");
        LIZ.append(reason);
        LIZ.append(", refreshAgain:");
        HH1.LIZIZ(LIZ, this.LJIL, LIZ, "NotificationTLPreload");
        if (reason == MLW.REFRESH || reason == MLW.REFRESH_MANUALLY || reason == MLW.PRELOAD_REFRESH_CLICK) {
            this.LJIJJ = System.currentTimeMillis();
        } else if (this.LJIL) {
            MS5.LIZ(new AqS156S0200000_9(this, reason, 89));
        }
        this.LJIL = false;
        if (LJIILL().contains(reason)) {
            this.LJIJI = System.currentTimeMillis();
            this.LJIJ = this.LJIJI;
        }
    }
}
