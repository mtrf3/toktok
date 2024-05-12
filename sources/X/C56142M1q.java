package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.M1q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56142M1q {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final ImageUrlModel LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56142M1q)) {
            return false;
        }
        C56142M1q c56142M1q = (C56142M1q) obj;
        return o.LJ(this.LIZ, c56142M1q.LIZ) && o.LJ(this.LIZIZ, c56142M1q.LIZIZ) && o.LJ(this.LIZJ, c56142M1q.LIZJ) && o.LJ(this.LIZLLL, c56142M1q.LIZLLL) && o.LJ(this.LJ, c56142M1q.LJ) && o.LJ(this.LJFF, c56142M1q.LJFF) && this.LJI == c56142M1q.LJI && o.LJ(this.LJII, c56142M1q.LJII);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomVideoGuideParamsForMall(schema=");
        LIZ.append(this.LIZ);
        LIZ.append(", previousPage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mallExtraInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", diversionParams=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", suggestGuideParams=");
        LIZ.append(this.LJ);
        LIZ.append(", diversionConfig=");
        LIZ.append(this.LJFF);
        LIZ.append(", canGoBack=");
        LIZ.append(this.LJI);
        LIZ.append(", backBtnAvatar=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31);
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        ImageUrlModel imageUrlModel = this.LJII;
        if (imageUrlModel == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrlModel.hashCode();
        }
        return i2 + hashCode;
    }

    public C56142M1q(String str, String previousPage, String str2, String str3, String str4, String str5, boolean z, ImageUrlModel imageUrlModel) {
        o.LJIIIZ(previousPage, "previousPage");
        this.LIZ = str;
        this.LIZIZ = previousPage;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z;
        this.LJII = imageUrlModel;
    }
}
