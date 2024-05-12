package X;

import com.ss.videoarch.strategy.network.VeLSNetworkManagerImpl;

/* loaded from: classes12.dex */
public final class PMX {
    public static volatile PMX LIZJ;
    public final C38891FOd LIZ = new C38891FOd();
    public C79355VCl LIZIZ;

    public static PMX LIZIZ() {
        if (LIZJ == null) {
            synchronized (PMX.class) {
                if (LIZJ == null) {
                    LIZJ = new PMX();
                }
            }
        }
        return LIZJ;
    }

    public PMX() {
        LIZ(new C63989P9l(new C63990P9m()));
    }

    public final void LIZ(C63989P9l c63989P9l) {
        new C63988P9k(c63989P9l);
        this.LIZIZ = new C79355VCl(this.LIZ);
        VeLSNetworkManagerImpl.getInstance().init(c63989P9l);
    }
}
