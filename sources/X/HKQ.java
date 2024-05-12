package X;

/* loaded from: classes8.dex */
public final class HKQ implements HKP {
    public HKP LIZ;
    public String LIZJ;
    public String LIZLLL;
    public C43611H9r LJ;
    public String LJI;
    public C43645HAz LJII;
    public int LIZIZ = -1;
    public int LJFF = -1;

    public HKQ(HKP hkp) {
        this.LIZ = hkp;
    }

    public final void LJI(HKP hkp) {
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && hkp != null) {
                        hkp.LJFF(this.LJFF, this.LJI, true);
                    }
                } else if (hkp != null) {
                    hkp.LIZLLL(this.LJ, true);
                }
            } else if (hkp != null) {
                hkp.LIZIZ(this.LJII, true);
            }
        } else if (hkp != null) {
            hkp.LIZ(this.LIZJ, this.LIZLLL, true);
        }
        this.LIZ = hkp;
    }

    @Override // X.HKP
    public final void LIZIZ(C43645HAz c43645HAz, boolean z) {
        this.LIZIZ = 1;
        this.LJII = c43645HAz;
        HKP hkp = this.LIZ;
        if (hkp != null) {
            hkp.LIZIZ(c43645HAz, false);
        }
    }

    @Override // X.HKP
    public final void LIZLLL(C43611H9r c43611H9r, boolean z) {
        this.LIZIZ = 2;
        this.LJ = c43611H9r;
        HKP hkp = this.LIZ;
        if (hkp != null) {
            hkp.LIZLLL(c43611H9r, false);
        }
    }

    @Override // X.HKP
    public final void LIZ(String str, String str2, boolean z) {
        this.LIZIZ = 0;
        this.LIZJ = str;
        this.LIZLLL = str2;
        HKP hkp = this.LIZ;
        if (hkp != null) {
            hkp.LIZ(str, str2, false);
        }
    }

    @Override // X.HKP
    public final void LJFF(int i, String str, boolean z) {
        this.LIZIZ = 3;
        this.LJFF = i;
        this.LJI = str;
        HKP hkp = this.LIZ;
        if (hkp != null) {
            hkp.LJFF(i, str, false);
        }
    }
}
