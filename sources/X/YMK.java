package X;

/* loaded from: classes16.dex */
public final class YMK implements Runnable {
    public final long LJLIL;
    public final /* synthetic */ YMI LJLILLLLZI;

    public final void LIZ() {
        YMJ LIZ = this.LJLILLLLZI.LJIIIZ.LIZ(this.LJLIL);
        if (LIZ == null) {
            return;
        }
        YMB ymb = this.LJLILLLLZI.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ws uplink timeout, serviceId: ");
        LIZ2.append(LIZ.LIZIZ);
        LIZ2.append(", uniqueId: ");
        LIZ2.append(LIZ.LIZ);
        C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ2));
        LIZ.LIZJ(new C79533VJh(-2, "ws timeout", null, 4, null), this.LJLILLLLZI.LIZIZ.isWsConnected());
        this.LJLILLLLZI.LJ(LIZ);
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

    public YMK(YMI ymi, long j) {
        this.LJLILLLLZI = ymi;
        this.LJLIL = j;
    }
}
