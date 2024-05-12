package X;

/* loaded from: classes12.dex */
public class PG8 extends PGA {
    public final /* synthetic */ PG7 LIZ;

    @Override // X.PGA, X.InterfaceC64219PIh
    public final void LIZIZ() {
        boolean z;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isStopWhenBackground:");
            PG6 pg6 = this.LIZ.LIZJ;
            if (pg6 != null && pg6.LIZJ) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ));
        }
        PG7 pg7 = this.LIZ;
        PG6 pg62 = pg7.LIZJ;
        if (pg62 != null && pg62.LIZJ) {
            pg7.LIZ();
        }
    }

    @Override // X.PGA, X.InterfaceC64219PIh
    public final void onBackground() {
        boolean z;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isStopWhenBackground:");
            PG6 pg6 = this.LIZ.LIZJ;
            if (pg6 != null && pg6.LIZJ) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ));
        }
        PG7 pg7 = this.LIZ;
        PG6 pg62 = pg7.LIZJ;
        if (pg62 != null && pg62.LIZJ) {
            pg7.LIZIZ();
        }
    }

    public PG8(PG7 pg7) {
        this.LIZ = pg7;
    }
}
