package X;

/* loaded from: classes12.dex */
public final class RCE {
    public static volatile RCE LIZIZ;
    public static final Object LIZJ = new Object();
    public RCF LIZ;

    public static RCE LIZ() {
        if (LIZIZ == null) {
            synchronized (RCE.class) {
                if (LIZIZ == null) {
                    LIZIZ = new RCE();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(RCD rcd) {
        synchronized (LIZJ) {
            RCF rcf = this.LIZ;
            if (rcf != null) {
                rcf.onComplete(rcd);
                this.LIZ = null;
            }
        }
    }
}
