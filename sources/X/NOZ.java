package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NOZ {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public String LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    public NOZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NOZ)) {
            return false;
        }
        NOZ noz = (NOZ) obj;
        return o.LJ(this.LIZ, noz.LIZ) && o.LJ(this.LIZIZ, noz.LIZIZ) && o.LJ(this.LIZJ, noz.LIZJ) && this.LIZLLL == noz.LIZLLL && this.LJ == noz.LJ && o.LJ(this.LJFF, noz.LJFF) && this.LJI == noz.LJI && this.LJII == noz.LJII && this.LJIIIIZZ == noz.LJIIIIZZ && o.LJ(this.LJIIIZ, noz.LJIIIZ) && o.LJ(this.LJIIJ, noz.LJIIJ) && o.LJ(this.LJIIJJI, noz.LJIIJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        boolean z = this.LIZLLL;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        boolean z2 = this.LJ;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int LJ2 = (((C79062V1e.LJ(this.LJFF, (i3 + i4) * 31, 31) + this.LJI) * 31) + this.LJII) * 31;
        if (!this.LJIIIIZZ) {
            i = 0;
        }
        return this.LJIIJJI.hashCode() + C79062V1e.LJ(this.LJIIJ, C79062V1e.LJ(this.LJIIIZ, (LJ2 + i) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadData(downloadUrl=");
        sb.append(this.LIZ);
        sb.append(", packageName=");
        sb.append(this.LIZIZ);
        sb.append(", quickAppUrl=");
        sb.append(this.LIZJ);
        sb.append(", disableDownloadingDialog=");
        sb.append(this.LIZLLL);
        sb.append(", isFromAppAd=");
        sb.append(this.LJ);
        sb.append(", appName=");
        sb.append(this.LJFF);
        sb.append(", downloadMode=");
        sb.append(this.LJI);
        sb.append(", linkMode=");
        sb.append(this.LJII);
        sb.append(", isSupportMultiple=");
        sb.append(this.LJIIIIZZ);
        sb.append(", webUrl=");
        sb.append(this.LJIIIZ);
        sb.append(", webTitle=");
        sb.append(this.LJIIJ);
        sb.append(", openUrl=");
        return C07670Rv.LIZIZ(sb, this.LJIIJJI, ')');
    }

    public NOZ(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = "";
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = false;
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
    }
}
