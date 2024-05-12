package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.NNy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59270NNy {
    public AwemeRawAd LIZ;
    public long LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public long LJ;
    public String LJFF;
    public int LJI;
    public int LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public C59270NNy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59270NNy)) {
            return false;
        }
        C59270NNy c59270NNy = (C59270NNy) obj;
        return o.LJ(this.LIZ, c59270NNy.LIZ) && this.LIZIZ == c59270NNy.LIZIZ && this.LIZJ == c59270NNy.LIZJ && o.LJ(this.LIZLLL, c59270NNy.LIZLLL) && this.LJ == c59270NNy.LJ && o.LJ(this.LJFF, c59270NNy.LJFF) && this.LJI == c59270NNy.LJI && this.LJII == c59270NNy.LJII && o.LJ(this.LJIIIIZZ, c59270NNy.LJIIIIZZ) && o.LJ(this.LJIIIZ, c59270NNy.LJIIIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        AwemeRawAd awemeRawAd = this.LIZ;
        int i = 0;
        if (awemeRawAd == null) {
            hashCode = 0;
        } else {
            hashCode = awemeRawAd.hashCode();
        }
        int LJ = (((C79062V1e.LJ(this.LJFF, JBR.LIZJ(this.LJ, C79062V1e.LJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, hashCode * 31, 31), 31), 31), 31), 31) + this.LJI) * 31) + this.LJII) * 31;
        String str = this.LJIIIIZZ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        String str2 = this.LJIIIZ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonData(awemeRawAd=");
        LIZ.append(this.LIZ);
        LIZ.append(", adId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", creativeId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", logExtra=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", groupId=");
        LIZ.append(this.LJ);
        LIZ.append(", adType=");
        LIZ.append(this.LJFF);
        LIZ.append(", adSystemOrigin=");
        LIZ.append(this.LJI);
        LIZ.append(", chargeType=");
        LIZ.append(this.LJII);
        LIZ.append(", awemeId=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", authorUid=");
        return q.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C59270NNy(int i) {
        this.LIZ = null;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = "";
        this.LJ = 0L;
        this.LJFF = "";
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
    }
}
