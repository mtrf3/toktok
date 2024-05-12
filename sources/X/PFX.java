package X;

import com.bytedance.services.apm.api.IFdCheck;

/* loaded from: classes12.dex */
public final class PFX {
    public static final PFX LJI = new PFX();
    public C64134PFa LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public PFW LJ;
    public IFdCheck LJFF;

    public final synchronized void LIZ() {
        C64134PFa c64134PFa;
        if (this.LIZLLL && (c64134PFa = this.LIZ) != null && c64134PFa.LIZJ && !this.LIZJ) {
            this.LIZJ = true;
            C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZJ(new PFY(this, this.LIZ.LIZIZ));
        }
    }

    public final synchronized void LIZIZ(C64134PFa c64134PFa) {
        if (c64134PFa == null) {
            return;
        }
        this.LIZ = c64134PFa;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateConfig:");
            LIZ.append(c64134PFa);
            C64028PAy.LIZ("APM-FD", X1D.LIZIZ(LIZ));
        }
        LIZ();
    }
}
