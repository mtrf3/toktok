package X;

/* loaded from: classes15.dex */
public final class VDN {
    public static volatile VDN LJ;
    public final FOZ LIZ = new FOZ();
    public VDO LIZIZ;
    public VDV LIZJ;
    public boolean LIZLLL;

    public static VDN LIZIZ() {
        if (LJ == null) {
            synchronized (VDN.class) {
                if (LJ == null) {
                    LJ = new VDN();
                }
            }
        }
        return LJ;
    }

    public VDN() {
        LIZ(new VDM(new VDL()));
    }

    public final void LIZ(VDM vdm) {
        VDO vdo = new VDO(vdm);
        this.LIZIZ = vdo;
        this.LIZJ = new VDV(this.LIZ, vdo);
        this.LIZLLL = vdm.LIZLLL;
    }
}
