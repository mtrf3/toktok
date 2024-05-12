package X;

/* renamed from: X.XZs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85056XZs {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;

    public C85056XZs() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85056XZs)) {
            return false;
        }
        C85056XZs c85056XZs = (C85056XZs) obj;
        return this.LIZ == c85056XZs.LIZ && this.LIZIZ == c85056XZs.LIZIZ && this.LIZJ == c85056XZs.LIZJ && this.LIZLLL == c85056XZs.LIZLLL && this.LJ == c85056XZs.LJ && this.LJFF == c85056XZs.LJFF && this.LJI == c85056XZs.LJI && this.LJII == c85056XZs.LJII && this.LJIIIIZZ == c85056XZs.LJIIIIZZ && this.LJIIIZ == c85056XZs.LJIIIZ && this.LJIIJ == c85056XZs.LJIIJ && this.LJIIJJI == c85056XZs.LJIIJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZJ = (((JBR.LIZJ(this.LIZLLL, (JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31) + this.LIZJ) * 31, 31) + this.LJ) * 31) + this.LJFF) * 31;
        boolean z = this.LJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZJ2 = (JBR.LIZJ(this.LJIIIIZZ, (((LIZJ + i2) * 31) + this.LJII) * 31, 31) + this.LJIIIZ) * 31;
        if (!this.LJIIJ) {
            i = 0;
        }
        return ((LIZJ2 + i) * 31) + this.LJIIJJI;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upsell2svPopCacheObj(lastAPICall=");
        sb.append(this.LIZ);
        sb.append(", lastPopUpShow=");
        sb.append(this.LIZIZ);
        sb.append(", popupCount=");
        sb.append(this.LIZJ);
        sb.append(", enterpriseAccLastPopUpShow=");
        sb.append(this.LIZLLL);
        sb.append(", enterpriseAccPopUpCount=");
        sb.append(this.LJ);
        sb.append(", enterpriseAccMonthlyPopUpCount=");
        sb.append(this.LJFF);
        sb.append(", enterpriseAccAPIResp=");
        sb.append(this.LJI);
        sb.append(", enterpriseAccAPIRespAccessCount=");
        sb.append(this.LJII);
        sb.append(", walletLastPopUpShow=");
        sb.append(this.LJIIIIZZ);
        sb.append(", walletPopupCount=");
        sb.append(this.LJIIIZ);
        sb.append(", walletAccAPIResp=");
        sb.append(this.LJIIJ);
        sb.append(", walletAccAPIRespAccessCount=");
        return UPJ.LIZLLL(sb, this.LJIIJJI, ')');
    }

    public C85056XZs(int i) {
        this.LIZ = -1L;
        this.LIZIZ = -1L;
        this.LIZJ = 0;
        this.LIZLLL = -1L;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = false;
        this.LJII = 0;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = 0;
        this.LJIIJ = false;
        this.LJIIJJI = 0;
    }
}
