package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NF7 {
    public final String LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NF7)) {
            return false;
        }
        NF7 nf7 = (NF7) obj;
        return o.LJ(this.LIZ, nf7.LIZ) && o.LJ(this.LIZIZ, nf7.LIZIZ) && o.LJ(this.LIZJ, nf7.LIZJ) && this.LIZLLL == nf7.LIZLLL && this.LJ == nf7.LJ && o.LJ(this.LJFF, nf7.LJFF) && this.LJI == nf7.LJI && this.LJII == nf7.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.LIZJ;
        int hashCode3 = (hashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode3 + i) * 31) + this.LJ) * 31;
        String str3 = this.LJFF;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.LJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((hashCode4 + i3) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AceSurveyUiState(brandName=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", coverUrl=");
        LIZ.append(this.LIZJ);
        LIZ.append(", surveyVisibility=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", rateInputValue=");
        LIZ.append(this.LJ);
        LIZ.append(", moreFeedBackBtnText=");
        LIZ.append(this.LJFF);
        LIZ.append(", moreFeedBackBtnVisible=");
        LIZ.append(this.LJI);
        LIZ.append(", submitState=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public static NF7 LIZ(NF7 nf7, boolean z, int i, boolean z2, boolean z3, int i2) {
        String str;
        String str2;
        UrlModel urlModel;
        boolean z4 = z2;
        boolean z5 = z;
        boolean z6 = z3;
        int i3 = i;
        String str3 = null;
        if ((i2 & 1) != 0) {
            str = nf7.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = nf7.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            urlModel = nf7.LIZJ;
        } else {
            urlModel = null;
        }
        if ((i2 & 8) != 0) {
            z5 = nf7.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i3 = nf7.LJ;
        }
        if ((i2 & 32) != 0) {
            str3 = nf7.LJFF;
        }
        if ((i2 & 64) != 0) {
            z4 = nf7.LJI;
        }
        if ((i2 & 128) != 0) {
            z6 = nf7.LJII;
        }
        nf7.getClass();
        return new NF7(str, str2, urlModel, z5, i3, str3, z4, z6);
    }

    public NF7(String str, String str2, UrlModel urlModel, boolean z, int i, String str3, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = urlModel;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = str3;
        this.LJI = z2;
        this.LJII = z3;
    }
}
